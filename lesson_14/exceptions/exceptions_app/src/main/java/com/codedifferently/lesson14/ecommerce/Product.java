package com.codedifferently.lesson14.ecommerce;

public class Product {
  private String productId;
  private String name;

  public Product(String productId, String name) {
    this.productId = productId;
    this.name = name;
  }

  public String getProductId() {
    if (productId == null) {
      try {
        throw new ProductNotFoundException("The product ID can not be found.");
      } catch (ProductNotFoundException e) {
        System.out.println(e);
      }
    }
    return productId;
  }

  public String getName() {
    if (name == null) {
      try {
        throw new ProductNotFoundException("Nothing matches that name");
      } catch (ProductNotFoundException e) {
        System.out.println(e);
      }
    }
    return name;
  }
}
