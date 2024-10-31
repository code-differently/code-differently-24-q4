package com.codedifferently.lesson15;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeManagerTest {

  private EmployeeManager employeeManager;
  private Employee employee;

  @BeforeEach
  void setUp() {
    employeeManager = new EmployeeManager();
    employee = new Employee(1, "Edgar Allen Poe", "Publications", 0.0);
    employeeManager.addEmployee(employee);
  }

  @Test
  void testAddEmployee() {
    // Arrange
    Employee newEmployee = new Employee(2, "Sheet Ghost", "Administration", 0.0);
    // Act
    employeeManager.addEmployee(newEmployee);
    // Assert
    assertThat(employeeManager.getEmployee(2)).isEqualTo(newEmployee);
  }

  @Test
  void testGetEmployee() {
    // Act
    Employee actualEmployee = employeeManager.getEmployee(1);
    // Assert
    assertThat(actualEmployee).isEqualTo(employee);
  }

  @Test
  void testUpdateEmployee() {
    // Arrange
    Employee updatedEmployee = new Employee(1, "Frankenstein", "Development", 0.0);
    // Act
    employeeManager.updateEmployee(updatedEmployee);
    Employee actualEmployee = employeeManager.getEmployee(1);
    // Assert
    assertThat(actualEmployee).isEqualTo(updatedEmployee);
  }

  @Test
  void testRemoveEmployee() {
    // Act
    employeeManager.removeEmployee(1);
    Employee removedEmployee = employeeManager.getEmployee(1);
    // Assert
    assertEquals(0, employeeManager.getEmployeeCount(), "Employee count should be 0");
    assertNull(removedEmployee, "Employee should be removed from directory.");
  }

  @Test
  void testAssertEmployeeInCollection() {
    // Arrange & Act & Assert
    assertThatThrownBy(() -> employeeManager.getEmployee(52))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("Employee does not exist in collection with Id 1");
  }

  @Test
  void testGetEmployeeCount() {
    // Arrange
    Employee addNew1 = new Employee(2, "Dracula", "Medical", 0.0);
    Employee addNew2 = new Employee(3, "Blade", "Security", 0.0);
    // Act
    employeeManager.addEmployee(addNew1);
    employeeManager.addEmployee(addNew2);
    // Assert
    assertEquals(3, employeeManager.getEmployeeCount());
  }
}
