package com.codedifferently.lesson17.bank;

public class MoneyOrder {
  private final CheckingAccount sourceAccount;
  private final double amount;
  private AuditLog auditLog;

  public MoneyOrder(CheckingAccount sourceAccount, double amount, AuditLog auditLog) {
    this.sourceAccount = sourceAccount;
    this.amount = amount;
    this.auditLog = auditLog;

    sourceAccount.withdraw(amount);

    auditLog.logTransaction(
        sourceAccount.getAccountNumber(), "MoneyOrder created", -amount, "MoneyOrder");
  }

  public CheckingAccount getSourceAccount() {
    return sourceAccount;
  }

  public double getAmount() {
    return amount;
  }
}
