package com.codedifferently.lesson17.bank;

import java.util.Set;

public class BusinessCheckingAccount extends CheckingAccount {

  public BusinessCheckingAccount(
      String accountNumber, Set<Customer> owners, double initialBalance) {
    super(accountNumber, owners, initialBalance); // Call to Account's constructor

    if (owners.stream().noneMatch(Customer::isBusiness)) {
      throw new IllegalArgumentException(
          "A BusinessCheckingAccount must have at least one business owner.");
    }
  }
}
