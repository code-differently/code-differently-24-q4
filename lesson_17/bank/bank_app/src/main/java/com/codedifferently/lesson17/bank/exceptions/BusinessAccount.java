package com.codedifferently.lesson17.bank.exceptions;

import com.codedifferently.lesson17.bank.CheckingAccount;
import com.codedifferently.lesson17.bank.Customer;
import java.util.Set;

public class BusinessAccount {
  public class BusinessCheckingAccount extends CheckingAccount {
    public BusinessCheckingAccount(String accountNumber, Set<Customer> owners, double balance) {
      super(accountNumber, owners, balance);
      if (!hasBusinessOwner(owners)) {
        throw new IllegalArgumentException("requires at least one business owner.");
      }
    }

    private boolean hasBusinessOwner(Set<Customer> owners) {
      return owners.stream()
          .anyMatch(
              owner -> {
                return ((Customer) owners).getEmail().contains("business");
              });
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
          + isActive
          + '}';
    }
  }
}
