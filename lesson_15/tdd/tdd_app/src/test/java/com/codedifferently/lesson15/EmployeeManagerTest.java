package com.codedifferently.lesson15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeManagerTest {
    private EmployeeManager employeeManager;

    @BeforeEach
    public void setUp() {
        employeeManager = new EmployeeManager();
    }

    @Test
    void testAddEmployee() {
        //Arrange
        Employee employee = new Employee(1, "John Doe", null, 0);
        
        //Act
        employeeManager.addEmployee(employee);

        //Assert
        assertEquals(1, employeeManager.getEmployeeCount());
        
    }

    @Test
    void testUpdateEmployee() {
        //Arrange
        Employee employee = new Employee(1, "John Doe", null, 0);
        Employee updatedEmployee = new Employee(1, "Jane Doe", null, 0);
        
        //Act
         employeeManager.addEmployee(employee);
         employeeManager.updateEmployee(updatedEmployee);

        //Assert
        Employee retrievedEmployee = employeeManager.getEmployee(1);
        assertEquals(updatedEmployee.getName(), retrievedEmployee.getName());

    }

    @Test
    void testGetEmployee() {
        //Arrange
        //Act
    }

    @Test
    void testRemoveEmployee() {
        //Arrange
        //Act
    }

    @Test
    void testGetEmployeeCount() {
        //Arrange
        //Act
    }
}
