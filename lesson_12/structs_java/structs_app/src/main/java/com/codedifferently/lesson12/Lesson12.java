package com.codedifferently.lesson12;

public class Lesson12 {

  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
  public String gameResult(ListNode head) {

    int[] scores = new int[2];

    while (head.next != null) {
      // Used ChatGpt to help complete this if statement-starting at the logical & operand
      if (head.val != head.next.val && head.val % 2 == 0) {
        if (head.val > head.next.val) {
          scores[head.val % 2]++;
          // Gpt help ended at the line above
        } else {
          //else will only be applicable if the previous condition is false
          scores[head.next.val % 2]++;
          //increments score for the next node value
        }
      }
      head = head.next;
      //reassigns the variable, head, to point to the next node in the list
    }
    if (scores[0] == scores[1]) {
      //checks for a tie
      return "Tie";
    } else if (scores[0] > scores[1]) {
      //checks if the even score is greater than the odd like the elif in the python example
      return "Even";
    } else {
      return "Odd";
    }
  }
}
