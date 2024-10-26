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
    /*the reason why i put the throw here is due to the fact that the product is being declared and we know in the test cases
     * that we are given a product id, what we dont know is if thaat productId is correct so technically speaking we should check
     * if the productId is matched up to the hashmap at all using get and if it doesnt exist then product will be null because no such key exists
     * instead of trying to put it in every single instance we see an order id or product id our test cases check to see if the given
     * input is even available for us to grab not if there is any input at all since that itself in my opinion would be front end and not us
     * that would handle that sort of thing before it reaches this point
     *
     * If you need me to delete comments I can i just wrote this out incase people look at any pr's for their own reasoning or what not
     */
    if (product == null) {
      throw new ProductNotFoundException("Product with ID " + productId + " not found");
    }
    String orderId = UUID.randomUUID().toString();
    orders.put(orderId, new Order(orderId, product, quantity));
    return orderId;
  }

  public void cancelOrder(String orderId) {
    orders.remove(orderId);
  }

  public String checkOrderStatus(String orderId)
      throws OrderNotFoundException, ProductNotFoundException {

    Order order = orders.get(orderId);
    // Since order is set at this exact moment all we need to do is check if the given id is in the
    // hashmap and if it isnt we know
    // that it would return a null value if no such key exists, hence why we would see if order ==
    // null and if it is throw that error
    // we do this instead of having an error at each exact moment because we know in the test cases
    // we are given an orderId we just need to make sure
    // on our end that it is correct, not if it exists.
    if (order == null) {
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
