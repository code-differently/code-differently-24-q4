import {
  AnswerChoice,
  MultipleChoiceQuizQuestion,
  QuizQuestion,
  QuizQuestionProvider,
} from 'codedifferently-instructional';

export class LjMcwilliamsQuiz implements QuizQuestionProvider {
  getProviderName(): string {
    return 'ljmcwilliams';
  }

  makeQuizQuestions(): QuizQuestion[] {
    return [
      LjMcwilliamsQuiz.makeQuestion0(),
      LjMcwilliamsQuiz.makeQuestion1(),
      LjMcwilliamsQuiz.makeQuestion2(),
    ];
  }

  private static makeQuestion0(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      0,
      'Which component of a computer is responsible for short-term memory?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Motherboard'],
        [AnswerChoice.B, 'CPU (Central Processing Unit)'],
        [AnswerChoice.C, 'RAM (Random Access Memory)'],
        [AnswerChoice.D, 'Power Supply'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion1(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      1,
      'Which terminal command allows a user to copy a file or directory?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'cp file-name'],
        [AnswerChoice.B, 'cpy file-name'],
        [AnswerChoice.C, 'dupe file-name'],
        [AnswerChoice.D, 'make file-name'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion2(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      2,
      'Which Git command allows a user to delete a feature branch LOCALLY?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'git remove branch-name'],
        [AnswerChoice.B, 'git push origin --delete branch-name'],
        [AnswerChoice.C, 'git checkout master'],
        [AnswerChoice.D, 'git branch -d branch-name'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }
}
