package com.codedifferently.lesson15;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class EmployeeTest {
  @Test
  void testEmployeeCreationAndDetails() {
    // Arrange
    Employee employee = new Employee(1, "John Doe", "Engineering", 75000.00);

    // Act
    String details = employee.getDetails();

    // Assert
    assertThat(details)
        .isEqualTo("ID: 1, Name: John Doe, Department: Engineering, Salary: 75000.0");
  }

  @Test
  void testGetters() {
    // Arrange
    Employee employee = new Employee(1, "John Doe", "Engineering", 75000.00);

    // Act & Assert
    assertThat(employee.getId()).isEqualTo(1);
    assertThat(employee.getName()).isEqualTo("John Doe");
    assertThat(employee.getDepartment()).isEqualTo("Engineering");
    assertThat(employee.getSalary()).isEqualTo(75000.00);
  }

  @Test
  void testSetters() {
    // Arrange
    Employee employee = new Employee(1, "John Doe", "Engineering", 75000.00);

    // Act
    employee.setId(2);
    employee.setName("Jane Doe");
    employee.setDepartment("Marketing");
    employee.setSalary(65000.00);

    // Assert
    assertThat(employee.getId()).isEqualTo(2);
    assertThat(employee.getName()).isEqualTo("Jane Doe");
    assertThat(employee.getDepartment()).isEqualTo("Marketing");
    assertThat(employee.getSalary()).isEqualTo(65000.00);
  }
}
