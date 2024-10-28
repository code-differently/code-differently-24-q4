package com.codedifferently.lesson13;

import java.util.HashMap;

public class Lesson13 {

  /**
   * Provide the solution to LeetCode 3146 here:
   * https://leetcode.com/problems/permutation-difference-between-two-strings
   */
  public int findPermutationDifference(String s, String t) {
    HashMap<Character, Integer> hashMap = new HashMap<>();
    int permutationD = 0;
    for (int i = 0; i < s.length(); i++) {
      hashMap.put(s.charAt(i), i);
    }
    for (char key : hashMap.keySet()) {
      int indexT = t.indexOf(Character.toString(key));
      permutationD += Math.abs(s.indexOf(key) - indexT);
    }
    return permutationD;
  }
}
