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
    return [
      AmiyahJonesQuiz.makeQuestion0(),
      AmiyahJonesQuiz.makeQuestion1(),
      AmiyahJonesQuiz.makeQuestion2(),
    ];
  }

  private static makeQuestion0(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      0,
      'What two computer parts get mixed up often?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Power supply and mother board'],
        [AnswerChoice.B, 'Graphics card and ram'],
        [AnswerChoice.C, 'Ram and hard drive'],
        [AnswerChoice.D, 'None of them get mixed up'],
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
        [AnswerChoice.C, 'Mother board'],
        [AnswerChoice.D, 'Ram'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion2(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      2,
      'Which computer part houses everything?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Hard drive'],
        [AnswerChoice.B, 'Case'],
        [AnswerChoice.C, 'CPU'],
        [AnswerChoice.D, 'Power supply'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }
}
