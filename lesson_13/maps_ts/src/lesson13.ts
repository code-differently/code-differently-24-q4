/**
 * Provide the solution to LeetCode 3146 here:
 * https://leetcode.com/problems/permutation-difference-between-two-strings
 */
export function findPermutationDifference(s: string, t: string): number {
  const map = new Map<string, number>();
  let sum = 0;
  for (const char of s) {
    map.set(char, s.indexOf(char));
  }
  for (const [key, value] of map) {
    const indexOfT = t.indexOf(key);
    sum += Math.abs(value - indexOfT);
  }
  return sum;
}
