import static org.junit.jupiter.api.Assertions.assertEquals;

import com.codedifferently.lesson15.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

  Employee employee;

  @BeforeEach
  void beforeTest_makesEmployeeBeforeEachTest() {
    employee = new Employee(4, "Dasia", "Human Resources", 100000);
  }

  @Test
  void testgetId() {
    assertEquals(4, employee.getId());
  }

  @Test
  void testsetId_getsEmployeesNewId() {
    employee.setId(10);
    assertEquals(10, employee.getId());
  }

  @Test
  void testgetName() {
    assertEquals("Dasia", employee.getName());
  }

  @Test
  void testsetName_getsEmployeesNewName() {
    employee.setName("Destiny");
    assertEquals("Destiny", employee.getName());
  }

  @Test
  void testgetDapartment() {
    assertEquals("Human Resources", employee.getDepartment());
  }

  @Test
  void testsetDepartment_getsEmployeesNewDepartment() {
    employee.setDepartment("Human Resources");
    assertEquals("Human Resources", employee.getDepartment());
  }

  @Test
  void testgetSalary() {
    assertEquals(100000, employee.getSalary());
  }

  @Test
  void testsetSalary_getsEmployeesNewSalary() {
    employee.setSalary(100000);
    assertEquals(100000, employee.getSalary());
  }

  @Test
  public void testGetDetails_getEmployeesUniqueInformation() {
    assertEquals(
        "id 4 name Dasia department Human Resources salary 100000.0", employee.getDetails());
  }
}
