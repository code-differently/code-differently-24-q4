package com.codedifferently.lesson17.bank;

import java.util.Set;

public class BusinessCheckingAccount extends CheckingAccount {
  public BusinessCheckingAccount(String accountNumber, Set<Customer> owners, double balance) {
    super(accountNumber, owners, balance);
    if (!hasBusinessOwner(owners)) {
      throw new IllegalArgumentException("requires at least one business owner.");
    }
  }

  private boolean hasBusinessOwner(Set<Customer> owners) {
    return owners.stream().anyMatch(Customer::isBusiness);
  }


  @Override
  public String toString() {
    return "BusinessCheckingAccount{"
        + "accountNumber='"
        + accountNumber
        + '\''
        + ", balance="
        + balance
        + ", isActive="
        + isActive
        + '}';
  }
}
