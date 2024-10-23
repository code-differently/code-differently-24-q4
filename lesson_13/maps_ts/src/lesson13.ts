/**
 * Provide the solution to LeetCode 3146 here:
 * https://leetcode.com/problems/permutation-difference-between-two-strings
 */
export function findPermutationDifference(s: string, t: string): number {
    let result = 0;
    const strLen: number = s.length;
    for (let i = 0; i < strLen; i++) {
        const ch: string = s.charAt(i);
        result = result + Math.abs(s.indexOf(ch) - t.indexOf(ch));
    }
    return result;
}