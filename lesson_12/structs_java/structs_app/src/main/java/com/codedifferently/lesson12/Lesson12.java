package com.codedifferently.lesson12;

public class Lesson12 {

  public String gameResult(ListNode head) {
    int score_even = 0;
    int score_odd = 0;
    int evenNum = 0;
    int oddNum = 0;
    for (int i = 0; i < getLength(head); i++) {
      if (i % 2 == 0) {
        ListNode resultNode = getElementAt(head, i);
        evenNum = resultNode.val;
      } else if (i % 2 == 1) {
        ListNode resultNode = getElementAt(head, i);
        oddNum = resultNode.val;
        if (evenNum > oddNum) {
          score_even += 1;
        } else if (evenNum < oddNum) {
          score_odd += 1;
        }
      }
    }
    if (score_even > score_odd) {
      return "Even";
    } else if (score_even < score_odd) {
      return "Odd";
    } else {
      return "Tie";
    }
  }

  public ListNode getElementAt(ListNode head, int position) {
    ListNode current = head;
    int index = 0;

    // Traverse the list until reaching the desired position
    while (current != null) {
      if (index == position) {
        return current; // Return the node at the specified position
      }
      current = current.next; // Move to the next node
      index++; // Increment the index
    }

    return null; // Return null if the position is out of bounds
  }

  public int getLength(ListNode head) {
    int length = 0;
    ListNode current = head;

    while (current != null) {
      length++; // increment to keep count through each element
      current = current.next; // moves on to next element
    }

    return length;
  }
}
