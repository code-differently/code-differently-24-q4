package com.codedifferently.lesson15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class EmployeeManagerTest {

 EmployeeManager employeeManager;

  Employee employee;

  @BeforeEach
  public void setUp() {
  employeeManager = new EmployeeManager();
  employee = new Employee (2,"Hummad","Finance",2000);
  }
  @Test
  public void testAddEmployee() {
    
    employeeManager.addEmployee(employee);
    Employee employee1 = new Employee (3,"Hummad","Finance",2000);
    employeeManager.addEmployee(employee1);

    assertEquals(2, employeeManager.getEmployeeCount());
  }

  @Test
  public void testGetEmployee(){

     
    employeeManager.addEmployee(employee);

    assertEquals(employee, employeeManager.getEmployee(employee.getId()));

  }

  @Test
  public void testGetEmployeeCount() {

    employee = new Employee(2, "Hummad", "Finance", 2000);
    Employee employee1 = new Employee (3,"Hummad","Finance",2000);

    employeeManager.addEmployee(employee1);

    employeeManager.addEmployee(employee);

    assertEquals(2, employeeManager.getEmployeeCount());

  }

  @Test 
  public void testRemoveEmployee()
  {

    employeeManager.addEmployee(employee);

    employeeManager.removeEmployee(employee.getId());

    assertEquals(0, employeeManager.getEmployeeCount());

  }

  @Test
  public void testUpdateEmployee()
  {

     employee = new Employee(2, "Hummad", "Finance", 2000);

    employeeManager.addEmployee(employee);

    employeeManager.updateEmployee(employee);

    assertEquals(employeeManager.getEmployee(employee.getId()), employee);

  }

}




  

  

  