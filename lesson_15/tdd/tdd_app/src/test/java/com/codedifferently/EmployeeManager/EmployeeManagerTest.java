package com.codedifferently.EmployeeManager;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.codedifferently.lesson15.Employee;
import com.codedifferently.lesson15.EmployeeManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeManagerTest {
  EmployeeManager employeeManager;
  Employee employee;

  @BeforeEach
  void setUp() {
    employeeManager = new EmployeeManager();
    employee = new Employee(1545, "Ray Allen", "Lavatory", 50000.0);
  }

  @Test
  void addEmployee() {
    employeeManager.addEmployee(employee);
    assertThat(employeeManager.getEmployee(1545)).isEqualTo(employee);
  }

  @Test
  void removeEmployee() {
    employeeManager.addEmployee(employee);
    employeeManager.removeEmployee(employee.getId());
    assertThat(employeeManager.getEmployeeCount()).isEqualTo(0);
  }

  @Test
  void updateEmployee() {
    employeeManager.addEmployee(employee);
    Employee updatedEmployee = new Employee(1545, "Ray Allen", "Baller", 1000000.0);

    employeeManager.updateEmployee(updatedEmployee);

    assertThat(employeeManager.getEmployee(employee.getId()).getDepartment()).isEqualTo("Baller");
    assertThat(employeeManager.getEmployee(employee.getId()).getSalary()).isEqualTo(1000000.0);
  }

  @Test
  void unknownEmployee() {
    assertThatThrownBy(() -> employeeManager.getEmployee(9999))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("Employee does not in collection with id 9999");
  }
}
