import static org.junit.jupiter.api.Assertions.assertEquals;

import com.codedifferently.lesson15.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

  Employee employee;

  @BeforeEach
  void setUp() {
    employee = new Employee(15, "Pablo", "Emperor", 100);
  }

  @Test
  void testgetId() {
    assertEquals(15, employee.getId());
  }

  @Test
  void testsetId() {

    employee.setId(12);

    assertEquals(12, employee.getId());
  }

  @Test
  void testgetName() {
    assertEquals("Pablo", employee.getName());
  }

  @Test
  void testsetName() {
    employee.setName("John");

    assertEquals("John", employee.getName());
  }

  @Test
  void testgetDepartment() {
    assertEquals("Emperor", employee.getDepartment());
  }

  @Test
  void testsetDepartment() {
    employee.setDepartment("Monk");

    assertEquals("Monk", employee.getDepartment());
  }

  @Test
  void testgetSalary() {
    assertEquals(100, employee.getSalary());
  }

  @Test
  void testsetSalary() {
    employee.setSalary(1000000);

    assertEquals(1000000, employee.getSalary());
  }
}
