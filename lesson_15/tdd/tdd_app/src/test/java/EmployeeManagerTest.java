import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.codedifferently.lesson15.Employee;
import com.codedifferently.lesson15.EmployeeManager;

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
    employees.put(employee.getId(), employee);

    employeeManager.addEmployee(employee);

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
  void testRemoveEmployee() {
    employees.put(employee.getId(), employee);
    
    employees.remove(employee.getId(), employee);
    
    employeeManager.addEmployee(employee);
    
    employeeManager.removeEmployee(employee.getId());
    
    assertEquals(0, employeeManager.getEmployeeCount());
  }

  @Test
  void testAssertEmployeeInCollection() throws IllegalArgumentException {
    
  }

  @Test
  void testGetEmployeeCount() {
    employees.put(employee.getId(), employee);
    
    employeeNew = new Employee(16, "Paul", "President", 200);
    
    employees.put(employeeNew.getId(), employeeNew);
    
    employeeManager.addEmployee(employee);
    
    employeeManager.addEmployee(employeeNew);
    
    assertEquals(2, employeeManager.getEmployeeCount());
  }
}
