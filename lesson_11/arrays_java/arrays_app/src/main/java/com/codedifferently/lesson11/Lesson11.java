package com.codedifferently.lesson11;
import java.util.ArrayList;
import java.util.List;

public class Lesson11 {

  /**
   * Provide the solution to LeetCode 1929 here:
   * https://leetcode.com/problems/concatenation-of-array
   */
  public int[] getConcatenation(int[] nums) {
        int n = nums.length; 
        int[] ans = new int[2 * n];
        
        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];         
            ans[i + n] = nums[i];     
        }
      
        return ans; 
}


  /**
   * Provide the solution to LeetCode 2942 here:
   * https://leetcode.com/problems/find-words-containing-character/
   */
   public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indices = new ArrayList<>(); 

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                indices.add(i); 
            }
        }

        return indices; 
    }
}
