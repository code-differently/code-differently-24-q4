package com.codedifferently.lesson17.bank;

import java.util.Set;

public class BusinessCheckingAccount extends CheckingAccount {

  /**
   * Creates a new BusinessCheckingAccount with the specified account number, owners, and initial
   * balance.
   *
   * <p>This constructor ensures that the account meets the minimum requirements for a business
   * checking account, including a minimum initial balance of $10,000 and at least one business
   * owner in the provided set of owners. If these requirements are not met, an {@link
   * IllegalArgumentException} is thrown.
   *
   * @param accountNumber The unique identifier for the account.
   * @param owners A set of {@link Customer} objects representing the owners of the account.
   * @param initialBalance The initial balance of the account, which must be at least $10,000.
   * @throws IllegalArgumentException If the initial balance is less than $10,000 or if none of the
   *     owners meet the criteria to be considered a business owner.
   */
  public BusinessCheckingAccount(
      String accountNumber, Set<Customer> owners, double initialBalance) {
    super(accountNumber, owners, initialBalance);

    // Business Account Logic
    if (initialBalance < 10000) {
      throw new IllegalArgumentException("Business accounts require a minimum balance of $10,000.");
    }
    if (!hasBusinessOwner(owners)) {
      throw new IllegalArgumentException(
          "A business checking account must have at least one business owner.");
    }
  }

  /**
   * Checks if at least one owner of the account is a business.
   *
   * <p>This method examines each owner in the "owners" set and returns true if any owner's name
   * contains "INC" or "LLC" (case-insensitive), which are used as indicators of a business owning
   * the account.
   *
   * @param owners The set of account owners to check.
   * @return true if the account has at least one business owner; false otherwise.
   */
  public boolean hasBusinessOwner(Set<Customer> owners) {
    return getOwners().stream()
        .anyMatch(
            owner ->
                owner.getName().toUpperCase().contains("INC")
                    || owner.getName().toUpperCase().contains("LLC"));
  }
}
