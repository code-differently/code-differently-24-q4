package com.codedifferently.lesson13;

import java.util.HashMap;

public class Lesson13 {

  /**
   * Provide the solution to LeetCode 3146 here:
   * https://leetcode.com/problems/permutation-difference-between-two-strings
   */
  public int findPermutationDifference(String s, String t) {
    HashMap<Character, Integer> indexMap = new HashMap<>();

    for (int i =0; i < s.length(); i++) {
      indexMap.put(s.charAt(i), i);
    }

    HashMap<Character, Integer> indexDifferences = new HashMap<>();
    int sumOfAbsoluteDiff = 0;

    for (int i = 0; i < t.length(); i++) {
      char c = t.charAt(i);
      int sIndex = indexMap.get(c);
      int tIndex = i;

      int indexDiff = Math.abs(sIndex - tIndex);

      indexDifferences.put(c, indexDiff);

      sumOfAbsoluteDiff += indexDiff;
    }

    return sumOfAbsoluteDiff;
  }
}
