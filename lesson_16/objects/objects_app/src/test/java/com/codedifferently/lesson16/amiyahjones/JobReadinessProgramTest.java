package com.codedifferently.lesson16.amiyahjones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

 
    
}
