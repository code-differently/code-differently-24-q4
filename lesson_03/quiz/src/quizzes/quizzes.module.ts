import { Module } from '@nestjs/common';
import { AnotherQuiz } from './another_quiz.js';
import { AnthonyMaysQuiz } from './anthony_mays_quiz.js';
import { JosephCaballeroQuiz } from './joseph_caballero_quiz.js';
import { OyeyemiJimohQuiz } from './oyeyemi_jimoh_quiz.js';
import { YafiahAbdullahQuiz } from './yafiah_abdullah_quiz.js';
import { ZionBuchananQuiz } from './zion_buchanan_quiz.js';

export const Quizzes = Symbol.for('Quizzes');

// Add your quiz provider here.

const QUIZ_PROVIDERS = [
  AnthonyMaysQuiz,
  YafiahAbdullahQuiz,
  AnotherQuiz,
  JosephCaballeroQuiz,
  OyeyemiJimohQuiz,
  ZionBuchananQuiz,
];

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
