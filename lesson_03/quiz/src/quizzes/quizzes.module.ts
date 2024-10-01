import { Module } from '@nestjs/common';
import { AnotherQuiz } from './another_quiz.js';
//import { AnthonyMaysQuiz } from './anthony_mays_quiz.js';
import { OyeyemiJimohQuiz } from './oyeyemi_jimoh_quiz.js';

export const Quizzes = Symbol.for('Quizzes');

// Add your quiz provider here.
//const QUIZ_PROVIDERS = [AnthonyMaysQuiz, AnotherQuiz, OyeyemiJimohQuiz];
const QUIZ_PROVIDERS = [AnotherQuiz, OyeyemiJimohQuiz];

@Module({
  providers: [
    ...QUIZ_PROVIDERS,
    {
      provide: Quizzes,
      useFactory: (...args) => [...args],
      inject: QUIZ_PROVIDERS,
    },
  ],
})
export class QuizzesModule {}
