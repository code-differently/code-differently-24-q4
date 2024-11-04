package com.codedifferently.lesson17.bank;

import java.util.Set;

public class SavingAccount extends CheckingAccount {
  public SavingAccount(String accountNumber, Set<Customer> owners, double initialBalance) {
    super(accountNumber, owners, initialBalance);
  }
}
