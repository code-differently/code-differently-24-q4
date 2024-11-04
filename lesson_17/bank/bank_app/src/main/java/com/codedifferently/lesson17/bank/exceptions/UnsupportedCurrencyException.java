package com.codedifferently.lesson17.bank.exceptions;

public class UnsupportedCurrencyException extends Exception {
  public UnsupportedCurrencyException() {}

  public UnsupportedCurrencyException(String message) {
    super(message);
  }
}
