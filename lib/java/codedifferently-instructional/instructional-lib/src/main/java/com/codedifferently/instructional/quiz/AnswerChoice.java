package com.codedifferently.instructional.quiz;

import java.util.Optional;

public enum AnswerChoice {
  UNANSWERED("UNANSWERED"),
  A("A"),
  B("B"),
  C("C"),
  D("D");

  private String option;

  AnswerChoice(String option) {
    this.option = option;
  }

  public static Optional<AnswerChoice> valueOrEmpty(String value) {
    try {
      return Optional.of(AnswerChoice.valueOf(value));
    } catch (IllegalArgumentException e) {
      return Optional.empty();
    }
  }

  public String toString() {
    return option;
  }
}
