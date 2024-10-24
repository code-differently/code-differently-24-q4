package com.codedifferently.lesson12;

public class ListNode {
  int val;
  ListNode next;

  ListNode() {}

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }


/* public static String listWinner(ListNode head) {
  int evenScore = 0;
  int oddScore = 0;

  ListNode current = head;
  while (current != null && current.next != null) {
    int evenVal = current.val;
    int oddVal = current.next.val;

    if (evenVal > oddVal) {
      evenScore++;
    } else if (oddVal > evenVal) {
      oddScore++;
    }

    current = current.next.next;
    }

  if (evenScore > oddScore) {
    return "Even";
  } else if (oddScore > evenScore) {
    return "Odd";
  } else {
    return "Tie";
  }
}

public static void main(String[] args) {
  ListNode head = new ListNode(2, new ListNode(5, new ListNode(4, new ListNode(7, new ListNode(20, new ListNode(5))))));

  String winner = listWinner(head);
  System.out.println("The winner is: " + winner);
} */
} 