import {
  AnswerChoice,
  MultipleChoiceQuizQuestion,
  QuizQuestion,
  QuizQuestionProvider,
} from 'codedifferently-instructional';

export class TommyTranQuiz implements QuizQuestionProvider {
  getProviderName(): string {
    return 'tommytran';
  }

  makeQuizQuestions(): QuizQuestion[] {
    return [
      TommyTranQuiz.makeQuestion0(),
      TommyTranQuiz.makeQuestion1(),
      TommyTranQuiz.makeQuestion2(),
    ];
  }

  private static makeQuestion0(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      0,
      'What is the capital city of Japan?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Seoul'],
        [AnswerChoice.B, 'Tokyo'],
        [AnswerChoice.C, 'Beijing'],
        [AnswerChoice.D, 'Bangkok'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion1(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      1,
      'Which planet is known as the "Red Planet?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Venus'],
        [AnswerChoice.B, 'Jupiter'],
        [AnswerChoice.C, 'Mars'],
        [AnswerChoice.D, 'Saturn'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion2(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      2,
      'Who wrote the play "Romeo and Juliet?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Charles Dickens'],
        [AnswerChoice.B, 'William Shakespeare'],
        [AnswerChoice.C, 'Jane Austen'],
        [AnswerChoice.D, 'Mark Twain'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }
}
