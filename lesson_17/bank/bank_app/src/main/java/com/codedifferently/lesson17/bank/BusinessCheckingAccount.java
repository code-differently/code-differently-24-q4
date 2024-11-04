package com.codedifferently.lesson17.bank;

import java.util.Set;

/**
 * Represents a business checking account, which is a specialized type of checking account. This
 * account must have at least one owner designated as a business.
 */
public class BusinessCheckingAccount extends CheckingAccount {

  /**
   * Creates a new BusinessCheckingAccount with the specified account number, owners, and initial
   * balance.
   *
   * @param accountNumber The account number for the business checking account.
   * @param owners A set of Customer objects representing the owners of the account.
   * @param initialBalance The initial balance to set for the account.
   * @throws IllegalArgumentException if no owner is designated as a business.
   */
  public BusinessCheckingAccount(
      String accountNumber, Set<Customer> owners, double initialBalance) {
    super(
        accountNumber,
        owners,
        initialBalance); // Call the superclass constructor to initialize common fields

    // Ensure that at least one owner is a business customer
    if (!owners.stream().anyMatch(Customer::isBusiness)) {
      throw new IllegalArgumentException("At least one owner must be a business");
    }
  }
}
