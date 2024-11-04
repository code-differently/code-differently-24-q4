package com.codedifferently.lesson17.bank;
import java.util.Set;

public class BusinessCheckingAccount extends CheckingAccount{
    private final String businessName;

    public BusinessCheckingAccount(String accountNumber, Set<Customer> owners, String businessName) {
        super(accountNumber, owners, 0.0);
        this.businessName = businessName;
    }

    public String getBusinessName() {
        return businessName;
    }    
}
