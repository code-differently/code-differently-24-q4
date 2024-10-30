package com.codedifferently.lesson15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class EmployeeTest {
    
    Employee employee;

    @BeforeEach
  void setUp() {
    employee = new Employee(1234,"Pierson","Tech Support",5.00);
  }
  
  @Test
    public void testGetId () {
        // Given
        // int expectedId = 1234;
        employee.setId(1234);

        //when
        // Employee employee = new Employee(1234,"Pierson","Tech Support",5.00);

        // Then
        int actualId = employee.getId();
        int expectedId = 1234;
        

        assertEquals(expectedId,actualId);

    }

    @Test
    public void testGetName () {
        // Given
        // String expectedName = "Pierson";
        employee.setName("Pierson");

        //when
        // Employee employee = new Employee(1234,"Pierson","Tech Support",5.00);

        // Then
        String actualName = employee.getName();
        String expectedName = "Pierson";


        assertEquals(expectedName,actualName);

    }

       @Test
    public void testGetDepartment () {
        // Given
        // String expectedDept = "Tech Support";
        employee.setDepartment("Tech Support");

        //when
        // Employee employee = new Employee(1234,"Pierson","Tech Support",5.00);

        // Then
        String actualDept = employee.getDepartment();
        String expectedDept = "Tech Support";

        assertEquals(expectedDept,actualDept);

    }

       @Test
    public void testGetSalary () {
        // Given
        // double expectedSalary = 5.00;
        employee.setSalary(5.00);

        //when
        // Employee employee = new Employee(1234,"Pierson","Tech Support",5.00);

        // Then
        double actualSalary = employee.getSalary();
        double expectedSalary = 5.00;

        assertEquals(expectedSalary,actualSalary);

    }


}