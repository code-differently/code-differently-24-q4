package com.codedifferently.lesson17.bank;

import java.util.Set;

public class BusinessCheckingAccount extends CheckingAccount implements BusinessAccount {

  public BusinessCheckingAccount(String accountNumber, Set<Customer> owners, double balance) {
    super(accountNumber, owners, balance);
  }

  @Override
  public boolean isBusiness() {
    return true;
  }
}
