package com.codedifferently.lesson17.bank;
import java.util.Set;

public class BusinessCheckingAccount extends CheckingAccount{
    private final String businessName;

    /**
     * Creates a new business checking account.
     *
     * @param accountNumber The account number.
     * @param owners The owners of the account.
     * @param businessName The name of the business.
     * @param initialBalance The initial balance of the account.
     * @throws IllegalArgumentException if no business owner is provided.
     */
    public BusinessCheckingAccount(String accountNumber, Set<Customer> owners, String businessName, double initialBalance) {
        super(accountNumber, owners, initialBalance);
        this.businessName = businessName;

        if (owners.stream().noneMatch(owner -> owner.isBusiness())) {
            throw new IllegalArgumentException("At least one owner must be a business.");
        }
    }   

    public String getBusinessName() {
        return businessName;
    }
}
