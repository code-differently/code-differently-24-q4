package com.codedifferently.lesson15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
  // Employyee Methods //

  private Employee employee;

  @BeforeEach
  public void setUp() {
    // Arrange
    employee = new Employee(1, "Wall-E", "Inbound", 30000.00);
  }

  @Test
  public void testGetId() {
    employee.getId();
    // Assert
    assertEquals(employee.getId(), 1);
  }

  @Test
  public void testSetId() {
    employee.setId(2);
    // Assert
    assertEquals(employee.getId(), 2);
  }

  @Test
  public void testGetName() {
    employee.getName();
    // Assert
    assertEquals(employee.getName(), "Wall-E");
  }

  @Test
  public void testSetName() {
    employee.setName("BURN-E");
    // Assert
    assertEquals(employee.getName(), "BURN-E");
  }

  @Test
  public void testGetDepartment() {
    employee.setName("BURN-E");
    // Assert
    assertEquals(employee.getDepartment(), "Inbound");
  }

  @Test
  public void testSetDepartment() {
    employee.setDepartment("NONE");
    // Assert
    assertEquals(employee.getDepartment(), "NONE");
  }

  @Test
  public void testGetSalary() {
    employee.getSalary();
    // Assert
    assertEquals(employee.getSalary(), 30000.00);
  }

  @Test
  public void testSetSalary() {
    employee.setSalary(100);
    // Assert
    assertEquals(employee.getSalary(), 100);
  }

  @Test
  public void testGetDetails() {
    // Assert
    assertEquals(
        "ID: 1, Name: Wall-E, Department: Inbound, Salary: 30000.0", employee.getDetails());
  }
}
