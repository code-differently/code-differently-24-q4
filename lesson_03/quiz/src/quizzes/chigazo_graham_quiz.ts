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
    return [ChigazoGrahamsQuiz.makeQuestion1(), ChigazoGrahamsQuiz.makeQuestion2, ChigazoGrahamsQuiz.makeQuestion3()];
  }

  private static makeQuestion1(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      1,
      'What is the sign for Modulo?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, '^'],
        [AnswerChoice.B, '*'],
        [AnswerChoice.C,'%',],
        [AnswerChoice.D, '//'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Provide an answer. | AnswerChoice.C, '%'
  }

  private static makeQuestion2(): QuizQuestion {
    return new QuizQuestion(
      2,
      'Who is are big three in hip hop?',
      'A machine that automatically transforms input into output.',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Kendrick Lamar, J. Cole, and Drake'],
        [AnswerChoice.B, 'Tupac, Biggie, and Nas'],
        [AnswerChoice.C, 'Kanye West, Eminem, and Lil Wayne',],
        [AnswerChoice.D, 'K. Dot'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Provide an answer. | AnswerChoice.D, 'K. Dot'
  }

    private static makeQuestion3(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      3,
      'what is the answer to life, the universe, and everything else?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, '42'],
        [AnswerChoice.B, 'Jesus'],
        [AnswerChoice.C,'N/A'],
        [AnswerChoice.D, 'Whatever you want it to be!'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Provide an answer. | AnswerChoice.A, '42'
  }
  
}