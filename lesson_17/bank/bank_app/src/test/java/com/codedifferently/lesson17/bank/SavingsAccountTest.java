package com.codedifferently.lesson17.bank;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;

public class SavingsAccountTest {
  private SavingsAccount savingsAccount;
  private Set<Customer> owners;

  @BeforeEach
  void setUp() {
    owners = new HashSet<>();
    owners.add(new Customer(UUID.randomUUID(), "Bob Smith"));
    savingsAccount = new SavingsAccount("12345", owners, 500);
  }
}
