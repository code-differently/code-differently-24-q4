package com.codedifferently.lesson17.bank.exceptions;

import com.codedifferently.lesson17.bank.CheckingAccount;
import com.codedifferently.lesson17.bank.Customer;
import java.util.Set;

public class SavingsAccount extends CheckingAccount {

  // Constructor for SavingsAccount
  public SavingsAccount(String accountNumber, Set<Customer> owners, double initialBalance) {
    super(accountNumber, owners, initialBalance);
  }

  // Define the NullCheck class that blocks a check from being withdrawn
  public class NullCheck {

    private boolean isVoided;
    private String checkNumber;
    private double amount;
    private String account;

    public void blockCheckWithdrawal(
        double amount, String account, String checkNumber, boolean isVoided) {
      this.isVoided = isVoided;
      this.checkNumber = checkNumber;
      this.amount = amount;
      this.account = account;

      // Example logic for blocking check withdrawal
      if (isVoided) {
        // Simulate a system that logs or handles the voided check
        System.out.println("Check " + checkNumber + " for account " + account + " is voided.");
      } else {
        // Process the withdrawal logic (not implemented here)
        System.out.println("Withdrawal blocked for check " + checkNumber);
      }

      if (this.amount > 0) {}
    }

    // Getters for properties
    public boolean getisVoided() {
      return isVoided;
    }

    public String getCheckNumber() {
      return checkNumber;
    }

    public double getAmount() {
      return amount;
    }

    public String getAccount() {
      return account;
    }
  }
}
