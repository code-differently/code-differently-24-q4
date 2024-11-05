package com.codedifferently.lesson17.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.codedifferently.lesson17.bank.exceptions.BusinessCheckingAccount;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BusinessCheckingAccountTest {
  private BusinessCheckingAccount classUnderTest;
  private Set<Customer> owners;

  @BeforeEach
  void setUp() {
    owners = new HashSet<>();
  }

  @Test
  void testHasBusinessOwner_withINCInTheName() {
    UUID id = UUID.randomUUID();
    Customer businessOwner = new Customer(id, "Company INC");
    owners.add(businessOwner);

    BusinessCheckingAccount account = new BusinessCheckingAccount("123456", owners, 200);
    assertNotNull(account);
    assertEquals("123456", account.getAccountNumber());
    assertEquals(200, account.getBalance());
  }

  @Test
  void testHasBusinessOwner_withLLCInTheName() {
    UUID id = UUID.randomUUID();
    Customer businessOwner = new Customer(id, "Company ILLC");
    owners.add(businessOwner);

    BusinessCheckingAccount account = new BusinessCheckingAccount("123456", owners, 200);
    assertNotNull(account);
    assertEquals("123456", account.getAccountNumber());
    assertEquals(200, account.getBalance());
  }

  @Test
  void testHasBusinessOwner_withCOInTheName() {
    UUID id = UUID.randomUUID();
    Customer businessOwner = new Customer(id, "Company CO.");
    owners.add(businessOwner);

    BusinessCheckingAccount account = new BusinessCheckingAccount("123456", owners, 200);
    assertNotNull(account);
    assertEquals("123456", account.getAccountNumber());
    assertEquals(200, account.getBalance());
  }
}
