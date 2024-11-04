package com.codedifferently.lesson17.bank;

import java.util.UUID;

public class BusinessOwner extends Customer {

  private final String businessName;

  public BusinessOwner(UUID id, String name, String businessName) {
    super(id, name);
    this.businessName = businessName;
  }

  public String businessName() {
    return businessName;
  }

  @Override
  public boolean isBusiness() {
    return true;
  }
}
