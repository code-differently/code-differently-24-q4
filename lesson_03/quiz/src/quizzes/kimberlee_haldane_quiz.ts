import {
  AnswerChoice,
  MultipleChoiceQuizQuestion,
  QuizQuestion,
  QuizQuestionProvider,
} from 'codedifferently-instructional';

export class KimberleeHaldaneQuiz implements QuizQuestionProvider {
  getProviderName(): string {
    return 'kimberleehaldane';
  }

  makeQuizQuestions(): QuizQuestion[] {
    return [
      KimberleeHaldaneQuiz.makeQuestion0(),
      KimberleeHaldaneQuiz.makeQuestion1(),
      KimberleeHaldaneQuiz.makeQuestion2(),
    ];
  }

  private static makeQuestion0(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      0,
      'Which command tells you where you are in the terminal?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'pwd'],
        [AnswerChoice.B, 'ls'],
        [AnswerChoice.C, 'cd'],
        [AnswerChoice.D, 'mkdir'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion1(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      1,
      'Why do we use IDEs?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'hunting insects'],
        [AnswerChoice.B, 'testing powerlines'],
        [AnswerChoice.C, 'editing and refactoring code'],
        [AnswerChoice.D, 'all of the above'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion2(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      2,
      'In the vscode terminal, what command is used to verify that you created a branch?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'git branch -a'],
        [AnswerChoice.B, 'git merge main'],
        [AnswerChoice.C, 'git checkout -b new_feature'],
        [AnswerChoice.D, 'git remote -v'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }
}
