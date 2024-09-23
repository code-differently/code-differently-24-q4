package com.codedifferently.instructional.quiz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

class QuizPrinterTest {

  private QuizPrinter quizPrinter;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
    quizPrinter = new QuizPrinter();
  }

  @Test
  void testPrintQuizPrintsQuestionsAndAnswers() {
    // Arrange
    QuizQuestion question1 = mock(QuizQuestion.class);
    when(question1.getQuestionNumber()).thenReturn(1);
    when(question1.getQuestionPrompt()).thenReturn("What is the capital of France?");
    when(question1.getAnswer()).thenReturn("Paris");

    QuizQuestion question2 = mock(QuizQuestion.class);
    when(question2.getQuestionNumber()).thenReturn(2);
    when(question2.getQuestionPrompt())
        .thenReturn("What is the largest planet in our solar system?");
    when(question2.getAnswer()).thenReturn("Jupiter");

    List<QuizQuestion> quizQuestions = Arrays.asList(question1, question2);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));

    // Act
    quizPrinter.printQuiz(quizQuestions);

    // Assert
    String expectedOutput =
        "\nQuestion 1: What is the capital of France?\n"
            + ">> Your answer: Paris\n"
            + "\n"
            + "Question 2: What is the largest planet in our solar system?\n"
            + ">> Your answer: Jupiter\n"
            + "\n";

    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintPossibleAnswersPrintsOptionsForMultipleChoiceQuestion() {
    // Arrange
    MultipleChoiceQuizQuestion question = mock(MultipleChoiceQuizQuestion.class);
    when(question.getQuestionNumber()).thenReturn(1);
    when(question.getQuestionPrompt()).thenReturn("What is the capital of France?");
    when(question.getAnswer()).thenReturn("Paris");

    AnswerChoice[] answerChoices = AnswerChoice.values();
    when(question.getAnswerForOption(answerChoices[0])).thenReturn("Paris");
    when(question.getAnswerForOption(answerChoices[1])).thenReturn("London");
    when(question.getAnswerForOption(answerChoices[2])).thenReturn("Berlin");

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));

    // Act
    quizPrinter.printQuiz(List.of(question));

    // Assert
    String expectedOutput =
        "\nQuestion 1: What is the capital of France?\n"
            + "A: London\n"
            + "B: Berlin\n"
            + ">> Your answer: Paris\n\n";

    assertEquals(expectedOutput, outputStream.toString());
  }
}
