package com.codedifferently.lesson11;

import java.util.List;

import java.util.ArrayList;

public class Lesson11 {

  /**
   * Provide the solution to LeetCode 1929 here:
   * https://leetcode.com/problems/concatenation-of-array
   */
  public int[] getConcatenation(int[] nums) {
    int[] ans = new int[nums.length + nums.length];
    for(int i = 0; i < nums.length; i++) {
      ans[i] = nums[i];
      ans[i + nums.length] = nums[i];
    }
    return ans;
  }

  /**
   * Provide the solution to LeetCode 2942 here:
   * https://leetcode.com/problems/find-words-containing-character/
   */
  public List<Integer> findWordsContaining(String[] words, char x) {

  List<Integer> arrayOfIndices = new ArrayList<>(); // Use a List to dynamically store indices

    for (int i = 0; i < words.length; i++) {
      if (words[i].contains(x)){ // Check if the character is present in the word
        arrayOfIndices.add(i); // Add the index to the list
      }
    }
    return arrayOfIndices; // Return list
  }
   