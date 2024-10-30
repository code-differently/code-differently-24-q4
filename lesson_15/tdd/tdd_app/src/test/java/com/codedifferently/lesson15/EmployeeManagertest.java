package com.codedifferently.lesson15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeManagertest {
  private EmployeeManager employeeManager;
  private Map<Integer, Employee> employees;
  Employee newEmployee;
  Employee tomCat;

  @BeforeEach
  void set_up() {
    employees = new HashMap<Integer, Employee>();
    newEmployee = new Employee(5, "Mike", "Human Resources", 900000.80);
    employeeManager = new EmployeeManager();
  }

  @Test
  void addEmployee() {

    employees.put(newEmployee.getId(), newEmployee);
    employeeManager.addEmployee(newEmployee);
    assertEquals(employees.get(5), employeeManager.getEmployee(5));
  }

  @Test
  void updateEmployee() {

    tomCat = new Employee(5, "mike", "Human Resources", 900000.80);
    employees.put(newEmployee.getId(), newEmployee);
    employeeManager.addEmployee(newEmployee);

    employees.put(tomCat.getId(), tomCat);
    employeeManager.updateEmployee(tomCat);
    assertEquals(employees.get(tomCat.getId()), employeeManager.getEmployee(newEmployee.getId()));
  }

  @Test
  void RemoveEmployee() {
    employeeManager.addEmployee(newEmployee);
    employeeManager.removeEmployee(newEmployee.getId());
    assertEquals(0, employeeManager.getEmployeeCount());
  }
}
