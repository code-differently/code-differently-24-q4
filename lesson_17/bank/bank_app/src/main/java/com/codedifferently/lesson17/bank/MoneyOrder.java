package com.codedifferently.lesson17.bank;

public class MoneyOrder {
    public MoneyOrder(Account sourceAccount, double amount) {
        sourceAccount.withdraw(amount);
    }
}
