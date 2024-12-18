import { QuizPrinter } from './quiz_printer.js';
import { QuizQuestion } from './quiz_question.js';
import { MultipleChoiceQuizQuestion, AnswerChoice } from './multiple_choice_quiz_question.js';

describe('QuizPrinter', () => {
  let printer: QuizPrinter;
  let mockConsoleLog: jest.SpyInstance;

  beforeEach(() => {
    printer = new QuizPrinter();
    mockConsoleLog = jest.spyOn(console, 'log').mockImplementation(() => {});
  });

  afterEach(() => {
    mockConsoleLog.mockRestore();
  });

  test('should print quiz question without answer', () => {
    const question = new QuizQuestion(1, 'Sample Question?', 'Correct Answer');
    printer.printQuizQuestion(question, false);

    expect(mockConsoleLog).toHaveBeenCalledWith('Question 1: Sample Question?');
    expect(mockConsoleLog).not.toHaveBeenCalledWith('>> Your answer: Correct Answer');
  });

  test('should print quiz question with answer', () => {
    const question = new QuizQuestion(1, 'Sample Question?', 'Correct Answer');
    printer.printQuizQuestion(question, true);

    expect(mockConsoleLog).toHaveBeenCalledWith('Question 1: Sample Question?');
    expect(mockConsoleLog).toHaveBeenCalledWith('>> Your answer: Correct Answer');
  });

  test('should print multiple choice question with possible answers', () => {
    const question = new MultipleChoiceQuizQuestion(1, 'Sample Question?', 
        new Map([
            [AnswerChoice.A, 'Option A'],
            [AnswerChoice.B, 'Option B'],
            [AnswerChoice.C, 'Option C'],
            [AnswerChoice.D, 'Option D']
        ]),
        AnswerChoice.C);

    printer.printQuizQuestion(question, true);

    expect(mockConsoleLog).toHaveBeenCalledWith('Question 1: Sample Question?');
    expect(mockConsoleLog).toHaveBeenCalledWith('A: Option A');
    expect(mockConsoleLog).toHaveBeenCalledWith('B: Option B');
    expect(mockConsoleLog).toHaveBeenCalledWith('C: Option C');
    expect(mockConsoleLog).toHaveBeenCalledWith('D: Option D');
    expect(mockConsoleLog).toHaveBeenCalledWith('>> Your answer: C');
  });
});