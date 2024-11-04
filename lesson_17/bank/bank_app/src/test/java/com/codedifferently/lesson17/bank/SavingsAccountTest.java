package com.codedifferently.lesson17.bank;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;
import org.junit.jupiter.api.Test;

class SavingsAccountTest {

  @Test
  void testSavingsAccountDeposit() {
    SavingsAccount savingsAccount = new SavingsAccount("987654321", Set.of(), 200.0);
    double amountToDeposit = 100.0;
    savingsAccount.deposit(amountToDeposit);
    assertThat(savingsAccount.getBalance()).isEqualTo(300.0);
  }
}
