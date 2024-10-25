package com.codedifferently.lesson13;

import java.util.HashMap;

public class Lesson13 {
  public int findPermutationDifference(String s, String t) {
    HashMap<Character, Integer> hashMap = new HashMap<>();
    int permDifferences = 0;
    for (int i = 0; i < s.length(); i++) {
      hashMap.put(s.charAt(i), i);
    }
    for (char key : hashMap.keySet()) {
      int indexInT = t.indexOf(Character.toString(key));
      permDifferences += Math.abs(s.indexOf(key) - indexInT);
    }
    return permDifferences;
  }
}
