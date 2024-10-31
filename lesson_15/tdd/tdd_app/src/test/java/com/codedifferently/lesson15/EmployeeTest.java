package com.codedifferently.lesson15;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EmployeeTest {
  private Employee employee;

  @Test
  void testGetDetails() {
    // Arrange
    employee = new Employee(1, "Jet Li", "Specialist", 110.00);
    // Act
    Employee actualDetails = employee.getDetails(employee);
    // Assert
    assertThat(actualDetails).isEqualTo(employee);
  }
}
