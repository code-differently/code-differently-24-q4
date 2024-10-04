import {
  AnswerChoice,
  MultipleChoiceQuizQuestion,
  QuizQuestion,
  QuizQuestionProvider,
} from 'codedifferently-instructional';

export class DavidSmithQuiz implements QuizQuestionProvider {
  getProviderName(): string {
    return 'davidsmith';
  }

  makeQuizQuestions(): QuizQuestion[] {
    return [
      DavidSmithQuiz.makeQuestion0(),
      DavidSmithQuiz.makeQuestion1(),
      DavidSmithQuiz.makeQuestion2(),
    ];
  }

  private static makeQuestion0(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      0,
      'Where have I worked before?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'JPMorganChase&Co.'],
        [AnswerChoice.B, 'Capital One'],
        [AnswerChoice.C, 'Nvidia'],
        [AnswerChoice.D, 'Meta'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion1(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      1,
      'Have I worked at Code Differently before?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Yes'],
        [AnswerChoice.B, 'No'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }
  private static makeQuestion2(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      2,
      'Was Jordan my teacher when I started coding',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Yes'],
        [AnswerChoice.B, 'No'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }
}
