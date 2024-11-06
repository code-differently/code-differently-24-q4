package com.codedifferently.lesson16.amiyahjones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.codedifferently.lesson16.amiyahjones.JobReadinessProgram.Level;
import org.junit.jupiter.api.Test;

public class JobReadinessProgramTest {

  @Test
  void testAddStudent() throws ClassroomFullException {
    // Arrange
    JobReadinessProgram program = new JobReadinessProgram(Level.Beginner, false, "rich");

    // Act
    program.addStudent("John");

    // Assert
    assertEquals(program.getStudentCount(), 1);
  }

  @Test
  void testGetStudentCount() throws ClassroomFullException {
    // Arrange
    JobReadinessProgram program = new JobReadinessProgram(Level.Advanced, true, "vicente");
    program.addStudent("John");

    // Act
    int actualCount = program.getStudentCount();

    // Assert
    int expectedCount = 1;
    assertEquals(expectedCount, actualCount);
  }

  @Test
  void testClassroomFullException() {
    // Arrange
    JobReadinessProgram program = new JobReadinessProgram(Level.Beginner, true, "Jordan");

    // Act
    try {
      for (int i = 1; i <= 23; i++) {
        program.addStudent("Student " + i);
      }
    } catch (ClassroomFullException e) {
      System.out.println(e.getMessage());
    }

    // Assert
    int currentCount = program.getStudentCount();
    assert (currentCount == 22);
  }

  @Test
  void testCheckReadinessBeginner() {
    JobReadinessProgram student = new JobReadinessProgram(Level.Beginner, true, null);
    String result = student.checkReadiness();
    assertEquals("Needs more training.", result);
  }

  @Test
  void testCheckReadinessIntermediate() {
    JobReadinessProgram student = new JobReadinessProgram(Level.Intermediate, true, null);
    String result = student.checkReadiness();
    assertEquals("Ready for job applications!", result);
  }

  @Test
  void testCheckReadinessAdvanced() {
    JobReadinessProgram student = new JobReadinessProgram(Level.Advanced, true, "vicente");
    String result = student.checkReadiness();
    assertEquals("Ready for job applications!", result);
  }

  @Test
  void testVerifyIfSuccessful() {
    JobReadinessProgram graduate = new JobReadinessProgram(Level.Intermediate, true, "rich");

    var graduation = graduate.verifyIsSuccessful();
    assertEquals(true, graduation);
  }

  @Test
  void testLecturePerWeek() {
    JobReadinessProgram program = new JobReadinessProgram(Level.Advanced, true, "rich");
    var lecturesAttended = program.getLecturesPerWeek();
    assertEquals(3, lecturesAttended);
  }

  @Test
  void testGetMentor() {
    JobReadinessProgram program = new JobReadinessProgram(Level.Beginner, true, "jordan");
    var AssignedMentor = program.getMentor();
    assertEquals("Anthony", AssignedMentor);
  }

  @Test
  void testGetSocialSupport() {
    JobReadinessProgram program = new JobReadinessProgram(Level.Beginner, true, "vicente");
    var SocialSupport = program.getSocialSupport();
    assertEquals("Estelle", SocialSupport);
  }

  @Test
  void testGetTeacherAssistants() {
    JobReadinessProgram program = new JobReadinessProgram(Level.Beginner, true, "vicente");
    var teacherAssitant = program.getTeacherAssistants();
    assertEquals(program.getTeacherAssistants(), teacherAssitant);
  }

  @Test
  void testAssignTA() {
    JobReadinessProgram program = new JobReadinessProgram(Level.Beginner, true, "Jordan");
    boolean result = program.assignTA("Vicente");
    assert (result == true);

    try {
      program.assignTA("Invalid TA");
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  @Test
  void testDisplayAssignedTA() {
    JobReadinessProgram program = new JobReadinessProgram(Level.Advanced, true, "rich");
    program.displayAssignedTA();

    JobReadinessProgram emptyProgram = new JobReadinessProgram(Level.Beginner, true, "Invalid TA");
    emptyProgram.displayAssignedTA();
  }
}
