package com.codedifferently.lesson17.bank;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import java.util.Set;
import java.util.UUID;
import org.junit.jupiter.api.Test;

class BusinessCheckingAccountTest {

  @Test
  void testConstructor_ThrowsException_NoBusinessOwner() {
    // Arrange
    Customer individualOwner = new Customer(UUID.randomUUID(), "John Doe", false);
    Set<Customer> owners = Set.of(individualOwner);

    // Act & Assert
    assertThatExceptionOfType(IllegalArgumentException.class)
        .isThrownBy(() -> new BusinessCheckingAccount("123456789", owners, 100.0))
        .withMessage("At least one owner must be a business");
  }

  @Test
  void testConstructor_Success_WithBusinessOwner() {
    // Arrange
    Customer businessOwner = new Customer(UUID.randomUUID(), "Tech Labs", true);
    Set<Customer> owners = Set.of(businessOwner);

    // Act
    BusinessCheckingAccount account = new BusinessCheckingAccount("123456789", owners, 100.0);

    // Assert
    assertThat(account).isNotNull();
    assertThat(account.getBalance()).isEqualTo(100.0);
  }
}
