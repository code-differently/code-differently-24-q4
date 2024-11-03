package com.codedifferently.lesson16.boxer;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.codedifferently.lesson16.boxer.Boxer.BoxerHasNoFightsException;
import com.codedifferently.lesson16.boxer.Boxer.BoxerIsRetiredException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoxerTest {

  Boxer boxer;

  @BeforeEach
  void setUp() {
    boxer = new Boxer("Joseph", 99, 99);
  }

  @Test
  void testWorkout_addingTenPointsOfPower() {
    boxer.workout(10);
    assertEquals(109, boxer.getPower());
  }

  @Test
  void testRest_restingToIncreaseHealth() {
    int previousHealth = boxer.getHealth();
    boxer.rest();
    assertNotEquals(boxer.getHealth(), previousHealth);
  }

  @Test
  void testGetFightHistory_makingAFighterToHaveABout()
      throws BoxerHasNoFightsException, BoxerIsRetiredException {
    Boxer mike = new Boxer("mike", 1000, 1000);
    boxer.bout(mike);
    assertEquals("fought: " + mike.getName() + " L.", boxer.getFights());
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
  void testBout_makingNewBoxerToFightAnotherAndSeeTheResults() throws BoxerIsRetiredException {
    Boxer mike = new Boxer("Mike", 1000, 1000);
    boxer.bout(mike);
    assertEquals(false, boxer.getAbleToFight());
  }

  @Test
  void testBout_makingNewBoxerToFightAndDraw()
      throws BoxerIsRetiredException, BoxerHasNoFightsException {
    Boxer ryan = new Boxer("Ryan Garcia", 99, 99);
    boxer.bout(ryan);
    assertEquals(boxer.getFights(), "fought: Ryan Garcia D.");
  }

  @Test
  void testBout_makingNewBoxerToWinAgainstWithBoxer()
      throws BoxerIsRetiredException, BoxerHasNoFightsException {
    Boxer hitman = new Boxer("Thomas Hearns", 98, 98);
    boxer.bout(hitman);
    assertEquals(boxer.getFights(), "fought: " + hitman.getName() + " W.");
  }

  @Test
  void testGetHealth() {
    assertEquals(boxer.getHealth(), 99);
  }

  @Test
  void testRollSkillSet_testingBasicIsNotWhatIsRolled() {
    boxer.rollSkillSet();
    assertNotEquals(boxer.getSkillSet(), "BASIC");
  }

  @Test
  void testAddFights() throws BoxerIsRetiredException, BoxerHasNoFightsException {
    boxer.addFights("Marvin Hagler", 'L');
    assertEquals(boxer.getFights(), "fought: Marvin Hagler L.");
  }

  @Test
  void testAddFights_whenRetired() throws BoxerIsRetiredException {
    boxer.retire();
    assertThatThrownBy(
            () -> {
              boxer.addFights("lomachenko", 'W');
            })
        .isInstanceOf(BoxerIsRetiredException.class)
        .hasMessage("Boxer is retired");
  }

  @Test
  void testRetire_whenRetired() throws BoxerIsRetiredException {
    boxer.retire();
    assertThatThrownBy(
            () -> {
              boxer.retire();
            })
        .isInstanceOf(BoxerIsRetiredException.class)
        .hasMessage("Boxer is already retired");
  }

  @Test
  void testSetName() {
    boxer.setName("Pablo");
    assertEquals(boxer.getName(), "Pablo");
  }

  @Test
  void testSetAbleToFight() {
    boxer.setAbleToFight(false);
    assertFalse(boxer.getAbleToFight());
  }

  @Test
  void testSetHealth() {
    boxer.setHealth(2);
    assertEquals(boxer.getHealth(), 2);
  }

  @Test
  void testBoxerIsRetiredException_retiringBoxerThenThrowingException()
      throws BoxerIsRetiredException {
    Boxer leaonard = new Boxer("Sugar ray", 200, 200);
    boxer.retire();
    assertThatThrownBy(
            () -> {
              boxer.bout(leaonard);
            })
        .isInstanceOf(BoxerIsRetiredException.class)
        .hasMessageContaining("Boxer is retired");
  }

  @Test
  void testBoxerHasNoFightsException_gettingFightsWhenNoFightsHaveBeenHad() {
    assertThatThrownBy(
            () -> {
              boxer.getFights();
            })
        .isInstanceOf(BoxerHasNoFightsException.class)
        .hasMessageContaining("Boxer hasnt fought anyone");
  }
}
