package com.codedifferently.lesson17.bank;

import com.codedifferently.lesson17.bank.exceptions.AccountNotFoundException;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * Represents a bank ATM that manages customer accounts and transactions. This class handles account
 * management, deposits, withdrawals, and logging actions.
 */
public class BankAtm {

  // Map to store customers by their unique ID
  private final Map<UUID, Customer> customerById = new HashMap<>();

  // Map to store checking accounts by their account number
  private final Map<String, CheckingAccount> accountByNumber = new HashMap<>();

  // Audit log to record account-related actions
  private final AuditLog auditLog = new AuditLog();

  /**
   * Adds a checking account to the bank's records.
   *
   * @param account The CheckingAccount to add.
   */
  public void addAccount(CheckingAccount account) {
    // Add the account to the account map using its account number
    accountByNumber.put(account.getAccountNumber(), account);

    // Register each owner of the account in the customer map
    account
        .getOwners()
        .forEach(
            owner -> {
              customerById.put(owner.getId(), owner);
            });

    // Log the account addition in the audit log
    auditLog.logAccountAddition(account.getAccountNumber());
  }

  /**
   * Finds all accounts owned by a specific customer.
   *
   * @param customerId The ID of the customer whose accounts are to be found.
   * @return A unique set of CheckingAccounts owned by the customer, or an empty set if none are
   *     found.
   */
  public Set<CheckingAccount> findAccountsByCustomerId(UUID customerId) {
    return customerById.containsKey(customerId)
        ? customerById.get(customerId).getAccounts()
        : Set.of(); // Return an empty set if the customer does not exist
  }

  /**
   * Deposits a specified amount of funds into an account.
   *
   * @param accountNumber The account number to deposit into.
   * @param amount The amount of money to deposit.
   */
  public void depositFunds(String accountNumber, double amount) {
    // Retrieve the account or throw an exception if not found
    CheckingAccount account = getAccountOrThrow(accountNumber);
    account.deposit(amount); // Deposit the amount into the account
  }

  /**
   * Deposits funds into an account using a check.
   *
   * @param accountNumber The account number to deposit into.
   * @param check The Check object representing the check to be deposited.
   */
  public void depositFunds(String accountNumber, Check check) {
    // Retrieve the account or throw an exception if not found
    CheckingAccount account = getAccountOrThrow(accountNumber);
    check.depositFunds(account); // Process the check and deposit funds into the account
  }

  /**
   * Deposits funds into an account while converting from a specified currency.
   *
   * @param accountNumber The account number to deposit into.
   * @param amount The amount to deposit.
   * @param currency The currency of the deposit amount.
   */
  public void depositFunds(String accountNumber, double amount, Currency currency) {
    // Retrieve the account or throw an exception if not found
    CheckingAccount account = getAccountOrThrow(accountNumber);

    // Validate the provided currency
    if (currency == null || !isValidCurrency(currency)) {
      throw new IllegalArgumentException("Invalid currency provided");
    }

    // Convert the amount to the account's currency (assuming USD for this example)
    Currency accountCurrency =
        Currency.getInstance("USD"); // Replace with actual account currency if necessary
    double convertedAmount = CurrencyConverter.convert(amount, currency, accountCurrency);

    account.deposit(convertedAmount); // Deposit the converted amount into the account
  }

  /**
   * Checks if the provided currency is valid.
   *
   * @param currency The currency to validate.
   * @return true if the currency is valid; false otherwise.
   */
  private boolean isValidCurrency(Currency currency) {
    // Define valid currencies
    return currency.getCurrencyCode().equals("USD")
        || currency.getCurrencyCode().equals("GBP")
        || currency.getCurrencyCode().equals("CAD")
        || currency.getCurrencyCode().equals("EUR");
  }

  /**
   * Retrieves all entries from the audit log.
   *
   * @return A list of log entries recorded in the audit log.
   */
  public List<String> getAuditLogEntries() {
    return auditLog.getLogEntries(); // Return the audit log entries
  }

  /**
   * Withdraws a specified amount of funds from an account.
   *
   * @param accountNumber The account number to withdraw from.
   * @param amount The amount of money to withdraw.
   */
  public void withdrawFunds(String accountNumber, double amount) {
    // Retrieve the account or throw an exception if not found
    CheckingAccount account = getAccountOrThrow(accountNumber);
    account.withdraw(amount); // Withdraw the specified amount from the account
  }

  /**
   * Retrieves an account by its account number, throwing an exception if not found.
   *
   * @param accountNumber The account number to search for.
   * @return The CheckingAccount associated with the given account number.
   * @throws AccountNotFoundException if the account is not found or is closed.
   */
  private CheckingAccount getAccountOrThrow(String accountNumber) {
    CheckingAccount account = accountByNumber.get(accountNumber);
    // Check if the account is found and is not closed
    if (account == null || account.isClosed()) {
      throw new AccountNotFoundException("Account not found");
    }
    return account; // Return the found account
  }
}
