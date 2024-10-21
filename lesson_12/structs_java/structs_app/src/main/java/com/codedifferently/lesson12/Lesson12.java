package com.codedifferently.lesson12;

public class Lesson12 {

  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
  public String gameResult(ListNode head) {
    int e_pts = 0;
    int o_pts = 0;

    ListNode curr = head;

    while (curr != null) {
      ListNode next = curr.next;
      if (curr.val > next.val) {
        e_pts++;
      } else if (curr.val < next.val) {
        o_pts++;
      }
      curr = next.next;
    }

    if (e_pts == o_pts) {
      return "Tie";
    }

    return e_pts > o_pts ? "Even" : "Odd";
  }
}
