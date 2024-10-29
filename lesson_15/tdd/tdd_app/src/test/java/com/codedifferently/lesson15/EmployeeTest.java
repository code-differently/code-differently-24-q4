package com.codedifferently.lesson15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class EmployeeTest {

    Employee employee;
    //Set up
    @BeforeEach
    void setUp() {
        employee = new Employee(19, "Chigazo", "Finance", 200000.00);
    }

    @Test
    //Method beign tested
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
        
        String actualName = employee.getName();

        String expectedName = "Chigazo";

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
    public void getDepartmentTest() {
        String expectedDepartment = employee.getDepartment();

        String actualDepartment = "Finance";

        assertEquals(expectedDepartment, actualDepartment);
    }

    // @Test
    // public void setDepartmentTest() {
    //     employee.setDepartment();
    // }

    @Test
    public void getSalaryTest() {
        double expectedSalary = employee.getSalary();

        double actualSalary = 200000.00;

        assertEquals(expectedSalary, actualSalary);
    }

    // @Test
    // public void setSalaryTest() {
    //     employee.setSalary();
    // }

    private void getId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

