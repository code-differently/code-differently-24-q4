package com.codedifferently.lesson12;

/** Implement the below Stack by providing code for the class methods. */
public class Stack {
  private ListNode top;

  public Stack() {
    this.top = null;
  }

  public void push(int value) {
    var newTop = new ListNode(value);
    newTop.next = top;
    top = newTop;
  }

  public int pop() {
    int newTop = 0;
    if (isEmpty()) {
      throw new IllegalStateException("Stack is empty");
    } else {
      newTop = top.val;
      top = top.next;
      return newTop;
    }
  }

  public int peek() {
    if (isEmpty()) {
      throw new IllegalStateException("Stack is empty");
    }
    return top.val;
  }

  public boolean isEmpty() {
    return top == null;
  }
}
