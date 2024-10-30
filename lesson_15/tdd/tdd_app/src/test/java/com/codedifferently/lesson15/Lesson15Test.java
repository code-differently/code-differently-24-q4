package com.codedifferently.lesson15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Lesson15Test {

  private EmployeeManager manager;
  private Employee emp;

  @BeforeEach
  public void setUp() {
    manager = new EmployeeManager();
    emp = new Employee(1, "Edgar Allen Poe");
  }

  @Test
  public void testAddEmployee() {
    // Act
    manager.addEmployee(emp);
    // Assert
    assertEquals(1, manager.getEmployeeCount());
    assertEquals(emp, manager.getEmployee(1));
  }

  @Test
  public void testGetEmployee() {
    // Arrange
    manager.addEmployee(emp);
    Employee expectedValue = emp;
    // Act
    Employee actualValue = manager.getEmployee(1);
    // Assert
    assertEquals(expectedValue, actualValue, "The value retrieved should match the value added.");
  }
}
