package com.codedifferently.lesson17.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoneyOrderTest {

  private BankAccount account;

  @BeforeEach
  public void setup() {
    // Arrange
    account = new CheckingAccount("12345678", null, 999.0);
  }

  @Test
  public void testMoneyOrderCreation() {
    // Arrange
    double expectedAccountAmmount = 499.00;

    // Act
    MoneyOrder moneyOrder = new MoneyOrder(account, 500.0);

    // Assert
    assertEquals(expectedAccountAmmount, account.balance);
  }

  @Test
  public void testMoneyOrderGetAmmount() {
    // Act
    MoneyOrder moneyOrder = new MoneyOrder(account, 500.0);

    // Arrange
    String expectedMessage = "$" + 500.0 + " Taken from: " + account;

    // Assert
    assertEquals(expectedMessage, moneyOrder.getAmount());
  }
}
