import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.codedifferently.lesson15.Employee;
import com.codedifferently.lesson15.EmployeeManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeManagerTest {
  EmployeeManager employeeManager;
  Employee employee;

  @BeforeEach
  void setUp() {
    employeeManager = new EmployeeManager();
    employee = new Employee(999, "Joseph", "Boxing", 150000000.5);
    employeeManager.addEmployee(employee);
  }

  @Test
  void testAddEmployee() {
    assertThat(employeeManager.getEmployee(999)).isEqualTo(employee);
  }

  @Test
  void testGetEmployee() {
    assertThat(employeeManager.getEmployee(999)).isEqualTo(employee);
  }

  @Test
  void testGetEmployee_failedDueToNull() throws RuntimeException {
    assertThatThrownBy(() -> employeeManager.getEmployee(9))
        .isInstanceOf(NullPointerException.class)
        .hasMessage("Employee with id 9 not found");
  }

  @Test
  void testEmployeeUpdate() {
    Employee employee2 = new Employee(99, "Angelica", "CodeDifferently", 900.55);
    employeeManager.addEmployee(employee2);
    employeeManager.updateEmployee(employee2);
    assertThat(employeeManager.getEmployeeCount()).isEqualTo(2);
  }

  @Test
  void testRemoveEmployee() throws RuntimeException {
    employeeManager.removeEmployee(999);
    assertThat(employeeManager.getEmployeeCount()).isEqualTo(0);
  }

  @Test
  void testRemoveEmployee_errorFromNullEmployeeId() throws RuntimeException {
    assertThatThrownBy(() -> employeeManager.removeEmployee(9))
        .isInstanceOf(NullPointerException.class)
        .hasMessage("Employee with id 9 not found");
  }

  @Test
  void testGetEmployeeCount_whenNoEmployeesAreInMap() {
    employeeManager.removeEmployee(999);
    assertThat(employeeManager.getEmployeeCount()).isEqualTo(0);
  }

  @Test
  void testGetEmployeeCount_whenOneEmployeeIsInTheMap() {
    assertThat(employeeManager.getEmployeeCount()).isEqualTo(1);
  }
}
