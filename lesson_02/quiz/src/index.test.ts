import {
  QuizConfig,
  QuizQuestion,
  AnswerChoice,
} from "codedifferently-instructional";
import { Lesson2 } from "./index.js";
import { beforeEach, afterEach, describe, it, expect } from "@jest/globals";

describe("Lesson2Test", () => {
  let quizConfig: QuizConfig = new QuizConfig(
    "/workspaces/code-differently-24-q4/lesson_02/quiz/src/answers.yaml",
  );
  let quizQuestions: QuizQuestion[];

  const EXPECTED_NUMBER_OF_QUESTIONS = 11;

  beforeEach(() => {
    getQuestions();
  });

  const getQuestions = () => {
    const questions = Lesson2.makeQuizQuestions().sort(
      (a, b) => a.getQuestionNumber() - b.getQuestionNumber(),
    );
    quizQuestions = questions;
  };

  it("checkQuizQuestions_areAssembledCorrectly", () => {
    // Expect the right number of questions.
    expect(quizQuestions.length).toBe(EXPECTED_NUMBER_OF_QUESTIONS);

    // Expect questions to be numbered correctly.
    for (let i = 0; i < quizQuestions.length; i++) {
      expect(quizQuestions[i].getQuestionNumber()).toBe(i);
    }
  });

  it("checkQuizQuestions_promptsAreUnique", () => {
    const questionPrompts = new Set(
      quizQuestions.map((q) => q.getQuestionPrompt()),
    );
    expect(questionPrompts.size).toBe(EXPECTED_NUMBER_OF_QUESTIONS);
  });

  it("checkQuestions_answeredCorrectly", async () => {
    expect(quizConfig.size("default")).toBe(quizQuestions.length);

    for (const question of quizQuestions) {
      const actualAnswer = question.getAnswer();

      // Check that the question was answered.
      expect(actualAnswer).not.toBe(AnswerChoice.UNANSWERED);

      // Check that the answer is correct.
      console.log(
        "Checking answer for question: ",
        question.getQuestionNumber(),
      );
      expect(
        await quizConfig.checkAnswer(
          "default",
          question.getQuestionNumber(),
          actualAnswer,
        ),
      ).toBe(true);
    }
  });
});
