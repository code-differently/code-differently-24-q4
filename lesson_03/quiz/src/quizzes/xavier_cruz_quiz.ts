import {
  AnswerChoice,
  MultipleChoiceQuizQuestion,
  QuizQuestion,
  QuizQuestionProvider,
} from 'codedifferently-instructional';

export class XavierCruzQuiz implements QuizQuestionProvider {
  getProviderName(): string {
    return 'xaviercruz';
  }

  makeQuizQuestions(): QuizQuestion[] {
    return [
      XavierCruzQuiz.makeQuestion0(),
      XavierCruzQuiz.makeQuestion1(),
      XavierCruzQuiz.makeQuestion2(),
      XavierCruzQuiz.makeQuestion3(),
    ];
  }

  private static makeQuestion0(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      0,
      'What programming language supports the "struct" data type?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'C'],
        [AnswerChoice.B, 'PHP'],
        [AnswerChoice.C, 'JSP'],
        [AnswerChoice.D, 'HTML'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion1(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      1,
      'What is another name for an app?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Program'],
        [AnswerChoice.B, 'Field'],
        [AnswerChoice.C, 'Record'],
        [AnswerChoice.D, 'Library'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Provide an answer.
  }

  private static makeQuestion2(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      2,
      'A virtual machine is an example of what?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Presentation'],
        [AnswerChoice.B, 'Fabrication'],
        [AnswerChoice.C, 'Deprecation'],
        [AnswerChoice.D, 'Emulation'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Provide an answer.
  }
  private static makeQuestion3(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      3,
      'What data type closely resembles a queue?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'String'],
        [AnswerChoice.B, 'Character'],
        [AnswerChoice.C, 'Integer'],
        [AnswerChoice.D, 'Array'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Provide an answer.
  }
}
