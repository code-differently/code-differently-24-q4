package com.codedifferently.lesson13;

import java.util.HashMap;

public class Lesson13 {

  /**
   * Provide the solution to LeetCode 3146 here:
   * https://leetcode.com/problems/permutation-difference-between-two-strings
   */
  public int findPermutationDifference(String s, String t) {
    var charLocation = new HashMap<Character, Integer>();
    int charSum = 0;
    for (int i = 0; i < s.length(); i++) {
      charLocation.put(s.charAt(i), i);
    }
    for (int i = 0; i < t.length(); i++) {
      int charResult = charLocation.get(t.charAt(i));
      charSum += Math.abs(charResult - i);
    }
    return charSum;
  }
}
