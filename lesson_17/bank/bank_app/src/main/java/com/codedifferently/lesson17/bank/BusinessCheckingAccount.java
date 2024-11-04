package com.codedifferently.lesson17.bank;
import java.util.Set;

public class BusinessCheckingAccount extends CheckingAccount{
    private final String businessName;

    public BusinessCheckingAccount(String accountNumber, Set<Customer> owners, String businessName, double initialBalance) {
        super(accountNumber, owners, initialBalance);
        this.businessName = businessName;
    }

    public String getBusinessName() {
        return businessName;
    }    
}
