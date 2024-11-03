package com.codedifferently.lesson17.bank;

import java.util.Set;

public class SavingsAccount extends CheckingAccount {
    public SavingsAccount(String accountNumber, Set <Customer> owners, double initialBalance) {
        super(accountNumber, owners, initialBalance);
    }


public void writeCheck(double amount) {
    throw new UnsuportedOperationException("Savings account cannot write checks");
    }
}
