package com.codedifferently.lesson17.bank;

/**
 * Represents a money order, which includes an amount and a source account number from which the
 * funds are drawn.
 */
public class MoneyOrder {

  // The amount of money represented by the money order
  private final double amount;

  // The account number from which the money order is issued
  private final String sourceAccountNumber;

  /**
   * Creates a new MoneyOrder with the specified amount and source account number.
   *
   * @param amount The amount of the money order.
   * @param sourceAccountNumber The account number from which the funds are drawn.
   */
  public MoneyOrder(double amount, String sourceAccountNumber) {
    this.amount = amount; // Initialize the amount
    this.sourceAccountNumber = sourceAccountNumber; // Initialize the source account number
  }

  /**
   * Gets the amount of the money order.
   *
   * @return The amount of the money order.
   */
  public double getAmount() {
    return amount; // Return the amount
  }

  /**
   * Gets the source account number for the money order.
   *
   * @return The source account number.
   */
  public String getSourceAccountNumber() {
    return sourceAccountNumber; // Return the source account number
  }
}
