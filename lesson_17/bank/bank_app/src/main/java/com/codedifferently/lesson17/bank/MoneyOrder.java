package com.codedifferently.lesson17.bank;

public class MoneyOrder {
  private final double amount;
  private final String sourceAccountNumber;

  public MoneyOrder(double amount, String sourceAccountNumber) {
    this.amount = amount;
    this.sourceAccountNumber = sourceAccountNumber;
  }

  public double getAmount() {
    return amount;
  }

  public String getSourceAccountNumber() {
    return sourceAccountNumber;
  }
}
