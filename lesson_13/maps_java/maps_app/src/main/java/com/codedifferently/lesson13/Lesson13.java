package com.codedifferently.lesson13;
import java.util.HashMap;
public class Lesson13 {

  /**
   * Provide the solution to LeetCode 3146 here:
   * https://leetcode.com/problems/permutation-difference-between-two-strings
   */
  public int findPermutationDifference(String s, String t) {
    int difference=0;
    HashMap<Character, Integer> indexMap=new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            indexMap.put(s.charAt(i), i);
        }
        
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            int indexInS = indexMap.get(ch);
            difference += Math.abs(indexInS - i);
        }
        
        return difference;
  }
}
