package com.codedifferently.lesson17.bank.exceptions;

import com.codedifferently.lesson17.bank.CheckingAccount;
import com.codedifferently.lesson17.bank.Customer;
import java.util.Set;

public class BusinessCheckingAccount extends CheckingAccount {
  public BusinessCheckingAccount(
      String accountNumber, Set<Customer> owners, double initialBalance) {
    super(accountNumber, owners, initialBalance);
    if (!hasBusinessOwner(owners)) {
      throw new IllegalArgumentException(
          "A business account requires at least one owner to be a business.");
    }
  }

  private boolean hasBusinessOwner(Set<Customer> owners) {
    return owners.stream()
        .anyMatch(
            owner ->
                owner.getName().toUpperCase().contains("INC")
                    || owner.getName().toUpperCase().contains("LLC")
                    || owner.getName().toUpperCase().contains("CO."));
  }
}
