package com.codedifferently.lesson13;

import java.util.HashMap;

public class Lesson13 {
  public int findPermutationDifference(String s, String t) {
    HashMap<Character, Integer> letters = new HashMap<>();
    int permDifferences = 0;
    for (int i = 0; i < s.length(); i++) {
      letters.put(s.charAt(i), i);
    }
    for (char key : letters.keySet()) {
      int indexInT = t.indexOf(Character.toString(key));
      permDifferences += Math.abs(s.indexOf(key) - indexInT);
    }
    // int sumDifference = 0;
    // for (int i = 0; i < s.length(); i++) {
    //   char currentChar = s.charAt(i);
    //   int indexInT = t.indexOf(currentChar);
    //   int difference = Math.abs(i - indexInT);
    //   sumDifference += difference;

    return permDifferences;
  }
}
