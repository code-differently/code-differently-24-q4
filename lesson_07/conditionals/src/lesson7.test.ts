import {
  addNumbers,
  binarySearch,
  canVote,
  compareStrings,
  computeFactorial,
  convertGpaToLetterGrade,
  getFirstNFibonacciNumbers,
} from "./lesson7.js";

describe("Lesson7 Tests", () => {
  test("testCanVote", () => {
    // Test when age is less than the minimum voting age
    expect(canVote(17)).toBe(false);

    // Test when age is equal to the minimum voting age
    expect(canVote(18)).toBe(true);

    // Test when age is greater than the minimum voting age
    expect(canVote(21)).toBe(true);
  });

  test("testCompareStrings", () => {
    // Test when both strings are equal
    expect(compareStrings("hello", "hello")).toBe(0);

    // Test when the first string is less than the second string
    expect(compareStrings("apple", "banana")).toBe(-1);

    // Test when the first string is greater than the second string
    expect(compareStrings("banana", "apple")).toBe(1);
  });

  test("testConvertGpaToLetterGrade", () => {
    const letterGradeByGpa: Record<string, string> = {
      "4.0": "A",
      "3.99": "A-",
      "3.7": "A-",
      "3.69": "B+",
      "3.3": "B+",
      "3.29": "B",
      "3.0": "B",
      "2.99": "B-",
      "2.7": "B-",
      "2.69": "C+",
      "2.3": "C+",
      "2.29": "C",
      "2.0": "C",
      "1.99": "C-",
      "1.7": "C-",
      "1.69": "D+",
      "1.3": "D+",
      "1.29": "D",
      "1.00": "D",
      "0.99": "F",
    };

    Object.entries(letterGradeByGpa).forEach(([gpa, grade]) => {
      expect(convertGpaToLetterGrade(parseFloat(gpa))).toBe(grade);
    });
  });

  test("testComputeFactorial", () => {
    // Test for factorial of 0
    expect(computeFactorial(0)).toBe(1);

    // Test for factorial of 5
    expect(computeFactorial(5)).toBe(120);

    // Test for factorial of 10
    expect(computeFactorial(10)).toBe(3628800);
  });

  test("testAddNumbers", () => {
    // Test for an empty array
    expect(addNumbers([])).toBe(0);

    // Test for an array with positive numbers
    expect(addNumbers([1.5, 2.5, 3.5])).toBe(7.5);

    // Test for an array with negative numbers
    expect(addNumbers([-1.5, -2.5, -3.5])).toBe(-7.5);
  });

  test("testGetFirstNFibonacciNumbers", () => {
    // Test for n = 0
    expect(getFirstNFibonacciNumbers(0)).toEqual([]);

    // Test for n = 5
    expect(getFirstNFibonacciNumbers(5)).toEqual([1, 1, 2, 3, 5]);

    // Test for n = 10
    expect(getFirstNFibonacciNumbers(10)).toEqual([
      1, 1, 2, 3, 5, 8, 13, 21, 34, 55,
    ]);
  });

  test("testBinarySearch", () => {
    const values = [1, 3, 5, 7, 9];

    // Test for value present in the array
    expect(binarySearch(values, 0, values.length - 1, 1)).toBe(0);
    expect(binarySearch(values, 0, values.length - 1, 3)).toBe(1);
    expect(binarySearch(values, 0, values.length - 1, 5)).toBe(2);
    expect(binarySearch(values, 0, values.length - 1, 7)).toBe(3);
    expect(binarySearch(values, 0, values.length - 1, 9)).toBe(4);

    // Test for value not present in the array
    expect(binarySearch(values, 0, values.length - 1, 4)).toBe(-1);
  });
});
