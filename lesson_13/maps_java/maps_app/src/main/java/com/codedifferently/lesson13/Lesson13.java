package com.codedifferently.lesson13;
import java.util.HashMap;

public class Lesson13 {

  /**
   * Provide the solution to LeetCode 3146 here:
   * https://leetcode.com/problems/permutation-difference-between-two-strings
   */
  public int findPermutationDifference(String s, String t) {

 HashMap<Character, Integer> indexFinder = new HashMap<>();

        
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            indexFinder.put(character, i);
        }

        int sum = 0;  

        for (int i = 0; i < t.length(); i++) {
            char character = t.charAt(i); 
            int value = indexFinder.get(character); 
            sum += Math.abs(value - i); 
        }

        return sum; 
    }
  }