/**
 * Provide the solution to LeetCode 3146 here:
 * https://leetcode.com/problems/permutation-difference-between-two-strings
 */
export function findPermutationDifference(s: string, t: string): number {
  //Create a way to find the index of each character in string s.
  // This could be a list or a dictionary where each character points to its index in s.
    let charPositionMap = new Map<string, number>();
  //Start with a variable to keep track of the total permutation difference. Set it to 0.
    let totalDifference = 0;
  //For each character in t, find its index in s using the mapping you created.
    for (let sIndex = 0; sIndex < s.length; sIndex++) {
      charPositionMap.set(s.charAt(sIndex), sIndex)
    }
      
    for (let tIndex = 0; tIndex < t.length; tIndex++) {
  //Calculate the absolute difference between the index in s and the current index in t.
      let indexInS = charPositionMap.get(t.charAt(tIndex));
    //Add the absolute difference you calculated to the total difference.
      totalDifference += Math.abs(indexInS - tIndex);
    }
  //After going through all characters in t, return the total difference.
    return totalDifference;
}
