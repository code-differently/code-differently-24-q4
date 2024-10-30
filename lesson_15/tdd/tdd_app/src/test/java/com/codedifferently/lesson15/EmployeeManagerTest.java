package com.codedifferently.lesson15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeManagerTest {
  private EmployeeManager employeeManager;
  private Employee employee;

  @BeforeEach
  public void setUp() {
    // Arrange
    employeeManager = new EmployeeManager();
    employee = new Employee(1, "Wall-E", "Inbound", 30000.00);
  }

  // EmployeeManager Methods //

  @Test
  public void testAddEmployee() {
    // Act
    employeeManager.addEmployee(employee);
    // Assert
    assertEquals(1, employeeManager.getEmployeeCount());
    assertEquals(employee, employeeManager.getEmployee(1));
  }

  @Test
  public void testGetEmployee() {
    // Act
    employeeManager.addEmployee(employee);
    Employee retrieved = employeeManager.getEmployee(1);
    // Assert
    assertEquals(employee, retrieved);
  }

  @Test
  public void testUpdateEmployee() {
    // Act
    employeeManager.addEmployee(employee);
    Employee updatedEmployee = new Employee(1, "EVE", "Inbound", 80000.00);
    employeeManager.updateEmployee(updatedEmployee);
    // Assert
    assertEquals(updatedEmployee, employeeManager.getEmployee(1));
  }

  @Test
  public void testRemoveEmployee() {
    // Act
    employeeManager.addEmployee(employee);
    employeeManager.removeEmployee(1);
    // Assert
    assertEquals(0, employeeManager.getEmployeeCount());
  }

  @Test
  public void testGetEmployeeCount() {
    // Assert
    assertEquals(0, employeeManager.getEmployeeCount());
    // Act
    employeeManager.addEmployee(employee);
    // Assert
    assertEquals(1, employeeManager.getEmployeeCount());
  }

  @Test
  public void testMultipleEmployees() {
    // Arrange
    Employee emp2 = new Employee(2, "Captain B. McCrea", "Captain", 100000.00);
    Employee emp3 = new Employee(3, "AUTO", "Pilot", 95000.00);
    // Act
    employeeManager.addEmployee(employee);
    employeeManager.addEmployee(emp2);
    employeeManager.addEmployee(emp3);
    // Assert
    assertEquals(3, employeeManager.getEmployeeCount());
    assertEquals(emp2, employeeManager.getEmployee(2));
    assertEquals(emp3, employeeManager.getEmployee(3));
  }
}
