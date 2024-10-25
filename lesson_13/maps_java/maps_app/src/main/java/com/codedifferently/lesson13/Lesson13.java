package com.codedifferently.lesson13;

import java.util.HashMap;

public class Lesson13 {

  public int findPermutationDifference(String s, String t) {
    HashMap<Character, Integer> stringS = new HashMap<>();
    HashMap<Character, Integer> stringT = new HashMap<>();
    int diffSum = 0;
    for (int i = 0; i < t.length(); i++) {
      stringS.put(s.charAt(i), i);
      stringT.put(t.charAt(i), i);
    }
    for (Character key : stringS.keySet()) {
      int value1 = stringS.get(key);
      int value2 = stringT.get(key);
      int difference = Math.abs(value1 - value2);
      diffSum += difference;
    }
    return diffSum;
  }
}
