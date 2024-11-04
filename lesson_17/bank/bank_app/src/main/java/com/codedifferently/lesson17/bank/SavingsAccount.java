package com.codedifferently.lesson17.bank;

import java.util.Set;

/** 
 * Represents a savings account, which is a specialized type of checking account.
 * Inherits the behavior and properties of the CheckingAccount class.
 */
public class SavingsAccount extends CheckingAccount {

  /**
   * Creates a new SavingsAccount with the specified account number, owners, and initial balance.
   *
   * @param accountNumber The account number for the savings account.
   * @param owners A set of Customer objects representing the owners of the account.
   * @param initialBalance The initial balance to set for the account.
   */
  public SavingsAccount(String accountNumber, Set<Customer> owners, double initialBalance) {
    super(accountNumber, owners, initialBalance); // Call the superclass constructor to initialize common fields
  }

  /**
   * Deposits funds into the savings account.
   * This method overrides the deposit method in CheckingAccount, but currently
   * it behaves the same way as the parent class.
   *
   * @param amount The amount to deposit into the savings account.
   */
  @Override
  public void deposit(double amount) {
    super.deposit(amount); // Call the deposit method from CheckingAccount
  }
}
