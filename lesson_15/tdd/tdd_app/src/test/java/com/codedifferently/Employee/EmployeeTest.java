package com.codedifferently.Employee;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.codedifferently.lesson15.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
  Employee employee;

  @BeforeEach
  void setUp() {
    employee = new Employee(1545, "Ray Allen", "Lavatory", 50000.0);
  }

  @Test
  void testId() {
    // Act
    employee.setId(1545);
    int id = employee.getId();
    // Assert
    assertEquals(1545, id);
  }

  @Test
  // Act
  void testName() {
    employee.setName("Ray Allen");
    String name = employee.getName();
    // Assert
    assertEquals("Ray Allen", name);
  }

  @Test
  // Act
  void testDepartment() {
    employee.setDepartment("Lavatory");
    String department = employee.getDepartment();
    // Assert
    assertEquals("Lavatory", department);
  }

  @Test
  // Act
  void testSalary() {
    employee.setSalary(50000.0);
    Double salary = employee.getSalary();
    // Assert
    assertEquals(50000.0, salary);
  }

  @Test
  void getDetails() {

    String expected = "Employee ID 1545, Name Ray Allen, Department Lavatory, Salary 50000.0";
    String actual = employee.getDetails();

    assertEquals(expected, actual);
  }
}
