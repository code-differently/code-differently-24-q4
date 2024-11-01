package com.codedifferently.lesson16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DayActionsTest {

  @Test
  void testInBed() {
    // Arrange
    var dayActions = new DayActions();

    // Act
    boolean isInBed = dayActions.isInBed();

    // Assert
    assertEquals(true, isInBed);
  }

  @Test
  void testShowered() {
    // Arrange
    var dayActions = new DayActions();

    // Act
    boolean hasShowered = dayActions.hasShowered();

    // Assert
    assertEquals(true, hasShowered);
  }

  @Test
  void testUniformNeeded() {
    // Arrange
    var dayActions = new DayActions();

    // Act
    boolean needsUniform = dayActions.needsUniform();

    // Assert
    assertEquals(true, needsUniform);
  }

  @Test
  void testPackLunch() {
    // Arrange
    var dayActions = new DayActions();

    // Act
    boolean needsLunch = dayActions.needsLunch();

    // Assert
    assertEquals(false, needsLunch);
  }

  @Test
  void needLunchMoney() {
    // Arrange
    var dayActions = new DayActions();
    DayActions.addDay(1, "Paige Blue", false, true, true, true, false, 5);

    // Act
    if (dayActions.lunchMoney() < 1) {

      // Assert
      assertEquals(0, dayActions.lunchMoney());
    }
  }
}
