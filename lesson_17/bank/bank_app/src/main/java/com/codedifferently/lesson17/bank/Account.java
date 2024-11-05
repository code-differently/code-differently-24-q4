package com.codedifferently.lesson17.bank;

public interface Account {
  void deposit(double account);

  void withdraw(double amount);

  double getBalance();

  String getAccountNumber();
}
