package com.codedifferently.lesson13;

public class Lesson13 {

  /**
   * Provide the solution to LeetCode 3146 here:
   * https://leetcode.com/problems/permutation-difference-between-two-strings
   */
  public int findPermutationDifference(String s, String t) {

    int sumDifference = 0;
    for (int i = 0; i < s.length(); i++) {
      char currentChar = s.charAt(i);
      int indexInT = t.indexOf(currentChar);
      int difference = Math.abs(i - indexInT);
      sumDifference += difference;
    }
    System.out.println("Here is the Permutation Difference is: + letters.get");
    return sumDifference;
  }
}

