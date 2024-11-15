package com.codedifferently.lesson16.gumball;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GumballMachineTest {
  GumBallMachine testGumBallMachine;

  @BeforeEach
  void setUp() {
    testGumBallMachine = new GumBallMachine(10, false); // Initialize with 10 gumballs
  }

  @Test
  void testGumBallCount_afterDispense() throws invalidCoinInsertedException {
    int initialCount = testGumBallMachine.dispenseGumBallCount();
    testGumBallMachine.dispenseGumBall(0.25); // Dispense a gumball
    assertEquals(initialCount - 1, testGumBallMachine.dispenseGumBallCount());
  }

  @Test
  void testSetRandomColor() {
    Colors previousColor = testGumBallMachine.getCurrentColor();
    Colors newColor = previousColor;
    int attempts = 0;
    int maxAttempts = 10; // Set a limit for attempts

    // Try to change the color until it is different or max attempts reached
    while (newColor.equals(previousColor) && attempts < maxAttempts) {
      testGumBallMachine.setRandomColors(); // Set a new random color
      newColor = testGumBallMachine.getCurrentColor();
      attempts++;
    }

    assertNotEquals(
        previousColor, newColor, "The color should have changed after multiple attempts");
  }

  
  @Test
  void testGetGumBall_whenMachineIsEmpty() throws invalidCoinInsertedException {
    for (int i = 0; i < 10; i++) {
      testGumBallMachine.dispenseGumBall(0.25); // Dispense all gumballs
    }
    assertThrows(
        invalidCoinInsertedException.class,
        () -> {
          testGumBallMachine.dispenseGumBall(0.25); // Try to dispense from an empty machine
        });
  }

  @Test
  void testGetGumBall_InvalidCoin() {
    assertThrows(
        invalidCoinInsertedException.class,
        () -> {
          testGumBallMachine.dispenseGumBall(0.01); // Try to insert an invalid coin
        });
  }

  @Test
  void testGumBallMachineIsBroken() {
    testGumBallMachine.breakMachine();
    assertTrue(testGumBallMachine.isBroken());
  }
}
