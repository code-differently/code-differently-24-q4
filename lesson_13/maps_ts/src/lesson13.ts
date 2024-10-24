/**
 * Provide the solution to LeetCode 3146 here:
 * https://leetcode.com/problems/permutation-difference-between-two-strings
 */
export function findPermutationDifference(s: string, t: string): number {
  const indexMap = new Map<string, number>();

  for (let i = 0; i < s.length; i++) {
    indexMap.set(s[i], i);
  }

  let permutationDifference = 0;

  for (let i = 0; i < t.length; i++) {
    const ch = t[i];
    const indexInS = indexMap.get(ch);
    if (indexInS !== undefined) {
      permutationDifference += Math.abs(indexInS - i);
    }
  }

  return permutationDifference;
}
