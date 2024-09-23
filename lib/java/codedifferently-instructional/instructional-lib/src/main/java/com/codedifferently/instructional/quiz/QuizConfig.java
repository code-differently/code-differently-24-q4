package com.codedifferently.instructional.quiz;

import at.favre.lib.crypto.bcrypt.BCrypt;
import at.favre.lib.crypto.bcrypt.BCrypt.Verifyer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

/** Loads quiz answers from the config file and uses bcrypt to check provided answers. */
@Component
@ConfigurationProperties(prefix = "quiz")
@PropertySources({
  @PropertySource(
      value = "classpath:application.yml",
      factory = MultipleYamlPropertySourceFactory.class),
  @PropertySource(
      value = "classpath:quiz-answers.yml",
      factory = MultipleYamlPropertySourceFactory.class,
      ignoreResourceNotFound = true)
})
public class QuizConfig {

  private Map<String, List<String>> answersByProvider;
  private Map<String, List<QuizQuestion>> questionsByProvider;
  private Verifyer verifyer = BCrypt.verifyer();
  private String quizTaker = "";

  public void setAnswers(Map<String, List<String>> answersByProvider) {
    this.answersByProvider = answersByProvider;
  }

  public void setQuizTaker(String quizTaker) {
    this.quizTaker = quizTaker;
  }

  public String getQuizTaker() {
    return this.quizTaker;
  }

  public void setQuestions(Map<String, List<QuestionConfig>> questionsByProvider) {
    if (questionsByProvider == null) {
      this.questionsByProvider = new HashMap<>();
      return;
    }
    this.questionsByProvider =
        (Map<String, List<QuizQuestion>>)
            questionsByProvider.entrySet().stream()
                .collect(
                    Collectors.toMap(Map.Entry::getKey, e -> convertToQuizQuestions(e.getValue())));
  }

  private List<QuizQuestion> convertToQuizQuestions(List<QuestionConfig> configs) {
    var questions = new ArrayList<QuizQuestion>();
    for (var i = 0; i < configs.size(); ++i) {
      QuestionConfig config = configs.get(i);
      if (config.choices == null) {
        questions.add(new QuizQuestion(i, config.prompt, ""));
      } else {
        questions.add(
            new MultipleChoiceQuizQuestion(
                i, config.prompt, config.choices, AnswerChoice.UNANSWERED));
      }
    }
    return questions;
  }

  public List<QuizQuestion> getQuestions(String provider) {
    return this.questionsByProvider.get(provider);
  }

  public boolean checkAnswer(String provider, int questionNumber, String actualAnswer) {
    List<String> answers = answersByProvider.get(provider);
    Objects.requireNonNull(answers, "No answers found for provider: " + provider);
    return verifyer.verify(actualAnswer.toCharArray(), answers.get(questionNumber)).verified;
  }

  public int size(String provider) {
    if (!answersByProvider.containsKey(provider)) {
      return 0;
    }
    return answersByProvider.get(provider).size();
  }

  record QuestionConfig(String prompt, Map<AnswerChoice, String> choices) {}
}
