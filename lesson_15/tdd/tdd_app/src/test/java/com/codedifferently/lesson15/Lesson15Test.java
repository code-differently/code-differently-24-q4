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
  public void employeeManagerAddEmployee(){
    Employee employee = new Employee(0, null, null, 0);
    EmployeeManager manager = new EmployeeManager();
    manager.addEmployee(employee);

    assertEquals(employee, manager.getEmployee(0));
  }

  @Test
  public void employeeManagerRemoveEmployee(){
    Employee employee = new Employee(0, null, null, 0);
    EmployeeManager manager = new EmployeeManager();
    manager.addEmployee(employee);

    manager.removeEmployee(0);

    assertEquals(0, manager.getEmployeeCount());
  }


  @Test
  public void employeeManagerUpdateEmployee(){
    Employee employee = new Employee(0, null, null, 0);
    Employee employee2 = new Employee(0, "test", "dept", 0);
    EmployeeManager manager = new EmployeeManager();
    manager.addEmployee(employee);

    manager.updateEmployee(employee2);

    assertEquals("ID: 0, Name: test, Department: dept, Salary: 0.0", manager.getEmployee(0).getDetails());

  }


  @Test
  public void getEmployeeDepartment(){
    Employee employee = new Employee(0, null, "fryCook", 0);

    assertEquals("fryCook", employee.getDepartment());
  }

  @Test
  public void getEmployeeSalary(){
    Employee employee = new Employee(0, null, "fryCook", 999_999);

    assertEquals(999_999, employee.getSalary());

  }

  @Test
  public void getEmployeeName(){
    Employee employee = new Employee(0, "James Bartholomew the III", "fryCook", 999_999);
    assertEquals("James Bartholomew the III", employee.getName());

  }


  @Test
  public void getEmployeeDetails(){
    Employee employee = new Employee(0, "James Bartholomew the III", "fryCook", 999_999);
    assertEquals("ID: 0, Name: James Bartholomew the III, Department: fryCook, Salary: 999999.0", employee.getDetails());
  }
}
