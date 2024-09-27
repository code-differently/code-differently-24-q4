import * as bcrypt from 'bcrypt';
import { Injectable } from '@nestjs/common';
import { ConfigService } from '@nestjs/config';
import { QuizQuestion } from './quiz_question.js';
import { AnswerChoice, MultipleChoiceQuizQuestion } from './multiple_choice_quiz_question.js';

interface QuestionConfig {
  prompt: string;
  choices?: Map<AnswerChoice, string>;
}

@Injectable()
export class QuizConfig {
  private answersByProvider: Map<string, string[]> = new Map();
  private questionsByProvider: Map<string, QuizQuestion[]> = new Map();
  private quizTaker: string = '';

  constructor(private configService: ConfigService) {
    this.loadConfig();
  }

  private loadConfig() {
    const answers = this.configService.get<Record<string, string[]>>('quiz.answers');
    const questions = this.configService.get<Record<string, QuestionConfig[]>>('quiz.questions');

    if (answers) {
      this.answersByProvider = new Map(Object.entries(answers));
    }

    if (questions) {
      this.setQuestions(questions);
    }
  }

  public setAnswers(answersByProvider: Map<string, string[]>) {
    this.answersByProvider = answersByProvider;
  }

  public setQuizTaker(quizTaker: string) {
    this.quizTaker = quizTaker;
  }

  public getQuizTaker(): string {
    return this.quizTaker;
  }

  public setQuestions(questionsByProvider: Record<string, QuestionConfig[]>) {
    if (!questionsByProvider) {
      this.questionsByProvider = new Map();
      return;
    }
    this.questionsByProvider = new Map(
      Object.entries(questionsByProvider).map(([key, value]) => [
        key,
        this.convertToQuizQuestions(value),
      ])
    );
  }

  private convertToQuizQuestions(configs: QuestionConfig[]): QuizQuestion[] {
    return configs.map((config, index) => {
      if (!config.choices) {
        return new QuizQuestion(index, config.prompt, '');
      } else {
        return new MultipleChoiceQuizQuestion(
          index,
          config.prompt,
          config.choices,
          AnswerChoice.UNANSWERED);
        
      }
    });
  }

  public getQuestions(provider: string): QuizQuestion[] | undefined {
    return this.questionsByProvider.get(provider);
  }

  public async checkAnswer(provider: string, questionNumber: number, actualAnswer: string): Promise<boolean> {
    const answers = this.answersByProvider.get(provider);
    if (!answers) {
      throw new Error(`No answers found for provider: ${provider}`);
    }
    return bcrypt.compare(actualAnswer, answers[questionNumber]);
  }

  public size(provider: string): number {
    const answers = this.answersByProvider.get(provider);
    return answers ? answers.length : 0;
  }
}
