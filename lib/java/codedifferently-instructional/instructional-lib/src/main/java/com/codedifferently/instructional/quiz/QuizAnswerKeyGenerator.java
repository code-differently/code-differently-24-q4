package com.codedifferently.instructional.quiz;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator.Feature;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuizAnswerKeyGenerator {
  private final QuizPrompter prompter;
  private BCrypt.Hasher hasher = BCrypt.withDefaults();
  private static final int COST_FACTOR = 10;

  public QuizAnswerKeyGenerator(QuizPrompter prompter) {
    this.prompter = prompter;
  }

  public void setHasher(BCrypt.Hasher hasher) {
    this.hasher = hasher;
  }

  public void collectAnswers(List<QuizQuestion> questions, File answersFile) throws IOException {
    for (QuizQuestion question : questions) {
      promptForAnswer(question);
    }
    var encryptedAnswers = getEncrypedAnswers(questions);
    writeAnswersToFile(encryptedAnswers, answersFile);
  }

  private void promptForAnswer(QuizQuestion question) {
    prompter.promptForAnswer(question, true /* require answer */);
  }

  private void writeAnswersToFile(List<String> encryptedAnswers, File answersFile)
      throws IOException {
    var mapper = createYamlMapper();
    Map propertyMap = getPropertyMap(encryptedAnswers);
    mapper.writeValue(answersFile, propertyMap);
  }

  private ObjectMapper createYamlMapper() {
    return new ObjectMapper(
        new YAMLFactory().disable(Feature.WRITE_DOC_START_MARKER).enable(Feature.MINIMIZE_QUOTES));
  }

  private Map getPropertyMap(List<String> encryptedAnswers) {
    var answers = new HashMap<String, List<String>>();
    answers.put("default", encryptedAnswers);
    var quizProps = new HashMap<String, Object>();
    quizProps.put("answers", answers);
    var propertyMap = new HashMap<String, Object>();
    propertyMap.put("quiz", quizProps);
    return propertyMap;
  }

  private List<String> getEncrypedAnswers(List<QuizQuestion> questions) {
    return questions.stream()
        .map(question -> hasher.hashToString(COST_FACTOR, question.getAnswer().toCharArray()))
        .collect(ArrayList<String>::new, ArrayList::add, ArrayList::addAll);
  }
}
