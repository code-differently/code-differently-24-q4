/**
 * Provide the solution to LeetCode 3146 here:
 * https://leetcode.com/problems/permutation-difference-between-two-strings
 */
export function findPermutationDifference(s: string, t: string): number {
  const charLocation = new Map<string, number>();
  let charSum = 0;
  for (let i = 0; i < s.length; i++) {
    charLocation.set(s[i], i);
  }
  for (let i = 0; i < t.length; i++) {
    const charResult = charLocation.get(t.charAt(i));
    if (charResult !== undefined) {
      charSum += Math.abs(charResult - i);
    }
  }
  return charSum;
}
