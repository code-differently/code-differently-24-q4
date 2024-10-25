/**
 * Provide the solution to LeetCode 3146 here:
 * https://leetcode.com/problems/permutation-difference-between-two-strings
 */
export function findPermutationDifference(s: string, t: string): number {
  const ABC = new Map<string, number>();
  let permDiff = 0;
  for (let i = 0; i < s.length; i++) {
    ABC.set(s.charAt(i), i);
  }

  for (const key of ABC.keys()) {
    const indexInT = t.indexOf(key);
    permDiff += Math.abs(s.indexOf(key) - indexInT);
  }
  return permDiff;
}
