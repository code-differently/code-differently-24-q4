import { QuizQuestion } from './quiz_question.js';
import { AnswerChoice, MultipleChoiceQuizQuestion } from './multiple_choice_quiz_question.js';

export class QuizPrinter {
  printQuiz(quizQuestions: Iterable<QuizQuestion>): void {
    console.log();

    for (const question of quizQuestions) {
      this.printQuizQuestion(question);
    }
  }

  printQuizQuestion(question: QuizQuestion, printAnswer: boolean = true): void {
    console.log(`Question ${question.getQuestionNumber()}: ${question.getQuestionPrompt()}`);

    if (question instanceof MultipleChoiceQuizQuestion) {
      this.printPossibleAnswers(question);
    }

    if (!printAnswer) {
      return;
    }

    console.log(`>> Your answer: ${question.getAnswer()}`);
    console.log();
  }

  private printPossibleAnswers(question: MultipleChoiceQuizQuestion): void {
    for (const option of Object.values(AnswerChoice)) {
      if (option === AnswerChoice.UNANSWERED) {
        continue;
      }
      const answer = question.getAnswerForOption(option);
      if (answer === null || answer === undefined) {
        continue;
      }
      console.log(`${option}: ${answer}`);
    }
  }
}
