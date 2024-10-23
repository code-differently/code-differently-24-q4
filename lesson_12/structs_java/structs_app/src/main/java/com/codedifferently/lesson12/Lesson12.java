package com.codedifferently.lesson12;

public class Lesson12 {

  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
  public String gameResult(ListNode head) {
    ListNode current = head;
    int evenSide = 0;
    int oddSide = 0;
    while (current != null && current.next != null) {
      if (current.val > current.next.val) {
        evenSide++;
      } else if (current.val < current.next.val) {
        oddSide++;
      }
      current = current.next.next;
    }
    if (evenSide > oddSide) {
      return "Even";
    } else if (evenSide < oddSide) {
      return "Odd";
    } else {
      return "Tie";
    }
  }
}
