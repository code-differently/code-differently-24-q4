package com.codedifferently.lesson11;

import java.util.ArrayList;
import java.util.List;

public class Lesson11 {
 
  /**
   * Implementation of the solution to LeetCode 1929 below:
   * https://leetcode.com/problems/concatenation-of-array
   */
  public static int[] getConcatenation(int[] nums) {
    int lenOriginalArray = nums.length;
    int[] concatenatedArrays = new int[lenOriginalArray * 2];
     
    for(int i= 0; i < lenOriginalArray; i++){
      concatenatedArrays[i] = nums[i];
    }
    int nextIndex = lenOriginalArray;
    for(int i= 0; i < lenOriginalArray; i++){
      concatenatedArrays[nextIndex+i] = nums[i];
    }
    return concatenatedArrays;
  }

  /**
   * Implementation of the solution to LeetCode 2942 below:
   * https://leetcode.com/problems/find-words-containing-character/
   */
  public List<Integer> findWordsContaining(String[] words, char x) {
    var indexList = new ArrayList<Integer>();
    int index = -1;
    for(String word : words){
      index = index + 1;
      var charactersOfWord = new ArrayList<Character>();
      char charactersOfCurrentWord[] = word.toCharArray();
      for(Character xter : charactersOfCurrentWord){
         charactersOfWord.add(xter);
      }
      if (charactersOfWord.contains(x)){
        indexList.add(index);
      }
    }
    return indexList;
  }
}
