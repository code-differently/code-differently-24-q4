package com.codedifferently.lesson13;

import java.util.HashMap;

public class Lesson13 {

  /**
   * Provide the solution to LeetCode 3146 here:
   * https://leetcode.com/problems/permutation-difference-between-two-strings
   */
  public int findPermutationDifference(String s, String t) {
    var charIndexMap = new HashMap<Character, Integer>();

    int totalDifference = 0;  

    for (int sIndex = 0; sIndex < s.length(); sIndex++) {
        charIndexMap.put(s.charAt(sIndex), sIndex);
        //keeps track of the position for each character in 's'
    }

    for (int tIndex = 0; tIndex < t.length(); tIndex++) {
      int indexInS = charIndexMap.get(t.charAt(tIndex)); 
      //Same as sIndex , but this loop keeps track of each character in t
      totalDifference += Math.abs(indexInS - tIndex); 
      //adds all the differences 
    }
     
    return totalDifference;
  }
}
