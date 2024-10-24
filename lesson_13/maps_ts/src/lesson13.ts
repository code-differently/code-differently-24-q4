/**
 * Provide the solution to LeetCode 3146 here:
 * https://leetcode.com/problems/permutation-difference-between-two-strings
 */
export function findPermutationDifference(s: string, t: string): number {
    let permuDifference = 0;
    // Created a counter to track Permutation Difference
    for (let i = 0; i < s.length; i++) {
      // Loops through each letter in string 's'
      const difference = s.indexOf(s.charAt(i)) - t.indexOf(s.charAt(i));
      // Subtracts possitional value of string 't' from the possitional value of string 's'
      permuDifference += Math.abs(difference);
      // Converts difference into absolute value and adds it to the Permutation Difference
    }
    return permuDifference;
    // Returns the total Permutation Difference value
  }

