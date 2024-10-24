package com.codedifferently.lesson13;
import java.util.HashMap;
public class Lesson13 {

  public int findPermutationDifference(String s, String t) {
    HashMap<Character, Integer> stringS = new HashMap<>();
    for (int i=0; i<s.length(); i++){
      stringS.put(s.charAt(i), i);
    }
    HashMap<Character, Integer> stringT = new HashMap<>();
    for (int i=0; i<t.length(); i++){
      stringT.put(t.charAt(i), i);
    }
    return compareMaps(stringS, stringT);
    
  }

  public int compareMaps(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2) {
    int diffSum=0;
    for (Character key : map1.keySet()) {
      if (map2.containsKey(key)) {
        int value1 = map1.get(key);
        int value2 = map2.get(key);
        int difference = Math.abs(value1 - value2);
        diffSum+=difference;
      }
    }
    return diffSum;
  }
}
