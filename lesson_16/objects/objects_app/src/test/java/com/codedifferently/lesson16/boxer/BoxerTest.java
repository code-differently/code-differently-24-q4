package com.codedifferently.lesson16.boxer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.codedifferently.lesson16.boxer.Boxer.BoxerHasNoFightsException;
import com.codedifferently.lesson16.boxer.Boxer.BoxerIsRetiredException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoxerTest {

  Boxer boxer;

  @BeforeEach
  void setUp() {
    boxer = new Boxer("Joseph", 100, 100);
  }

  @Test
  void testWorkout() {
    boxer.workout(10);
    assertEquals(110, boxer.getPower());
  }

  @Test
  void testRest() {
    int previousHealth = boxer.getHealth();
    boxer.rest();
    assertNotEquals(boxer.getHealth(), previousHealth);
  }

  @Test
  void testGetHealth() {
    assertEquals(100, boxer.getHealth());
  }

  @Test
  void testGetFightHistory() throws BoxerHasNoFightsException, BoxerIsRetiredException {
    Boxer mike = new Boxer("mike", 1000, 1000);
    boxer.bout(mike);
    assertEquals("You fought " + mike.getName() + " L", boxer.getFights());
  }

  @Test
  void testIsAbleToFight_boxerIsNotRetiredOrInjured() {
    assertEquals(true, boxer.getAbleToFight());
  }

  @Test
  void testIsAbleToFight_boxerIsNotAbleToFight() throws BoxerIsRetiredException {
    boxer.retire();
    assertEquals(false, boxer.getAbleToFight());
  }

  @Test
  void testBout_makingNewBoxerToFightAnother() throws BoxerIsRetiredException {
    Boxer mike = new Boxer("Mike", 1000, 1000);
    boxer.bout(mike);
    assertEquals(false, boxer.getAbleToFight());
  }

  @Test
  void testGetFightHistory_noFights() {
    assertEquals(boxer.getHealth(), 100);
  }

  @Test
  void testRollSkillSet() {
    boxer.rollSkillSet();
    assertNotEquals(boxer.getStyle(), "BASIC");
  }
}
