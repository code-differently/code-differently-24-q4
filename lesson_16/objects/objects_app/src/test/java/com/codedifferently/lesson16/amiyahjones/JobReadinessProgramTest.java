package com.codedifferently.lesson16.amiyahjones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.codedifferently.lesson16.amiyahjones.JobReadinessProgram.level;

public class JobReadinessProgramTest {

    @Test
    void testAddStudent() {
        //Arrange
        JobReadinessProgram program = new JobReadinessProgram(null);

        //Act
        program.addStudent("John");

        //Assert
        assertEquals(program.getStudentCount(), 1);
    }

    @Test
    void testGetStudentCount() {
        //Arrange
        JobReadinessProgram program = new JobReadinessProgram(null, true);
        program.addStudent("John");

        //Act
        int actualCount = program.getStudentCount();

        //Assert
        int expectedCount = 1;
        assertEquals(expectedCount, actualCount);
        
        
    }

    @Test 
    void testCheckReadinessBeginner() {
        JobReadinessProgram student = new JobReadinessProgram(level.advanced, true);
        String result = student.checkReadiness();
        assertEquals("Needs more training.", result);
    }

    @Test 
    void testCheckReadinessIntermediate() {
        JobReadinessProgram student = new JobReadinessProgram(level.intermediate, true);
        String result = student.checkReadiness();
        assertEquals("Ready for job applications!", result);
    }

    @Test 
    void testCheckReadinessAdvanced() {
        JobReadinessProgram student = new JobReadinessProgram(level.advanced, true);
        String result = student.checkReadiness();
        assertEquals("Ready for job applications!", result);
    }

    @Test
    void testVerifyIfSuccessful(){
         JobReadinessProgram graduate = new JobReadinessProgram(null, false);
         
         var graduation = graduate.verifyIsSuccessful();
         assertEquals(true, graduation);

    }

    @Test
    void testLecturePerWeek(){
       JobReadinessProgram program = new JobReadinessProgram(level.advanced, true);
       var lecturesAttended = program.lecturePerWeek();
       assertEquals(3, lecturesAttended);
    }
}
