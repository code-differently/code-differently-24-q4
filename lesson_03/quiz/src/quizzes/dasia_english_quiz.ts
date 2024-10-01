import {
  AnswerChoice,
  MultipleChoiceQuizQuestion,
  QuizQuestion,
  QuizQuestionProvider,
} from 'codedifferently-instructional';

export class DasiaEnglishQuiz implements QuizQuestionProvider {
  getProviderName(): string {
    return 'dasiaenglish';
  }

  makeQuizQuestions(): QuizQuestion[] {
    return [
      DasiaEnglishQuiz.makeQuestion0(),
      DasiaEnglishQuiz.makeQuestion1(),
      DasiaEnglishQuiz.makeQuestion2(),
    ];
  }

  private static makeQuestion0(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      0,
      'How often should you sync your fork?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Never'],
        [AnswerChoice.B, 'Once a day'],
        [AnswerChoice.C, 'About every hour or as often as possible'],
        [AnswerChoice.D, 'Once a week'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion1(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      1,
      'What is a computer?',
      new Map<AnswerChoice, string>([
        [
          AnswerChoice.A,
          'A machine that transforms input to output data using automatically executed pre-programmed instructions',
        ],
        [AnswerChoice.B, 'A machine'],
        [AnswerChoice.C, 'A laptop'],
        [
          AnswerChoice.D,
          'A machine that automatically executed pre-programmed instructions',
        ],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }
  private static makeQuestion2(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      2,
      'What part of the computer does everything have to run through?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'CPU'],
        [AnswerChoice.B, 'GPU'],
        [AnswerChoice.C, 'RAM'],
        [AnswerChoice.D, 'Motherboard'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }
}
