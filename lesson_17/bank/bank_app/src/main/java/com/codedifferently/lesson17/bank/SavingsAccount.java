package com.codedifferently.lesson17.bank;

import java.util.Set;

import com.codedifferently.lesson17.bank.exceptions.CheckNotAllowedException;

public class SavingsAccount extends CheckingAccount {
    public SavingsAccount(String accountNumber, Set<Customer> owners, double initialBalance) {
        super(accountNumber, owners, initialBalance);
    }

public void writeCheck(double amount) {
    throw new CheckNotAllowedException("Savings account cannot write checks");
    }
}
