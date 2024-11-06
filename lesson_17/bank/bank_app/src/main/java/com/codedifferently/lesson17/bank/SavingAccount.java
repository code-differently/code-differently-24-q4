package com.codedifferently.lesson17.bank;

import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Represents a saving account. */
public class SavingAccount extends BankAccount {
  // private boolean isActive;
  private boolean isCheckCreationAllowed;
  private static final Logger logger = LoggerFactory.getLogger(SavingAccount.class);

  /**
   * Creates a new saving account.
   *
   * @param accountNumber The account number.
   * @param owners The owners of the account.
   * @param initialBalance The initial balance of the account.
   */
  public SavingAccount(String accountNumber, Set<Customer> owners, double balance) {
    super(accountNumber, owners, balance);
    logger.info("Saving Account constructor accessed...");
    isCheckCreationAllowed = false;
  }

  public boolean isCheckCreationAllowed() {
    return isCheckCreationAllowed;
  }
}
