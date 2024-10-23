package com.codedifferently.lesson13;

public class Lesson13 {

  /**
   * Provide the solution to LeetCode 3146 here:
   * https://leetcode.com/problems/permutation-difference-between-two-strings
   */
  public int findPermutationDifference(String s, String t) {
    var sum = 0;
    char[] charArray1 = s.toCharArray();
    char[] charArray2 = t.toCharArray();

    for (int i = 0; i < s.length(); i++) {
      for (int j = 0; j < t.length(); j++) {
        if (charArray1[i] == charArray2[j]) {
          sum = sum + Math.abs(i - j);
        }
      }
    }
    return sum;
  }
}
