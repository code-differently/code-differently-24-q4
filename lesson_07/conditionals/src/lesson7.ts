//import { computeLexicographicDistance } from "./util.js";

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


export function convertGpaToLetterGrade(gpa: number): string {
  if (gpa >= 4.0) {
    return "A";
  } else if (gpa >= 3.7) {
    return "A-";
  } else if (gpa >= 3.3) {
    return "B+";
  } else if (gpa >= 3.0) {
    return "B";
  } else if (gpa >= 2.7) {
    return "B-";
  } else if (gpa >= 2.3) {
    return "C+";
  } else if (gpa >= 2.0) {
    return "C";
  } else if (gpa >= 1.7) {
    return "C-";
  } else if (gpa >= 1.3) {
    return "D+";
  } else if (gpa >= 1.0) {
    return "D";
  } else if (gpa < 1.0 && gpa >= 0) {
    return "F";
  } else {
    return "Invalid";
  }
}

const grade = convertGpaToLetterGrade(3.2);
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
   
    result *= i;
  }
  return result;
}

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
//** I had to look up how to complete this problem on google
export function getFirstNFibonacciNumbers(n: number): number[] {
  const myArray: number[] = []; 
  if (n <= 0) return [];
  if (n === 1) return [1];
  if (n === 2) return [1, 1];
  myArray.push(1, 1);

  for (let i = 2; i < n; i++) {
   
    const nextNum = myArray[i - 1] + myArray[i - 2];
    myArray.push(nextNum); 
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
    
    return -1;
  }

  const pivotIndex = Math.floor((start + end) / 2); 

  if (values[pivotIndex] === value) {
    return pivotIndex;
  } else if (values[pivotIndex] > value) {
    return binarySearch(values, start, pivotIndex - 1, value);
  }
  return binarySearch(values, pivotIndex + 1, end, value);
}

const values = [ 2, 4, 6, 8, 10, 12, 14, 16];
const index = binarySearch(values, 4, 8, 14);
console.log(index);