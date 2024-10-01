import {
  AnswerChoice,
  MultipleChoiceQuizQuestion,
  QuizQuestion,
  QuizQuestionProvider,
} from 'codedifferently-instructional';

export class PabloLimonParedesQuiz implements QuizQuestionProvider {
  getProviderName(): string {
    return 'pablolimonparedes';
  }

  makeQuizQuestions(): QuizQuestion[] {
    return [
      PabloLimonParedesQuiz.makeQuestion0(),
      PabloLimonParedesQuiz.makeQuestion1(),
      PabloLimonParedesQuiz.makeQuestion2(),
    ];
  }

  private static makeQuestion0(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      0,
      'What does git checkout -b branch command do?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Creates a pull request'],
        [AnswerChoice.B, 'Creates a new branch and switches you to it'],
        [AnswerChoice.C, 'To move to another branch'],
        [AnswerChoice.D, 'Delete a branch'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion1(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      1,
      'What does the man git command do?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Create a new directory'],
        [AnswerChoice.B, 'Shows history of commands'],
        [AnswerChoice.C, 'Get to main branch'],
        [AnswerChoice.D, 'Access the manual for git'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }
  private static makeQuestion2(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      2,
      'How do you clear up your terminal if your screen is cramped?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'command + k'],
        [AnswerChoice.B, 'CTRL + space'],
        [AnswerChoice.C, 'command + shift + P'],
        [AnswerChoice.D, 'command + T'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }
}
