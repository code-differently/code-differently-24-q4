import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.codedifferently.lesson15.Employee;
import com.codedifferently.lesson15.EmployeeManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeManagerTest {
  private EmployeeManager cut;

  @BeforeEach
  public void setUp() {
    cut = new EmployeeManager();
    Employee employee1 = new Employee(10, "Jojo", "Sales", 22.12);
    cut.addEmployee(employee1);
  }

  @Test
  public void testAddEmployee() {
    // Arrange
    Employee employee = new Employee(2, "Washington", "Finance", 29.23);

    // Act
    cut.addEmployee(employee);

    // Assert
    int expectedId = 2;
    assertEquals(expectedId, cut.getEmployeeCount());
  }

  @Test
  public void testgetEmployee() {
    // Arrange
    Employee employee = new Employee(2, "Washington", "Finance", 29.23);

    // Act
    Employee returnedEmployee = cut.getEmployee(employee.getId());

    // Assert
    assertNull(returnedEmployee);
  }

  @Test
  public void testRemoveEmployee() {
    // Arrange
    Employee employee = new Employee(3, "Belvedere", "Finance", 100.1);

    // Act
    cut.removeEmployee(employee.getId());

    // Assert
    int removedId = 3;
    assertNull(cut.getEmployee(removedId));
  }

  @Test
  public void testUpdateEmployee() {
    // Arrange
    Employee employee = new Employee(5, "John", "Safety", 50);

    // Act
    cut.updateEmployee(employee);

    // Assert
    int expectedId = 5;
    assertEquals(expectedId, employee.getId());
  }
}
