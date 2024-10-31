package com.codedifferently.lesson16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {

  Person person;

  // Set up
  @BeforeEach
  void setUp() {
    person = new person();
  }

  @Test
  // Method being tested
  public void testGet() {
    // Execersise
    int actual = .get();

    int expected = ;
    // Assert(Checking the value)
    assertEquals(expected, actual);
  }

  @Test
  public void testSet() {
    // Arrange
    int expectedSet = ;
    // Act
    person.set(expectedSet);
    // Assert
    assertEquals(expectedSet, person.get());
  }
}
