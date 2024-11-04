package com.codedifferently.lesson17.bank;

import com.codedifferently.lesson17.bank.exceptions.CheckVoidedException;

/**
 * Represents a check that can be deposited into a checking account. A check has a number, an
 * amount, and is associated with a checking account.
 */
public class Check {

  // The unique identifier for the check
  private final String checkNumber;

  // The amount specified on the check
  private final double amount;

  // The checking account that the check is drawn from
  private final CheckingAccount account;

  // Indicates whether the check has been voided
  private boolean isVoided = false;

  /**
   * Creates a new check with the specified check number, amount, and associated account.
   *
   * @param checkNumber The check number.
   * @param amount The amount of the check (must be positive).
   * @param account The checking account the check is drawn on.
   * @throws IllegalArgumentException if the amount is negative.
   */
  public Check(String checkNumber, double amount, CheckingAccount account) {
    if (amount < 0) {
      throw new IllegalArgumentException(
          "Check amount must be positive"); // Validate the check amount
    }
    this.checkNumber = checkNumber;
    this.amount = amount;
    this.account = account; // Assign the associated checking account
  }

  /**
   * Gets the voided status of the check.
   *
   * @return True if the check is voided; false otherwise.
   */
  public boolean getIsVoided() {
    return isVoided; // Return the voided status
  }

  /** Voids the check, preventing it from being deposited. */
  public void voidCheck() {
    isVoided = true; // Set the voided status to true
  }

  /**
   * Deposits the check into the specified account.
   *
   * @param toAccount The account to deposit the check into.
   * @throws CheckVoidedException if the check is voided.
   */
  public void depositFunds(CheckingAccount toAccount) {
    if (isVoided) {
      throw new CheckVoidedException("Check is voided"); // Check if the check is voided
    }
    account.withdraw(amount); // Withdraw the amount from the original account
    toAccount.deposit(amount); // Deposit the amount into the specified account
    voidCheck(); // Void the check after successful deposit
  }

  @Override
  public int hashCode() {
    return checkNumber.hashCode(); // Generate hash code based on the check number
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Check other) {
      return checkNumber.equals(other.checkNumber); // Check equality based on the check number
    }
    return false;
  }

  @Override
  public String toString() {
    return "Check{"
        + "checkNumber='"
        + checkNumber
        + '\''
        + ", amount="
        + amount
        + ", account="
        + account.getAccountNumber()
        + '}'; // Return a string representation of the check
  }
}
