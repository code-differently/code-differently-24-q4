import {
  AnswerChoice,
  MultipleChoiceQuizQuestion,
  QuizQuestion,
  QuizQuestionProvider,
} from 'codedifferently-instructional';

export class DwightBlueQuiz implements QuizQuestionProvider {
  getProviderName(): string {
    return 'dwightblue';
  }

  makeQuizQuestions(): QuizQuestion[] {
    return [
      DwightBlueQuiz.makeQuestion0(),
      DwightBlueQuiz.makeQuestion1(),
      DwightBlueQuiz.makeQuestion2(),
    ];
  }

  private static makeQuestion0(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      0,
      'What is the largest state in the USA? ',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Texas'],
        [AnswerChoice.B, 'California'],
        [AnswerChoice.C, 'Alaska'],
        [AnswerChoice.D, 'New York'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion1(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      1,
      'What are you unable to write on? ',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Paper'],
        [AnswerChoice.B, 'Notepad'],
        [AnswerChoice.C, 'Sand'],
        [AnswerChoice.D, 'Space'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion2(): QuizQuestion {
    return new QuizQuestion(
      2,
      'What did BASIC programing lanuage use to sort coding',
      '',
    );
    // Provide an answer.
  }
}
