package com.codedifferently.lesson12;


import java.util.ArrayList;
import java.util.List;

public class Lesson12 {

  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
  

    public String gameResult(ListNode head) {
      List<String> result = new ArrayList<>();
      int evenCounter = 0;
      int oddCounter = 0;
      ListNode current = head;

      while (current != null && current.next != null) {
        int evenValue = current.data;
        int oddValue = current.next.data;

        if (evenValue > oddValue) {
          result.add("even");
          evenCounter++;
        } else {
          result.add("odd");
          oddCounter++;
        }

        current = current.next.next;
      }

      String winningTeam;
      if (evenCounter > oddCounter) {
        winningTeam = "even";
      } else if (oddCounter > evenCounter) {
        winningTeam = "odd";
      } else {
        winningTeam = "tie";
      }

      System.out.println("Node team with higher value in each pair: " + result);
      System.out.println("The team with the most high-values is: " + winningTeam);

      return winningTeam;
    }
  }


