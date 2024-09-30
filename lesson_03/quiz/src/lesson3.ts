import { NestFactory } from "@nestjs/core";
import { Quizzes } from "./quizzes/quizzes.module.js";
import { AppModule } from "./app.module.js";
import { INestApplicationContext } from "@nestjs/common";
import { QuizPrinter, QuizQuestion } from "codedifferently-instructional";

async function bootstrap() {
  const app = await NestFactory.createApplicationContext(AppModule);
  run(app);
  return app.close();
}

function run(app: INestApplicationContext) {
  const quizzes = app.get(Quizzes);

  for (const quiz of quizzes) {
    console.log("\nQuestions by " + quiz.getProviderName() + ":");
    printQuiz(quiz.makeQuizQuestions());
  }
}

function printQuiz(quizQuestions: Iterable<QuizQuestion>) {
  var printer = new QuizPrinter();
  printer.printQuiz(quizQuestions);
}

bootstrap();
