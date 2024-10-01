import {
  AnswerChoice,
  MultipleChoiceQuizQuestion,
  QuizQuestion,
  QuizQuestionProvider,
} from 'codedifferently-instructional';

export class JamesCapparellQuiz implements QuizQuestionProvider {
  getProviderName(): string {
    return 'jamescapparell';
  }

  makeQuizQuestions(): QuizQuestion[] {
    return [
      JamesCapparellQuiz.makeQuestion0(),
      JamesCapparellQuiz.makeQuestion1(),
      JamesCapparellQuiz.makeQuestion2(),
    ];
  }

  private static makeQuestion0(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      0,
      'What county in Delaware is Code differently offices in?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Sussex County'],
        [AnswerChoice.B, 'Kent County'],
        [AnswerChoice.C, 'New Castle County'],
        [AnswerChoice.D, 'Lancaster County'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }
  private static makeQuestion1(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      1,
      'Which video game charcter has the most games in their series?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Mario'],
        [AnswerChoice.B, 'Sonic'],
        [AnswerChoice.C, 'Mega Man'],
        [AnswerChoice.D, 'Pikachu'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion2(): QuizQuestion {
    return new QuizQuestion(
      2,
      'Type the full answer while filling in the blanks! A _____ that transforms ____ data into ____ data using automatically executed, pre-programmed ____.',
      'A _____ that transforms ____ data into ____ data using automatically executed, pre-programmed ____.',
    ); // Provide an answer.
  }
}
