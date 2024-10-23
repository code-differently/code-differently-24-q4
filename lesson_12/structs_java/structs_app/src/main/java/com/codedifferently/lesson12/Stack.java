package com.codedifferently.lesson12;

/** Implement the below Stack by providing code for the class methods. */
public class Stack {
  private ListNode top;

  public Stack() {
    this.top = null;
  }

  public void push(int value) {
    ListNode newTop = new ListNode(value);
    newTop.next = top;
    top = newTop;
  }

  public int pop() {
    var oldTop = top.val;
    top = top.next;
    return oldTop;
  }

  public int peek() {
    var headVal = top.val;
    return headVal;
  }

  public boolean isEmpty() {
    return top == null;
  }
}
