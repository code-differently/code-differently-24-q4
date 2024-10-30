import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.codedifferently.lesson15.Employee;
import com.codedifferently.lesson15.EmployeeManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeManagerTest {

  private EmployeeManager employeeManager;
  Employee employee;
  Employee employeeNew;

  @BeforeEach
  void beforeTest() {
    employee = new Employee(4, "Dasia", "HR", 100000);
    employeeManager = new EmployeeManager();
  }

  @Test
  void addEmployee() {
    employeeManager.addEmployee(employee);
    assertThat(employeeManager.getEmployee(employee.getId())).isEqualTo(employee);
  }

  @Test
  void removeEmployee() {
    employeeManager.addEmployee(employee);
    employeeManager.removeEmployee(employee.getId());
    assertEquals(0, employeeManager.getEmployeeCount());
  }

  @Test
  void testUpdateEmployee_replacesOutdatedInformation() {
    employeeManager.addEmployee(employee);
    employeeNew = new Employee(4, "Bri", "Makerting", 300000);
    employeeManager.updateEmployee(employeeNew);
    assertEquals(employeeNew, employeeManager.getEmployee(employee.getId()));
  }
}
