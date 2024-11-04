package com.codedifferently.lesson17.bank;

import java.util.ArrayList;
import java.util.List;

public class AuditLog {
    private final List<String> logEntries;
    
    public AuditLog() {
        logEntries = new ArrayList<>();
    }

    public void logTransaction(String message, double amount, String type) {
        String logEntry = String.format("Transaction: %s | Amount: %.2f | Type: %s", message, amount, type);
        logEntries.add(logEntry);
        System.out.println(logEntry);
    }
}
