package com.codedifferently.lesson17.bank.exceptions;

import com.codedifferently.lesson17.bank.Check;

public class MoneyOrder extends Check {

  public MoneyOrder(
      String checkNumber,
      double amount,
      com.codedifferently.lesson17.bank.CheckingAccount account) {
    super(checkNumber, amount, account);
    if (amount < 0) {
      throw new IllegalArgumentException("MoneyOrder amount must be positive");
    }
    account.withdraw(amount);
  }

  /**
   * Deposits the check into an account.
   *
   * @param toAccount The account to deposit the check into.
   */
  public void depositFunds(CheckingAccount toAccount) {
    if (getIsVoided()) {
      throw new UnsupportedOperationException("MoneyOrder is voided");
    }
    toAccount.withdraw(getAmount());
    ((CheckingAccount) getAccount()).withdraw(getAmount());
    ((CheckingAccount) toAccount).deposit(getAmount());
    voidCheck();
  }

  public class CheckingAccount {
    private String accountNumber;

    public CheckingAccount(String accountNumber) {
      this.accountNumber = accountNumber;
    }

    private void withdraw(double amount) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
    }

    private void deposit(double amount) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }

    public String getAccountNumber() {
      return this.accountNumber;
    }
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
