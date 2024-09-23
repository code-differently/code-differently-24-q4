package com.codedifferently.instructional.quiz;

import java.util.List;

/** Describes an object that provides quiz questions. */
public interface QuizQuestionProvider {
  /** Returns the name of the provider. */
  String getProviderName();

  /** Produces quiz questions. */
  List<QuizQuestion> makeQuizQuestions();
}
