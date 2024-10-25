package com.codedifferently.lesson13;

import java.util.HashMap;

public class Lesson13 {

  /**
   * Provide the solution to LeetCode 3146 here:
   * https://leetcode.com/problems/permutation-difference-between-two-strings
   */

  public int findPermutationDifference(String s, String t) {
    
        //var charLocation = new HashMap<Character, Integer>();

    HashMap<Character,Integer> map = new HashMap();
    int sum=0;
    for(int i =0; i< s.length(); i++) { 
        map.putIfAbsent(s.charAt(i),i);
    }
    for(char key: map.keySet())  {
        int indexInt = t.indexOf(Character.toString(key));
        sum += Math.abs (s.indexOf(key)- indexInt);
    }
    return sum;
  }
}
