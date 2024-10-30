package com.codedifferently.lesson15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
  //  private class Employee employee;
  Employee testEmployee;

  @BeforeEach
  void setUp() {
    testEmployee = new Employee(3, "angie", "Software Engineer", 100000.99);
  }

  @Test
  void getId_successful() {

    Employee employee = new Employee(3, null, "", 0);
    int actualId = employee.getId();
    assertEquals(3, actualId);
  }

  @Test
  void setName() {
    testEmployee.setName("angie");
    assertEquals("angie", testEmployee.getName());
  }

  @Test
  void getName_successful() {
    Employee testemployee = new Employee(0, "angie", "", 0);

    String actualName = testemployee.getName();
    assertEquals("angie", actualName);
  }

  @Test
  void getDepartment_successful() {
    Employee employee = new Employee(0, null, "test", 0);

    String actualDepartment = employee.getDepartment();

    assertEquals("test", actualDepartment);
  }

  @Test
  void getSalary_successful() {
    Employee employee = new Employee(0, null, "", 100000.99);

    Double actualSalary = employee.getSalary();

    assertEquals(100000.99, actualSalary);
  }

  @Test
  public void testGetDetails() {
    assertEquals("3 angie Software Engineer 100000.99.", testEmployee.getDetails());
  }
}
