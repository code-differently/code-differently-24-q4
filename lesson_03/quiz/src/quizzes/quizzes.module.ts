import { Module } from "@nestjs/common";
import { AnthonyMaysQuiz } from "./anthony_mays_quiz.js";

export const Quizzes = Symbol.for("Quizzes");

@Module({
  providers: [
    AnthonyMaysQuiz,
    {
      provide: Quizzes,
      useFactory: (...args) => [...args],
      inject: [AnthonyMaysQuiz],
    },
  ],
})
export class QuizzesModule {}
