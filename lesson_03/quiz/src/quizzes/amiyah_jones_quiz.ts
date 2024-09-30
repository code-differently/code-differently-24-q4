import {
  AnswerChoice,
  MultipleChoiceQuizQuestion,
  QuizQuestion,
  QuizQuestionProvider,
} from 'codedifferently-instructional';

export class AmiyahJonesQuiz implements QuizQuestionProvider {
  getProviderName(): string {
    return 'amiyahjones';
  }

  makeQuizQuestions(): QuizQuestion[] {
    return [AmiyahJonesQuiz.makeQuestion0(), AmiyahJonesQuiz.makeQuestion1()];
  }

  private static makeQuestion0(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      0,
      'What is a multiple choice question?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'A question about agency'],
        [AnswerChoice.B, 'The hardest kind of quiz question there is'],
        [
          AnswerChoice.C,
          'A question that can be answered using one or more provided choices',
        ],
        [AnswerChoice.D, 'Whatever you want it to be!'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion1(): QuizQuestion {
    return new QuizQuestion(
      1,
      'What is a computer?',
      'A machine that automatically transforms input into output.',
    ); // Provide an answer.
  }
}
