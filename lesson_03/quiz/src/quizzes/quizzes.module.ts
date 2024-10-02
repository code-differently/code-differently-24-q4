import { Module } from '@nestjs/common';
import { AmiyahJonesQuiz } from './amiyah_jones_quiz.js';
import { AngelicaCQuiz } from './angelica_c_quiz.js';
import { AnotherQuiz } from './another_quiz.js';
import { AnthonyMaysQuiz } from './anthony_mays_quiz.js';
import { ChigazoGrahamsQuiz } from './chigazo_graham_quiz.js';
import { DasiaEnglishQuiz } from './dasia_english_quiz.js';
import { JosephCaballeroQuiz } from './joseph_caballero_quiz.js';
import { OyeyemiJimohQuiz } from './oyeyemi_jimoh_quiz.js';
import { TommyTranQuiz } from './tommy_tran_quiz.js';
import { XavierCruzQuiz } from './xavier_cruz_quiz.js';
import { YafiahAbdullahQuiz } from './yafiah_abdullah_quiz.js';

export const Quizzes = Symbol.for('Quizzes');

// Add your quiz provider here.
const QUIZ_PROVIDERS = [
  AnthonyMaysQuiz,
  YafiahAbdullahQuiz,
  AnotherQuiz,
  JosephCaballeroQuiz,
  AngelicaCQuiz,
  OyeyemiJimohQuiz,
  DasiaEnglishQuiz,
  ChigazoGrahamsQuiz,
  AmiyahJonesQuiz,
  XavierCruzQuiz,
  TommyTranQuiz,
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
