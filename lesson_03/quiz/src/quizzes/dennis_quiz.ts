import {
  AnswerChoice,
  MultipleChoiceQuizQuestion,
  QuizQuestion,
  QuizQuestionProvider,
} from 'codedifferently-instructional';

export class DennisQuiz implements QuizQuestionProvider {
  getProviderName(): string {
    return 'dennislipscomb';
  }

  makeQuizQuestions(): QuizQuestion[] {
    return [
      DennisQuiz.makeQuestion0(),
      DennisQuiz.makeQuestion1(),
      DennisQuiz.makeQuestion2(),
    ];
  }

  private static makeQuestion0(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      0,
      'What is RAM?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Random Access Motherboard'],
        [AnswerChoice.B, 'Run Access Memory'],
        [AnswerChoice.C, 'Random Access Memory'],
        [AnswerChoice.D, 'Random Audit Memory'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion1(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      1,
      'what does "git branch -m" do?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'change name of branch'],
        [AnswerChoice.B, 'push fork'],
        [AnswerChoice.C, 'delete branch'],
        [AnswerChoice.D, 'save branch'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion2(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      2,
      'Which is not an IDE?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'VS Code'],
        [AnswerChoice.B, 'Ah Git Push It'],
        [AnswerChoice.C, 'JetBrains'],
        [AnswerChoice.D, 'Netbeans'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }
}
