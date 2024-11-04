package com.codedifferently.lesson17.bank;

import java.util.Set;

public class SavingsAccount extends CheckingAccount {

  public SavingsAccount(String accountNumber, Set<Customer> owners, double initialBalance) {
    super(accountNumber, owners, initialBalance);
  }

  @Override
  public void deposit(double amount) {
    super.deposit(amount);
  }
}
