package com.codedifferently.lesson15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

  Employee employee;

  @BeforeEach
  void setUp() {
    employee = new Employee(2, "Hummad", "Finance", 2000);
  }

  @Test
  public void testGetId() {

    int actualId = 2;
    int expectedId = employee.getId();
    assertEquals(expectedId, actualId);
  }

  @Test
  public void testGetSalary() {
    assertEquals(employee.getSalary(), 2000);
  }

  @Test
  public void testSetSalary() {
    employee.setSalary(2000);
    assertEquals(employee.getSalary(), 2000);
  }

  @Test
  public void testSetId() {

    employee.setId(10);
    assertEquals(employee.getId(), 10);
  }

  @Test
  public void testGetName() {
    employee.getName();
    assertEquals(employee.getName(), "Hummad");
  }

  @Test
  public void testSetName() {
    employee.setName("Hummad");
    assertEquals(employee.getName(), "Hummad");
  }

  @Test
  public void testGetDepartment() {

    assertEquals(employee.getDepartment(), "Finance");
  }

  @Test
  public void testSetDepartment() {

    employee.setDepartment("Finance");
    assertEquals(employee.getDepartment(), "Finance");
  }

  @Test
  public void testGetDetails() {

    // String expectedDetails = "2 Hummad Finance 2000";
    assertEquals("ID:2Name: HummadDepartment: Financesalary: 2000.0", employee.getDetails());
  }
}
