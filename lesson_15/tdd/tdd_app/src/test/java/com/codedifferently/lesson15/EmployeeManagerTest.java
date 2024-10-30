package com.codedifferently.lesson15;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeManagerTest {
    private EmployeeManager employeeManager;
    Employee employee1;
    private int count;

    @BeforeEach
    public void setup() {
        Employee employee1 = new Employee(1, "Nile", "SWE", 65000.00);
        Employee employee2 = new Employee(2, "Chino", "Marketing", 70000.00);
        employeeManager = new EmployeeManager();
    }

    @Test
    public void testEmployeeManagement() {
    }
        // Create Employee objects
        
        @Test
        public void addEmployee() { // Use addEmployee to add employees
        employeeManager.addEmployee(employee1);
        employeeManager.addEmployee(employee2);
        }

        @Test// Invoke getEmployeeCount
        public void getEmployee() {
        int count = employeeManager.getEmployeeCount();
        assertThat(count).isEqualTo(2); 
        

    
         
        Employee retrievedEmployee = employeeManager.getEmployee(1);
        assertThat(retrievedEmployee.getName()).isEqualTo("Nile");
        }

        @Test
        public void updateEmployee() {
        employee1.setSalary(70000.00); 
        employeeManager.updateEmployee(employee1);

    
        Employee updatedEmployee = employeeManager.getEmployee(1);
        assertThat(updatedEmployee.getSalary()).isEqualTo(70000.00); 
        }

        @Test
        public void getEmployeeCount() {
        employeeManager.removeEmployee(2);
        count = employeeManager.getEmployeeCount();
        }
        
         
        @Test
        public void getEmployees() {
        assertThat(count).isEqualTo(1); 

        
        Map<Integer, Employee> employeeMap = employeeManager.getEmployees();
        assertThat(employeeMap.size()).isEqualTo(1);
        } 

        @Test 
        public void setEmployees() {
        Map<Integer, Employee> newEmployees = new HashMap<>();
        newEmployees.put(3, new Employee(3, "Charlie", "HR", 75000.00));
        employeeManager.setEmployees(newEmployees);
        

        
        assertThat(employeeManager.getEmployees().size()).isEqualTo(1); 
    }
    @Test
    public void testGetDetails() {
     String actualDetails = employee1.getDetails();
        String expectedDetails = "id: 7 name: Nile department: SWE salary: 65000.0";
        assertEquals(expectedDetails, actualDetails);

    }
}
        
       