package com.codedifferently.lesson17.bank.exceptions;

public class moneyOrderVoidedException extends RuntimeException {

  public moneyOrderVoidedException() {}

  public moneyOrderVoidedException(String message) {
    super(message);
  }
}
