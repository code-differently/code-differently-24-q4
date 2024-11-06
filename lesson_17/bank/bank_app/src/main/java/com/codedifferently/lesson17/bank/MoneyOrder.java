package com.codedifferently.lesson17.bank;

public class MoneyOrder {
  private final BankAccount account;
  private final double amount;

  public MoneyOrder(BankAccount account, double amount) {
    this.account = account;
    this.amount = amount;

    account.withdraw(amount);
  }

  public String getAmount() {
    return "$" + amount + " Taken from: " + account;
  }
}
