import { computeLexicographicDistance } from "./util.js";

/** (Q1)
 * Returns true if the provided age meets the minimum US voting age and false otherwise.
 *
 * @param age The age to check.
 * @return True if the age corresponds to a voting age and false otherwise.
 */
export function canVote(age: number): boolean {
  return age >= 18;
}

const age = 12;
let checkAge;

if (canVote(age)) {
  checkAge = true;
} else {
  checkAge = false;
}

console.log(checkAge);

/** (Q2)
 * Compares two strings lexicographically.
 *
 * @param a The first `string` to compare.
 * @param b The second `string` to compare.
 * @return -1 if a is less than b, 1 if a is greater than b, and 0 otherwise.
 */
export function compareStrings(a: string, b: string): number {
  const distance = computeLexicographicDistance(a, b);
  return distance;
}

export function computeLexicographicDistance(a: string, b: string): number {
  //I literally used export function again because typescript kept telling me
  // that my return statements needed to be inside the body of a function.
  // I'm a bit skeptical because we are supposed to be DRY! and the only thing I
  // changed was the function name. But it worked. I'm just leaving this note
  // to remind myself to ask for clarification about this.
  if (a < b) {
    return -1;
  } else if (a > b) {
    return 1;
  } else {
    return 0;
  }
}

const result = compareStrings("Kimberlee", "haldane");
console.log(result);

//If I am understanding question 2 correctly, because the first function
// 'compareStrings' calls on a second function 'computeLexicographicDistance',
// I needed to set up both functions. The first function calls the second
// and the second function does the actual calculation and determines if each string
// is one of this set (-1, 1, 0). Testing is when the first function comes
//back into play, comparing two strings and returning a numerical result. Sorry
// for the long note, it took me a VERY long time to get to this understanding.
// I just hope I am right.

/** (Q3)
 * Converts a GPA on the 4.0 scale to the corresponding letter grade using the college board
 * scale. See
 * https://bigfuture.collegeboard.org/plan-for-college/college-basics/how-to-convert-gpa-4.0-scale
 * for details.
 *
 * @param gpa The GPA value.
 * @return The letter grade ("A+", "A", "A-", "B+", etc.).
 */
export function myGrade(grade: number): string {
  const gpa = convertGpaToLetterGrade(grade);
  return gpa;
}

//I followed the same logic as question 2. I can already tell that
// there may be many simpler ways to build this function. I am just
// happy it came out with no errors and will make a note to play around
// with this and see if I can't get it to look better (simpler/cleaner).

export function convertGpaToLetterGrade(gpa: number): string {
  if (gpa < 65) {
    return "F";
  } else if (gpa < 67 && gpa >= 65) {
    return "D";
  } else if (gpa < 70 && gpa >= 67) {
    return "D+";
  } else if (gpa < 73 && gpa >= 70) {
    return "C-";
  } else if (gpa < 77 && gpa >= 73) {
    return "C";
  } else if (gpa < 80 && gpa >= 77) {
    return "C+";
  } else if (gpa < 83 && gpa >= 80) {
    return "B-";
  } else if (gpa < 87 && gpa >= 83) {
    return "B";
  } else if (gpa < 90 && gpa >= 87) {
    return "B+";
  } else if (gpa < 93 && gpa >= 90) {
    return "A-";
  } else if (gpa < 97 && gpa >= 93) {
    return "A";
  } else if (gpa <= 100 && gpa >= 97) {
    return "A+";
  } else {
    return "unable to assess";
  }
}

const grade = convertGpaToLetterGrade(32);
console.log(grade);

/** (Q4)
 * Computes the factorial of the given value of `n`.
 *
 * @param n The value for which to compute the factorial.
 * @return The factorial of n.
 */
export function computeFactorial(n: number): number {
  let result = 1;
  for (let i = 1; i <= n; i++) { // I used i+1 and fell into an infinite loop. My bad!
    result *= i;
  }
  return result;
}
// Steps I followed: Describe the function, Declare the function, crawl inside the function
const n = 7;
console.log(computeFactorial(n));


/** (Q5)
 * Adds all of the provided values and returns the sum.
 *
 * @param values The values to sum.
 * @return The sum of all the values.
 */
export function addNumbers(values: number[]): number {
  let total = 0;
  for (const value of values) {
    total += value;
  }
  return total;
}

const numbers = [8, 4, 6, 2, 7];
const sum = addNumbers(numbers);
console.log(sum);

/** (Q6)
 * Returns an array of the first `n` Fibonacci numbers starting from 1.
 *
 * @param n The first `n` of Fibonacci values to compute.
 * @return An array containing the first `n` Fibonacci values.
 */
export function getFirstNFibonacciNumbers(n: number): number[] {
  return [];
}

/** (Q7)
 * Finds a value in an array of values.
 *
 * @param values The values to search.
 * @param start The left most index to search.
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
    // The range is not valid so just return -1.
    return -1;
  }

  const pivotIndex = Math.floor((start + end) / 2); // The index in the middle of the array.

  // TODO(you): Finish implementing this algorithm

  // If values[pivotIndex] is equal to value then return `pivotIndex`.
  // Else if values[pivotIndex] is greater than the value, then
  // call `binarySearch(values, start, pivotIndex - 1, value)` and return its value;
  // Else call `binarySearch(values, pivotIndex + 1, end, value)` and return its value.
  return -1;
}
