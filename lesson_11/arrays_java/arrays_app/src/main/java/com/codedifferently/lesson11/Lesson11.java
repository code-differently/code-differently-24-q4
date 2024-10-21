package com.codedifferently.lesson11;

import java.util.ArrayList;
import java.util.List;

public class Lesson11 {

  /**
   * Provide the solution to LeetCode 1929 here:
   * https://leetcode.com/problems/concatenation-of-array
   */
  public int[] getConcatenation(int[] nums) {
    int ans[] = new int[2 * nums.length];

    System.arraycopy(nums, 0, ans, 0, nums.length);
    System.arraycopy(nums, 0, ans, nums.length, nums.length);
    return ans;
  }

  // worked on the solutions with Pablo, Joseph, & Nile via jitsi. //
  /**
   * Provide the solution to LeetCode 2942 here:
   * https://leetcode.com/problems/find-words-containing-character/
   */
  public List<Integer> findWordsContaining(String[] words, char x) {
    List<Integer> indices = new ArrayList<>();
    for (int i = 0; i < words.length; i++) {
      String str = String.valueOf(x);
      if (words[i].contains(str)) {
        indices.add(i);
      }
    }
    return indices;
  }
}
