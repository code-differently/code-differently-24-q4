package com.codedifferently.lesson16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FamilyTest {

  @Test
  void testFamily_isOver12YO() {
    // Arrange
    var family = new Family();
    family.addPerson(2, 1, "Chase Blue", 12);

    // Act
    boolean hasA12YO = family.hasA12YO();

    // Assert
    assertEquals(true, hasA12YO);
  }

  @Test
  void testFamily_hasDivThree() {
    // Arrange
    var family = new Family();
    family.addPerson(5, 3, "Brysen Thompson", 4);

    // Act
    boolean hasADivThree = family.hasADivThree();

    // Assert
    assertEquals(true, hasADivThree);
  }

  @Test
  void testFamiy_hasSixKids() {
    // int i = 0;

    var family = new Family();

    // Arrange
    family.addPerson(1, 1, "Paige Blue", 15);
    family.addPerson(6, 3, "Carter Thompson", 1);
    family.addPerson(3, 2, "Abigal Thompson", 10);
    family.addPerson(4, 2, "Christian Thompson", 9);

    // Act
    // boolean addPerson(id) == 6;

    // Assert
    assertEquals(true, family.hasSixKids());
  }
}
