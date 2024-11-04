package com.codedifferently.lesson17.bank;

public class MoneyOrder {
  private double amount;
  private CheckingAccount account;



  /**
   * Creates a new check.
   *
   * @param checkNumber The check number.
   * @param amount The amount of the check.
   * @param account The account the check is drawn on.
   */
  public MoneyOrder(double amount, CheckingAccount account) {
    if (amount < 0) {
      throw new IllegalArgumentException("Money Order amount must be positive");
    }
    this.amount = amount;
    this.account = account;

    account.withdraw(amount);
  }
}
