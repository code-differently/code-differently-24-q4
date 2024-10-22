package com.codedifferently.lesson12;

public class Lesson12 {

  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
  public String gameResult(ListNode head) {
    //create two variables to count points for "Odd" and "Even"
    int oddPoints = 0;
    int evenPoints = 0;

    // Loop through the linked list to get pairs (so two nodes at a time)
    ListNode current = head;
    // Check each pair of nodes (odd and even):
      // compare their values
      while (current != null && current.next != null) {
      // add a point to "Even" if the odd-indexed node is higher and vice versa 
        if (current.val > current.next.val){
          evenPoints++;
        } else if (current.val < current.next.val){
          oddPoints++;
        }
        current = current.next.next;
      }
    // Decide the winner 
      // compare the points and choose the winner or tie
      if (oddPoints > evenPoints) {
        return "Odd";
      } else if (evenPoints > oddPoints){
        return "Even";
      } else {
        return "Tie";
      }   
  }
}
