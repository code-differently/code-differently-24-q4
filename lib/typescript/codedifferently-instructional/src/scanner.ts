// Scanner class to simulate Java's Scanner for user input
export class Scanner {
  public next(): string {
    return require('readline-sync').question('');
  }
}