/**
 * Provide the solution to LeetCode 3146 here:
 * https://leetcode.com/problems/permutation-difference-between-two-strings
 */
export function findPermutationDifference(s: string, t: string): number {
  let difference = 0;
  const indexMap = new Map<string, number>();

  for (let i = 0; i < s.length; i++) {
    indexMap.set(s[i], i);
  }

  for (let i = 0; i < t.length; i++) {
    // eslint-disable-next-line @typescript-eslint/no-non-null-assertion
    const indexInS = indexMap.get(t[i])!;
    difference += Math.abs(indexInS - i);
  }

  return difference;
}
