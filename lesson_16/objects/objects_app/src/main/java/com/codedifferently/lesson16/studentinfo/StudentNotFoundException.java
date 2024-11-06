package com.codedifferently.lesson16.studentinfo;

public class StudentNotFoundException extends RuntimeException {
  public StudentNotFoundException(String message) {
    super(message);
  }
}
