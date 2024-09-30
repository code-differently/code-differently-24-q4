import { flush, proxy } from '@alfonso-presa/soft-assert';
import { beforeAll, describe, expect, it } from '@jest/globals';
import { Test, TestingModule } from '@nestjs/testing';
import {
  AnswerChoice,
  QuizConfig,
  QuizQuestion,
} from 'codedifferently-instructional';
import path from 'path';
import { fileURLToPath } from 'url';
import { AppModule } from './app.module.js';
import { Quizzes } from './quizzes/quizzes.module.js';

const __filename = fileURLToPath(import.meta.url); // get the resolved path to the file
const __dirname = path.dirname(__filename); // get the name of the directory
const softExpect = proxy(expect);

describe('Lesson3Test', () => {
  let moduleFixture: TestingModule;
  let quizConfig: QuizConfig;
  let quizQuestionsByProvider: Map<string, QuizQuestion[]>;

  beforeAll(async () => {
    moduleFixture = await Test.createTestingModule({
      imports: [AppModule],
    }).compile();

    quizConfig = new QuizConfig(path.resolve(__dirname, '../quiz.yaml'));

    makeQuestions();
  });

  const makeQuestions = () => {
    const quizzes = moduleFixture.get(Quizzes);
    quizQuestionsByProvider = new Map();
    for (const quiz of quizzes) {
      if (quizQuestionsByProvider.has(quiz.getProviderName())) {
        throw new Error(`Duplicate provider name: ${quiz.getProviderName()}`);
      }
      const questions = [...quiz.makeQuizQuestions()];
      questions.sort((a, b) => a.getQuestionNumber() - b.getQuestionNumber());
      quizQuestionsByProvider.set(quiz.getProviderName(), questions);
    }
  };

  afterEach(() => {
    flush();
  });

  it('assembles questions correctly', async () => {
    for (const quizQuestions of quizQuestionsByProvider.values()) {
      // Expect the right number of questions.
      expect(quizQuestions.length).toBe(2);

      // Expect questions to be numbered correctly.
      for (let i = 0; i < quizQuestions.length; i++) {
        expect(quizQuestions[i].getQuestionNumber()).toBe(i);
      }
    }
  });

  it('checks for unique prompts', async () => {
    for (const quizQuestions of quizQuestionsByProvider.values()) {
      const questionPrompts = new Set(
        quizQuestions.map((q) => q.getQuestionPrompt()),
      );
      expect(questionPrompts.size).toBe(2);
    }
  });

  it('checks correct number of answers are configured', async () => {
    for (const [providerName, questions] of quizQuestionsByProvider) {
      expect(quizConfig.size(providerName)).toBe(questions.length);
    }
  });

  const maybeIt = process.env.PROVIDER_NAME ? it : it.skip;

  maybeIt('checks for correct answers', async () => {
    const targetProviderName =
      process.env.PROVIDER_NAME?.toLowerCase().trim() || '';

    if (!quizQuestionsByProvider.has(targetProviderName)) {
      throw new Error(`Unknown provider name: ${targetProviderName}`);
    }

    for (const [providerName, questions] of quizQuestionsByProvider) {
      if (providerName !== process.env.PROVIDER_NAME?.toLowerCase().trim()) {
        continue;
      }
      for (const question of questions) {
        const actualAnswer = question.getAnswer();
        softExpect(actualAnswer).not.toBe(AnswerChoice.UNANSWERED);
        softExpect(
          await quizConfig.checkAnswer(
            providerName,
            question.getQuestionNumber(),
            actualAnswer,
          ),
        ).toBe(true);
      }
    }
  });
});
