package com.codedifferently.lesson14.ecommerce;

public class Order {
  private String orderId;
  private Product product;
  private int quantity;

  public Order(String orderId, Product product, int quantity) {
    this.orderId = orderId;
    this.product = product;
    this.quantity = quantity;
  }

  public String getOrderId() throws OrderNotFoundException {
    if (orderId == null) {
      throw new OrderNotFoundException("This order does not match any in our records");
    }
    return orderId;
  }

  public Product getProduct() throws OrderNotFoundException {
    if (product == null) {
      throw new OrderNotFoundException("This Product is not in our system.");
    }
    return product;
  }

  public int getQuantity() throws OrderNotFoundException {
    if (quantity == 0) {
      throw new OrderNotFoundException("Out of Stock.");
    }

    return quantity;
  }
}
