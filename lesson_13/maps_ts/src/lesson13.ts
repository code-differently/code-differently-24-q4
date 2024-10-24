/**
 * Provide the solution to LeetCode 3146 here:
 * https://leetcode.com/problems/permutation-difference-between-two-strings
 */
export function findPermutationDifference(s: string, t: string): number {
    let sum = 0;
    const strStone = new Map<string, number>();

    for (let i = 0; i < s.length; i++) {
      strStone.set(s.charAt(i),i);
    }
    for (const key of strStone.keys()) {
      const indexSTR = t.indexOf(key);
        sum += Math.abs(s.indexOf(key) - indexSTR);
     }
     return sum;
}
