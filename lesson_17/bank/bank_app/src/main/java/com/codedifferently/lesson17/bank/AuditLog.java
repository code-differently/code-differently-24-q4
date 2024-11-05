package com.codedifferently.lesson17.bank;

import java.util.ArrayList;
import java.util.List;

/** Records and prints transaction logs. */
public class AuditLog {
  private final List<String> logEntries;

  /** Creates a new, empty audit log. */
  public AuditLog() {
    logEntries = new ArrayList<>();
  }

  /**
   * Adds a transaction entry to the log and prints it.
   *
   * @param accountNumber The account number involved.
   * @param message A message describing the transaction.
   * @param amount The amount of money in the transaction.
   * @param type The type of transaction (e.g., Deposit, Withdrawal).
   */
  public void logTransaction(String accountNumber, String message, double amount, String type) {
    String logEntry =
        String.format(
            "Account: %s | Transaction: %s | Amount: %.2f | Type: %s",
            accountNumber, message, amount, type);
    logEntries.add(logEntry);
    System.out.println(logEntry);
  }

  /**
   * Returns all the transaction logs.
   *
   * @return A list of all log entries.
   */
  public List<String> getLogEntries() {
    return logEntries;
  }
}
