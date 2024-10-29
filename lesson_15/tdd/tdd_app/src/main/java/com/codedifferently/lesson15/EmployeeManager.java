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

  public Employee getEmployee(int id) {
    return employees.get(id);
  }

  public void updateEmployee(Employee employee) {
    employees.put(employee.getId(), employee);
  }

  public void removeEmployee(int id) {
    employees.remove(id);
  }

  public int getEmployeeCount() {
    return employees.size();
  }
}
