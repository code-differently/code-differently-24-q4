package com.codedifferently.lesson11;

import java.util.ArrayList;
import java.util.List;

public class Lesson11 {

  /**
   * Provide the solution to LeetCode 1929 here:
   * https://leetcode.com/problems/concatenation-of-array
   */
  public int[] getConcatenation(int[] nums) {
    int[] ans = new int[nums.length * 2];
    System.arraycopy(nums, 0, ans, 0, nums.length);
    System.arraycopy(nums, 0, ans, nums.length, nums.length);
    return ans;
  }

  /**
   * Provide the solution to LeetCode 2942 here:
   * https://leetcode.com/problems/find-words-containing-character/
   */
  public List<Integer> findWordsContaining(String[] words, char x) {
    List<Integer> output = new ArrayList();
    for (int i = 0; i < words.length; i++) {
      if (words[i].contains(String.valueOf(x))) {
        output.add(i);
      }
    }
    return output;
  }
}
