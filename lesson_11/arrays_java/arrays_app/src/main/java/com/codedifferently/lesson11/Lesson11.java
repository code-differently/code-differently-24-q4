package com.codedifferently.lesson11;

import java.util.ArrayList;
import java.util.List;

public class Lesson11 {

  public int[] getConcatenation(int[] nums) {
    int lenOriginalArray = nums.length;
    int[] concatenatedArrays = new int[lenOriginalArray * 2];
    int pos = 0;

    System.arraycopy(nums, pos, concatenatedArrays, pos, lenOriginalArray);
    System.arraycopy(nums, pos, concatenatedArrays, lenOriginalArray, lenOriginalArray);
    return concatenatedArrays;
  }

  public List<Integer> findWordsContaining(String[] words, char x) {
    var indexList = new ArrayList<Integer>(0);
    int index = 0;
    for (String word : words) {
      if (word.indexOf(x) != -1) {
        indexList.add(index);
      }
      index = index + 1;
    }
    return indexList;
  }
}
