package com.codedifferently.lesson17.bank;

import com.codedifferently.lesson17.bank.exceptions.CheckNotAllowedException;
import java.util.Set;

public class SavingsAccount extends CheckingAccount {
  public SavingsAccount(String accountNumber, Set<Customer> owners, double initialBalance) {
    super(accountNumber, owners, Math.max(initialBalance, 0));
  }

  @Override
  public void deposit(double amount) {
    super.deposit(amount);
  }

  @Override
  public void withdraw(double amount) {
    super.withdraw(amount);
  }

  public void writeCheck(double amount) {
    throw new CheckNotAllowedException("Savings account cannot write checks");
  }
}
