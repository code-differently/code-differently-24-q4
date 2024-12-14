import { QuizQuestion } from './quiz_question.js';
import { Scanner } from './scanner.js';

export enum AnswerChoice {
  UNANSWERED = 'UNANSWERED',
  A = 'A',
  B = 'B',
  C = 'C',
  D = 'D'
}

export class MultipleChoiceQuizQuestion extends QuizQuestion {
  private answersByOption: Map<AnswerChoice, string>;

  constructor(
    questionNumber: number,
    question: string,
    answerOptions: Map<AnswerChoice, string>,
    correctAnswer: AnswerChoice
  ) {
    super(questionNumber, question, correctAnswer);
    this.answersByOption = answerOptions;
  }

  public getAnswerChoices(): Set<AnswerChoice> {
    return new Set(this.answersByOption.keys());
  }

  public getAnswerForOption(option: AnswerChoice): string | undefined {
    return this.answersByOption.get(option);
  }

  public promptForAnswer(scanner: Scanner): void {
    let response: string | null = null;
    let answer: AnswerChoice | null = null;

    do {
      // If a response was given but not accepted, announce that.
      if (response !== null) {
        console.log("Value not accepted, try again.\n");
      }

      // Get a response.
      console.log(">> Your answer (or 's' to skip): ");
      response = scanner.next().toUpperCase().trim();

      // If the user wants to skip, let them.
      if (response === 'S') {
        this.setAnswer(null);
        return;
      }

      // Try to parse the answer.
      if (['A', 'B', 'C', 'D'].includes(response)) {
        answer = response as AnswerChoice;
      }
    } while (answer === null || !this.answersByOption.has(answer));

    // Set the question answer.
    this.setAnswer(answer);
  }

  public setAnswer(answer: AnswerChoice | null): void {
    super.setAnswer(answer ?? AnswerChoice.UNANSWERED);
  }
}

