package com.codedifferently.lesson15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

  Employee employee;

  // Set up
  @BeforeEach
  void setUp() {
    employee = new Employee(7, "Nile", "SWE", 65000.00);
  }

  @Test
  public void testGetId() {
    int actualId = employee.getId();
    int expectedId = 7;
    assertEquals(expectedId, actualId);
  }

  @Test
  public void testSetID() {
    int expectedSetId = 0;
    employee.setId(expectedSetId);
    assertEquals(expectedSetId, employee.getId());
  }

  @Test
  public void testGetName() {
    String expectedName = "Nile";
    String actualName = employee.getName();
    assertEquals(expectedName, actualName);
  }

  @Test
  public void testSetName() {
    String expectedSetName = "Nile";
    employee.setName(expectedSetName);
    assertEquals(expectedSetName, employee.getName());
  }

  @Test
  public void testGetDepartment() {
    String expectedDepartment = "SWE";
    String actualDepartment = employee.getDepartment();
    assertEquals(expectedDepartment, actualDepartment);
  }

  @Test
  public void testSetDepartment() {
    String expectedSetDepartment = "Tech";
    employee.setDepartment(expectedSetDepartment);
    assertEquals(expectedSetDepartment, employee.getDepartment());
  }

  @Test
  public void testGetSalary() {
    double expectedSalary = 65000.00;
    double actualSalary = employee.getSalary();
    assertEquals(expectedSalary, actualSalary);
  }

  @Test
  public void testSetSalary() {
    double expectedSetSalary = 100000.00;
    employee.setSalary(expectedSetSalary);
    assertEquals(expectedSetSalary, employee.getSalary());
  }

  @Test
  public void testGetDetails() {
    String actualDetails = employee.getDetails();
    String expectedDetails = "id: 7 name: Nile department: SWE salary: 65000.0";
    assertEquals(expectedDetails, actualDetails);
  }
}
