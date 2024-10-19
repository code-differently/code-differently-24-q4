/**
 * Provide the solution to LeetCode 1929 here:
 * https://leetcode.com/problems/concatenation-of-array
 */
export function getConcatenation(nums: number[]): number[] {
  if (nums.length === 0) {
    return [];
  }
  const lenOriginalArray: number = nums.length;
  const concatenatedArrays: number[] = [lenOriginalArray * 2];
  for (let i = 0; i < lenOriginalArray; i++) {
    concatenatedArrays[i] = nums[i];
  }
  const nextIndex = lenOriginalArray;
  for (let i = 0; i < lenOriginalArray; i++) {
    concatenatedArrays[nextIndex + i] = nums[i];
  }
  return concatenatedArrays;
}

/**
 * Provide the solution to LeetCode 2942 here:
 * https://leetcode.com/problems/find-words-containing-character/
 */
export function findWordsContaining(words: string[], x: string): number[] {
  const indexList: number[] = [];
  if (words.length === 0){
    return [];
  }
  let index = -1;
  for (const word of words) {
    index = index + 1;
    const charactersOfWord = [];
    const charactersOfCurrentWord: string[] = word.split('');
    for (const xter of charactersOfCurrentWord) {
      charactersOfWord.push(xter);
    }
    if (charactersOfWord.includes(x)) {
      indexList.push(index);
    }
  }
  return indexList;
}
