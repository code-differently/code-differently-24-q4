package com.codedifferently.lesson17.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoneyOrderTest {

    private CheckingAccount sourceAccount;
    private AuditLog auditLog;

    @BeforeEach
    public void setup() {
        // Arrange
        sourceAccount = new CheckingAccount("12345678", "John Doe", true, 1000.0);
        auditLog = new AuditLog();
    }

   @Test
    public void testMoneyOrderWithdrawal() {
        // Act
        MoneyOrder moneyOrder = new MoneyOrder(sourceAccount, 500.0, auditLog);

        // Assert
        assertEquals(500.0, sourceAccount.getBalance(), "Balance after money order should be 500");

        // Assert
        assertEquals(1, auditLog.getLogEntries().size(), "Audit log should contain 1 entry");
        String logEntry = auditLog.getLogEntries().get(0);

        assertTrue(logEntry.contains("Account: 12345678"), "Log should contain the correct account number");
        assertTrue(logEntry.contains("MoneyOrder created"), "Log should describe the MoneyOrder creation");
        assertTrue(logEntry.contains("-500.00"), "Log should reflect the correct withdrawal amount");
        assertTrue(logEntry.contains("MoneyOrder"), "Log should specify the transaction type as 'MoneyOrder'");
    }
}
