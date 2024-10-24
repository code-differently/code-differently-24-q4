package com.codedifferently.lesson13;

import java.util.HashMap;

public class Lesson13 {

  /**
   * Provide the solution to LeetCode 3146 here:
   * https://leetcode.com/problems/permutation-difference-between-two-strings
   */
  public int findPermutationDifference(String s, String t) {
    var charCountS = new HashMap<Character, Integer>();

    int totalDifference = 0;

    for (int sIndex = 0; sIndex < s.length(); sIndex++) {
      charCountS.put(s.charAt(sIndex), sIndex);
    }
    for (int tIndex = 0; tIndex < t.length(); tIndex++) {
      int countIndexS = charCountS.put(t.charAt(tIndex), tIndex);

      totalDifference += Math.abs(countIndexS - tIndex);
    }
    return totalDifference;
  }
}
