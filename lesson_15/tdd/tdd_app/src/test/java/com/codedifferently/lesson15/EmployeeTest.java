package com.codedifferently.lesson15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
  private Employee employee;

  @BeforeEach
  public void setUp() {
    employee = new Employee(1, "Yafiah", "Engineering", 75000.0);
  }

  @Test
  public void testGetId() {
    assertEquals(1, employee.getId());
  }

  @Test
  public void testGetName() {
    assertEquals("Yafiah", employee.getName());
  }

  @Test
  public void testGetDepartment() {
    assertEquals("Engineering", employee.getDepartment());
  }

  @Test
  public void testGetSalary() {
    assertEquals(75000.0, employee.getSalary());
  }

  @Test
  public void testSetId() {
    employee.setId(2);
    assertEquals(2, employee.getId());
  }

  @Test
  public void testSetName() {
    employee.setName("Nash");
    assertEquals("Nash", employee.getName());
  }

  @Test
  public void testSetDepartment() {
    employee.setDepartment("Marketing");
    assertEquals("Marketing", employee.getDepartment());
  }

  @Test
  public void testSetSalary() {
    employee.setSalary(80000.0);
    assertEquals(80000.0, employee.getSalary());
  }

  @Test
  public void testGetDetails() {
    String expectedDetails = "ID: 1, Name: Yafiah, Department: Engineering, Salary: $75000.0";
    assertEquals(expectedDetails, employee.getDetails());
  }
}
