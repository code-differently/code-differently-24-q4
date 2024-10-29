package com.codedifferently.lesson15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
  private Employee cut;

  @BeforeEach
  public void setUp() {
    cut = new Employee(1, "Wilmington", "HR", 200.00);
  }

  @Test
  public void testGetName() {
    // Arrange
    cut.setName("Wilmington");

    // Act
    String expectedName = cut.getName();

    // Assert
    String actualName = "Wilmington";
    assertEquals(expectedName, actualName, "The name should be 'Wilmington'");
  }

  @Test
  public void testGetId() {
    // Arrange
    cut.setId(1);

    // Act
    int expectedId = cut.getId();

    // Assert
    int actualId = 1;
    assertEquals(expectedId, actualId, "The id should be '1'");
  }

  @Test
  public void testGetDepartment() {
    // Arrange
    cut.setDepartment("HR");

    // Act
    String expectedDept = cut.getDepartment();

    // Assert
    String actualDept = "HR";
    assertEquals(expectedDept, actualDept, "The Department should be 'HR'");
  }

  @Test
  public void testGetSalary() {
    // Arrange
    cut.setSalary(200.00);

    // Act
    double expectedSalary = cut.getSalary();

    // Assert
    double actualSalary = cut.getSalary();
    assertEquals(expectedSalary, actualSalary, "The Salary should be '200.00'");
  }

  @Test
  public void testGetDetails() {
    // Arrange
    String expected = "Employee ID: 1, Name: Wilmington, Department: HR, Salary: 200.0";

    // Act
    String actual = cut.getDetails();

    // Assert
    assertEquals(expected, actual);
  }
}
