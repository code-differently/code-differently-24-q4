package com.codedifferently.lesson17.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.codedifferently.lesson17.bank.exceptions.CheckNotAllowedException;
import org.junit.jupiter.api.Test;

public class SavingsAccountTest {
  @Test
  void testDeposit() {
    // Arrange
    SavingsAccount account = new SavingsAccount("12345678", null, 5.00);
    account.deposit(200);

    // Assert
    assertEquals(205.00, account.getBalance());
  }

  @Test
  void testWithdraw() {
    // Arrange
    SavingsAccount account = new SavingsAccount("12345678", null, 0.00);
    account.deposit(1000);

    // Act
    account.withdraw(500);

    // Assert
    assertEquals(500, account.getBalance());
  }

  @Test
  void testWriteCheck() {
    // Arrange
    SavingsAccount account = new SavingsAccount("12345678", null, 1000.00);

    // Act & Assert
    CheckNotAllowedException thrown =
        assertThrows(
            CheckNotAllowedException.class,
            () -> {
              account.writeCheck(100);
            });

    // Assert
    assertEquals("Savings account cannot write checks", thrown.getMessage());
  }
}
