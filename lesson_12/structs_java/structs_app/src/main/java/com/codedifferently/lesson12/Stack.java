package com.codedifferently.lesson12;

/** Implement the below Stack by providing code for the class methods. */
public class Stack {
  private ListNode top;

  public Stack() {
    this.top = null;
  }

  public void push(int value) {
     ListNode node = new ListNode(value);
     node.next = top;
     top = node;
   }

   public int pop() {
     if (isEmpty()){
       throw new IllegalStateException("Stack has no values");
     }
     int valToPop = top.val;
     top = top.next;
     return valToPop;
   }

   public int peek() {
     if (isEmpty()){
       throw new IllegalStateException("Stack has no values");
     }

     return top.val;
   }

   public boolean isEmpty() {
     return top == null;
   }
 }
