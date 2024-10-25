package com.codedifferently.lesson13;

import java.util.HashMap;

public class Lesson13 {

  /**
   * Provide the solution to LeetCode 3146 here:
   * https://leetcode.com/problems/permutation-difference-between-two-strings
   */
  public int findPermutationDifference(String s, String t) {
    HashMap<Character, Integer> map = new HashMap<>();

    int sum = 0;
    for (char letter : s.toCharArray()) {
      map.put(letter, s.indexOf(letter));
    }
    for (int i = 0; i < s.length(); i++) {
      int indexOfT = map.get(t.charAt(i));
      sum += Math.abs(i - indexOfT);
    }
    return sum;
  }
}
