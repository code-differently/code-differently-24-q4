import { computeLexicographicDistance } from "./util.js";

/**
 * Returns true if the provided age meets the minimum US voting age and false otherwise.
 *
 * @param age The age to check.
 * @return True if the age corresponds to a voting age and false otherwise.
 */

export function canVote(age: number): boolean {
  if (age >= 18) {
    return true;
  } else {
    return false;
  }
}
/**
 * Compares two strings lexicographically.
 *
 * @param a The first `string` to compare.
 * @param b The second `string` to compare.
 * @return -1 if a is less than b, 1 if a is greater than b, and 0 otherwise.
 */
export function compareStrings(a: string, b: string): number {
  // The distance will be a number less than 0 if string `a` is lexicographically less than `b`, 1
  // if it is greater, and 0 if the strings are equal.
  const distance = computeLexicographicDistance(a, b);

  //This is just an idea(That's probably wrong)/
  // TODO(you): Finish this method.
  let stringLengthCompare = 0;
  if (distance > 0) {
    stringLengthCompare = 1; //equal distances
  } else if (distance < 0) {
    stringLengthCompare = -1; //unequal distances
  }
  return stringLengthCompare;
}

/**
 * Converts a GPA on the 4.0 scale to the corresponding letter grade using the college board
 * scale. See
 * https://bigfuture.collegeboard.org/plan-for-college/college-basics/how-to-convert-gpa-4.0-scale
 * for details.
 *
 * @param gpa The GPA value.
 * @return The letter grade ("A+", "A", "A-", "B+", etc.).
 */
export function convertGpaToLetterGrade(gpa: number): string {
  if (gpa >= 4.0) {
    return "A";
  } else if (gpa <= 3.99 && gpa >= 3.7) {
    return "A-";
  } else if (gpa <= 3.69 && gpa >= 3.3) {
    return "B+";
  } else if (gpa <= 3.29 && gpa >= 3.0) {
    return "B";
  } else if (gpa <= 2.99 && gpa >= 2.7) {
    return "B-";
  } else if (gpa <= 2.69 && gpa >= 2.3) {
    return "C+";
  } else if (gpa <= 2.29 && gpa >= 2.0) {
    return "C";
  } else if (gpa <= 1.99 && gpa >= 1.7) {
    return "C-";
  } else if (gpa <= 1.69 && gpa >= 1.3) {
    return "D+";
  } else if (gpa <= 1.29 && gpa >= 1.0) {
    return "D";
  } else return "F";
}

/**
 * Computes the factorial of the given value of `n`.
 *
 * @param n The value for which to compute the factorial.
 * @return The factorial of n.
 */
export function computeFactorial(n: number): number {
  let product = 1;
  for (let i = 1; 1 <= n; i++) {
    product *= i;
  }

  return product;
}
const n = 2;

console.log(computeFactorial(n));
/**
 * Adds all of the provided values and returns the sum.
 *
 * @param values The values to sum.
 * @return The sum of all the values.
 */
export function addNumbers(values: number[]): number {
  let sum = 0;
  for (const value of values) {
    sum += value;
  }
  return sum;
}

/**
 * Returns an array of the first `n` Fibonacci numbers starting from 1.
 *
 * @param n The first `n` of Fibonacci values to compute.
 * @return An array containing the first `n` Fibonacci values.
 */
export function getFirstNFibonacciNumbers(n: number): number[] {
  if (n < 1) {
    //return [];
  }

  const fibonacci: number[] = [1, 1]; // The function starts with the first two Fibonacci numbers

  for (let i = 2; i < n; i++) {
    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]; // Here the sum of the preceeding expression(?) is iterated with the number directly preceeding it
  }

  return fibonacci.slice(0, n); // Return only the first n Fibonacci numbers
}

/**
 * Finds a value in an array of values.
 *
 * @param values The values to search.
 * @param start The left most index to search.e
 * @param end The right most index to search.
 * @param value The value to look for.
 * @return The index of the value if found in the array and -1 otherwise.
 */
export function binarySearch(
  values: number[],
  start: number,
  end: number,
  value: number,
): number {
  if (end < start) {
    return -1;
  }

  const pivotIndex = Math.floor((start + end) / 2); // The index in the middle of the array.

  if (values[pivotIndex] === value) {
    return pivotIndex;
  } else if (values[pivotIndex] > value) {
    return binarySearch(values, start, pivotIndex - 1, value);
    return value;
  } else {
    return binarySearch(values, pivotIndex + 1, end, value);
  }
  // TODO(you): Finish implementing this algorithm

  // If values[pivotIndex] is equal to value then return `pivotIndex`.
  // Else if values[pivotIndex] is greater than the value, then
  // call `binarySearch(values, start, pivotIndex - 1, value)` and return its value;
  // Else call `binarySearch(values, pivotIndex + 1, end, value)` and return its value.
  return -1;
}
