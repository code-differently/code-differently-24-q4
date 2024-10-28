/**
 * Provide the solution to LeetCode 3146 here:
 * https://leetcode.com/problems/permutation-difference-between-two-strings
 */
export function findPermutationDifference(s: string, t: string): number {
  const map = new Map<string, number>();

  for (let i = 0; i < t.length; i++) {
    map.set(t[i], i);
  }

  let difference = 0;
  for (let i = 0; i < s.length; i++) {
    const idx = map.get(s[i]);
    if (idx != undefined) {
      difference += Math.abs(i - idx);
    }
  }

  return difference;
}
