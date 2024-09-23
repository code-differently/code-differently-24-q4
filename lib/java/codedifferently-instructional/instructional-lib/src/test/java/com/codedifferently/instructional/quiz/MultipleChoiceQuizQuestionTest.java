package com.codedifferently.instructional.quiz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class MultipleChoiceQuizQuestionTest {

  @Test
  void testGetAnswerForOption() {
    // Arrange
    int questionNumber = 1;
    String question = "What is the capital of France?";
    Map<AnswerChoice, String> answerOptions = new HashMap<>();
    answerOptions.put(AnswerChoice.A, "Paris");
    answerOptions.put(AnswerChoice.B, "London");
    answerOptions.put(AnswerChoice.C, "Berlin");
    AnswerChoice correctAnswer = AnswerChoice.A;
    MultipleChoiceQuizQuestion quizQuestion =
        new MultipleChoiceQuizQuestion(questionNumber, question, answerOptions, correctAnswer);

    // Act
    String actualAnswerForOptionA = quizQuestion.getAnswerForOption(AnswerChoice.A);
    String actualAnswerForOptionB = quizQuestion.getAnswerForOption(AnswerChoice.B);
    String actualAnswerForOptionC = quizQuestion.getAnswerForOption(AnswerChoice.C);

    // Assert
    assertEquals("Paris", actualAnswerForOptionA);
    assertEquals("London", actualAnswerForOptionB);
    assertEquals("Berlin", actualAnswerForOptionC);
  }
}
