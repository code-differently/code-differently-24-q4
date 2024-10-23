package com.codedifferently.lesson12;

/** Implement the below Stack by providing code for the class methods. */
public class Stack {
  private ListNode top;

  public Stack() {
    this.top = null;
  }

  public void push(int value) {
    // Your code here
    ListNode top2 = new ListNode(value);
    top2.next = top;
    top = top2;
  }

  public int pop() {
    int topvalue = top.val;
    top = top.next;

    return topvalue;
  }

  public int peek() {
    return top.val;
  }

  public boolean isEmpty() {
    return top == null
  }
}
