package com.codedifferently.lesson15;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import com.codedifferently.lesson14.ecommerce.EcommerceSystem;

public class EmployeeTest {

    EmployeeTest employeeTest;

    @BeforeEach
  void setUp() {
    employeeTest = new EmployeeTest();
  }

    @Test
    public void getIdTest() {
        // test if id matches set id
    
        Id idObject = new Id(57);
        
        int expectedId = idObject.getId();

        assertThat(expectedId).isEqualTo(57);
    }

    @Test
    public void setIdTest() {
        // tests if changed id matches new id
        employeeTest.setId();
    }

    @Test
    public void getNameTest() {
        // tests if changed name matches name
        employeeTest.getName();
    }

    @Test
    public void setNameTest() {
        // tests if changed id matches new id
        employeeTest.setName();
    }

    @Test
    public void getDepartmentTest() {
        employeeTest.getDepartment();
    }

    @Test
    public void setDepartmentTest() {
        employeeTest.setDepartment();
    }

    @Test
    public void getSalaryTest() {
        employeeTest.getSalary();
    }

    @Test
    public void setSalaryTest() {
        employeeTest.setSalary();
    }

    private void getId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

