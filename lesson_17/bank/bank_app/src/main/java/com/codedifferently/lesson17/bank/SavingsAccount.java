package com.codedifferently.lesson17.bank;

import java.util.Set;

public class SavingsAccount extends CheckingAccount {

  public SavingsAccount(String accountNumber, double initialBalance, Set<Customer> owners) {
    // Pass the accountNumber, initialBalance, and owners set to the CheckingAccount constructor
    super(accountNumber, owners, initialBalance);
  }

  /**
   * @param check The check to deposit.
   * @throws UnsupportedOperationException If a check is attempted to be deposited.
   */
  public void depositFunds(Check check) {
    throw new UnsupportedOperationException("Cannot deposit checks into a Savings Account.");
  }
}
