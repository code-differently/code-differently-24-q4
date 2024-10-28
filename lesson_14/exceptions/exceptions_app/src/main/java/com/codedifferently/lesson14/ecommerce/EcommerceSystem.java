package com.codedifferently.lesson14.ecommerce;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class EcommerceSystem {
  private Map<String, Product> products;
  private Map<String, Order> orders;

  public EcommerceSystem() {
    products = new HashMap<>();
    orders = new HashMap<>();
  }

  public void addProduct(String productId, String name) {
    products.put(productId, new Product(productId, name));
  }

  public String placeOrder(String productId, int quantity) throws ProductNotFoundException {
    Product product = products.get(productId);

    if (!products.containsKey(productId)) {

      throw new ProductNotFoundException("Product with ID " + productId + " not found");
    }
    String orderId = UUID.randomUUID().toString();
    orders.put(orderId, new Order(orderId, product, quantity));
    return orderId;
  }

  public void cancelOrder(String orderId) throws OrderNotFoundException {
    orders.remove(orderId);
  }

  public String checkOrderStatus(String orderId) throws OrderNotFoundException {
    Order order = orders.get(orderId);
    if (orders.get(orderId) == null) {
      throw new OrderNotFoundException("Order with ID " + orderId + " not found");
    }
    return "Order ID: "
        + orderId
        + ", Product: "
        + order.getProduct().getName()
        + ", Quantity: "
        + order.getQuantity();
  }
}
