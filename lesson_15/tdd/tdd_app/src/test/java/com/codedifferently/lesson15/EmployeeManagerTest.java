package com.codedifferently.lesson15;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeManagerTest {

  EmployeeManager employeeManager;
  List<Employee> employees;

  // Set up
  @BeforeEach
  void setUp() {
    employeeManager = new EmployeeManager();
    Employee employee = new Employee(0, "Nitsua", "Sales", 65000.00);
    employeeManager.addEmployee(employee);
    employees = new ArrayList();
    employees.add(employee);
  }

  @Test
  public void testAddEmployee() {
    // Arrange
    Employee employee1 = new Employee(1, "Penny", "Sales", 65000.00);
    // Act & Assert
    employeeManager.addEmployee(employee1);
    assertEquals(employee1, employeeManager.getEmployee(1));
  }

  @Test
  public void testGetEmployee() {
    // Arrange
    Employee employee = new Employee(0, "Nitsua", "Sales", 65000.00);
    Employee expectedEmployee = employeeManager.getEmployee(employee.getId());
    // Act
    Employee actualEmployee = employeeManager.getEmployee(0);
    // Assert
    assertEquals(expectedEmployee, actualEmployee);
  }

  @Test
  public void testUpdateEmployee() {
    // Arrange
    Employee expectedEmployeeUpdate = new Employee(0, "Nitsua", "Tech", 100000.00);
    // Act
    employeeManager.updateEmployee(expectedEmployeeUpdate);
    // Act
    assertEquals(expectedEmployeeUpdate, employeeManager.getEmployee(0));
  }

  @Test
  public void testRemoveEmployee() {
    // Arange
    Employee employee = new Employee(0, "Nitsua", "Sales", 65000.00);
    employeeManager.addEmployee(employee);
    // Act
    employeeManager.removeEmployee(0);
    // Assert
    assertThatThrownBy(() -> employeeManager.removeEmployee(0))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("Employee does not in collection with id " + employee.getId());
  }

  @Test
  public void testGetEmployeeCount() {
    // Act
    int actualEmployeeCount = employeeManager.getEmployeeCount();
    // Assert(recieved help from Vicente on employees array)
    assertEquals(employees.size(), actualEmployeeCount);
  }
}
