package com.codedifferently.lesson12;

public class Lesson12 {

  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
  public String gameResult(ListNode head) {

    ListNode current = head;
    int evenTeam = 0;
    int oddTeam = 0;
    while (current != null) {
      if (current.val < current.next.val) {
        oddTeam++;
      } else if (current.val > current.next.val) {
        evenTeam++;
      }
      current = current.next.next;
    }

    if (evenTeam < oddTeam) {
      return "oddTeamwins";
    } else if (evenTeam > oddTeam) {
      return "eveTeamwins";
    } else return "tie";
  }
}
