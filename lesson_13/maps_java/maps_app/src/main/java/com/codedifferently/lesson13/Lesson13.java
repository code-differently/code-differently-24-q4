package com.codedifferently.lesson13;

import java.util.HashMap;

public class Lesson13 {

  /**
   * Provide the solution to LeetCode 3146 here:
   * https://leetcode.com/problems/permutation-difference-between-two-strings
   */

  /**
   * We need to return the absolute difference btw. a chars index in both 's' and 't' if s = "abc"
   * and t = "bac" for s: a @index 0, b @index 1, c @index 2 for t: a @index 1, b @index 0, c @index
   * 2 the math: |0 - 1| + |1 - 0| + \2 - 2| = |-1| + |1| + |0| = 1 + 1 + 0 = 2 we return 2
   */
  public int findPermutationDifference(String s, String t) {
    var stringMap = new HashMap<Character, Integer>();
    int total = 0;

    for (int i = 0; i < s.length(); i++) {
      stringMap.put(s.charAt(i), s.indexOf(s.charAt(i)));
    }

    for (int i = 0; i < t.length(); i++) {
      int absDiff = Math.abs(stringMap.get(s.charAt(i)) - t.indexOf(s.charAt(i)));
      total += absDiff;
    }
    return total;
  }
}
