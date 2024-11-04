package com.codedifferently.lesson17.bank;

import java.util.Set;

public class BusinessCheckingAccount extends CheckingAccount {

  public BusinessCheckingAccount(
      String accountNumber, Set<Customer> owners, double initialBalance) {
    super(accountNumber, owners, initialBalance);
    if (!owners.stream().anyMatch(Customer::isBusiness)) {
      throw new IllegalArgumentException("At least one owner must be a business");
    }
  }
}
