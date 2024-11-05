package com.codedifferently.lesson17.bank;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BusinessCheckingAccountTest {
  private Customer regularCustomer;
  private BusinessOwner BusinessCustomer;
  private Set<Customer> owners;

  @BeforeEach
  void setUp() {
    regularCustomer = new Customer(UUID.randomUUID(), "james");
    BusinessCustomer = new BusinessOwner(UUID.randomUUID(), "john", "long johns");
    owners = new HashSet<>();
  }

  @Test
  void hasBusinessOwnerTest() {
    owners.add(regularCustomer);

    IllegalArgumentException thrown =
        assertThrows(
            IllegalArgumentException.class,
            () -> new BusinessCheckingAccount("12354", owners, 100.00),
            "Expect Constructor to throw but did not");

    assertTrue(thrown.getMessage().contains("requires at least one business owner"));
  }
}
