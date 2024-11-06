package com.codedifferently.lesson17.bank;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.codedifferently.lesson17.bank.exceptions.AccountNotFoundException;
import com.codedifferently.lesson17.bank.exceptions.CheckVoidedException;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAtmTest {

  private BankAtm classUnderTest;
  private CheckingAccount account1;
  private CheckingAccount account2;
  private Customer customer1;
  private Customer customer2;

  @BeforeEach
  void setUp() {
    classUnderTest = new BankAtm();
    customer1 = new Customer(UUID.randomUUID(), "John Doe");
    customer2 = new Customer(UUID.randomUUID(), "Jane Smith");
    account1 = new CheckingAccount("123456789", Set.of(customer1), 100.0);
    account2 = new CheckingAccount("987654321", Set.of(customer1, customer2), 200.0);
    customer1.addAccount(account1);
    customer1.addAccount(account2);
    customer2.addAccount(account2);
    classUnderTest.addAccount(account1);
    classUnderTest.addAccount(account2);
  }

  @Test
  void testAddAccount() {
    // Arrange
    Customer customer3 = new Customer(UUID.randomUUID(), "Alice Johnson");
    CheckingAccount account3 = new CheckingAccount("555555555", Set.of(customer3), 300.0);
    customer3.addAccount(account3);

    // Act
    classUnderTest.addAccount(account3);

    // Assert
    Set<CheckingAccount> accounts = classUnderTest.findAccountsByCustomerId(customer3.getId());
    assertThat(accounts).containsOnly(account3);
  }

  @Test
  void testFindAccountsByCustomerId() {
    // Act
    Set<CheckingAccount> accounts = classUnderTest.findAccountsByCustomerId(customer1.getId());

    // Assert
    assertThat(accounts).containsOnly(account1, account2);
  }

  @Test
  void testDepositFunds() {
    // Act
    classUnderTest.depositFunds(account1.getAccountNumber(), 50.0);

    // Assert
    assertThat(account1.getBalance()).isEqualTo(150.0);
  }

  @Test
  void testDepositFunds_Check() {
    // Arrange
    Check check = new Check("987654321", 100.0, account1);

    // Act
    classUnderTest.depositFunds("987654321", check);

    // Assert
    assertThat(account1.getBalance()).isEqualTo(0);
    assertThat(account2.getBalance()).isEqualTo(300.0);
  }

  @Test
  void testDepositFunds_DoesntDepositCheckTwice() {
    Check check = new Check("987654321", 100.0, account1);

    classUnderTest.depositFunds("987654321", check);

    assertThatExceptionOfType(CheckVoidedException.class)
        .isThrownBy(() -> classUnderTest.depositFunds("987654321", check))
        .withMessage("Check is voided");
  }

  @Test
  void testWithdrawFunds() {
    // Act
    classUnderTest.withdrawFunds(account2.getAccountNumber(), 50.0);

    // Assert
    assertThat(account2.getBalance()).isEqualTo(150.0);
  }

  @Test
  void testWithdrawFunds_AccountNotFound() {
    String nonExistingAccountNumber = "999999999";

    // Act & Assert
    assertThatExceptionOfType(AccountNotFoundException.class)
        .isThrownBy(() -> classUnderTest.withdrawFunds(nonExistingAccountNumber, 50.0))
        .withMessage("Account not found");
  }

  @Test
  public void testDepositFundsIntoSavingsAccount() {
    BankAtm atm = new BankAtm();
    SavingsAccount savingsAccount = new SavingsAccount("12345", 1000.00, Set.of(customer1));
    atm.addAccount(savingsAccount);

    // Valid deposit
    atm.depositFunds("12345", 500.00);
    assertEquals(1500.00, savingsAccount.getBalance(), 0.01);
  }

  @Test
  public void testDepositCheckIntoSavingsAccount() {
    // Arrange
    BankAtm atm = new BankAtm();
    Set<Customer> owners = new HashSet<>();
    owners.add(new Customer(UUID.randomUUID(), "Customer1"));
    SavingsAccount savingsAccount = new SavingsAccount("12345", 1000.00, Set.of(customer1));

    atm.addAccount(savingsAccount); // Add savings account to ATM

    // Act & Assert: Check that the exception is thrown when attempting to deposit a check into a
    // savings account
    Check check = new Check("234", 100.00, savingsAccount); // Creating a check to deposit

    // Assert that an UnsupportedOperationException is thrown
    UnsupportedOperationException exception =
        assertThrows(
            UnsupportedOperationException.class,
            () -> {
              atm.depositFunds("12345", check); // Attempt to deposit check
            });

    // Optionally, you can also assert the message of the exception if you want more specific
    // validation
    assertEquals("Cannot deposit checks into a Savings Account.", exception.getMessage());
  }

  @Test
  public void testAddBusinessCheckingAccountWithBusinessOwner() {
    // Arrange
    BankAtm atm = new BankAtm();

    // Create business and personal customers
    BusinessCustomer businessCustomer = new BusinessCustomer(UUID.randomUUID(), "Business1");
    Customer personalCustomer = new Customer(UUID.randomUUID(), "Personal1");

    // Create a set of owners, including a business customer
    Set<Customer> owners = new HashSet<>();
    owners.add(businessCustomer);
    owners.add(personalCustomer);

    // Create a BusinessCheckingAccount with the above owners
    BusinessCheckingAccount businessAccount = new BusinessCheckingAccount("67890", 1000.00, owners);

    // Act: Add the BusinessCheckingAccount to the ATM
    atm.addAccount(businessAccount);

    // Assert: Ensure no exceptions were thrown and the account was added
    assertNotNull(atm.accountByNumber.get("67890"));
  }

  @Test
  public void testAddBusinessCheckingAccountWithoutBusinessOwner() {
    // Arrange
    BankAtm atm = new BankAtm();

    // Create only personal customers (no business owner)
    Customer personalCustomer1 = new Customer(UUID.randomUUID(), "Personal1");
    Customer personalCustomer2 = new Customer(UUID.randomUUID(), "Personal2");

    // Create a set of owners with only personal customers
    Set<Customer> owners = new HashSet<>();
    owners.add(personalCustomer1);
    owners.add(personalCustomer2);

    // Act & Assert: Try to add a BusinessCheckingAccount and expect an exception
    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              BusinessCheckingAccount businessAccount =
                  new BusinessCheckingAccount("67890", 1000.00, owners);
              atm.addAccount(businessAccount);
            });

    // Assert: Ensure the correct exception is thrown
    assertEquals(
        "A BusinessCheckingAccount must have at least one business owner.", exception.getMessage());
  }
}
