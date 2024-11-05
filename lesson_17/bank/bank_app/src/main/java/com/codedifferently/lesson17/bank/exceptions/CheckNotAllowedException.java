package com.codedifferently.lesson17.bank.exceptions;

public class CheckNotAllowedException extends RuntimeException {
  public CheckNotAllowedException(String message) {
    super(message);
  }
}
