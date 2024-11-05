package com.codedifferently.lesson17.bank;

import java.util.ArrayList;
import java.util.List;

public class AuditLog {
    private final List<String> logEntries;
    
    public AuditLog() {
        logEntries = new ArrayList<>();
    }

    public void logTransaction(String accountNumber, String message, double amount, String type) {
        String logEntry = String.format("Account: %s | Transaction: %s | Amount: %.2f | Type: %s", accountNumber, message, amount, type);
        logEntries.add(logEntry);
        System.out.println(logEntry);
    }

    public List<String> getLogEntries() {
        return logEntries;
    }
}
