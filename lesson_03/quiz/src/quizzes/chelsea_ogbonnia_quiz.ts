import {
  AnswerChoice,
  MultipleChoiceQuizQuestion,
  QuizQuestion,
  QuizQuestionProvider,
} from 'codedifferently-instructional';

export class ChelseaOgbonniaQuiz implements QuizQuestionProvider {
  getProviderName(): string {
    return 'chelseaogbonnia';
  }

  makeQuizQuestions(): QuizQuestion[] {
    return [
      ChelseaOgbonniaQuiz.makeQuestion0(),
      ChelseaOgbonniaQuiz.makeQuestion1(),
      ChelseaOgbonniaQuiz.makeQuestion2(),
      ChelseaOgbonniaQuiz.makeQuestion3(),
    ];
  }

  private static makeQuestion0(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      0,
      'Which git command combines the changes from one branch to the current branch?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'git branch -d <branchname>'],
        [AnswerChoice.B, 'git merge <branchname>'],
        [AnswerChoice.C, 'git branch'],
        [AnswerChoice.D, 'git add <filename>'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion1(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      1,
      'Which git command is used fetch and download content from a remote repository to update the local repository?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'git fetch'],
        [AnswerChoice.B, 'git merge'],
        [AnswerChoice.C, 'git clone'],
        [AnswerChoice.D, 'git pull'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }
  private static makeQuestion2(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      2,
      'Which Git command is NOT used to sync repositories?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'git push'],
        [AnswerChoice.B, 'git sync'],
        [AnswerChoice.C, 'git pull'],
        [AnswerChoice.D, 'git merge'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion3(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      3,
      'Which git command creates a new Git repository?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'git init'],
        [AnswerChoice.B, 'git clone'],
        [AnswerChoice.C, 'git folder <repositoryname>'],
        [AnswerChoice.D, 'git add <repositoryname>'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }
}
