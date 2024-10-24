package com.codedifferently.lesson13;

import java.util.HashMap;

public class Lesson13 {

  /**
   * Provide the solution to LeetCode 3146 here:
   * https://leetcode.com/problems/permutation-difference-between-two-strings
   */
  public int findPermutationDifference(String s, String t) {
HashMap<Character,Integer> smap = new HashMap<>();
HashMap<Character,Integer> tmap = new HashMap<>();
int sum = 0;
  for (int i =0; i <s.length(); i++){
    smap.put(s.charAt(i),i);
    tmap.put(t.charAt(i),i);
  }
  for (Character key:smap.keySet()){
    if (tmap.containsKey(key)) {
      Integer val1 = smap.get(key);
      Integer val2 = tmap.get(key);
      sum += Math.abs(val1-val2);
            }
        }
        return sum;
  }
}
