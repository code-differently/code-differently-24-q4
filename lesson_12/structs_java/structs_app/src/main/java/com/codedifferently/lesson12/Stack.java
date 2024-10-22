package com.codedifferently.lesson12;

import java.util.EmptyStackException;

/** Implement the below Stack by providing code for the class methods. */
public class Stack {
  private ListNode top;

  public Stack() {
    this.top = null;
  }

  public void push(int value) {
    // Your code here
    ListNode newNode = new ListNode(value);
    newNode.next = top;
    top = newNode;
  }

  public int pop() {
    if (isEmpty()) {
        return 0; 
    } else {
        int value = top.val; 
        top = top.next; 
        return value;
    }
  }

  public int peek() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return top.val;
  }

  public boolean isEmpty() {
    return top == null;
  }
}
