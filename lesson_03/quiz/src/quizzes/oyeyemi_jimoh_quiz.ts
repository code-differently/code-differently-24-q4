import {
  AnswerChoice,
  MultipleChoiceQuizQuestion,
  QuizQuestion,
  QuizQuestionProvider,
} from 'codedifferently-instructional';

export class OyeyemiJimohQuiz implements QuizQuestionProvider {
  getProviderName(): string {
    return 'oyeyemijimoh';
  }

  makeQuizQuestions(): QuizQuestion[] {
    return [
      OyeyemiJimohQuiz.makeQuestion0(),
      OyeyemiJimohQuiz.makeQuestion1(),
      OyeyemiJimohQuiz.makeQuestion2(),
    ];
  }

  private static makeQuestion0(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      0,
      'Who is the master soccer dribbler in the list below?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Jay Jay Okocha'],
        [AnswerChoice.B, 'Christiana Ronaldo'],
        [AnswerChoice.C, 'Sarr'],
        [AnswerChoice.D, 'Sadio Mane'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion1(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      1,
      'Which of the below tech company is not a cloud provider ?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Oracle'],
        [AnswerChoice.B, 'Meta'],
        [AnswerChoice.C, 'Microsoft'],
        [AnswerChoice.D, 'Amazon'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }

  private static makeQuestion2(): QuizQuestion {
    return new MultipleChoiceQuizQuestion(
      2,
      'Which one does not belong to the group?',
      new Map<AnswerChoice, string>([
        [AnswerChoice.A, 'Keyboard'],
        [AnswerChoice.B, 'Mouse'],
        [AnswerChoice.C, 'Table'],
        [AnswerChoice.D, 'Headphone'],
      ]),
      AnswerChoice.UNANSWERED,
    ); // Replace `UNANSWERED` with the correct answer.
  }
}
