package com.codedifferently.lesson15;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeManagerTest {
  private EmployeeManager employeeManager;
  private Map<Integer, Employee> employees;
  private Employee employee1;
  private Employee employee2;

  @BeforeEach
  public void setup() {
    employees = new HashMap<>();
    employee1 = new Employee(1, "Nile", "SWE", 65000.00);
    employee2 = new Employee(2, "Chino", "Marketing", 70000.00);

    employeeManager = new EmployeeManager();
    employeeManager.setEmployees(employees);
    employeeManager.addEmployee(employee1);
    employeeManager.addEmployee(employee2);
  }

  @Test
  public void testEmployeeManagement() {}

  @Test
  public void addEmployee() {
    assertThat(employees).hasSize(2);
  }

  @Test
  public void getEmployee() {
    Employee retrievedEmployee = employeeManager.getEmployee(2);
    assertThat(retrievedEmployee.getName()).isEqualTo("Chino");
  }

  @Test
  public void updateEmployee() {
    employee1.setSalary(70000.00);
    employeeManager.updateEmployee(employee1);

    Employee updatedEmployee = employeeManager.getEmployee(1);
    assertThat(updatedEmployee.getSalary()).isEqualTo(70000.00);
  }

  @Test
  public void getEmployeeCount() {
    int count = employeeManager.getEmployeeCount();
    assertEquals(2, count);
  }

  @Test
  public void getEmployees() {
    Map<Integer, Employee> employeeMap = employeeManager.getEmployees();
    assertThat(employeeMap.size()).isEqualTo(2);
  }

  @Test
  public void setEmployees() {
    Map<Integer, Employee> newEmployees = new HashMap<>();
    newEmployees.put(3, new Employee(3, "Charlie", "HR", 75000.00));
    employeeManager.setEmployees(newEmployees);

    assertThat(employeeManager.getEmployees().size()).isEqualTo(1);
  }

  @Test
  public void testGetDetails() {
    String actualDetails = employee1.getDetails();
    String expectedDetails = "id: 1 name: Nile department: SWE salary: 65000.0";
    assertEquals(expectedDetails, actualDetails);
  }
}
