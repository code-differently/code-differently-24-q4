package com.codedifferently.lesson13;

import java.util.HashMap;

public class Lesson13 {
  public int findPermutationDifference(String s, String t) {
    var indexMap = new HashMap<Character, Integer>();
    for (int i = 0; i < t.length(); i++) {
      indexMap.put(t.charAt(i), i);
    }

    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      // Default to -1 if char not found
      result += Math.abs(i - indexMap.getOrDefault(s.charAt(i), -1));
    }
    return result;
  }
}
