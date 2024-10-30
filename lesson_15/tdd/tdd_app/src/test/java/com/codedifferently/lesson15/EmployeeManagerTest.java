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
  Employee employee1;
  Employee employee2;

  @BeforeEach
  public void setup() {
    employees = new HashMap<Integer, Employee>();
    employees.put(1, new Employee(1, "Nile", "SWE", 65000.00));

    employeeManager = new EmployeeManager();
  }

  @Test
  public void testEmployeeManagement() {}

  // Create Employee objects

  @Test
  public void addEmployee() { // Use addEmployee to add employees
    assertThat(employees).hasSize(1);
    employees.put(2, new Employee(2, "Chino", "Marketing", 70000.00));
    assertThat(employees).hasSize(2);
  }

  @Test // Invoke getEmployeeCount
  public void getEmployee() {
    int count = employeeManager.getEmployeeCount();
    assertThat(employees).hasSize(2);

    Employee retrievedEmployee = employeeManager.getEmployee(2);
    assertThat(retrievedEmployee.getName()).hasSize(2);
  }

  @Test
  public void updateEmployee() {
    employee1.put(new Employee(1, "Nile", "SWE", 65000.00));
    employee1.setSalary(70000.00);
    employeeManager.updateEmployee(employee1);

    Employee updatedEmployee = employeeManager.getEmployee(1);
    assertThat(updatedEmployee.getSalary()).isEqualTo(70000.00);
  }

  @Test
  public void getEmployeeCount() {
    employeeManager.removeEmployee(2);
    count = employeeManager.getEmployeeCount();
  }

  @Test
  public void getEmployees() {
    employees.put(1, new Employee(1, "Nile", "SWE", 65000.00));
    assertThat(employees).hasSize(1);
    Map<Integer, Employee> employeeMap = employeeManager.getEmployees();
    employeeMap.put(count, employee1);
    assertThat(employeeMap.size()).isEqualTo(1);
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
    String expectedDetails = "id: 7 name: Nile department: SWE salary: 65000.0";
    assertEquals(expectedDetails, actualDetails);
  }
}
