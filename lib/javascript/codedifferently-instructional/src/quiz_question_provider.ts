import { QuizQuestion } from './quiz_question.js';

/** Describes an object that provides quiz questions. */
export interface QuizQuestionProvider {
  /** Returns the name of the provider. */
  getProviderName(): string;

  /** Produces quiz questions. */
  makeQuizQuestions(): QuizQuestion[];
}
