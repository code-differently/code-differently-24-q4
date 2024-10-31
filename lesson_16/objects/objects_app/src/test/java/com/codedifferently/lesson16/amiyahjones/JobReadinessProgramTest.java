package com.codedifferently.lesson16.amiyahjones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class JobReadinessProgramTest {

    @Test
    void testAddStudent() {
        //Arrange
        JobReadinessProgram program = new JobReadinessProgram();

        //Act
        program.addStudent("John");

        //Assert
        assertEquals(program.getStudentCount(), 1);
    }

    @Test
    void testGetStudentCount() {
        //Arrange
        JobReadinessProgram program = new JobReadinessProgram();
        program.addStudent("John");

        //Act
        int actualCount = program.getStudentCount();

        //Assert
        int expectedCount = 1;
        assertEquals(expectedCount, actualCount);
        
        
    }

    @Test 
    void testCheckReadinessBeginner() {
        JobReadinessProgram student = new JobReadinessProgram(level.BEGINNER);
        String result = student.checkReadiness();
        assertEquals("Needs more training.", result);
    }

    @Test 
    void testCheckReadinessIntermediate() {
        JobReadinessProgram student = new JobReadinessProgram(level.INTERMEDIATE);
        String result = student.checkReadiness();
        assertEquals("Ready for job applications!", result);
    }

    @Test 
    void testCheckReadinessAdvanced() {

    }
    
}
