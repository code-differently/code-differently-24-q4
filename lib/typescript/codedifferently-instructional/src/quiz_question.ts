export class QuizQuestion {
  private questionNumber: number;
  private question: string;
  private correctAnswer: string | null;

  constructor(questionNumber: number, question: string, correctAnswer: string) {
    this.questionNumber = questionNumber;
    this.question = question;
    this.correctAnswer = correctAnswer;
  }

  public getQuestionNumber(): number {
    return this.questionNumber;
  }

  public getQuestionPrompt(): string {
    return this.question;
  }

  public getAnswer(): string {
    return this.correctAnswer ?? '';
  }

  public setAnswer(answer: string | null): void {
    this.correctAnswer = answer;
  }

  public promptForAnswer(scanner: Scanner, requireAnswer = false): void {
    let response: string | null = null;

    do {
      // If a response was given but not accepted, announce that.
      if (response !== null) {
        console.log("Value not accepted, try again.\n");
      }

      // Get a response.
      const prompt = `>> Your answer ${requireAnswer ? "(required)" : "(or 's' to skip)"}: `;
      process.stdout.write(prompt);
      response = scanner.next().trim();

      // If the user wants to skip, let them.
      if (!requireAnswer && response.toUpperCase() === "S") {
        this.setAnswer(null);
        return;
      }
    } while (requireAnswer && (response === '' || response.toUpperCase() === 'S'));

    // Set the question answer.
    this.setAnswer(response);
  }
}

// Scanner class to simulate Java's Scanner for user input
class Scanner {
  public next(): string {
    return require('readline-sync').question('');
  }
}
