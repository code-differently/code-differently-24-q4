package com.codedifferently.lesson12;

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
    if (isEmpty()){
      System.out.println("EMPTY"); 
    }
    return 1;
  }

  public int peek() {
    if(isEmpty()){
      //do stuff
    } 
    return 1;
  }

  public boolean isEmpty() {
    return top == null;
  }
}
