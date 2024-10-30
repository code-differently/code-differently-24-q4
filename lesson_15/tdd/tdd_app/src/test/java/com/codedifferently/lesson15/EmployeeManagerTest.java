package com.codedifferently.lesson15;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeManagerTest {

    EmployeeManager manager;

    @BeforeEach
    void setUp() {
    manager = new EmployeeManager();
    Map<Integer, Employee> employee1 = new HashMap<>();
    Employee employee = new Employee(1234,"Pierson","Tech Support",5.00);

}
@Test
    public void testGetEmployee () { 
        // Given
        Employee employee = new Employee(1234,"Pierson","Tech Support",5.00);
        // When
        manager.addEmployee(employee);

       // Then
       assertNotNull(employee.getId());
    }
    
@Test
    public void testUpdateEmployee () { 
        // Given
        Employee employee = new Employee(1234,"Pierson","Tech Support",5.00);
        // When
        manager.addEmployee(employee);
        manager.updateEmployee(employee);

        // Then
        assertEquals(1234,employee.getId());
        
    }

@Test

    public void testGetEmployeeCount() {
        // Given
        Employee employee1 = new Employee(1234,"Pierson","Tech Support",5.00);
        Employee employee2 = new Employee(2345,"George","President",10);
        // When
        manager.addEmployee(employee1);
        manager.addEmployee(employee2);
        
        // Then
        assertEquals(2,manager.getEmployeeCount());
    }

@Test
    public void testRemoveEmployee () { 
        // Given
        Employee employee = new Employee(1234,"Pierson","Tech Support",5.00);
        // When
        manager.addEmployee(employee);
        manager.removeEmployee(employee.getId());

        // Then
        assertEquals(1234,employee.getId());
        
    }
}