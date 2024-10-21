package com.codedifferently.lesson11;

import java.util.List;

public class Lesson11 {

  /**
   * Provide the solution to LeetCode 1929 here:
   * https://leetcode.com/problems/concatenation-of-array
   */
  public int[] getConcatenation(int[] nums) {
    int[] ans = new int[nums.length + nums.length];
    for(int i = 0; i < nums.length; i++) {
      ans[i] = nums[i];
      ans[i + nums.length] = nums[i];
    }
    return ans;
  }

  /**
   * Provide the solution to LeetCode 2942 here:
   * https://leetcode.com/problems/find-words-containing-character/
   */
  public List<Integer> findWordsContaining(String[] words, char x) {
    int[] indices = new int[words.length];
    int count = 0;

    for (int i = 0; i < words.length ; i++) {
      if(words[i].contains(Character.toString(x))) {
        indices[count] = i;
        count = count + 1;
      }
    }
    int[] arrayOfIndices = new int[count];
    for (int i = 0; i < count; i++) {
      arrayOfIndices.length;
    }
    return arrayOfIndices.length;
  }
}
