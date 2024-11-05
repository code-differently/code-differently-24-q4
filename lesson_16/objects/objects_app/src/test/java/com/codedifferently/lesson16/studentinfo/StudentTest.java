package com.codedifferently.lesson16.studentinfo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentTest {
  private Student classUnderTest;

  @BeforeEach
  public void setUp() {
    List<String> phoneNumbers = new ArrayList<>();
    phoneNumbers.add("302-999-2222");
    phoneNumbers.add("302-211-2222");
    phoneNumbers.add("302-212-7777");
    classUnderTest =
        new Student(
            612453698l,
            "John Doe",
            Department.Finance,
            "johndoe@gmail.com",
            phoneNumbers,
            LocalDate.of(2022, 12, 25));
  }

  @Test
  void testGetEmailAddress() {
    // Arrange
    classUnderTest.setEmailAddress("johndoe@gmail.com");

    // Act
    String expectedEmailAddress = classUnderTest.getEmailAddress();

    // Assert
    String actualEmailAddress = "johndoe@gmail.com";
    assertEquals(expectedEmailAddress, actualEmailAddress);
  }

  @Test
  void testGetStudentNumber() {
    // Arrange
    classUnderTest.setStudentNumber(612453698l);

    // Act
    long expectedStudentNumber = classUnderTest.getStudentNumber();

    // Assert
    long actualStudentNumber = 612453698l;
    assertEquals(expectedStudentNumber, actualStudentNumber);
  }

  @Test
  void testGetStudentFullName() {
    // Arrange
    classUnderTest.setFullName("John Doe");

    // Act
    String expectedStudentName = classUnderTest.getFullName();

    // Assert
    String actualStudentName = "John Doe";
    assertEquals(expectedStudentName, actualStudentName);
  }

  @Test
  void testGetDepartment() {
    // Arrange
    classUnderTest.setDepartment(Department.Administration);

    // Act
    Department expectedDepartment = classUnderTest.getDepartment();

    // Assert
    Department actualDepartment = Department.Administration;
    assertEquals(expectedDepartment, actualDepartment);
  }

  @Test
  void testGetDateOfBirth() {
    // Arrange
    LocalDate date = LocalDate.of(2021, 9, 12);
    classUnderTest.setDateOfBirth(date);

    // Act
    LocalDate expectedDate = classUnderTest.getDateOfBirth();

    // Assert
    LocalDate actualDate = date;
    assertEquals(expectedDate, actualDate);
  }

  @Test
  void testToString() {
    // Arrange

    Student student =
        new Student(
            612453698l,
            "John Doe",
            Department.Finance,
            "johndoe@gmail.com",
            null,
            LocalDate.of(2022, 12, 25));
    // Act
    String expectedResult = classUnderTest.toString();

    // Assert
    assertNotNull(expectedResult);
  }
}
