package com.codedifferently.lesson17.bank;

import com.codedifferently.lesson17.bank.exceptions.AccountNotFoundException;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/** Represents a bank ATM. */
public class BankAtm {

  private final Map<UUID, Customer> customerById = new HashMap<>();
  private final Map<String, CheckingAccount> accountByNumber = new HashMap<>();
  private final AuditLog auditLog = new AuditLog();

  /**
   * Adds a checking account to the bank.
   *
   * @param account The account to add.
   */
  public void addAccount(CheckingAccount account) {
    accountByNumber.put(account.getAccountNumber(), account);
    account
        .getOwners()
        .forEach(
            owner -> {
              customerById.put(owner.getId(), owner);
            });
    auditLog.logAccountAddition(account.getAccountNumber());
  }

  /**
   * Finds all accounts owned by a customer.
   *
   * @param customerId The ID of the customer.
   * @return The unique set of accounts owned by the customer.
   */
  public Set<CheckingAccount> findAccountsByCustomerId(UUID customerId) {
    return customerById.containsKey(customerId)
        ? customerById.get(customerId).getAccounts()
        : Set.of();
  }

  /**
   * Deposits funds into an account.
   *
   * @param accountNumber The account number.
   * @param amount The amount to deposit.
   */
  public void depositFunds(String accountNumber, double amount) {
    CheckingAccount account = getAccountOrThrow(accountNumber);
    account.deposit(amount);
  }

  /**
   * Deposits funds into an account using a check.
   *
   * @param accountNumber The account number.
   * @param check The check to deposit.
   */
  public void depositFunds(String accountNumber, Check check) {
    CheckingAccount account = getAccountOrThrow(accountNumber);
    check.depositFunds(account);
  }

  public void depositFunds(String accountNumber, double amount, Currency currency) {
    CheckingAccount account = getAccountOrThrow(accountNumber);

    // Validate the currency
    if (currency == null || !isValidCurrency(currency)) {
      throw new IllegalArgumentException("Invalid currency provided");
    }

    // Convert the amount to the account's currency
    Currency accountCurrency =
        Currency.getInstance("USD"); // Replace with account's actual currency
    double convertedAmount = CurrencyConverter.convert(amount, currency, accountCurrency);

    account.deposit(convertedAmount);
  }

  private boolean isValidCurrency(Currency currency) {
    // You can add additional logic here to define valid currencies if needed
    return currency.getCurrencyCode().equals("USD")
        || currency.getCurrencyCode().equals("GBP")
        || currency.getCurrencyCode().equals("CAD");
  }

  public List<String> getAuditLogEntries() {
    return auditLog.getLogEntries();
  }

  /**
   * Withdraws funds from an account.
   *
   * @param accountNumber
   * @param amount
   */
  public void withdrawFunds(String accountNumber, double amount) {
    CheckingAccount account = getAccountOrThrow(accountNumber);
    account.withdraw(amount);
  }

  /**
   * Gets an account by its number or throws an exception if not found.
   *
   * @param accountNumber The account number.
   * @return The account.
   */
  private CheckingAccount getAccountOrThrow(String accountNumber) {
    CheckingAccount account = accountByNumber.get(accountNumber);
    if (account == null || account.isClosed()) {
      throw new AccountNotFoundException("Account not found");
    }
    return account;
  }
}
