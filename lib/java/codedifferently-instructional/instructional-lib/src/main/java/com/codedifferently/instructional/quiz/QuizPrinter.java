package com.codedifferently.instructional.quiz;

import javax.annotation.Nonnull;

public class QuizPrinter {

  public void printQuiz(@Nonnull Iterable<QuizQuestion> quizQuestions) {
    System.out.println();

    for (QuizQuestion question : quizQuestions) {
      printQuizQuestion(question);
    }
  }

  public void printQuizQuestion(QuizQuestion question) {
    this.printQuizQuestion(question, true);
  }

  public void printQuizQuestion(QuizQuestion question, boolean printAnswer) {
    System.out.println(
        "Question " + question.getQuestionNumber() + ": " + question.getQuestionPrompt());

    if (question instanceof MultipleChoiceQuizQuestion) {
      printPossibleAnswers((MultipleChoiceQuizQuestion) question);
    }

    if (!printAnswer) {
      return;
    }

    System.out.println(">> Your answer: " + question.getAnswer());
    System.out.println();
  }

  private void printPossibleAnswers(MultipleChoiceQuizQuestion question) {
    for (AnswerChoice option : AnswerChoice.values()) {
      if (option == AnswerChoice.UNANSWERED) {
        continue;
      }
      var answer = question.getAnswerForOption(option);
      if (answer == null) {
        continue;
      }
      System.out.println(option + ": " + question.getAnswerForOption(option));
    }
  }
}
