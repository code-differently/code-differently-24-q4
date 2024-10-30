package com.codedifferently.lesson15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
  Employee employee;

  @BeforeEach
  public void setUp() {
    employee = new Employee(0, "Zion", "Code Differently", 0);
  }

  @Test
  public void testGetId() {
    employee.getId();
    assertEquals(employee.getId(), 0);
  }

  @Test
  public void testSetId() {
    employee.setId(1);
    assertEquals(employee.getId(), 1);
  }

  @Test
  public void testGetName() {
    assertEquals(employee.getName(), "Zion");
  }

  @Test
  public void testSetName() {
    employee.setName("Zion");
    assertEquals(employee.getName(), "Zion");
  }

  @Test
  public void testGetDepartment() {
    employee.getDepartment();
    assertEquals(employee.getDepartment(), "Code Differently");
  }

  @Test
  public void testSetDepartment() {
    employee.setDepartment("Code Differently");
    assertEquals(employee.getDepartment(), "Code Differently");
  }

  @Test
  public void testGetDetails() {
    assertEquals(employee.getDetails(), "Id 0 Name: Zion department Code Differently0.0 salary");
  }
  @Test
  public void testGetSalary() { 
    employee.getSalary();
    assertEquals(employee.getSalary(), 0);
  } 

  @Test 
  public void testSetSalary() { 
    assertEquals(employee.getSalary(), 0);
  }

}
