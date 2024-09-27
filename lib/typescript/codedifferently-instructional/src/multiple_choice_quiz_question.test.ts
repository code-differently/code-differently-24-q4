import { MultipleChoiceQuizQuestion, AnswerChoice } from './multiple_choice_quiz_question.js';
import { QuizQuestion } from "./quiz_question.js";
import { Scanner } from "./scanner.js";

describe('MultipleChoiceQuizQuestion', () => {
    let question: MultipleChoiceQuizQuestion;
    let answerOptions: Map<AnswerChoice, string>;

    beforeEach(() => {
        answerOptions = new Map([
            [AnswerChoice.A, 'Option A'],
            [AnswerChoice.B, 'Option B'],
            [AnswerChoice.C, 'Option C'],
            [AnswerChoice.D, 'Option D']
        ]);
        question = new MultipleChoiceQuizQuestion(1, 'Sample Question?', answerOptions, AnswerChoice.A);
    });

    test('should create an instance of MultipleChoiceQuizQuestion', () => {
        expect(question).toBeInstanceOf(MultipleChoiceQuizQuestion);
        expect(question).toBeInstanceOf(QuizQuestion);
    });

    test('should return correct answer choices', () => {
        const answerChoices = question.getAnswerChoices();
        expect(answerChoices).toEqual(new Set([AnswerChoice.A, AnswerChoice.B, AnswerChoice.C, AnswerChoice.D]));
    });

    test('should return correct answer for a given option', () => {
        expect(question.getAnswerForOption(AnswerChoice.A)).toBe('Option A');
        expect(question.getAnswerForOption(AnswerChoice.B)).toBe('Option B');
        expect(question.getAnswerForOption(AnswerChoice.C)).toBe('Option C');
        expect(question.getAnswerForOption(AnswerChoice.D)).toBe('Option D');
    });

    test('should set answer correctly', () => {
        question.setAnswer(AnswerChoice.B);
        expect(question.getAnswer()).toBe('B');
        question.setAnswer(null);
        expect(question.getAnswer()).toBe(AnswerChoice.UNANSWERED);
    });

    test('should prompt for answer and set it correctly', () => {
        const mockScanner = {
            next: jest.fn()
                .mockReturnValueOnce('e') // Invalid input
                .mockReturnValueOnce('b') // Valid input
        } as unknown as Scanner;

        console.log = jest.fn(); // Mock console.log to suppress output during test

        question.promptForAnswer(mockScanner);
        expect(question.getAnswer()).toBe('B');
        expect(mockScanner.next).toHaveBeenCalledTimes(2);
    });

    test('should skip answer when "s" is entered', () => {
        const mockScanner = {
            next: jest.fn().mockReturnValueOnce('s')
        } as unknown as Scanner;

        console.log = jest.fn(); // Mock console.log to suppress output during test

        question.promptForAnswer(mockScanner);
        expect(question.getAnswer()).toBe(AnswerChoice.UNANSWERED);
        expect(mockScanner.next).toHaveBeenCalledTimes(1);
    });
});