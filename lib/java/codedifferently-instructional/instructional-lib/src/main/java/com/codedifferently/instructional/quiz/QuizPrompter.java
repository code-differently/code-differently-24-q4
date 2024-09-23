package com.codedifferently.instructional.quiz;

import java.util.List;
import java.util.Scanner;

public class QuizPrompter {
  private final Scanner scanner;
  private QuizPrinter printer = new QuizPrinter();

  public QuizPrompter(Scanner scanner) {
    this.scanner = scanner;
  }

  public void setQuizPrinter(QuizPrinter printer) {
    this.printer = printer;
  }

  public void promptForAnswers(List<QuizQuestion> questions) {
    for (QuizQuestion question : questions) {
      promptForAnswer(question);
    }
  }

  public void promptForAnswer(QuizQuestion question) {
    promptForAnswer(question, false);
  }

  public void promptForAnswer(QuizQuestion question, boolean requireAnswer) {
    printer.printQuizQuestion(question, false);
    question.promptForAnswer(scanner, requireAnswer);
    System.out.println();
  }
}
