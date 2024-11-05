package com.codedifferently.lesson17.bank;

/** Represents a Money Order transaction. */
public class MoneyOrder {
  private final CheckingAccount sourceAccount;
  private final double amount;
  private AuditLog auditLog;

  /**
   * Creates a new money order transaction by withdrawing the specified amount from the source
   * account. The transaction is logged for auditing purposes.
   *
   * @param sourceAccount The account from which funds will be withdrawn.
   * @param amount The amount to withdraw and transfer in the money order.
   * @param auditLog The audit log used to record the transaction details.
   */
  public MoneyOrder(CheckingAccount sourceAccount, double amount, AuditLog auditLog) {
    this.sourceAccount = sourceAccount;
    this.amount = amount;
    this.auditLog = auditLog;

    sourceAccount.withdraw(amount);

    auditLog.logTransaction(
        sourceAccount.getAccountNumber(), "MoneyOrder created", -amount, "MoneyOrder");
  }

  /**
   * Gets the source account from which the money was withdrawn.
   *
   * @return The source checking account.
   */
  public CheckingAccount getSourceAccount() {
    return sourceAccount;
  }

  /**
   * Gets the amount of money involved in the Money Order transaction.
   *
   * @return The amount of the money order.
   */
  public double getAmount() {
    return amount;
  }
}
