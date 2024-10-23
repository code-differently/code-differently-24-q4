package com.codedifferently.lesson12;

public class Lesson12 {

  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
    public String gameResult(ListNode head) {
        int oddPoints = 0;
        int evenPoints = 0;
        ListNode current = head;
        
        while (current != null && current.next != null) {
            int evenValue = current.val;
            int oddValue = current.next.val;
            
            if (evenValue > oddValue) {
                evenPoints++;
            } else if (oddValue > evenValue) {
                oddPoints++;
            }

            current = current.next.next;
        }
        
        if (evenPoints > oddPoints) {
            return "Even";
        } else if (oddPoints > evenPoints) {
            return "Odd";
        } else {
            return "Tie";
        }
    }
  }