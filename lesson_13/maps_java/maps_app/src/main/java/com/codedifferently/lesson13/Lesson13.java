package com.codedifferently.lesson13;

public class Lesson13 {

  /**
   * Provide the solution to LeetCode 3146 here:
   * https://leetcode.com/problems/permutation-difference-between-two-strings You are given two
   * strings s and t such that every character occurs at most once in s and t is a permutation of s.
   * The permutation difference between s and t is defined as the sum of the absolute difference
   * between the index of the occurrence of each character in s and the index of the occurrence of
   * the same character in t. Return the permutation difference between s and t.
   */
  public int findPermutationDifference(String s, String t) {

    int permuDifference = 0;
    // Created a counter to track Permutation Difference
    for (int i = 0; i < s.length(); i++) {
      // Loops through each letter in string 's'
      int difference = s.indexOf(s.charAt(i)) - t.indexOf(s.charAt(i));
      // Subtracts possitional value of string 't' from the possitional value of string 's'
      permuDifference += Math.abs(difference);
      // Converts difference into absolute value and adds it to the Permutation Difference
    }
    return permuDifference;
    // Returns the total Permutation Difference value
  }
}
