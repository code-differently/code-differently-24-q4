package com.codedifferently.lesson17.bank;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 
SavingsAccountTest {
      private SavingsAccount classUnderTest;
    private Set<Customer> owners;

  @BeforeEach
  void setUp() {
    owners = new HashSet<>();
    owners.add(new Customer(UUID.randomUUID(), "John Doe"));
    owners.add(new Customer(UUID.randomUUID(), "Jane Smith"));
    classUnderTest = new SavingsAccount("123456789", owners, 100.0);
  }
@Test
void toStringTest() {
    String expected = "SavingsAccount{accountNumber='123456789', balance=100.0, isActive=true}";
    assertEquals(expected, classUnderTest.toString());
}
}
