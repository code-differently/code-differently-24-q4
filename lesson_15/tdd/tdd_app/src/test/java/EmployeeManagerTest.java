import static org.junit.jupiter.api.Assertions.assertEquals;

import com.codedifferently.lesson15.Employee;
import com.codedifferently.lesson15.EmployeeManager;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeManagerTest {
  Employee employee;
  EmployeeManager employeeManager;
  Map<Integer, Employee> employees;
  Employee employeeNew;

  @BeforeEach
  void setUp() {
    employee = new Employee(15, "Pablo", "Emperor", 100);
    employeeManager = new EmployeeManager();
    employees = new HashMap<>();
  }

  @Test
  void testAddEmployee() {
    // Arrange
    employees.put(employee.getId(), employee);

    // Act
    employeeManager.addEmployee(employee);

    // Assert
    assertEquals(employees.get(employee.getId()), employeeManager.getEmployee(employee.getId()));
  }

  @Test
  void testGetEmployee() {
    employees.put(employee.getId(), employee);
    assertEquals(employee, employees.get(employee.getId()));
  }

  @Test
  void testUpdateEmployee() {
    employees.put(employee.getId(), employee);
    employeeNew = new Employee(15, "Paul", "President", 200);
    employees.put(employeeNew.getId(), employeeNew);
    employeeManager.addEmployee(employee);
    employeeManager.updateEmployee(employeeNew);
    assertEquals(
        employeeManager.getEmployee(employeeNew.getId()), employees.get(employeeNew.getId()));
  }

  @Test
  void testRemoveEmployee() {}

  @Test
  void testAssertEmployeeInCollection() {}

  @Test
  void testGetEmployeeCount() {}
}
