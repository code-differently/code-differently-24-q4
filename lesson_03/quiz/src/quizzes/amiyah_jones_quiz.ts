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
      'What two computer parts get mixed up often?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Power supply and mother board'],
        [AnswerChoice.B, 'Graphics card and ram'],
        [AnswerChoice.C, 'Ram and hard drive'],
        [AnswerChoice.D, 'None, all of them are different'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion1(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      1,
      'Which computer part figures out how everything is supposed to look on your screen?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Graphics card'],
        [AnswerChoice.B, 'CPU'],
        [AnswerChoice.C, 'mother board'],
        [AnswerChoice.D, 'mother board'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion2(): QuizQuestion {
    return new QuizQuestion(
      2,
      'What is a computer?',
      'A machine that automatically transforms input into output.',
    ); // Provide an answer.
  }
}
