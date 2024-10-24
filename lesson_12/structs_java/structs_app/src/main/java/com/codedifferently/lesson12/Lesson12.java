package com.codedifferently.lesson12;

public class Lesson12 {
  // node1 node2 node3 node4 null

  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
  public String gameResult(ListNode head) {
    // These vars keep track of the point for the even and odd indicies.
    int oddPoints = 0;
    int evenPoints = 0;

    /*
     * This var will be redeclared throughout the loop and be used
     * to point to the node pairs.
     */
    ListNode curr = head;

    /**
     * This loop will do two comparisons. The 1st comparison is to determine which index has a
     * greater value. The 2nd comparison checks which index team is more points
     */
    while (curr != null) {
      if (curr.val > curr.next.val) {
        evenPoints++;
      } else if (curr.val < curr.next.val) {
        oddPoints++;
      }

      // "curr.next.next" allows for the loop to skip over an index
      curr = curr.next.next;
    }

    if (oddPoints > evenPoints) {
      return "Odd";
    } else if (oddPoints < evenPoints) {
      return "Even";
    } else {
      return "Tie";
    }
  }
}
