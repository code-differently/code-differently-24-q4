package com.codedifferently.lesson12;

public class Lesson12 {

  public String gameResult(ListNode head) {

    int oddPoints = 0;
    int evenPoints = 0;

    ListNode current = head;

    while (current != null && current.next != null) {
      if (current.val > current.next.val) {
        evenPoints++;
      } else if (current.val < current.next.val) {
        oddPoints++;
      }
      current = current.next.next;
    }

    if (oddPoints > evenPoints) {
      return "Odd";
    } else if (evenPoints > oddPoints) {
      return "Even";
    } else {
      return "Tie";
    }
  }
}
