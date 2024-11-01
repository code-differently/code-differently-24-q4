package com.codedifferently.lesson16.amiyahjones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.codedifferently.lesson16.amiyahjones.JobReadinessProgram.Level;

public class JobReadinessProgramTest {

    @Test
    void testAddStudent() {
        //Arrange
        JobReadinessProgram program = new JobReadinessProgram(null, false, null);

        //Act
        program.addStudent("John");

        //Assert
        assertEquals(program.getStudentCount(), 1);
    }

    @Test
    void testGetStudentCount() {
        //Arrange
        JobReadinessProgram program = new JobReadinessProgram(null, true, null);
        program.addStudent("John");

        //Act
        int actualCount = program.getStudentCount();

        //Assert
        int expectedCount = 1;
        assertEquals(expectedCount, actualCount);
        
        
    }

    @Test 
    void testCheckReadinessBeginner() {
        JobReadinessProgram student = new JobReadinessProgram(Level.Advanced, true, null);
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
        JobReadinessProgram student = new JobReadinessProgram(Level.Advanced, true, null);
        String result = student.checkReadiness();
        assertEquals("Ready for job applications!", result);
    }

    @Test
    void testVerifyIfSuccessful() {
         JobReadinessProgram graduate = new JobReadinessProgram(null, false, null);
         
         var graduation = graduate.verifyIsSuccessful();
         assertEquals(true, graduation);

    }

    @Test
    void testLecturePerWeek() {
       JobReadinessProgram program = new JobReadinessProgram(Level.Advanced, true, null);
       var lecturesAttended = program.lecturePerWeek();
       assertEquals(3, lecturesAttended);
    }

    @Test 
    void testGetMentor() {
        JobReadinessProgram program = new JobReadinessProgram(Level.Beginner, true, null);
        var AssignedMentor = program.getMentor();
        assertEquals("Anthony", AssignedMentor);
    }

     @Test 
    void testGetSocialSupport() {
        JobReadinessProgram program = new JobReadinessProgram(Level.Beginner, true, null);
        var SocialSupport = program.getSocialSupport();
        assertEquals("Estelle", SocialSupport);
    }

    
}
