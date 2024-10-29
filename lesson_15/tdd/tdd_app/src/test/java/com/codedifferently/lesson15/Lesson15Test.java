package com.codedifferently.lesson15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Lesson15Test {

  private EmployeeManager employeeManager;
  private Employee employee;

  @BeforeEach
  public void setUp() {
    // Arrange
    employeeManager = new EmployeeManager();
    employee = new Employee(1, "Wall-E", "Inbound", 30000.00);
  }

  @Test
  public void testGetId() {
    employee.getId();
    // Assert
    assertEquals(employee.getId(), 1);
  }

  @Test
  public void testSetId() {
    employee.setId(2);
    // Assert
    assertEquals(employee.getId(), 2);
  }

  @Test
  public void testGetName() {
    employee.getName();
    // Assert
    assertEquals(employee.getName(), "Wall-E");
  }

  @Test
  public void testSetName() {
    employee.setName("BURN-E");
    // Assert
    assertEquals(employee.getName(), "BURN-E");
  }

  @Test
  public void testGetDepartment() {
    employee.setName("BURN-E");
    // Assert
    assertEquals(employee.getDepartment(), "Inbound");
  }

  @Test
  public void testSetDepartment() {
    employee.setDepartment("NONE");
    // Assert
    assertEquals(employee.getDepartment(), "NONE");
  }

  @Test
  public void testGetSalary() {
    employee.getSalary();
    // Assert
    assertEquals(employee.getSalary(), 30000.00);
  }

  @Test
  public void testSetSalary() {
    employee.setSalary(100);
    // Assert
    assertEquals(employee.getSalary(), 100);
  }

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
  public void testGetDetails() {
    // Assert
    assertEquals(
        "ID: 1, Name: Wall-E, Department: Inbound, Salary: 30000.0", employee.getDetails());
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
