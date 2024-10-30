package com.codedifferently.lesson15;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Lesson15Test {

  @Test
  public void testLesson15() {
    assertThat(new Lesson15()).isNotNull();
  }

  @Test
  public void testGetGreeting() {
    // Act
    Lesson15.main(null);
  }

  @Test
  public void testEmployeeId_Exists(){
    Employee employee = new Employee(0, null, null, 0);
    assertEquals(0, employee.getId());
  }

  @Test
  public void testEmployeeName_Exists(){
    Employee employee = new Employee(0, "dave", null, 0);
    assertEquals("dave", employee.getName());
  }
@Test
  public void testEmployeeDepartment_Exists(){
    Employee employee = new Employee(0, "dave", "IT", 0);
    assertEquals("IT", employee.getDepartment());
  }
  @Test
  public void testEmployeeSalary_Exists(){
    Employee employee = new Employee(0, "dave", "IT", 10000);
    assertEquals(10000, employee.getSalary());
  }
  @Test
  public void testGetEmployee(){
    Employee employee = new Employee(10, null, null, 0);
    EmployeeManager manager = new EmployeeManager();
    manager.addEmployee(employee);
    assertEquals(employee, manager.getEmployee(10));
  }
  @Test
  public void testGetEmployeeCount(){
    Employee employee = new Employee(10, null, null, 0);
    EmployeeManager manager = new EmployeeManager();
    manager.addEmployee(employee);
    assertEquals(1, manager.getEmployeeCount());
}
 @Test
  public void testGetEmployeeUpate(){
    Employee employee2 = new Employee(10, "BillyBobJenkins", null, 0);
    Employee employee = new Employee(10, "Dave", null, 0);
    EmployeeManager manager = new EmployeeManager();
    manager.addEmployee(employee);
    manager.updateEmployee(employee2);

    assertEquals(employee2, manager.getEmployee(10));
}
@Test
  public void testGetEmployeeRemove(){
    Employee employee2 = new Employee(10, "BillyBobJenkins", null, 0);
    Employee employee = new Employee(11, "Dave", null, 0);
    EmployeeManager manager = new EmployeeManager();
    manager.addEmployee(employee);
    manager.addEmployee(employee2);
    manager.removeEmployee(10);

    assertEquals(1, manager.getEmployeeCount());
}
  @Test
  public void testGetDetails(){
    Employee employee2 = new Employee(10, "BillyBobJenkins", "IT", 10);
    assertEquals("ID: 10, Name: BillyBobJenkins, Department: IT, Salary: 10.0", employee2.getDetails());

  }
}