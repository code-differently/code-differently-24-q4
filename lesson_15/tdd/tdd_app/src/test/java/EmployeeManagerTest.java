import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.codedifferently.lesson15.Employee;
import com.codedifferently.lesson15.EmployeeManager;

public class EmployeeManagerTest {

  EmployeeManager employeeManager;
  Employee employee;
  Employee employee2;

  @BeforeEach
  public void setUp() {
    employeeManager = new EmployeeManager();
    employee = new Employee(0, "Zion", "Code Differently", 0);
  }

  @Test
  public void testAddEmployee() {
    employeeManager.addEmployee(employee);
    assertEquals(1, employeeManager.getEmployeeCount());
  }

  @Test
  public void testGetEmployee() {
    employeeManager.addEmployee(employee);
    assertEquals(employeeManager.getEmployee(employee.getId()), employee);
  }

  @Test
  public void testupdateEmployee() {
    employeeManager.addEmployee(employee);
    employee2 = new Employee(0, "Andre", "JP Morgan", 0);
    employeeManager.updateEmployee(employee2);
    assertEquals(employeeManager.getEmployee(employee2.getId()), employee2);
  }

  @Test
  public void testSetName() {
    employee.setName("Zion");
    assertEquals(employee.getName(), "Zion");
  }

  @Test
  public void testGetDepartment() {
    employee.getDepartment();
    assertEquals(employee.getDepartment(), "Code Differently");
  }

  @Test
  public void testSetDepartment() {
    employee.setDepartment("Code Differently");
    assertEquals(employee.getDepartment(), "Code Differently");
  }

  @Test
  public void testGetDetails() {
    assertEquals(employee.getDetails(), "Id 0 Name: Zion department Code Differently0.0 salary");
  }

    @Test
  public void testRemoveEmployee(){
    // Setup
    var id=0;

    // Execute
    employeeManager.addEmployee(employee);
    employeeManager.removeEmployee(id);

    // Assert
    assertThatThrownBy(() -> employeeManager.getEmployee(id))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("Employee does not in collection with id " + id);
  }
}
