package com.codedifferently.lesson12;

public class Lesson12 {

  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
  public String gameResult(ListNode head) {
    int oddPoints = 0;
    int evenPoints = 0;

    for (ListNode current = head;
        current != null && current.next != null;
        current = current.next.next) {
      if (current.val > current.next.val) {
        evenPoints++;
      } else {
        oddPoints++;
      }
    }
    if (oddPoints > evenPoints) {
      return "Odd";
    } else if (evenPoints > oddPoints) {
      return "Even";
    } else {
      return "Tie";
    }
  }
}
