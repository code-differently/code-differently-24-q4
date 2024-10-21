/**
 * Provide the solution to LeetCode 1929 here:
 * https://leetcode.com/problems/concatenation-of-array
 */
export function getConcatenation(nums: number[]): number[] {
  const n = nums.length;
  const ans = new Array(2 * n);
  for (let i = 0; i < n; i++) {
    ans[i] = nums[i];
    ans[i + n] = nums[i];
  }
  return ans;
}

/**
 * Provide the solution to LeetCode 2942 here:
 * https://leetcode.com/problems/find-words-containing-character/
 */
export function findWordsContaining(words: string[], x: string): number[] {
  const indices: number[] = [];
  for (let i = 0; i < words.length; i++) {
    if (words[i].includes(x)) {
      indices.push(i);
    }
  }
  return indices;
}
