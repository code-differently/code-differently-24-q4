/**
 * Provide the solution to LeetCode 3146 here:
 * https://leetcode.com/problems/permutation-difference-between-two-strings
 */
export function findPermutationDifference(s: string, t: string): number {
  const sMap = new Map<string, number>();
  let sum = 0;
  for (let i = 0; i < s.length; i++) {
    sMap.set(s.charAt(i), i);
  }
  for (const key of sMap.keys()) {
    const val1 = sMap.get(key);
    if (val1 !== undefined) {
      sum += Math.abs(val1 - t.indexOf(key));
    }
  }
  return sum;
}
