package com.codedifferently.lesson17.bank;
import java.util.Set;

public class BusinessCheckingAccount extends CheckingAccount{
    private final boolean isBusinessOwner;

    public BusinessCheckingAccount(String accountNumber, Set<Customer> owners, boolean isBusinessOwner) {
        super(accountNumber, owners, 0.0);
        this.isBusinessOwner = isBusinessOwner;
    }

    public void writeCheck(double amount) {
        if(!isBusinessOwner) {
            throw new IllegalArgumentException("Must be a business owner to write a check.");
        }
        super.writeCheck(amount);
    }
}
