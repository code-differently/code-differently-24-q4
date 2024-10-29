package com.codedifferently.lesson15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
         Employee employee = new Employee(1, "John Doe", null, 0);
        
        //Act
        employeeManager.addEmployee(employee);
        Employee retrievedEmployee = employeeManager.getEmployee(1);

        //Assert
        assertEquals(employee.getId(), retrievedEmployee.getId());
        assertEquals(employee.getName(), retrievedEmployee.getName());

    }

    @Test
    void testRemoveEmployee() {
       
        Employee employee = new Employee(1, "John Doe", null, 0);
    
        employeeManager.addEmployee(employee);
        assertEquals(1, employeeManager.getEmployeeCount());

        employeeManager.removeEmployee(1);       
        assertEquals(0, employeeManager.getEmployeeCount());
        
    }

    @Test
    void testGetEmployeeCount() {

        assertEquals(0, employeeManager.getEmployeeCount());

        employeeManager.addEmployee(new Employee(1, "John Doe", null, 0));
        employeeManager.addEmployee(new Employee(2, "Jane Doe", null, 0));
        
        assertEquals(2, employeeManager.getEmployeeCount());
    } 
    
    @Test
    void testGetEmployeeThrowsExceptionForNonExistentId() {
        assertThrows(IllegalArgumentException.class, () -> {
            employeeManager.getEmployee(999);
        });
    }

    @Test
    void testUpdateEmployeeThrowsExceptionForNonExistentId() {
        Employee employee = new Employee(1, "John Doe", null, 0);
        assertThrows(IllegalArgumentException.class, () -> {
            employeeManager.updateEmployee(employee);
        });
    }

    @Test
    void testRemoveEmployeeThrowsExceptionForNonExistentId() {
        assertThrows(IllegalArgumentException.class, () -> {
            employeeManager.removeEmployee(999);
        });
    }
}
