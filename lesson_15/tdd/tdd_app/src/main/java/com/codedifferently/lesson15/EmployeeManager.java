package com.codedifferently.lesson15;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManager {
  private Map<Integer, Employee> employees;

  public EmployeeManager() {
    employees = new HashMap<>();
  }

  public void addEmployee(Employee employee) {
    employees.put(employee.getId(), employee);
  }

  public Employee getEmployee(int id) throws RuntimeException {
    if (employees.get(id) == null) {
      throw new NullPointerException("Employee with id " + id + " not found");
    }
    return employees.get(id);
  }

  public void updateEmployee(Employee employee) {
    employees.put(employee.getId(), employee);
  }

  public void removeEmployee(int id) throws RuntimeException {
    if (employees.get(id) == null) {
      throw new NullPointerException("Employee with id " + id + " not found");
    }
    employees.remove(id);
  }

  public int getEmployeeCount() {
    return employees.size();
  }
}
