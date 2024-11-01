package com.codedifferently.lesson16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class GumballMachineTest {
  GumBallMachine testGumBallMachine(20, );

  @Test
  void testGumballMachineCount() {
//arrange
    testGumBallMachine = new gumballMachine();
    //act
    testGumballMachine.removeGumball();
    //assert
    assertNotEquals(GumballmachineCount.getGumballCount(),testGumballMachine);
    }

    @Test
    void testGetGumBall() {
        // Arrange
        var  quater = 0.25;
        var previousGumBallCount = gumBallMachine.getGumBallCount();
        // Act
        gumballmachine.getGumBall(quater);

        // Assert
        assertNotEquals(gumballmachine.getGumBallCount(),previousGumBallCount);
    }
       @Test
        testGumballMachineIsEmpty_whenEmpty() {
        // Arrange
        

        // Act
        testGumballMachine.getGumBall(threedollars); 

        // Assert
        assertEquals("No more gum! Refill.", testGumballMachine.IsEmpty());
    }
        @Test 
        testGetGumBall_InvalidCoinPenny() {
    
        assertThrows (invalidCoinInsertedException.class,()->{
            testGumBallMachine.getGumBall(0.01);
        });
    }
        @Test
        testGumBallMachineIsBroken(){
            testGumBallMachine.IsBroken();
            assertFalse(testGumBallMachine.IsBroken);
        }
}
 