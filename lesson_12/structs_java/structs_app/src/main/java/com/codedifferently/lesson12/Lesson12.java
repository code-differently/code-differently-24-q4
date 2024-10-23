package com.codedifferently.lesson12;

public class Lesson12 {

  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
  public Lesson12() {}

  public String gameResult(ListNode head) {
    int evenPoints = 0;
    int oddPoints = 0;
    while (head != null) {

      if (head.val > head.next.val) {
        evenPoints++;
      } else if (head.val < head.next.val) {
        oddPoints++;
      }
      head = head.next.next;
    }
    if (evenPoints > oddPoints) {
      return "Even";
    } else if (oddPoints > evenPoints) {
      return "Odd";
    } else return "Tie";
  }
}