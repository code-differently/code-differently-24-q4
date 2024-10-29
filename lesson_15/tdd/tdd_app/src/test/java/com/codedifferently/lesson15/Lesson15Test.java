package com.codedifferently.lesson15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Lesson15Test {

  private EmployeeManager employeeManager;
  private Employee employee;

  @BeforeEach
  public void setUp() {
    employeeManager = new EmployeeManager();
    employee = new Employee(1, "Wall E", "Inbound", 30000.00);
  }

  @Test
  public void testAddEmployee() {
    employeeManager.addEmployee(employee);
    assertEquals(1, employeeManager.getEmployeeCount());
    assertEquals(employee, employeeManager.getEmployee(1));
  }

  @Test
  public void testGetEmployee() {
    employeeManager.addEmployee(employee);
    Employee retrieved = employeeManager.getEmployee(1);
    assertEquals(employee, retrieved);
  }

  @Test
  public void testUpdateEmployee() {
    employeeManager.addEmployee(employee);
    Employee updatedEmployee = new Employee(1, "EVE", "Inbound", 80000.00);
    employeeManager.updateEmployee(updatedEmployee);
    assertEquals(updatedEmployee, employeeManager.getEmployee(1));
  }

  @Test
  public void testRemoveEmployee() {
    employeeManager.addEmployee(employee);
    employeeManager.removeEmployee(1);
    assertEquals(0, employeeManager.getEmployeeCount());
  }

  @Test
  public void testGetEmployeeCount() {
    assertEquals(0, employeeManager.getEmployeeCount());
    employeeManager.addEmployee(employee);
    assertEquals(1, employeeManager.getEmployeeCount());
  }
}
