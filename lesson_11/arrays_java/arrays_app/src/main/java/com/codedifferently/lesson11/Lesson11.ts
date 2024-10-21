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