import {
    AnswerChoice,
    MultipleChoiceQuizQuestion,
    QuizQuestion,
    QuizQuestionProvider,
} from 'codedifferently-instructional';

export class YafiahAbdullahQuiz implements QuizQuestionProvider {
  getProviderName(): string {
    return 'yafiahAbdullah';
  }

  makeQuizQuestions(): QuizQuestion[] {
    return [YafiahAbdullahQuiz.makeQuestion0(), YafiahAbdullahQuiz.makeQuestion1(),YafiahAbdullahQuiz.makeQuestion2()];
  }

  private static makeQuestion0(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      0,
      'What is a CPU?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Central Processing Unit'],
        [AnswerChoice.B, 'Computer Performance Unit'],
        [
          AnswerChoice.C,
          'Core Processing Unit',
        ],
        [AnswerChoice.D, 'Central Program Unit'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion1(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      1,
      'Which of the following best describes the main function of a CPU?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'To store data'],
        [AnswerChoice.B, 'To execute instructions and process data'],
        [
          AnswerChoice.C,
          'To manage peripheral devices',
        ],
        [AnswerChoice.D, 'To connect to the internet'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

   private static makeQuestion2(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      2,
      'What is the unit of measurement commonly used to describe CPU speed?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Megabytes (MB)'],
        [AnswerChoice.B, 'Gigahertz (GHz)'],
        [
          AnswerChoice.C,
          'Kilobytes (KB)',
        ],
        [AnswerChoice.D, 'Terabits (Tb)'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }
}
