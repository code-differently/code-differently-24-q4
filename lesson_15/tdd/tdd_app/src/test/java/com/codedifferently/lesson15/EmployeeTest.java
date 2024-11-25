import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

  Employee employee;

  @BeforeEach
  void setUp() {
    employee = new Employee(9, "joseph", "Boxing", 1000000.5);
  }

  @Test
  void testGetId() {
    assertThat(employee.getId()).isEqualTo(9);
  }

  @Test
  void testSetId_testingIfNumberOneWorks() {
    employee.setId(1);
    assertThat(employee.getId()).isEqualTo(1);
  }

  @Test
  void testGetName() {
    assertThat(employee.getName()).isEqualTo("joseph");
  }

  @Test
  void testSetName_testingIfPabloWorks() {
    employee.setName("Pablo");
    assertThat(employee.getName()).isEqualTo("Pablo");
  }

  @Test
  void testGetDepartment() {
    assertThat(employee.getDepartment()).isEqualTo("Boxing");
  }

  @Test
  void testSetDepartment_testingSettingDepartmentToHome() {
    employee.setDepartment("Home");
    assertThat(employee.getDepartment()).isEqualTo("Home");
  }

  @Test
  void testGetSalary() {
    assertThat(employee.getSalary()).isEqualTo(1000000.5);
  }

  @Test
  void testSetSalary_salaryToTwoMillionAndFiveCents() {
    employee.setSalary(2000000.5);
    assertThat(employee.getSalary()).isEqualTo(2000000.5);
  }

  @Test
  void testGetDetails_testsIfWeGetSpecificDetails() {
    assertThat(employee.getDetails())
        .isEqualTo("Employee: 9 joseph Department: Boxing Salary: 1000000.5");
  }
}