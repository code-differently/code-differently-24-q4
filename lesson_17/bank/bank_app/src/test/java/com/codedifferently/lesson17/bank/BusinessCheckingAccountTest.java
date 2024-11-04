package com.codedifferently.lesson17.bank;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BusinessCheckingAccountTest {

  private Set<Customer> owners;

  @BeforeEach
  void setUp() {
    owners = new HashSet<>();
    owners.add(new Customer(UUID.randomUUID(), "John Doe", false));
    owners.add(new Customer(UUID.randomUUID(), "Jane Smith", false));
    new BusinessCheckingAccount("123456789", owners, 100.0);
  }

  @Test
  void businessCheckingAccount_withNoBusinessOwner_shouldThrowException() {
    Set<Customer> owners = new HashSet<>();
    owners.add(new Customer(UUID.randomUUID(), "Individual Owner", false));

    assertThatExceptionOfType(IllegalArgumentException.class)
        .isThrownBy(() -> new BusinessCheckingAccount("123456789", owners, 100.0))
        .withMessage("At least one owner must be a business for a BusinessCheckingAccount");
  }

  @Test
  void businessCheckingAccount_withBusinessOwner_shouldCreateAccount() {
    Set<Customer> owners = new HashSet<>();
    owners.add(new Customer(UUID.randomUUID(), "Business Owner", true));

    BusinessCheckingAccount account = new BusinessCheckingAccount("123456789", owners, 100.0);
    assertEquals("123456789", account.getAccountNumber());
  }
}
