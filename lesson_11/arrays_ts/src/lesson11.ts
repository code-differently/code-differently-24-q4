/**
 * Provide the solution to LeetCode 1929 here:
 * https://leetcode.com/problems/concatenation-of-array
 */
export function getConcatenation(nums: number[]): number[] {
  const ans: number[] = [...nums, ...nums];
  return ans;
}

/**
 * Provide the solution to LeetCode 2942 here:
 * https://leetcode.com/problems/find-words-containing-character/
 */
export function findWordsContaining(words: string[], x: string): number[] {
  const output: number[] = [];
  for (let i = 0; i < words.length; i++) {
      if (words[i].includes(x)) {
          output.push(i);
      }
    }
  return output;
}
