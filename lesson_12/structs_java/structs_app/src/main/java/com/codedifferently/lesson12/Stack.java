package com.codedifferently.lesson12;

public class Stack {
  private ListNode top;

  public Stack() {
    this.top = null;
  }

  public void push(int value) {
    ListNode newNode = new ListNode(value);
    newNode.next = top;
    top = newNode;
  }

  public int pop() {
    int topmostValue = 0;
    if (isEmpty()) {
      return Integer.parseInt(null);
    } else {
      topmostValue = top.val;
      top = top.next;
      return topmostValue;
    }
  }

  public int peek() {
    if (isEmpty()) {
      return Integer.parseInt(null);
    }
    return top.val;
  }

  public boolean isEmpty() {
    return top == null;
  }
}
