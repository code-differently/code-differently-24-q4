package com.codedifferently.lesson12;

public class Lesson12 {


 /**
  * Provide the solution to LeetCode 3062 here:
  * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
  */
 public String gameResult(ListNode head) {
    int evenCounter = 0; //Keeps track of even score
    int oddCounter = 0; //Keeps track of odd score

    while(head != null && head.next != null) { //Goes through the Linked List until theres no more pairs
      int evenValue = head.val; //Makes the first even value to compare equal to the first number of the list
      int oddValue = head.next.val; //Makes the first odd value to compare equal to the second number of the list


      if (evenValue > oddValue) {
        evenCounter++;
        //Compares the even and odd value, adds 1 to even score if even is greater
      } else if (evenValue < oddValue) {
        oddCounter++;
      } //Compares the even and odd value, adds 1 to odd score if odd is greater
      head = head.next.next; //Brings out the next pair befor restarting the loop
    }

   if (evenCounter > oddCounter) {
     return "Even";
     //Compares the even and odd score, prints 'Even' if Evens score is greater
   } if (evenCounter < oddCounter) {
     return "Odd";
     //Compares the even and odd score, prints 'Odd' if odds score is greater
   } else {
     return "Tie";
   } //Compares the even and odd score, prints 'Tie' if the two scores are equal

  }

}
