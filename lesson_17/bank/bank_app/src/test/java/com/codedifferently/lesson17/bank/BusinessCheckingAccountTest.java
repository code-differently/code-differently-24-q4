package com.codedifferently.lesson17.bank;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BusinessCheckingAccountTest {
  private Set<Customer> owners;

  @BeforeEach
  public void setUp() {
    owners = new HashSet<>();
  }

  @Test
  public void testBusinessCheckingAccount_HasBusinessOwner_WithIncInName() {
    UUID id = UUID.randomUUID();
    Customer businesserOwner = new Customer(id, "Bob INC.");

    owners.add(businesserOwner);

    BusinessCheckingAccount account = new BusinessCheckingAccount("12345", owners, 15000);
    assertNotNull(account);
    assertEquals(15000, account.getBalance());
    assertEquals("12345", account.getAccountNumber());
  }

  @Test
  public void testBusinessCheckingAccount_HasBusinessOwner_WithLlcInName() {
    UUID id = UUID.randomUUID();
    Customer businesserOwner = new Customer(id, "Bob LLC.");

    owners.add(businesserOwner);

    BusinessCheckingAccount account = new BusinessCheckingAccount("12345", owners, 15000);
    assertNotNull(account);
    assertEquals(15000, account.getBalance());
    assertEquals("12345", account.getAccountNumber());
  }

  @Test
public void testBusinessCheckingAccount_WithoutBusinessOwner() {
    UUID individualId = UUID.randomUUID();
    Customer individualOwner = new Customer(individualId, "John Doe"); // Example customer without business designation

    owners.add(individualOwner); // Add the individual owner to the set

    assertThatThrownBy(() -> {
        new BusinessCheckingAccount("12345", owners, 15000);
    })
    .isInstanceOf(IllegalArgumentException.class)
    .hasMessageContaining("A business checking account must have at least one business owner.");
}

@Test
public void testBusinessCheckingAccount_BelowMinimumBalance() {
    UUID businessId = UUID.randomUUID();
    Customer businessOwner = new Customer(businessId, "ABC LLC"); // Create a customer with a valid business name

    owners.add(businessOwner); // Add the business owner to the set

    assertThatThrownBy(() -> {
        new BusinessCheckingAccount("12345", owners, 5000); // Attempt to create with a balance below 10,000
    })
    .isInstanceOf(IllegalArgumentException.class)
    .hasMessageContaining("Business accounts require a minimum balance of $10,000.");
}
}
