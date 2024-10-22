package com.codedifferently.lesson12;

/** Implement the below Stack by providing code for the class methods. */
public class Stack {
  private ListNode top;

  public Stack() {
    this.top = null;
  }

  public void push(int value) {
    ListNode tophat = new ListNode(value);
    tophat.next = top;
    top = tophat;
  }

  public int pop() {
    top = top.next;
    return top.val;
  }

  public int peek() {
    return top.val;
  }

  public boolean isEmpty() {
    return top == null;
  }
}