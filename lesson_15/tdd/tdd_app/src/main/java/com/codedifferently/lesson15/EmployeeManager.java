package com.codedifferently.lesson15;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManager {
    private Map<Integer, Employee> employees = new HashMap<>();

    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    public void removeEmployee(int id) {
        employees.remove(id);
    }

    public void updateEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    public Employee getEmployee(int id) {
        return employees.get(id);
    }

    public int getEmployeeCount() {
        return employees.size();
    }
 
    public Map<Integer, Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Map<Integer, Employee> employees) {
        this.employees = employees;
    }
}

