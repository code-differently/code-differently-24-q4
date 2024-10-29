package com.codedifferently.lesson15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmployeeTest {
  @Test
  void testGetDepartment() {
    // Arrange
    Employee employee = new Employee(12345, "John Doe", "Engineering", 75000);

    // Act
    String actualDepartment = employee.getDepartment();

    // Assert
    String expectedDepartment = "Engineering";
    assertEquals(expectedDepartment, actualDepartment);
  }

  @Test
  void testGetDetails() {
    // Arrange
    Employee employee = new Employee(12345, "John Doe", "Engineering", 75000);

    // Act
    String actualDetails = employee.getDetails();

    // Assert
    String expectedDetails =
        "Employee: John Doe, Department: Engineering , ID: 12345 , Salary: 75000";
    assertEquals(expectedDetails, actualDetails);
  }

  @Test
  void testGetId() {
    // Arrange
    Employee employee = new Employee(12345, "John Doe", "Engineering", 75000);

    // Act
    int actualEmployeeID = employee.getId();

    // Assert
    int expectedEmployeeID = 12345;
    assertEquals(expectedEmployeeID, actualEmployeeID);
  }

  @Test
  void testGetName() {
    // Arrange
    Employee employee = new Employee(12345, "John Doe", "Engineering", 75000);

    // Act
    employee.getName();

    // Assert
    assertEquals("John Doe", employee.getName());
  }

  @Test
  void testGetSalary() {
    // Arrange
    Employee employee = new Employee(12345, "John Doe", "Engineering", 75000);

    // Act
    double expectedSalary = employee.getSalary();

    // Assert
    double actualSalary = 75000;
    assertEquals(expectedSalary, actualSalary);
  }

  @Test
  void testSetDepartment() {
    // Arrange
    Employee employee = new Employee(12345, "John Doe", "", 75000);

    // Act
    employee.setDepartment("Engineering");

    // Assert
    assertEquals("Engineering", employee.getDepartment());
  }

  @Test
  void testSetId() {
    // Arrange
    Employee employee = new Employee(0, "John Doe", "", 75000);

    // Act
    employee.setId(12345);

    // Assert
    assertEquals(12345, employee.getId());
  }

  @Test
  void testSetName() {
    // Arrange
    Employee employee = new Employee(12345, "", "Engineering", 75000);

    // Act
    employee.setName("Alice Johnson");

    // Assert
    assertEquals("Alice Johnson", employee.getName());
  }

  @Test
  void testSetSalary() {
    // Arrange
    Employee employee = new Employee(12345, "", "Engineering", 0);

    // Act
    employee.setSalary(75000);

    // Assert
    assertEquals(75000, employee.getSalary());
  }
}
