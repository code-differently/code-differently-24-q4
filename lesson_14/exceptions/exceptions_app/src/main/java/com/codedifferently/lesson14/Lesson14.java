package com.codedifferently.lesson14;

public class Lesson14 {

  public static void main(String[] args) {
    // System.out.println("Hello World");
    try {
      String orderId = ecommerceSystem.placeOrder("1", 1);  
    } catch (ProductNotFoundException e) {
      System.out.println("Product with ID " + orderId + " not found.");
    } catch (OrderNotFoundException e){
      System.out.println("Order with ID " + orderId + " not found.");
    }
  }
}

//ProductNotFoundException <- for product does not exist
//OrderNotFoundException <- for both order does not exist and order cancelled
