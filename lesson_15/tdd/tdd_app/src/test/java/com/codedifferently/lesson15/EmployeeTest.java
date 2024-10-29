package com.codedifferently.lesson15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class EmployeeTest {

    Employee employee;
    //Set up
    @BeforeEach
    void setUp() {
        employee = new Employee(19, "Chigazo", "Finance", 50000.00);
    }

    @Test
    //Method being tested
    public void testGetId() {
        //Execersise
        int actualId = employee.getId();
        
        int expectedId = 19;
        //Assert(Checking the value)
        assertEquals(expectedId, actualId);
    }

    @Test
    public void testSetID() {
        //Arrange
        int expectedSetId = 91;
        //Act
        employee.setId(expectedSetId);
        //Assert
        assertEquals(expectedSetId, employee.getId());
    }

    @Test
    public void testGetName() {
        //Arrange
        String expectedName = "Chigazo";
        //Act
        String actualName = employee.getName();
        //Assert
        assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        //Arrange
        String expectedSetName = "Austin";
        //Act
        employee.setName(expectedSetName);
        //Assert
        assertEquals(expectedSetName, employee.getName());
    }

    @Test
    public void testGetDepartment() {
        //Arrange
        String actualDepartment = "Finance";
        //Act
        String expectedDepartment = employee.getDepartment();
        //Assert
        assertEquals(expectedDepartment, actualDepartment);
    }

    @Test
    public void testSetDepartment() {
        //Arrange
        String expectedSetDepartment = "Tech";
        //Act
        employee.setDepartment(expectedSetDepartment);
        //Assert
        assertEquals(expectedSetDepartment, employee.getDepartment());
    }

    @Test
    public void testGetSalary() {
        //Arrange
        double actualSalary = 50000.00;
        //Act
        double expectedSalary = employee.getSalary();
        //Assert
        assertEquals(expectedSalary, actualSalary);
    }

    @Test
    public void testSetSalary() {
        //Arrange
        double expectedSetSalary = 100000.00;
        //Act
        employee.setSalary(expectedSetSalary);
        //Assert
        assertEquals(expectedSetSalary, employee.getSalary());
    }

    @Test
    public void testGetDetails() {
        //Arrange
        String actualDetails = 
        "id: " + employee.getId()
         + "name: " + employee.getName()
         + "department: " + employee.getDepartment()
         + "salary: " + employee.getSalary();
        //Act
        String expectedDetails = employee.getDetails();
        //Assert
        assertEquals(expectedDetails, actualDetails);
    }
}

