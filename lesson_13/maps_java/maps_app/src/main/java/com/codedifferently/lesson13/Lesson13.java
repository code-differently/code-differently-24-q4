package com.codedifferently.lesson13;

import java.util.HashMap;

public class Lesson13 {

  public int findPermutationDifference(String s, String t) {
    var charIndexMap = new HashMap<Character, Integer>();

    int totalDifference = 0;  

    for (int sIndex = 0; sIndex < s.length(); sIndex++) {
        charIndexMap.put(s.charAt(sIndex), sIndex);
    }

    for (int tIndex = 0; tIndex < t.length(); tIndex++) {
      int indexInS = charIndexMap.get(t.charAt(tIndex)); 
      totalDifference += Math.abs(indexInS - tIndex); 
    }
     
    return totalDifference;
  }
}
