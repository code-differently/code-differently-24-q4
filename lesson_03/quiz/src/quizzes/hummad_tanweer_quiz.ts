import {
  AnswerChoice,
  MultipleChoiceQuizQuestion,
  QuizQuestion,
  QuizQuestionProvider,
} from 'codedifferently-instructional';

export class HummadTanweerQuiz implements QuizQuestionProvider {
  getProviderName(): string {
    return 'hummadtanweer';
  }

  makeQuizQuestions(): QuizQuestion[] {
    return [
      HummadTanweerQuiz.makeQuestion0(),
      HummadTanweerQuiz.makeQuestion1(),
      HummadTanweerQuiz.makeQuestion2(),
    ];
  }

  private static makeQuestion0(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      0,
      'Who is attributed with inventing GIT?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Linus Torvalds'],
        [AnswerChoice.B, 'James Gosling'],
        [AnswerChoice.C, 'Koska Kawaguchi'],
        [AnswerChoice.D, 'Junio C. Hamano'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion1(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      1,
      'What is the opposite of a GIT clone?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'GIT add'],
        [AnswerChoice.B, 'GIT push'],
        [AnswerChoice.C, 'GIT upload'],
        [AnswerChoice.D, 'GIT status'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion2(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      2,
      'How do you check the state of your local git repository since your last commit?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'GIT diff'],
        [AnswerChoice.B, 'GIT commit'],
        [AnswerChoice.C, 'GIT status'],
        [AnswerChoice.D, 'GIT check'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }
}
