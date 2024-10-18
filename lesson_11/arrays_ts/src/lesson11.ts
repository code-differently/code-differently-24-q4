/**
 * Provide the solution to LeetCode 1929 here:
 * https://leetcode.com/problems/concatenation-of-array
 */
export function getConcatenation(nums: number[]): number[] {
  const ans: number[] = [];
  for (const num of nums) {
    ans.push(num);
  }
  for (const num of nums) {
    ans.push(num);
  }
  return ans;
}

/**
 * Provide the solution to LeetCode 2942 here:
 * https://leetcode.com/problems/find-words-containing-character/
 */
export function findWordsContaining(words: string[], x: string): number[] {
  const num: number[] = [];
  for (const word of words) {
    const wordArr = word.split('');
    const containsX = wordArr.some((char) => x.includes(char));
    if (containsX) {
      num.push(words.indexOf(word));
    }
  }
  return num;
}
