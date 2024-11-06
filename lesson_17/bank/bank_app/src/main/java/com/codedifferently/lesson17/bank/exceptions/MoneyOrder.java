package com.codedifferently.lesson17.bank.exceptions;

import com.codedifferently.lesson17.bank.Check;
import com.codedifferently.lesson17.bank.CheckingAccount;

public class MoneyOrder extends Check {

  public MoneyOrder(String checkNumber, double amount, CheckingAccount account) {
    super(checkNumber, amount, account);
    if (amount < 0) {
      throw new IllegalArgumentException("MoneyOrder amount must be positive");
    }
    account.withdraw(amount);
  }

  @Override
  /**
   * Deposits the check into an account.
   *
   * @param toAccount The account to deposit the check into.
   */
  public void depositFunds(CheckingAccount toAccount) {
    if (getIsVoided()) {
      throw new CheckVoidedException("MoneyOrder is voided");
    }
    // getAccount().withdraw(getAmount());
    toAccount.deposit(getAmount());
    voidCheck();
  }

  @Override
  public String toString() {
    return "MoneyOrder{"
        + "checkNumber='"
        + getCheckNumber()
        + '\''
        + ", amount="
        + getAmount()
        + ", account="
        + ((CheckingAccount) getAccount()).getAccountNumber()
        + '}';
  }

  private double getAmount() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  private Object getAccount() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  private String getCheckNumber() {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}
