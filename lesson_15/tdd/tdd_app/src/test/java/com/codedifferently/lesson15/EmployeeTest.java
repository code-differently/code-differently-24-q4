package com.codedifferently.lesson15;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
  EmployeeManager employeeManager;
  private Map<Integer, Employee> employees;

  @BeforeEach
  void setUp() {
    employees = new HashMap<>();
    employees.put(1, new Employee(1, "John", "Marketing", 20000.50));
    employees.put(2, new Employee(2, "Jane", "Accounting", 30000.70));
    employeeManager = new EmployeeManager();
    for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
      employeeManager.addEmployee(entry.getValue());
    }
  }

  @Test
  public void testGetSalary() {
    // Arrange
    var id = 1;

    // Act
    Employee employee = employeeManager.getEmployee(id);

    // Assert
    assertThat(employee.getSalary()).isNotNull();
  }

  @Test
  public void testGetDepartment() {
    // Arrange
    var id = 1;

    // Act
    Employee employee = employeeManager.getEmployee(id);

    // Assert
    assertThat(employee.getDepartment()).isNotNull();
  }

  @Test
  public void testGetDetails() {
    // Arrange
    var id = 1;

    // Act
    Employee employee = employeeManager.getEmployee(id);

    // Assert
    assertThat(employee.getDetails()).isNotNull();
    assertThat(employee.getName()).isEqualTo("John");
    assertThat(employee.getDepartment()).isEqualTo("Marketing");
    assertThat(employee.getSalary()).isEqualTo(20000.50);
  }
}
