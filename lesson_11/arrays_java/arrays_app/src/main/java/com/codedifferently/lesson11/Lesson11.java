package com.codedifferently.lesson11;

import java.util.ArrayList;
import java.util.List;

public class Lesson11 {

  public int[] getConcatenation(int[] nums) {
    int[] answer = new int[2 * nums.length];

    for (int i = 0; i < nums.length; i++) {
      answer[i] = nums[i];
      answer[i + nums.length] = nums[i];
    }
    return answer;
  }

  public List<Integer> findWordsContaining(String[] words, char x) {
    List answer = new ArrayList();
    for (int i = 0; i < words.length; i++) {
      if (words[i].indexOf(x) != -1) {
        answer.add(i);
      }
    }
    return answer;
  }
}
