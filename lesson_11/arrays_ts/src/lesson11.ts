export function getConcatenation(nums: number[]): number[] {
  const n: number = nums.length;
  const ans: number[] = new Array(2*n);
    
     for(let i = 0; i < n; i++){
        ans[i] = nums[i];
        ans[i + n] = nums[i];
       }

    return ans;
}

export function findWordsContaining(words: string[], x: string): number[] {
  const indices: number[] = [];

    for (let i = 0; i < words.length; i++){
        if(words[i].indexOf(x) >= 0){
                indices.push(i);
    }
}

return indices; 
}
