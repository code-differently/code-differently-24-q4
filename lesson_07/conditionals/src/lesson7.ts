import { computeLexicographicDistance } from "./util.js";

/**
 * Returns true if the provided age meets the minimum US voting age and false otherwise.
 *
 * @param age The age to check.
 * @return True if the age corresponds to a voting age and false otherwise.
 */
export function canVote(age: number): boolean {
  if (age>=18){
    return true;
  }
  else{
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
  if (distance>0){
    return 1;
  }
  if (distance<0){
    return -1
  }
  else{
    return 0;
  }
}

/**
 * Converts a GPA on the 4.0 scale to the corresponding letter grade using the college board
 * scale. See
 * https://bigfuture.collegeboard.org/plan-for-college/college-basics/how-to-convert-gpa-4.0-scale
 * for details.
 *  A+	97-100	4.0
    A	93-96	4.0
    A-	90-92	3.7
    B+	87-89	3.3
    B	83-86	3.0
    B-	80-82	2.7
    C+	77-79	2.3
    C	73-76	2.0
    C-	70-72	1.7
    D+	67-69	1.3
    D	65-66	1.0
    E/F	Below 65	0.0
 * @param gpa The GPA value.
 * @return The letter grade ("A+", "A", "A-", "B+", etc.).
 */
export function convertGpaToLetterGrade(gpa: number): string {
  let letterGrade = "N/A";
  if (gpa===4.0){
    letterGrade = "A";
    return letterGrade;
  }
  else if (gpa>=3.7 && gpa<4.0){
    letterGrade = "A-";
    return letterGrade;
  }
  else if (gpa>=3.3 && gpa<3.7){
    letterGrade = "B+";
    return letterGrade;
  }
  else if (gpa>=3.0 && gpa<3.3){
    letterGrade = "B";
    return letterGrade;
  }
  else if (gpa>=2.7 && gpa<3.0){
    letterGrade = "B-";
    return letterGrade;
  }
  else if (gpa>=2.3 && gpa<2.7){
    letterGrade = "C+";
    return letterGrade;
  }
  else if (gpa>=2.0 && gpa<2.3){
    letterGrade = "C";
    return letterGrade;
  }
  else if (gpa>=1.7 && gpa<2.0){
    letterGrade = "C-";
    return letterGrade;
  }
  else if (gpa>=1.3 && gpa<1.7){
    letterGrade = "D+";
    return letterGrade;
  }
  else if (gpa>=1.0 && gpa<1.3){
    letterGrade = "D";
    return letterGrade;
  }
  else if (gpa>=0 && gpa<1.0){
    letterGrade = "F";
    return letterGrade;
  }
  else{
    return letterGrade;
  }
}

/**
 * Computes the factorial of the given value of `n`.
 *
 * @param n The value for which to compute the factorial.
 * @return The factorial of n.
 */
export function computeFactorial(n: number): number {
  let fact = 0;
  if (n>0){
    fact = 1;
    const numbers = Array.from({ length: n }, (_, index) => index + 1);
    for (const i of numbers) {
      fact *= i;
    }
    return fact;
  }
  return fact;
}

/**
 * Adds all of the provided values and returns the sum.
 *
 * @param values The values to sum.
 * @return The sum of all the values.
 */
export function addNumbers(values: number[]): number {
  let sum=0;
  if (values.length>0){
    for (const value of values) {
      sum += value;
}
    return sum;
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
  const list: number[] = [];
  const indices = Array.from({ length: n - 1 }, (_, index) => index + 2);
  if (n>=1){
    list.push(0);
  }
  if (n>=2){
    list.push(1);
  }
  if (n>=3){
    for (const i of indices) {
      list[i] = list[i - 1] + list[i - 2];
    }
  }
  return list;
}

/**
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
  if (values[pivotIndex]===value){
    return pivotIndex;
  }
  else if(values[pivotIndex]>value){
    return binarySearch(values, start, pivotIndex-1, value);
  }
  else{
    return binarySearch(values, pivotIndex + 1, end, value);
  }
}
