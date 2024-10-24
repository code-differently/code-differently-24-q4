package com.codedifferently.lesson12;

public class Lesson12 {

  public Lesson12() {}

  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
  public String gameResult(ListNode head) {
    var o = 0;
    var e = 0;
    while (head != null) {
      if (head.val > head.next.val) {
        e++;
      } else {
        o++;
      }
      head = head.next.next;
    }
    if (e > o) {
      return "Even";
    } else if (e < o) {
      return "Odd";
    } else return "Tie";
  }
}
