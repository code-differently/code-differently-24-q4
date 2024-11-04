package com.codedifferently.lesson17.bank;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codedifferently.lesson17.bank.exceptions.InsufficientFundsException;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the CheckingAccount class. This class verifies the functionality and behavior of
 * CheckingAccount methods.
 */
class CheckingAccountTest {

  // The CheckingAccount instance being tested
  private CheckingAccount classUnderTest;

  // Set of owners for the CheckingAccount
  private Set<Customer> owners;

  /**
   * Set up method to initialize test environment before each test case. Creates a set of owners and
   * initializes a CheckingAccount with a default balance.
   */
  @BeforeEach
  void setUp() {
    owners = new HashSet<>();
    owners.add(new Customer(UUID.randomUUID(), "John Doe", false)); // Individual owner
    owners.add(new Customer(UUID.randomUUID(), "Tech Corp", true)); // Business owner
    classUnderTest = new CheckingAccount("123456789", owners, 100.0); // Initialize account
  }

  /** Tests the retrieval of the account number. */
  @Test
  void getAccountNumber() {
    assertEquals("123456789", classUnderTest.getAccountNumber()); // Verify account number
  }

  /** Tests the retrieval of the account owners. */
  @Test
  void getOwners() {
    assertEquals(owners, classUnderTest.getOwners()); // Verify owners set
  }

  /** Tests the deposit functionality by adding funds to the account. */
  @Test
  void deposit() {
    classUnderTest.deposit(50.0); // Deposit funds
    assertEquals(150.0, classUnderTest.getBalance()); // Verify new balance
  }

  /** Tests depositing a negative amount, expecting an IllegalArgumentException. */
  @Test
  void deposit_withNegativeAmount() {
    assertThatExceptionOfType(IllegalArgumentException.class)
        .isThrownBy(() -> classUnderTest.deposit(-50.0)); // Verify exception is thrown
  }

  /** Tests the withdrawal functionality by taking funds from the account. */
  @Test
  void withdraw() {
    classUnderTest.withdraw(50.0); // Withdraw funds
    assertEquals(50.0, classUnderTest.getBalance()); // Verify new balance
  }

  /** Tests withdrawing a negative amount, expecting an IllegalStateException. */
  @Test
  void withdraw_withNegativeAmount() {
    assertThatExceptionOfType(IllegalStateException.class)
        .isThrownBy(() -> classUnderTest.withdraw(-50.0))
        .withMessage("Withdrawal amount must be positive"); // Verify exception message
  }

  /**
   * Tests withdrawal when there are insufficient funds, expecting an InsufficientFundsException.
   */
  @Test
  void withdraw_withInsufficientBalance() {
    assertThatExceptionOfType(InsufficientFundsException.class)
        .isThrownBy(() -> classUnderTest.withdraw(150.0))
        .withMessage(
            "Account does not have enough funds for withdrawal"); // Verify exception message
  }

  /** Tests the retrieval of the current account balance. */
  @Test
  void getBalance() {
    assertEquals(100.0, classUnderTest.getBalance()); // Verify initial balance
  }

  /**
   * Tests closing an account that still has a positive balance, expecting an IllegalStateException.
   */
  @Test
  void closeAccount_withPositiveBalance() {
    assertThatExceptionOfType(IllegalStateException.class)
        .isThrownBy(() -> classUnderTest.closeAccount()); // Verify exception is thrown
  }

  /** Tests whether the account is closed. */
  @Test
  void isClosed() {
    assertFalse(classUnderTest.isClosed()); // Verify account is initially open
    classUnderTest.withdraw(100); // Withdraw all funds
    classUnderTest.closeAccount(); // Close the account
    assertTrue(classUnderTest.isClosed()); // Verify account is closed
  }

  /** Tests the equality of two CheckingAccount instances. */
  @Test
  void equals() {
    CheckingAccount otherAccount = new CheckingAccount("123456789", owners, 200.0);
    assertEquals(
        classUnderTest,
        otherAccount); // Verify accounts are equal based on account number and owners
  }

  /** Tests the hash code of a CheckingAccount instance. */
  @Test
  void hashCodeTest() {
    CheckingAccount otherAccount = new CheckingAccount("123456789", owners, 200.0);
    assertEquals(classUnderTest.hashCode(), otherAccount.hashCode()); // Verify hash codes are equal
  }

  /** Tests the string representation of the CheckingAccount. */
  @Test
  void toStringTest() {
    String expected = "CheckingAccount{accountNumber='123456789', balance=100.0, isActive=true}";
    assertEquals(
        expected,
        classUnderTest.toString()); // Verify string representation matches expected format
  }
}
