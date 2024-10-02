import {
  AnswerChoice,
  MultipleChoiceQuizQuestion,
  QuizQuestion,
  QuizQuestionProvider,
} from 'codedifferently-instructional';

export class AngelicaCQuiz implements QuizQuestionProvider {
  getProviderName(): string {
    return 'angelicacastillo';
  }

  makeQuizQuestions(): QuizQuestion[] {
    return [
      AngelicaCQuiz.makeQuestion0(), 
      AngelicaCQuiz.makeQuestion1(), 
      AngelicaCQuiz.makeQuestion2(),
    ];
  }

  private static makeQuestion0(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      0,
      'What does CPU stand for?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Central Processing Unit'],
        [AnswerChoice.B, 'Central Program Unit'],
        [AnswerChoice.C,'Center Program Unit'],
        [AnswerChoice.D, 'Whatever you want it to be!'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }
 private static makeQuestion1(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      1,
      'Which of the following would be a "simple" essential part of the computer?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'RAM'],
        [AnswerChoice.B, 'CPU'],
        [AnswerChoice.C,'CASE'],
        [AnswerChoice.D, 'HARD DRIVE'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }
   private static makeQuestion2(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      2,
      'What would be considered the brains long term memory?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Mother board'],
        [AnswerChoice.B, 'Hard drive'],
        [AnswerChoice.C,'Power supply'],
        [AnswerChoice.D, 'Computer'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }
  }