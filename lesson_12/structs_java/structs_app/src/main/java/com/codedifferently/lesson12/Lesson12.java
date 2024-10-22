package com.codedifferently.lesson12;

import java.util.Queue;

public class Lesson12 {

  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
  public String gameResult(ListNode head) {
    //make a linked list 
    Queue<Integer> queue = new LinkedList<Integer>();
    
    //create two variables to count points for "Odd" and "Even"
    int Odd = 0;
    int Even = 0;
    // Loop through the linked list to get pairs (so two nodes at a time)

    // Check each pair of nodes (odd and even):
      // compare their values

      // add a point to "Odd" if the odd-indexed node is higher 

      //add a point to "Even" if the even-indexed node is higher 

    // Decide the winner 
      // compare the points and choose the winner or tie
      if (Odd > Even) {
        return("Team odd wins!");
      } else if (Even > Odd){
        return("Team Even wins");
      } else {
        return ("It's a tie");
      }
      
  }
}

// Constraints:
// The number of nodes in the list is in the range [2, 100]. 
// The number of nodes in the list is even. 1 <= Node.val <= 100 
// The value of each odd-indexed node is odd. 
// The value of each even-indexed node is even.
