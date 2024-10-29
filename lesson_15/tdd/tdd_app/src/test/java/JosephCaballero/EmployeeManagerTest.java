import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.codedifferently.lesson15.Employee;
import com.codedifferently.lesson15.EmployeeManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeManagerTest {
  EmployeeManager employeeManager;
  Employee employee;
  Employee employee2;

  @BeforeEach
  void setUp() {
    employeeManager = new EmployeeManager();
  }

  @Test
  void testAddEmployee() {
    employee = new Employee(999, "Joseph", "Boxing", 150000000.5);
    employeeManager.addEmployee(employee);
    assertThat(employeeManager.getEmployeeCount()).isEqualTo(1);
  }

  @Test
  void testGetEmployee() {
    employee = new Employee(999, "Joseph", "Boxing", 150000000.5);
    employeeManager.addEmployee(employee);
    assertThat(employeeManager.getEmployee(999)).isEqualTo(employee);
  }

  @Test
  void testGetEmployee_failedDueToNull() throws RuntimeException {
    assertThatThrownBy(() -> employeeManager.getEmployee(9))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("Employee does not in collection with id 9");
  }

  @Test
  void testEmployeeUpdate() {
    employee = new Employee(999, "Joseph", "Boxing", 150000000.5);
    employeeManager.addEmployee(employee);
    employee2 = new Employee(99, "Angelica", "CodeDifferently", 900.55);
    employeeManager.addEmployee(employee2);
    employeeManager.updateEmployee(employee2);
    assertThat(employeeManager.getEmployeeCount()).isEqualTo(2);
  }

  @Test
  void testRemoveEmployee() throws RuntimeException {
    employee = new Employee(999, "Joseph", "Boxing", 150000000.5);
    employeeManager.addEmployee(employee);
    employeeManager.removeEmployee(999);
    assertThat(employeeManager.getEmployeeCount()).isEqualTo(0);
  }

  @Test
  void testRemoveEmployee_errorFromNullEmployeeId() throws RuntimeException {
    assertThatThrownBy(() -> employeeManager.removeEmployee(9))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("Employee does not in collection with id 9");
  }

  @Test
  void testGetEmployeeCount_whenOneEmployeeIsInTheMap() {
    employee = new Employee(999, "Joseph", "Boxing", 150000000.5);
    employeeManager.addEmployee(employee);
    assertThat(employeeManager.getEmployeeCount()).isEqualTo(1);
  }
}
