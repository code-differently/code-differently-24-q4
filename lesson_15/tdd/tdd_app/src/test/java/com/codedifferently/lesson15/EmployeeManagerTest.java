package com.codedifferently.lesson15;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class EmployeeManagerTest {
  @Test
  void testAddEmployee() {
    // Arrange
    EmployeeManager manager = new EmployeeManager();
    Employee employee = new Employee(1, "Jane Doe", "Marketing", 65000.00);

    // Act
    manager.addEmployee(employee);
    Employee retrievedEmployee = manager.getEmployee(1);

    // Assert
    assertThat(retrievedEmployee).isNotNull();
    assertThat(retrievedEmployee.getName()).isEqualTo("Jane Doe");
  }

  @Test
  void testUpdateEmployee() {
    // Arrange
    EmployeeManager manager = new EmployeeManager();
    Employee employee = new Employee(1, "John Doe", "Engineering", 75000.00);
    manager.addEmployee(employee);

    // Act
    employee.setName("John Smith");
    manager.updateEmployee(employee);
    Employee updatedEmployee = manager.getEmployee(1);

    // Assert
    assertThat(updatedEmployee.getName()).isEqualTo("John Smith");
  }

  @Test
  void testEmployeeCount() {
    // Arrange
    EmployeeManager manager = new EmployeeManager();
    manager.addEmployee(new Employee(1, "John Doe", "Engineering", 75000.00));
    manager.addEmployee(new Employee(2, "Jane Doe", "Marketing", 65000.00));

    // Act
    int count = manager.getEmployeeCount();

    // Assert
    assertThat(count).isEqualTo(2);
  }

  @Test
  void testRemoveEmployeeThrowsExceptionWhenNotFound() {
    // Arrange
    EmployeeManager manager = new EmployeeManager();

    // Act & Assert
    assertThatThrownBy(() -> manager.removeEmployee(99))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("Employee does not in collection with id 99");
  }

  @Test
  void testGetEmployeeThrowsExceptionWhenNotFound() {
    // Arrange
    EmployeeManager manager = new EmployeeManager();

    // Act & Assert
    assertThatThrownBy(() -> manager.getEmployee(99))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("Employee does not in collection with id 99");
  }

  @Test
  void testUpdateEmployeeThrowsExceptionWhenNotFound() {
    // Arrange
    EmployeeManager manager = new EmployeeManager();
    Employee employee = new Employee(1, "John Doe", "Engineering", 75000.00);

    // Act & Assert
    assertThatThrownBy(() -> manager.updateEmployee(employee))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("Employee does not in collection with id 1");
  }
}
