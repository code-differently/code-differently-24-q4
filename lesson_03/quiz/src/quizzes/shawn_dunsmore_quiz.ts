import {
  AnswerChoice,
  MultipleChoiceQuizQuestion,
  QuizQuestion,
  QuizQuestionProvider,
} from 'codedifferently-instructional';

export class ShawnDunsmoreQuiz implements QuizQuestionProvider {
  getProviderName(): string {
    return 'shawndunsmore';
  }

  makeQuizQuestions(): QuizQuestion[] {
    return [
      ShawnDunsmoreQuiz.makeQuestion0(),
      ShawnDunsmoreQuiz.makeQuestion1(),
      ShawnDunsmoreQuiz.makeQuestion2(),
    ];
  }

  private static makeQuestion0(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      0,
      'What is Davids Favorite Color?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Idc'],
        [AnswerChoice.B, 'Blue'],
        [AnswerChoice.C, 'Black'],
        [AnswerChoice.D, 'Whatever you think it is.'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion1(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      1,
      'What is Jordan famous for?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Photography'],
        [AnswerChoice.B, 'Being short'],
        [AnswerChoice.C, 'Pickleball'],
        [AnswerChoice.D, 'Trampoline Dunking.'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion2(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      2,
      'How mnay states are there?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, '50'],
        [AnswerChoice.B, '35'],
        [AnswerChoice.C, '20'],
        [AnswerChoice.D, '65'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }
}
