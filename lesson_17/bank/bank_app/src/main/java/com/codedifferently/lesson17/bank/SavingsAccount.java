package com.codedifferently.lesson17.bank;

import com.codedifferently.lesson17.bank.exceptions.CheckNotAllowedException;
import java.util.Set;

/** Represents a savings account. */
public class SavingsAccount extends CheckingAccount {

  /**
   * Creates a new savings account.
   *
   * @param accountNumber The account number.
   * @param owners The owners of the account.
   * @param initialBalance The initial balance of the account. If it's negative, it will be set to
   *     zero.
   */
  public SavingsAccount(String accountNumber, Set<Customer> owners, double initialBalance) {
    super(accountNumber, owners, Math.max(initialBalance, 0));
  }

  /**
   * Deposits funds into the savings account.
   *
   * @param amount The amount to deposit.
   */
  @Override
  public void deposit(double amount) {
    super.deposit(amount);
  }

  /**
   * Withdraws funds from the savings account.
   *
   * @param amount The amount to withdraw.
   */
  @Override
  public void withdraw(double amount) {
    super.withdraw(amount);
  }

  /**
   * Throws an exception because savings accounts cannot write checks.
   *
   * @param amount The amount to write a check for.
   * @throws CheckNotAllowedException if attempting to write a check.
   */
  public void writeCheck(double amount) {
    throw new CheckNotAllowedException("Savings account cannot write checks");
  }
}
