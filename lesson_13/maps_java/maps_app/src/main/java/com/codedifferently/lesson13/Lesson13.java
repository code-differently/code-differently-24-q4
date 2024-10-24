package com.codedifferently.lesson13;

import java.util.HashMap;

public class Lesson13 {

  /**
   * Provide the solution to LeetCode 3146 here:
   * https://leetcode.com/problems/permutation-difference-between-two-strings
   */
  public int findPermutationDifference(String s, String t) {
    var bmb = new HashMap<Character, Integer>();
    int permDiff = 0;
    for (int i = 0; i < s.length(); i++) {
      bmb.put(s.charAt(i), i);
    }
    for (char key : bmb.keySet()) {
      int indexInT = t.indexOf(Character.toString(key));
      permDiff += Math.abs(s.indexOf(key) - indexInT);
    }
    return permDiff;
  }
}
