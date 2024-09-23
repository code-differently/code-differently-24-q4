package com.codedifferently.instructional.quiz;

import java.io.File;
import java.nio.file.Paths;
import java.util.Scanner;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public final class QuizRunner {

  private final Scanner scanner;
  private final QuizConfig quizConfig;

  public QuizRunner(QuizConfig quizConfig, Scanner scanner) {
    this.quizConfig = quizConfig;
    this.scanner = scanner;
  }

  public void run(String... args) throws Exception {
    if (isJUnitTest()) {
      return;
    }
    System.out.println("\n");
    String mode = getModeFromCommandLine(args);
    switch (mode) {
      case "proctor":
        var proctor = new QuizProctor(quizConfig, scanner);
        proctor.proctor(new File(getDataPath()));
        break;
      case "generator":
        var answersFile = new File(getResourcesPath() + File.separator + "quiz-answers.yml");
        var generator = new QuizAnswerKeyGenerator(new QuizPrompter(scanner));
        generator.collectAnswers(quizConfig.getQuestions("default"), answersFile);
        break;
      default:
        throw new AssertionError();
    }
  }

  private static boolean isJUnitTest() {
    for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
      if (element.getClassName().startsWith("org.junit.")) {
        return true;
      }
    }
    return false;
  }

  private static String getModeFromCommandLine(String[] args) throws IllegalArgumentException {
    Options options = new Options();
    options.addOption(
        Option.builder("m")
            .longOpt("mode")
            .hasArg()
            .valueSeparator('=')
            .desc(
                "The quiz runner mode to use. Options are 'proctor' (default), 'generator', and 'grader'.")
            .build());
    var parser = new DefaultParser();
    var formatter = new HelpFormatter();
    try {
      CommandLine cmd = parser.parse(options, args);
      return cmd.getOptionValue("mode", "proctor");
    } catch (ParseException e) {
      System.out.println();
      System.out.println(e.getMessage());
      formatter.printHelp("quizrunner", options);

      System.exit(1);
    }
    return null;
  }

  private static String getResourcesPath() {
    String[] pathParts = {Paths.get("").toAbsolutePath().toString(), "src", "main", "resources"};
    return String.join(File.separator, pathParts);
  }

  public static String getDataPath() {
    String[] pathParts = {getResourcesPath(), "data"};
    return String.join(File.separator, pathParts);
  }
}
