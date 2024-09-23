package com.codedifferently.instructional.quiz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class QuizQuestionTest {

  @Test
  void testGetQuestionNumber() {
    // Arrange
    int expectedQuestionNumber = 1;
    String question = "What is the capital of France?";
    String correctAnswer = "Paris";
    QuizQuestion quizQuestion = new QuizQuestion(expectedQuestionNumber, question, correctAnswer);

    // Act
    int actualQuestionNumber = quizQuestion.getQuestionNumber();

    // Assert
    assertEquals(expectedQuestionNumber, actualQuestionNumber);
  }

  @Test
  void testGetQuestionPrompt() {
    // Arrange
    int questionNumber = 2;
    String expectedQuestionPrompt = "What is the largest planet in our solar system?";
    String correctAnswer = "Jupiter";
    QuizQuestion quizQuestion =
        new QuizQuestion(questionNumber, expectedQuestionPrompt, correctAnswer);

    // Act
    String actualQuestionPrompt = quizQuestion.getQuestionPrompt();

    // Assert
    assertEquals(expectedQuestionPrompt, actualQuestionPrompt);
  }

  @Test
  void testGetAnswer() {
    // Arrange
    int questionNumber = 3;
    String question = "Who painted the Mona Lisa?";
    String expectedAnswer = "Leonardo da Vinci";
    QuizQuestion quizQuestion = new QuizQuestion(questionNumber, question, expectedAnswer);

    // Act
    String actualAnswer = quizQuestion.getAnswer();

    // Assert
    assertEquals(expectedAnswer, actualAnswer);
  }
}
