/**
 * Provide the solution to LeetCode 3146 here:
 * https://leetcode.com/problems/permutation-difference-between-two-strings
 */
export function findPermutationDifference(s: string, t: string): number {
  const letters = new Map<string,number>();
    for (let i = 0; i < s.length; i++) {
      letters.set(s.charAt(i), i);
    }
    let permDifferences = 0;
    for (const key of letters.keys()) {
      const indexInT = t.indexOf(String(key));
       permDifferences += Math.abs(s.indexOf(key) - indexInT);
    }
    // int sumDifference = 0;
    // for (int i = 0; i < s.length(); i++) {
    //   char currentChar = s.charAt(i);
    //   int indexInT = t.indexOf(currentChar);
    //   int difference = Math.abs(i - indexInT);
    //   sumDifference += difference;

    return permDifferences;
  }

