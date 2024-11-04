package com.codedifferently.lesson17.bank;

public class CheckNotAllowedException extends RuntimeException {
    public CheckNotAllowedException(String message) {
        super(message);
    }
}
