package com.codedifferently.lesson17.bank;

import java.util.Set;

public final class BusinessCheckingAccount extends CheckingAccount {
  public BusinessCheckingAccount(
      String accountNumber, double initialBalance, Set<Customer> owners) {
    // Pass the accountNumber, initialBalance, and owners set to the CheckingAccount constructor
    super(accountNumber, owners, initialBalance);
    if (!hasBusinessOwner(owners)) {
      throw new IllegalArgumentException(
          "A BusinessCheckingAccount must have at least one business owner.");
    }
  }

  /**
   * @param check The check to deposit.
   * @throws UnsupportedOperationException If a check is attempted to be deposited.
   */
  boolean hasBusinessOwner(Set<Customer> owners) {
    return owners.stream().anyMatch(owner -> owner instanceof BusinessCustomer);
  }
}
