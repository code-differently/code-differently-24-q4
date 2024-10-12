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
  if (gpa >= 4.0) {
    return "A+";
  } else if (gpa > 3.7 && gpa < 4.0) {
    return "A";
  } else if (gpa > 3.3 && gpa <= 3.7) {
    return "A-";
  } else if (gpa > 3.0 && gpa <= 3.3) {
    return "B+";
  } else if (gpa > 2.7 && gpa <= 3.0) {
    return "B";
  } else if (gpa > 2.3 && gpa <= 2.7) {
    return "B-";
  } else if (gpa > 2.0 && gpa <= 2.3) {
    return "C+";
  } else if (gpa > 1.7 && gpa <= 2.0) {
    return "C";
  } else if (gpa > 1.3 && gpa <= 1.7) {
    return "C-";
  } else if (gpa > 1.0 && gpa <= 1.3) {
    return "D+";
  } else if (gpa > 0.0 && gpa <= 1.0) {
    return "D";
  } else if (gpa < 0.0) {
    return "F";
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
  for (let i = 1; i <= n; i++) {
    // I used i+1 and fell into an infinite loop. My bad!
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
//This question nearly had me in tears and I'm sad to say that in the end
// I had to seek help. However, I think if I can explain what I learned as
// I go, that help would not have been in vain. Again, pardon the long notes.
export function getFirstNFibonacciNumbers(n: number): number[] {
  const myArray: number[] = []; // First: initiatialize an empty array inside the function
  // Next:Take care of base case since the first two Fibonacci numbers are 1, 1.
  // If n is 1, return an array with the first number. If n is 2, return an array with
  // the first two numbers. This step is crucial for ensuring the loop works properly.
  if (n <= 0) return [];
  if (n === 1) return [1];
  if (n === 2) return [1, 1];
  myArray.push(1, 1);

  for (let i = 2; i < n; i++) {
    //initialization(stats at 2 because I added the first two numbers in the sequence above)
    // so this tells the function to start computing from the 3rd number. Condition: this tells
    // the function that it can only work with numbers less than the given number.
    // Increment: this tells the function to move on to the next number by 1 (no infinite loops).
    const nextNum = myArray[i - 1] + myArray[i - 2];
    myArray.push(nextNum); // adds the new number to the array to continue the loop
  }
  return myArray;
}

console.log(getFirstNFibonacciNumbers(7));

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

  if (values[pivotIndex] === value) {
    return pivotIndex;
  } else if (values[pivotIndex] > value) {
    return binarySearch(values, start, pivotIndex - 1, value);
  }
  return binarySearch(values, pivotIndex + 1, end, value);
}
// This problem was much easier to write out because of question 6.
