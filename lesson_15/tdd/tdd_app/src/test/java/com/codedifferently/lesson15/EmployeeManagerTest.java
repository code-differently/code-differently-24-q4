package test.java.com.codedifferently.lesson15;

import static org.junit.jupiter.api.Assertions.*;

import com.codedifferently.lesson15.Employee;
import com.codedifferently.lesson15.EmployeeManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeManagerTest {
  private EmployeeManager employeeManager;
  private Employee employee;

  @BeforeEach
  public void setUp() {
    employeeManager = new EmployeeManager();
    employee = new Employee(1, "Yafiah", "Engineering", 75000.0);
    employeeManager.addEmployee(employee);
  }

  @Test
  public void testAddEmployee() {
    assertEquals(1, employeeManager.getEmployeeCount());
  }

  @Test
  public void testGetEmployee() {
    assertEquals(employee, employeeManager.getEmployee(1));
  }

  @Test
  public void testUpdateEmployee() {
    Employee updatedEmployee = new Employee(1, "Yafiah", "Engineering", 80000.0);
    employeeManager.updateEmployee(updatedEmployee);
    assertEquals(80000.0, employeeManager.getEmployee(1).getSalary());
  }

  @Test
  public void testRemoveEmployee() {
    employeeManager.removeEmployee(1);
    assertEquals(0, employeeManager.getEmployeeCount());
  }

  @Test
  public void testGetEmployeeCount() {
    assertEquals(1, employeeManager.getEmployeeCount());
  }
}
