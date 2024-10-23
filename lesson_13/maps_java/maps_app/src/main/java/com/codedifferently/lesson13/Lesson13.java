package com.codedifferently.lesson13;

public class Lesson13 {
  public int findPermutationDifference(String s, String t) {
    int result = 0;
    int strLen = s.length();
    for(int i= 0; i < strLen ; i++){
        char ch = s.charAt(i);
        result = result + ( Math.abs(s.indexOf(ch) - t.indexOf(ch)));
    }
    return result;
  }
}
