package com.codedifferently.lesson12;

/** Implement the below Stack by providing code for the class methods. */
public class Stack {
  private ListNode top;

  public Stack() {
    this.top = null;
  }

  public void push(int value) {
    // Your code here
    ListNode newTop = new ListNode(value);
    newTop.next = top;
    top = newTop;
  }

  public int pop() {
    if (isEmpty()) {
      throw new IllegalStateException("Empty");
    }
    int oldTopVal = top.val;
    top = top.next;
    return oldTopVal;
  }

  public int peek() {
    if (isEmpty()) {
      throw new IllegalStateException("Empty");
    }
    return top.val;
  }

  public boolean isEmpty() {
    return top == null;
  }
}
