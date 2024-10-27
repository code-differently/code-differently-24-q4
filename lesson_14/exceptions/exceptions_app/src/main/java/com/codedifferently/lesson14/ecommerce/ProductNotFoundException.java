package com.codedifferently.lesson14.ecommerce;

class ProductNotFoundException extends RuntimeException {
  public ProductNotFoundException(String message) {
    super(message);
  }
}
