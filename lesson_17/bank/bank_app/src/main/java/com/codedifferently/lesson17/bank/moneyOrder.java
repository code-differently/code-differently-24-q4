package com.codedifferently.lesson17.bank;

import com.codedifferently.lesson17.bank.exceptions.moneyOrderVoidedException;

public class moneyOrder extends Check {

  public moneyOrder(String checkNumber, double amount, CheckingAccount account) {
    super(checkNumber, amount, account);
    if (amount < 0) {
      throw new IllegalArgumentException("moneyOrder is positive");
    }
    account.withdraw(amount);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof moneyOrder other) {
      return getCheckNumber().equals(other.getCheckNumber());
    }
    return false;
  }

  @Override
  /**
   * Deposits the check into an account.
   *
   * @param toAccount The account to deposit the check into.
   */
  public void depositFunds(CheckingAccount toAccount) {
    if (getIsVoided()) {
      throw new moneyOrderVoidedException("moneyOrder is voided");
    }
    toAccount.deposit(getAmount());
    voidCheck();
  }

  @Override
  public String toString() {
    return "moneyOrder{"
        + "moneyOrderNumber='"
        + getCheckNumber()
        + '\''
        + ", amount="
        + getAmount()
        + ", account="
        + newAccount().getAccountNumber()
        + '}';
  }
}
