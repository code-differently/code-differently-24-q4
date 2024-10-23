package com.codedifferently.lesson13;

import java.util.HashMap;

public class Lesson13 {

  /**
   * Provide the solution to LeetCode 3146 here:
   * https://leetcode.com/problems/permutation-difference-between-two-strings
   */
  public int findPermutationDifference(String s, String t) {
    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < t.length(); i++) {
      map.put(t.charAt(i), i);
    }

    int difference = 0;
    for (int i = 0; i < s.length(); i++) {
      int idx = map.get(s.charAt(i));
      difference += Math.abs(i - idx);
    }

    return difference;
  }
}
