package com.codedifferently.lesson12;

public class Lesson12 {

  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
  public String gameResult(ListNode head) {
    ListNode current = head;
    int even = 0;
    int odd = 0;
    while (current != null) {
      ListNode nextNode = current.next;
      if (current.val < nextNode.val) {
        odd++;
      }
      if (current.val > nextNode.val) {
        even++;
      }
      current = nextNode.next;
    }
    if (even > odd) {
      return "Even";
    }
    if (even < odd) {
      return "Odd";
    }
    if (even == odd) {
      return "Tie";
    }
    return null;
  }
}
