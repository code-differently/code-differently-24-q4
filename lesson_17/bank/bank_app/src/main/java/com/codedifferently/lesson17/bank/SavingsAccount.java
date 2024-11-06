package com.codedifferently.lesson17.bank;

import com.codedifferently.lesson17.bank.exceptions.InsufficientFundsException;
import java.util.Set;

// represent a savings account
public class SavingsAccount {

  private final Set<Customer> owners;
  private final String accountNumber;
  private double balance;
  private boolean isActive;

  // consturcter of saving account
  public SavingsAccount(String accountNumber, Set<Customer> owners, double initialBalance) {
    this.accountNumber = accountNumber;
    this.owners = owners;
    this.balance = initialBalance;
    isActive = true;
  }

  // getters & setters
  public String getAccountNumber() {
    return accountNumber;
  }

  public Set<Customer> getOwners() {
    return owners;
  }

  public double getBalance() {
    return balance;
  }

  public boolean isClosed() {
    return !isActive;
  }

  /**
   * Deposits funds into the account.
   *
   * @param amount The amount to deposit.
   */
  public void deposit(double amount) throws IllegalStateException {
    if (isClosed()) {
      throw new IllegalStateException("Cannot deposit to a closed account");
    }
    if (amount <= 0) {
      throw new IllegalArgumentException("Deposit amount must be positive");
    }
    balance += amount;
  }

  /**
   * Withdraws funds from the account.
   *
   * @param amount
   * @throws InsufficientFundsException
   */
  public void withdraw(double amount) throws InsufficientFundsException {
    if (isClosed()) {
      throw new IllegalStateException("Cannot withdraw from a closed account");
    }
    if (amount <= 0) {
      throw new IllegalStateException("Withdrawal amount must be positive");
    }
    if (balance < amount) {
      throw new InsufficientFundsException("Account does not have enough funds for withdrawal");
    }
    balance -= amount;
  }

  /** Closes the account. */
  public void closeAccount() throws IllegalStateException {
    if (balance > 0) {
      throw new IllegalStateException("Cannot close account with a positive balance");
    }
    isActive = false;
  }

  @Override
  public int hashCode() {
    return accountNumber.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof SavingsAccount other) {
      return accountNumber.equals(other.accountNumber);
    }
    return false;
  }

  @Override
  public String toString() {
    return "SavingsAccount{"
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
