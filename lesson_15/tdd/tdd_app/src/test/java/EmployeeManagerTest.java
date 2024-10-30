import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.codedifferently.lesson15.Employee;
import com.codedifferently.lesson15.EmployeeManager;

public class EmployeeManagerTest {
  Employee employee;
  EmployeeManager employeeManager;
  Employee employeeNew;

  @BeforeEach
  void setUp() {
    employee = new Employee(15, "Pablo", "Emperor", 100);
    employeeManager = new EmployeeManager();
  }

  @Test
  void testAddEmployee() {
    employeeManager.addEmployee(employee);

    assertEquals(1, employeeManager.getEmployeeCount());
  }

  @Test
  void testGetEmployee() {
    employeeManager.addEmployee(employee);

    assertEquals(employee, employeeManager.getEmployee(employee.getId()));
  }

  @Test
  void testUpdateEmployee() {
    employeeNew = new Employee(15, "Paul", "President", 200);

    employeeManager.addEmployee(employee);

    employeeManager.updateEmployee(employeeNew);

    assertEquals(employeeManager.getEmployee(employeeNew.getId()), employeeNew);
  }

  @Test
  void testRemoveEmployee() {
    employeeManager.addEmployee(employee);

    employeeManager.removeEmployee(employee.getId());

    assertEquals(0, employeeManager.getEmployeeCount());
  }

  @Test
  void testGetEmployeeCount() {
    employeeNew = new Employee(16, "Paul", "President", 200);

    employeeManager.addEmployee(employee);

    employeeManager.addEmployee(employeeNew);

    assertEquals(2, employeeManager.getEmployeeCount());
  }
}
