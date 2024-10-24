package com.codedifferently.lesson13;

import java.util.HashMap;

public class Lesson13 {

  /**
   * Provide the solution to LeetCode 3146 here:
   * https://leetcode.com/problems/permutation-difference-between-two-strings
   */
  public int findPermutationDifference(String s, String t) {
    var sum = 0;
    HashMap<Character, Integer> strStone = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      strStone.put(s.charAt(i), i);
    }
    for (char key : strStone.keySet()) {
      int indexSTR = t.indexOf(Character.toString(key));

      sum += Math.abs(s.indexOf(key) - indexSTR);
    }
    return sum;
  }
}
