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

  public String placeOrder(String productId, int quantity)  throws ProductNotFoundException, InvalidOrderQuantityException {
    Product product = products.get(productId); {
    String orderId = UUID.randomUUID().toString();
    orders.put(orderId, new Order(orderId, product, quantity));
    return orderId;
    
    if (! products.containsKey(productId));
    throw new ProductNotFoundException("Product with ID " + productId + "not found");
  }
    if (quantity < 1); {
    throw new InvalidOrderQuantityException("Quantity must be at least 1");
}
   
}

  public void cancelOrder(String orderId) throws OrderNotFoundException {
    orders.remove(orderId); {
      
      Order order = orders.get(orderId);
      if (order == null) {
        throw new OrderNotFoundException("Order with ID " + orderId + "not found");
      }
      if (order.getStatus().equals("Canceled")) {
        throw new OrderNotFoundException("Order has already been canceled");
      }
      if (order.getStatus().equals("Processed")) {
        throw new OrderNotFoundException("Order has already been processed");
      }
    }
  }

  public String checkOrderStatus(String orderId) throws OrderNotFoundException {
    Order order = orders.get(orderId); 
    return "Order ID: "
        + orderId
        + ", Product: "
        + order.getProduct().getName()
        + ", Quantity: "
        + order.getQuantity();

  if (orders.get(orderId) == null) {
    throw new OrderNotFoundException("Order with ID " + orderId + "not found");
  }
  if (orders.remove(orderId)) {
    throw new OrderNotFoundException("Order with ID " + orderId + "not found");
  }
}
}
