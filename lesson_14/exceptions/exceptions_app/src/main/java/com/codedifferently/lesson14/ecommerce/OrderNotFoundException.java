package com.codedifferently.lesson14.ecommerce;

class OrderNotFoundException extends RuntimeException {
  public OrderNotFoundException(String message) {
    super(message);
  }
}
