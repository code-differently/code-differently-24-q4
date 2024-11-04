package com.codedifferently.lesson17.bank;

import java.util.Set;

public class SavingsAccount extends CheckingAccount {
  public SavingsAccount(String accountNumber, Set<Customer> owners, double initialBalance) {
    super(accountNumber, owners, initialBalance);
  }

  @Override
  public int hashCode() {
    return getAccountNumber().hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof SavingsAccount other) {
      return this.getAccountNumber().equals(other.getAccountNumber());
    }
    return false;
  }

  @Override
  public String toString() {
    return "SavingsAccount{"
        + "accountNumber='"
        + getAccountNumber()
        + '\''
        + ", balance="
        + getBalance()
        + ", isActive="
        + getStatus()
        + '}';
  }
}
