package com.codedifferently.lesson11;

import java.util.ArrayList;
import java.util.List;

public class Lesson11 {

  /**
   * Provide the solution to LeetCode 1929 here:
   * https://leetcode.com/problems/concatenation-of-array
   */
  public int[] getConcatenation(int[] nums) {
    int n = nums.length;
    int ans[] = new int[2 * n];
    for (int i = 0; i < n; i++) {
      ans[i] = nums[i];
      ans[n + i] = nums[i];
    }
    return ans;
  }

  /**
   * Provide the solution to LeetCode 2942 here:
   * https://leetcode.com/problems/find-words-containing-character/
   */
  public List<Integer> findWordsContaining(String[] words, char x) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < words.length; i++) {
      String str = words[i];
      for (int j = 0; j < str.length(); j++) {
        if (str.charAt(j) == x) {
          list.add(i);
          break;
        }
      }
    }
    return list;
  }
}
