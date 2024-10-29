package com.codedifferently.lesson15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




class Lesson15Test {

  private EmployeeManager manager;
  private Employee emp;

  @BeforeEach
  public void conStant() {
    manager = new EmployeeManager();
     emp = new Employee(1, "Kimberlee Haldane", null, 0);
  }
  
  @Test
   public void testAddEmployee() {
   // Act
   manager.addEmployee(emp);
    // Assert
    assertEquals(1, manager.getEmployeeCount()); 
    assertEquals(emp, manager.getEmployee(1)); 
    }

}

