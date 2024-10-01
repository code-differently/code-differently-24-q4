import {
  AnswerChoice,
  MultipleChoiceQuizQuestion,
  QuizQuestion,
  QuizQuestionProvider,
} from 'codedifferently-instructional';

export class ChigazoGrahamsQuiz implements QuizQuestionProvider {
  getProviderName(): string {
    return 'chigazograham';
  }

  makeQuizQuestions(): QuizQuestion[] {
    return [
      ChigazoGrahamsQuiz.makeQuestion0(),
      ChigazoGrahamsQuiz.makeQuestion1(),
      ChigazoGrahamsQuiz.makeQuestion2(),
    ];
  }

  private static makeQuestion0(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      0,
      'What is the sign for modulo?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, '^'],
        [AnswerChoice.B, '*'],
        [AnswerChoice.C, '%'],
        [AnswerChoice.D, '//'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Provide an answer. | AnswerChoice.C, '%'
  }

  private static makeQuestion1(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      1,
      'Who are hip hops big three',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Kendrick Lamar, J. Cole, and Drake'],
        [AnswerChoice.B, 'Tupac, Biggie, and Nas'],
        [AnswerChoice.C, 'Kanye West, Eminem, and Lil Wayne'],
        [AnswerChoice.D, 'K. Dot'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Provide an answer. | AnswerChoice.C, '%'
  }

  private static makeQuestion2(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      2,
      'what is the answer to life, the universe, and everything else?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, '42'],
        [AnswerChoice.B, 'Jesus'],
        [AnswerChoice.C, 'N/A'],
        [AnswerChoice.D, 'Whatever you want it to be!'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Provide an answer. | AnswerChoice.A, '42'
  }
}