package com.codedifferently.lesson12;

/** Implement the below Stack by providing code for the class methods. */
public class Stack {
  private ListNode top;

  public Stack() {
    this.top = null;
  }

  public void push(int value) {
    ListNode pushedVal = new ListNode(value);
    pushedVal.next = top;
    top = pushedVal;
  }

  public int pop() {
    int val = top.val;
    top = top.next;
    return val;
  }

  public int peek() {
    return top.val;
  }

  public boolean isEmpty() {
    return top == null;
  }
}
