package com.codedifferently.lesson17.bank;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import com.codedifferently.lesson17.bank.exceptions.moneyOrderVoidedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class moneyOrderTest {

  private CheckingAccount account1;
  private CheckingAccount account2;
  private moneyOrder classUnderTest;

  @BeforeEach
  void setUp() {
    account1 = new CheckingAccount("123456789", null, 100.0);
    account2 = new CheckingAccount("987654321", null, 200.0);
    classUnderTest = new moneyOrder("123456789", 50.0, account1);
  }

  @Test
  void testDepositFunds() {
    // Act
    classUnderTest.depositFunds(account2);
    // Assert
    assertThat(account1.getBalance()).isEqualTo(50.0);
    assertThat(account2.getBalance()).isEqualTo(250.0);
  }

  @Test
  void testDepositFunds_moneyOrderVoided() {
    // Arrange
    classUnderTest.voidCheck();

    // Act & Assert
    assertThatExceptionOfType(moneyOrderVoidedException.class)
        .isThrownBy(() -> classUnderTest.depositFunds(account2))
        .withMessage("moneyOrder is voided");
  }

  @Test
  void testHashCode() {
    // Arrange
    moneyOrder otherCheck = new moneyOrder("123456789", 50.0, account1);

    // Assert
    assertThat(classUnderTest.hashCode()).isEqualTo(otherCheck.hashCode());
  }

  @Test
  void testEquals() {
    // Arrange
    moneyOrder newPaymentOrder = new moneyOrder("123456789", 25.0, account1);
    moneyOrder differentCheck = new moneyOrder("987654321", 25.0, account1);

    // Assert
    assertThat(classUnderTest.equals(newPaymentOrder)).isTrue();
    assertThat(classUnderTest.equals(differentCheck)).isFalse();
  }

  @Test
  void testToString() {
    // Assert
    assertThat(classUnderTest.toString())
        .isEqualTo("moneyOrder{moneyOrderNumber='123456789', amount=50.0, account=123456789}");
  }
}
