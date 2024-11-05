package com.codedifferently.lesson17.bank;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/** Represents a customer of the bank. */
public class Customer {

  private final UUID id;
  private final String name;
  private final Set<CheckingAccount> accounts = new HashSet<>();
  private boolean isBusiness;

  /**
   * Creates a new customer.
   *
   * @param id The ID of the customer.
   * @param name The name of the customer.
   * @param isBusiness Indicates whether the customer is a business (true) or an individual (false).
   */
  public Customer(UUID id, String name, boolean isBusiness) {
    this.id = id;
    this.name = name;
    this.isBusiness = isBusiness;
  }

  /**
   * Gets the ID of the customer.
   *
   * @return The ID of the customer.
   */
  public UUID getId() {
    return id;
  }

  /**
   * Gets the name of the customer.
   *
   * @return The name of the customer.
   */
  public String getName() {
    return name;
  }

  /**
   * Checks if the customer is a business.
   *
   * @return true if the customer is a business; false otherwise.
   */
  public boolean isBusiness() {
    return isBusiness;
  }

  /**
   * Adds a checking account to the customer.
   *
   * @param account The account to add.
   */
  public void addAccount(CheckingAccount account) {
    accounts.add(account);
  }

  /**
   * Gets the accounts owned by the customer.
   *
   * @return The unique set of accounts owned by the customer.
   */
  public Set<CheckingAccount> getAccounts() {
    return accounts;
  }

  @Override
  public int hashCode() {
    // Generate a hash code based on the customer's ID for proper set operations
    return id.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    // Check if this customer is equal to another customer based on their ID
    if (obj instanceof Customer other) {
      return id.equals(other.id);
    }
    return false;
  }

  @Override
  public String toString() {
    // Provide a string representation of the customer including ID and name
    return "Customer{" + "id=" + id + ", name='" + name + '\'' + '}';
  }
}
