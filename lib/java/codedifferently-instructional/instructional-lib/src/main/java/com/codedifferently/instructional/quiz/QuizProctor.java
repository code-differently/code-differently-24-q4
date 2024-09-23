package com.codedifferently.instructional.quiz;

import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public final class QuizProctor {

  private final QuizConfig quizConfig;
  private final Scanner scanner;

  public QuizProctor(QuizConfig config, Scanner scanner) {
    this.quizConfig = config;
    this.scanner = scanner;
  }

  public void proctor(File answersDirctory) {
    // Randomize questions and choose first 15
    List<QuizQuestion> questions = quizConfig.getQuestions("default");
    Collections.shuffle(questions);
    questions = questions.subList(0, Math.min(questions.size(), 15));

    // Prompt for answers.
    var prompter = new QuizPrompter(scanner);
    prompter.promptForAnswers(questions);

    // Generate answers file in resources.
    String fileName = promptForFileName(scanner);
    saveAnswersToFile(questions, answersDirctory, fileName);
  }

  private String promptForFileName(Scanner scanner) {
    System.out.println();
    System.out.println("Quiz completed. Please provide a unique name for saving your answers.");

    String response = null;
    do {
      System.out.print(">> Your answer: ");
      response = scanner.next().toLowerCase().replaceAll("\\s+", "");
    } while (response.equals(""));

    return response;
  }

  private void saveAnswersToFile(
      List<QuizQuestion> questions, File answersDirctory, String filename) {
    var values = new LinkedHashMap<Integer, String>();
    for (QuizQuestion question : questions) {
      values.put(question.getQuestionNumber(), question.getAnswer());
    }

    var file = new File(answersDirctory.getAbsolutePath() + File.separator + filename + ".json");
    file.getParentFile().mkdirs();
    var gson = new GsonBuilder().setPrettyPrinting().create();

    try (var writer = new FileWriter(file, false)) {
      writer.write(gson.toJson(values));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
