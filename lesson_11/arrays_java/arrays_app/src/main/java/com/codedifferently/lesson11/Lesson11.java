package com.codedifferently.lesson11;

import java.util.ArrayList;
import java.util.List;

public class Lesson11 {

  public int[] getConcatenation(int[] nums) {
    int n = nums.length;

    int[] ans = new int[2 * n];

    for (int i = 0; i < n; i++) {
      ans[i] = nums[i];
      ans[i + n] = nums[i];
    }

    return ans;
  }

  public List<Integer> findWordsContaining(String[] words, char x) {
    List<Integer> indices = new ArrayList<>();

    for (int i = 0; i < words.length; i++) {
      if (words[i].indexOf(x) >= 0) {
        indices.add(i);
      }
    }
    return indices;
  }
}
