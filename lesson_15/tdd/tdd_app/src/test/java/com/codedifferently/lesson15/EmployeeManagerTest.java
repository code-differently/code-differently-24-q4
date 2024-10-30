package com.codedifferently.lesson15;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeManagerTest {
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
  public void testGetEmployee() {
    // Arange
    var id = 1;

    // Act
    Employee result = employeeManager.getEmployee(id);

    // Assert
    assertThat(result).isNotNull();
    assertThat(result.getName()).isEqualTo("John");
  }

  @Test
  public void testUpdateEmployee() {
    // Arrange
    var id = 2;

    // Act
    Employee employee = employeeManager.getEmployee(id); // use this for set test
    employee.setDepartment("Human Resources");
    employeeManager.updateEmployee(employee);
    Employee updatedEmployee = employeeManager.getEmployee(id);

    // Assert
    assertThat(updatedEmployee).isNotNull();
  }

  @Test
  public void testGetEmployeeCount() {
    // Assert
    assertThat(employeeManager.getEmployeeCount()).isNotNull();
  }

  @Test
  public void testRemoveEmployee() {
    var id = 1;

    int count = employeeManager.getEmployeeCount();
    employeeManager.removeEmployee(id);

    assertThatThrownBy(() -> employeeManager.getEmployee(id))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("Employee does not in collection with id " + id);
    assertThat(employeeManager.getEmployeeCount()).isLessThan(count);
  }
}
