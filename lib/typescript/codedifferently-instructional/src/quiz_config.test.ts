import { QuizConfig } from "./quiz_config.js";
import { AnswerChoice, MultipleChoiceQuizQuestion } from "./multiple_choice_quiz_question.js";
import fs from "fs";
import path from "path";

describe("QuizConfig", () => {
  const sampleConfigContent = `
    quiz:
      answers:
        default:
          - $2b$10$pdBfv9lsxilbVKghcMh8H.wzvspj6bBgrEszebz/QEu/E6V8pZ5by # bcrypt hash for "B"
          - $2y$10$RHzYUNhX9.KjzK67TV3rBunpnwBz7Erc95Bpd0crf0j.nsKRMZ3kS # bcrypt hash for "C"
      questions:
        default:
          - prompt: "What is 2+2?"
            choices:
              A: "3"
              B: "4"
              C: "5"
          - prompt: "What is the capital of France?"
            choices:
              A: "Berlin"
              B: "Madrid"
              C: "Paris"
  `;

  beforeEach(() => {
    jest.spyOn(fs, 'readFileSync').mockReturnValue(sampleConfigContent);
  });

  it("should load the configuration correctly", () => {
    const quizConfig = new QuizConfig('some/path');

    const questions = quizConfig.getQuestions("default")!;
    expect(questions).toHaveLength(2);

    const question1 = questions[0] as MultipleChoiceQuizQuestion;
    expect(question1.getQuestionPrompt()).toBe("What is 2+2?");
    expect(question1.getAnswerForOption(AnswerChoice.A)).toBe("3");
    expect(question1.getAnswerForOption(AnswerChoice.B)).toBe("4");
    expect(question1.getAnswerForOption(AnswerChoice.C)).toBe("5");

    const question2 = questions[1] as MultipleChoiceQuizQuestion;
    expect(question2.getQuestionPrompt()).toBe("What is the capital of France?");
    expect(question2.getAnswerForOption(AnswerChoice.A)).toBe("Berlin");
    expect(question2.getAnswerForOption(AnswerChoice.B)).toBe("Madrid");
    expect(question2.getAnswerForOption(AnswerChoice.C)).toBe("Paris");

    const answers = quizConfig.size("default");
    expect(answers).toBe(2);
  });

  it("should throw an error if no answers are found for the provider", async () => {
    const quizConfig = new QuizConfig('some/path');

    await expect(quizConfig.checkAnswer("nonexistent", 0, "answer")).rejects.toThrow(
      "No answers found for provider: nonexistent"
    );
  });

  it("should correctly check answers", async () => {
    const quizConfig = new QuizConfig('some/path');

    const isCorrect1 = await quizConfig.checkAnswer("default", 0, AnswerChoice.B);
    expect(isCorrect1).toBe(true);

    const isCorrect2 = await quizConfig.checkAnswer("default", 1, AnswerChoice.C);
    expect(isCorrect2).toBe(true);

    const isIncorrect = await quizConfig.checkAnswer("default", 0, "wrongAnswer");
    expect(isIncorrect).toBe(false);
  });
});