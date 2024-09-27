import * as bcrypt from 'bcrypt';
import { QuizQuestion } from './quiz_question.js';
import { AnswerChoice, MultipleChoiceQuizQuestion } from './multiple_choice_quiz_question.js';
import YAML from 'yaml';
import fs from 'fs';

interface QuestionConfig {
  prompt: string;
  choices?: Map<AnswerChoice, string>;
}

export class QuizConfig {
  private answersByProvider: Map<string, string[]> = new Map();
  private questionsByProvider: Map<string, QuizQuestion[]> = new Map();
  private quizTaker: string = '';

  constructor(path: string) {
    this.loadConfig(path);
  }

  private loadConfig(configPath: string) {
    const file = fs.readFileSync(configPath, 'utf8');
    const config = YAML.parse(file);
    
    const answers = config.quiz.answers;
    const questions = config.quiz.questions;

    if (answers) {
      this.setAnswers(new Map(Object.entries(answers)));
    }

    if (questions) {
      this.setQuestions(questions);
    }
  }

  public setAnswers(answersByProvider: Map<string, string[]>) {
    answersByProvider.forEach((answers, provider) => {
      // Replace bcrypt's $2y$ with $2b$ to make it compatible with bcryptjs.
      answersByProvider.set(provider, answers.map((answer) => answer.replace('$2y$', '$2b$')));
    });
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
          new Map(Object.entries(config.choices)) as Map<AnswerChoice, string>,
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
