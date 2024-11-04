package com.codedifferently.lesson17.bank;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MoneyOrderTest {
  @Test
  void testMoneyOrderInitialization() {
    double amount = 50.0;
    String sourceAccountNumber = "123456789";
    MoneyOrder moneyOrder = new MoneyOrder(amount, sourceAccountNumber);
    assertThat(moneyOrder.getAmount()).isEqualTo(amount);
    assertThat(moneyOrder.getSourceAccountNumber()).isEqualTo(sourceAccountNumber);
  }
}
