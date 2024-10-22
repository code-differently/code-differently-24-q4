package com.codedifferently.lesson12;

public class Lesson12 {
  public String gameResult(ListNode head) {
    int result[] = new int[] {0, 0};
    while (head.next != null) {
      if (head.val != head.next.val && head.val % 2 == 0) {
        if (head.val > head.next.val) result[head.val % 2] += 1;
        else result[head.next.val % 2] += 1;
      }
      head = head.next;
    }
    return (result[0] == result[1]) ? "Tie" : (result[0] > result[1] ? "Even" : "Odd");
  }
}
