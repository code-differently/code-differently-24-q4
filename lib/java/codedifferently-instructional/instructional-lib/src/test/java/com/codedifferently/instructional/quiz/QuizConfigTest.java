package com.codedifferently.instructional.quiz;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

class QuizConfigTest {

  private QuizConfig quizConfig;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
    quizConfig = new QuizConfig();
  }

  @Test
  void testCheckAnswerReturnsTrueWhenAnswerIsCorrect() {
    // Arrange
    int questionNumber = 0;
    String actualAnswer = "Paris";
    List<String> answers =
        Arrays.asList(
            "$2y$10$dLPdcUrNbecoR1cKO07deet0PrK1ZWsGZYZzsNhFDEYBk/YuGLaPa",
            "$2a$10$A1B2C3D4E5F6G7H8I9J0K1L2M3N4O5P6Q7R8S9T0U1V2W3X4Y5Z6");
    quizConfig.setAnswers(Map.of("default", answers));

    // Act
    boolean result = quizConfig.checkAnswer("default", questionNumber, actualAnswer);

    // Assert
    assertTrue(result);
  }

  @Test
  void testCheckAnswerReturnsFalseWhenAnswerIsIncorrect() {
    // Arrange
    int questionNumber = 1;
    String actualAnswer = "Mars";
    List<String> answers =
        Arrays.asList(
            "$2a$10$X5Z0yK4p2z6g7h8i9j0k1l2m3n4o5p6q7r8s9t0u1v2w3x4y5z6",
            "$2a$10$A1B2C3D4E5F6G7H8I9J0K1L2M3N4O5P6Q7R8S9T0U1V2W3X4Y5Z6");
    quizConfig.setAnswers(Map.of("set1", answers));

    // Act
    boolean result = quizConfig.checkAnswer("set1", questionNumber, actualAnswer);

    // Assert
    assertFalse(result);
  }

  @Test
  void testSizeReturnsCorrectNumberOfAnswers() {
    // Arrange
    List<String> answers =
        Arrays.asList(
            "$2a$10$X5Z0yK4p2z6g7h8i9j0k1l2m3n4o5p6q7r8s9t0u1v2w3x4y5z6",
            "$2a$10$A1B2C3D4E5F6G7H8I9J0K1L2M3N4O5P6Q7R8S9T0U1V2W3X4Y5Z6");
    quizConfig.setAnswers(Map.of("default", answers));

    // Act
    int result = quizConfig.size("default");

    // Assert
    assertEquals(2, result);
  }
}
