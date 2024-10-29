package com.codedifferently.lesson15;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class EmployeeManagerTest {
    @Test
    void testAddEmployee() {
        //Arrange
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee(
            24680, 
            "Web Design", 
            "Alice Johnson", 
            75000
            );
        
        //Act
        employees.add(employee.getId(), employee);

        //Assert
        assertTrue(employees.contains(employee));
        
    }

    @Test
    void testUpdateEmployee() {
        //Arrange
        //Act
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
