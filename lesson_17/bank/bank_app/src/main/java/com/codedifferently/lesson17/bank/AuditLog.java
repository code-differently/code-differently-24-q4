package com.codedifferently.lesson17.bank;

import java.util.ArrayList;
import java.util.List;

/**
 * Records audit logs for account-related actions. This class maintains a list of log entries for
 * tracking account additions.
 */
public class AuditLog {

  // List to hold log entries
  private final List<String> logEntries = new ArrayList<>();

  /**
   * Logs the addition of a new account by recording its account number.
   *
   * @param accountNumber The account number of the newly added account.
   */
  public void logAccountAddition(String accountNumber) {
    logEntries.add("Account added: " + accountNumber);
  }

  /**
   * Retrieves all log entries recorded in the audit log.
   *
   * @return A new list containing all log entries.
   */
  public List<String> getLogEntries() {
    // Return a copy of the log entries to prevent external modification
    return new ArrayList<>(logEntries);
  }

  /**
   * Retrieves the last log entry recorded in the audit log.
   *
   * @return The most recent log entry as a String, or null if there are no entries.
   */
  public String getLastEntry() {
    // Check if the log is empty and return null if so
    if (logEntries.isEmpty()) {
      return null; // Or throw an exception if preferred
    }
    // Return the last log entry
    return logEntries.get(logEntries.size() - 1);
  }
}
