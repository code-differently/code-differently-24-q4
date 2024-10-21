/**
* Provide the solution to LeetCode 1929 here:
* https://leetcode.com/problems/concatenation-of-array
*/

function getConcatenation(nums: number[]): number[] {
    let n: number = nums.length;
    let ans: number[] = new Array(2*n);
    
     for(let i = 0; i < n; i++){
        ans[i] = nums[i];
        ans[i + n] = nums[i];
       }

    return ans;
};

/**
* Provide the solution to LeetCode 2942 here:
* https://leetcode.com/problems/find-words-containing-character/
*/

function findWordsContaining(words: string[], x: string): number[] {
    let indices: number[] = [];

    for (let i = 0; i < words.length; i++){
        if(words[i].indexOf(x) >= 0){
                indices.push(i);
    }
}

return indices; 
};