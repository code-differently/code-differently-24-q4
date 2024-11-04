package com.codedifferently.lesson17.bank;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import com.codedifferently.lesson17.bank.exceptions.AccountNotFoundException;
import com.codedifferently.lesson17.bank.exceptions.CheckVoidedException;
import com.codedifferently.lesson17.bank.exceptions.InsufficientFundsException;
import java.util.Currency;
import java.util.List;
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
    customer1 = new Customer(UUID.randomUUID(), "John Doe", false);
    customer2 = new Customer(UUID.randomUUID(), "Jane Smith", false);
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
    Customer customer3 = new Customer(UUID.randomUUID(), "Tech Labs", true);
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
  void testDepositFunds_WithCurrency_GBP() {
    // Arrange
    Currency gbp = Currency.getInstance("GBP");
    account1.deposit(100.0); // Reset balance for testing
    double initialBalance = account1.getBalance();

    // Act
    classUnderTest.depositFunds(account1.getAccountNumber(), 100.0, gbp);

    // Assert
    double expectedBalance =
        initialBalance + CurrencyConverter.convert(100.0, gbp, Currency.getInstance("USD"));
    assertThat(account1.getBalance()).isEqualTo(expectedBalance);
  }

  @Test
  void testDepositFunds_WithCurrency_CAD() {
    // Arrange
    Currency cad = Currency.getInstance("CAD");
    account2.deposit(200.0);
    double initialBalance = account2.getBalance();

    // Act
    classUnderTest.depositFunds(account2.getAccountNumber(), 100.0, cad);

    // Assert
    double expectedBalance =
        initialBalance + CurrencyConverter.convert(100.0, cad, Currency.getInstance("USD"));
    assertThat(account2.getBalance()).isEqualTo(expectedBalance);
  }

  @Test
  void testDepositFunds_AccountNotFound() {
    // Arrange
    String nonExistingAccountNumber = "999999999";

    // Act & Assert
    assertThatExceptionOfType(AccountNotFoundException.class)
        .isThrownBy(
            () ->
                classUnderTest.depositFunds(
                    nonExistingAccountNumber, 50.0, Currency.getInstance("USD")))
        .withMessage("Account not found");
  }

  @Test
  void testWithdrawFunds_InsufficientFunds() {
    // Arrange
    double amountToWithdraw = 200.0; // More than the balance

    // Act & Assert
    assertThatExceptionOfType(InsufficientFundsException.class)
        .isThrownBy(
            () -> classUnderTest.withdrawFunds(account1.getAccountNumber(), amountToWithdraw))
        .withMessage("Account does not have enough funds for withdrawal");
  }

  @Test
  void testAddAccountLogsCorrectly() {
    // Arrange
    String accountNumber = "555555555";
    Customer customer = new Customer(UUID.randomUUID(), "New Customer", true);
    CheckingAccount newAccount = new CheckingAccount(accountNumber, Set.of(customer), 300.0);
    customer.addAccount(newAccount);

    // Act
    classUnderTest.addAccount(newAccount);

    // Assert
    List<String> logEntries = classUnderTest.getAuditLogEntries();
    assertThat(logEntries).contains("Account added: " + accountNumber);
  }
}
