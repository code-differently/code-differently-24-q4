import {
  AnswerChoice,
  MultipleChoiceQuizQuestion,
  QuizQuestion,
  QuizQuestionProvider,
} from 'codedifferently-instructional';

export class ZionBuchananQuiz implements QuizQuestionProvider {
  getProviderName(): string {
    return 'zionbuchanan';
  }

  makeQuizQuestions(): QuizQuestion[] {
    return [
      ZionBuchananQuiz.makeQuestion0(),
      ZionBuchananQuiz.makeQuestion1(),
      ZionBuchananQuiz.makeQuestion2(),
    ];
  }

  private static makeQuestion0(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      0,
      'What is a computer?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'A machine that transforms input data to output'],
        [AnswerChoice.B, 'A device that only stores information'],
        [AnswerChoice.C, 'A system that requires no user input to function'],
        [
          AnswerChoice.D,
          'A machine that operates only when connected to the internet.',
        ],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion1(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      1,
      'Why do we use IDEs?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'to issue tracking and debugging'],
        [AnswerChoice.B, 'Managing source control'],
        [AnswerChoice.C, 'Refactoring code'],
        [AnswerChoice.D, 'All of the above'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion2(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      2,
      'What is a branch?',
      new Map<AnswerChoice, string>([
        [
          AnswerChoice.A,
          'A kind of software program that runs on every computer automatically.',
        ],
        [AnswerChoice.B, 'Both Choices A and D'],
        [
          AnswerChoice.C,
          'A specialized type of car engine designed for off-road vehicles.',
        ],
        [
          AnswerChoice.D,
          'A copy of the repository that allows you to make changes and merge them back later.',
        ],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }
}
