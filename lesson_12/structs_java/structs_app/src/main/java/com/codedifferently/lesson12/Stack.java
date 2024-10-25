package com.codedifferently.lesson12;

/** Implement the below Stack by providing code for the class methods. */
public class Stack {
  private ListNode top;

  public Stack() {
    this.top = null;
  }

  public void push(int value) {
    ListNode topHat = new ListNode(value);
    topHat.next = top;
    top = topHat;
  }

  public int pop() {
    int headNumber = top.val;
    top = top.next;
    return headNumber;
  }

  public int peek() {
    return top.val;
  }

  public boolean isEmpty() {
    return top == null;
  }
}
