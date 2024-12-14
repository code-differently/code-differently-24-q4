import { QuizQuestion } from './quiz_question.js';
import { Scanner } from './scanner.js';

describe('QuizQuestion', () => {
  let question: QuizQuestion;

  beforeEach(() => {
    question = new QuizQuestion(1, 'Sample Question?', 'Correct Answer');
  });

  test('should prompt for answer and set it correctly', () => {
    const mockScanner = {
      next: jest.fn()
        .mockReturnValueOnce('') // Invalid input
        .mockReturnValueOnce('Correct Answer') // Valid input
    } as unknown as Scanner;

    console.log = jest.fn(); // Mock console.log to suppress output during test

    question.promptForAnswer(mockScanner, true);
    expect(question.getAnswer()).toBe('Correct Answer');
    expect(mockScanner.next).toHaveBeenCalledTimes(2);
  });

  test('should skip answer when "s" is entered', () => {
    const mockScanner = {
      next: jest.fn().mockReturnValueOnce('s')
    } as unknown as Scanner;

    console.log = jest.fn(); // Mock console.log to suppress output during test

    question.promptForAnswer(mockScanner);
    expect(question.getAnswer()).toBe('');
    expect(mockScanner.next).toHaveBeenCalledTimes(1);
  });

  test('should require answer and not accept skip', () => {
    const mockScanner = {
      next: jest.fn()
        .mockReturnValueOnce('s') // Attempt to skip
        .mockReturnValueOnce('Correct Answer') // Valid input
    } as unknown as Scanner;

    console.log = jest.fn(); // Mock console.log to suppress output during test

    question.promptForAnswer(mockScanner, true);
    expect(question.getAnswer()).toBe('Correct Answer');
    expect(mockScanner.next).toHaveBeenCalledTimes(2);
  });

  test('should accept empty answer if not required', () => {
    const mockScanner = {
      next: jest.fn().mockReturnValueOnce('')
    } as unknown as Scanner;

    console.log = jest.fn(); // Mock console.log to suppress output during test

    question.promptForAnswer(mockScanner);
    expect(question.getAnswer()).toBe('');
    expect(mockScanner.next).toHaveBeenCalledTimes(1);
  });
});