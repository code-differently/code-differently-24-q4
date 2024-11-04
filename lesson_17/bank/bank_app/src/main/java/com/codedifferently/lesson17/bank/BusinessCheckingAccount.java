package com.codedifferently.lesson17.bank;

import java.util.Set;

public class BusinessCheckingAccount extends CheckingAccount {

  public BusinessCheckingAccount(String accountNumber, Set<Customer> owners, double balance) {
    super(accountNumber, owners, balance);
    validateBusinessOwners(owners);
  }

  private void validateBusinessOwners(Set<Customer> owners) {
    boolean hasBusinessOwner = owners.stream().anyMatch(Customer::isBusiness);
    if (!hasBusinessOwner) {
      throw new IllegalArgumentException(
          "At least one owner must be a business for a BusinessCheckingAccount");
    }
  }

  @Override
  public String toString() {
    return "BusinessCheckingAccount{"
        + "accountNumber='"
        + getAccountNumber()
        + '\''
        + ", balance="
        + getBalance()
        + ", isActive="
        + isClosed()
        + '}';
  }
}
