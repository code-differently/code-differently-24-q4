import {
  AnswerChoice,
  MultipleChoiceQuizQuestion,
  QuizQuestion,
  QuizQuestionProvider,
} from 'codedifferently-instructional';

export class JosephCaballeroQuiz implements QuizQuestionProvider {
  getProviderName(): string {
    return 'josephcaballero';
  }

  makeQuizQuestions(): QuizQuestion[] {
    return [
      JosephCaballeroQuiz.makeQuestion0(),
      JosephCaballeroQuiz.makeQuestion1(),
    ];
  }

  private static makeQuestion0(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      0,
      'What is HTML?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'A food branch'],
        [
          AnswerChoice.B,
          'A hypertext markup language for frontend development',
        ],
        [AnswerChoice.C, 'An animal'],
        [AnswerChoice.D, 'Whatever you want it to be!'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer | B.
  }

  private static makeQuestion1(): QuizQuestion {
    return new QuizQuestion(1, 'What is the styling language for HTML?', '');
    // Provide an answer.
  }
}
