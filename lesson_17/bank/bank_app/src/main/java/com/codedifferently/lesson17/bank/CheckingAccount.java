package com.codedifferently.lesson17.bank;

import java.util.Set;

/** Represents a checking account. */
public class CheckingAccount extends BankAccount {

  // private boolean isActive;

  /**
   * Creates a new checking account.
   *
   * @param accountNumber The account number.
   * @param owners The owners of the account.
   * @param initialBalance The initial balance of the account.
   */
  public CheckingAccount(String accountNumber, Set<Customer> owners, double balance) {
    super(accountNumber, owners, balance);
    // isActive = true;
  }
}
