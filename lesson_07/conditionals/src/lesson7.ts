/**
 * Returns true if the provided age meets the minimum US voting age and false otherwise.
 *
 * @param age The age to check.
 * @return True if the age corresponds to a voting age and false otherwise.
 */
export function canVote(age: number): boolean {
  if (age >= 18) {
    console.log("You can Vote");
    return true;
  } else console.log("you cannot vote");
  return false;
}

/**
 * Compares two strings lexicographically.
 *
 * @param a The first string to compare.
 * @param b The second string to compare.
 * @return -1 if a is less than b, 1 if a is greater than b, and 0 otherwise.
 */
export function compareStrings(a: string, b: string): number {
  // The distance will be a number less than 0 if string a is lexicographically less than b, 1
  // if it is greater, and 0 if the strings are equal.
  // TODO(you): Finish this method.

  if (a === b) {
    return 0;
  } else if (a > b) {
    return 1;
  } else return -1;
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
  switch (true) {
    case gpa >= 4.0:
      return "A";
    case gpa >= 3.7 && gpa <= 3.99:
      return "A-";
    case gpa >= 3.3 && gpa <= 3.69:
      return "B+";
    case gpa >= 3 && gpa <= 3.29:
      return "B";
    case gpa >= 2.7 && gpa <= 2.99:
      return "B-";
    case gpa >= 2.3 && gpa <= 2.69:
      return "C+";
    case gpa >= 2 && gpa <= 2.29:
      return "C";
    case gpa >= 1.7 && gpa <= 1.99:
      return "C-";
    case gpa >= 1.3 && gpa <= 1.69:
      return "D+";
    case gpa >= 1 && gpa <= 1.29:
      return "D";
    default:
      return "F";
  }
}
/**
 * Computes the factorial of the given value of n.
 *
 * @param n The value for which to compute the factorial.
 * @return The factorial of n.
 */
export function computeFactorial(n: number): number {
  if (n === 1 || n === 0) {
    return 1;
  } else {
    let factorial = 1; //initialize variable
    for (
      let i = 2;
      i <= n;
      i++ // i starts at 2 and increments until it is equal to n
    )
      factorial = factorial * i; // factorial loops by multiplying with i until it = n
    return factorial;
  }
}

/**
 * Adds all of the provided values and returns the sum.
 *
 * @param values The values to sum.
 * @return The sum of all the values.
 */
export function addNumbers(values: number[]): number {
  let sum = 0; // initialize variable

  // eslint-disable-next-line @typescript-eslint/prefer-for-of
  for (let i = 0; i < values.length; i++) {
    // loop starting 0 as long as i is less than the length of values array increment
    sum = sum + values[i]; // add the values in the array;
  }
  return sum;
}

/**
 * Returns an array of the first n Fibonacci numbers starting from 1.
 *
 * @param n The first n of Fibonacci values to compute.
 * @return An array containing the first n Fibonacci values.
 */
export function getFirstNFibonacciNumbers(n: number): number[] {
  const array: number[] = [];

  if (n === 0) {
    return array;
  }

  if (n >= 1) {
    array.push(1); // Add the first Fibonacci number
  }
  if (n >= 2) {
    array.push(1);
  }
  // starting at 2 increment i until it is = n
  for (let i = 2; i < n; i++) {
    const Fibonacci = array[i - 1] + array[i - 2]; //add the numbers 2 positions behind to get current position
    array.push(Fibonacci);
  }

  return array;
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

  // If values[pivotIndex] is equal to value then return pivotIndex.
  // Else if values[pivotIndex] is greater than the value, then
  // call binarySearch(values, start, pivotIndex - 1, value) and return its value;
  // Else call binarySearch(values, pivotIndex + 1, end, value) and return its value.
  if (values[pivotIndex] === value) return pivotIndex;
  else if (values[pivotIndex] > value)
    return binarySearch(values, start, pivotIndex - 1, value);
  else return binarySearch(values, pivotIndex + 1, end, value);
}
