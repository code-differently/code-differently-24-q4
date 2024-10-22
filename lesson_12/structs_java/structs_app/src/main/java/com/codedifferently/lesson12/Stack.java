package com.codedifferently.lesson12;

/** Implement the below Stack by providing code for the class methods. */
public class Stack {
  private ListNode top;

  public Stack() {
    this.top = null;
  }

  public void push(int value) {
    top = new ListNode(value, top);
  }

  public int pop() {
    int value = top.val;
    top = top.next;
    return value;
  }

  public int peek() {
    return top.val;
  }

  public boolean isEmpty() {
    return top == null;
  }
}
