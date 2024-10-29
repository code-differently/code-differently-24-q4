package com.codedifferently.lesson15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
    @Test
    void testGetDepartment() {
        //Arrange
        //Act
    }

    @Test
    void testGetDetails() {
        //Arrange
        Employee employee = new Employee(12345, "John Doe", "Engineering", 75000);
        
        //Act
        String actualDetails = employee.getDetails();
        
        //Assert
        String expectedDetails = "Employee: John Doe, Department: Engineering , ID: 12345 , Salary: 75000";
        assertEquals(expectedDetails, actualDetails);
    }

    @Test
    void testGetId() {
        //Arrange
        //Act
    }

    @Test
    void testGetName() {
        //Arrange
        //Act
    }

    @Test
    void testGetSalary() {
        //Arrange
        //Act
    }

    @Test
    void testSetDepartment() {
        //Arrange
        //Act
    }

    @Test
    void testSetId() {
        //Arrange
        //Act
    }

    @Test
    void testSetName() {
        //Arrange
        //Act
    }

    @Test
    void testSetSalary() {
        //Arrange
        //Act
    }
}
