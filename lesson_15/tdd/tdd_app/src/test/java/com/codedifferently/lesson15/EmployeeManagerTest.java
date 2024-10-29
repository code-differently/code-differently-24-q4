package com.codedifferently.lesson15;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class EmployeeManagerTest {
    @Test
    void testAddEmployee() {
        // employees.put(employee.getId(), employee);
        //Arrange
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee(12345, "Engineering", "Alice Johnson", 75000);
        
        //Act
        employees.add(employee);

        //Assert
        
        
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
