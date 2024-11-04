package com.codedifferently.lesson17.bank;

import java.util.ArrayList;
import java.util.List;

public class AuditLog {

  private final List<String> logEntries = new ArrayList<>();

  public void logAccountAddition(String accountNumber) {
    logEntries.add("Account added: " + accountNumber);
  }

  public List<String> getLogEntries() {
    return new ArrayList<>(logEntries);
  }

  public String getLastEntry() {
    if (logEntries.isEmpty()) {
      return null; // Or throw an exception if preferred
    }
    return logEntries.get(logEntries.size() - 1);
  }
}
