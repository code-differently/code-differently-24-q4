
export function getConcatenation(nums: number[]): number[] {
   const answer = [2*nums.length];

   for (let i=0;i<nums.length;i++){
    answer[i]=nums[i];
    answer[i+nums.length]=nums[i];
   }
   return answer;
}

export function findWordsContaining(words: string[], x: string): number[] {
  let answer = [];
  for(let i=0;i<words.length;i++){
    if (words[i].indexOf(x)!=-1){
      answer.push(i);
    }
  }
  return answer;
}
