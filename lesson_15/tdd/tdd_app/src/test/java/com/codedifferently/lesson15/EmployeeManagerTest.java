package com.codedifferently.lesson15;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeManagerTest {

  public EmployeeManager manager;
  public Employee emp;

  @BeforeEach
  public void setUp() {
    manager = new EmployeeManager();
    emp = new Employee(1, "Edgar Allen Poe", "Writer", 0.0);
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

  @Test
  public void testUpdateEmployee() {
    // Arrange
    manager.addEmployee(emp);
    Employee updatedEmployee = new Employee(1, "Frankenstein", "Admin", 0.0);
    // Act
    manager.updateEmployee(updatedEmployee);
    // Assert
    assertEquals(
        updatedEmployee,
        manager.getEmployee(1),
        "Updated employee details should match the new information.");
  }

  @Test
  public void testRemoveEmployee() {
    // Arrange
    manager.addEmployee(emp);
    // Act
    manager.removeEmployee(1);
    Employee removedEmployee = manager.getEmployee(1);
    // Assert
    assertEquals(0, manager.getEmployeeCount(), "Employee count should be 0.");
    assertNull(removedEmployee, "Employee should be removed from system.");
  }

  @Test
  public void testAssertEmployeeInCollection() throws Exception {
    // Act
    assertThatThrownBy(() -> manager.getEmployee(1))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("Employee does not in collection with id 1");
  }
}
