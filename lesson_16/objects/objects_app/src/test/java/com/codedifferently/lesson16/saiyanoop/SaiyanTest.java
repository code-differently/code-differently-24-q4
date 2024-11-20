package com.codedifferently.lesson16.saiyanoop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import com.codedifferently.lesson16.saiyanoop.Saiyan.SaiyanForms;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class SaiyanTest {
  @Test
  void testgetPowerLevel() {
    Saiyan saiyan =
        new Saiyan(
            1200,
            "Goku",
            new ArrayList<String>(Arrays.asList("Power Pole", "Scouter", "Flying Nimbus")),
            SaiyanForms.BASE,
            false);
    assertEquals(1200, saiyan.getPowerLevel());
  }

  @Test
  void testpowerLevelDroppingAndFormDown() throws InvalidPowerLevelCustomExcepetion {
    Saiyan saiyan =
        new Saiyan(
            4200,
            "Goku",
            new ArrayList<String>(Arrays.asList("Power Pole", "Scouter", "Flying Nimbus")),
            SaiyanForms.SSJ3,
            false);
    saiyan.setPowerLevel(3300);
    assertEquals(SaiyanForms.SSJ2, saiyan.getSaiyanForms());
    saiyan.setPowerLevel(2300);
    assertEquals(SaiyanForms.SSJ1, saiyan.getSaiyanForms());
    saiyan.setPowerLevel(1300);
    assertEquals(SaiyanForms.BASE, saiyan.getSaiyanForms());
  }

  @Test
  void testpowerLevelRisingAndFormUp() throws InvalidPowerLevelCustomExcepetion {
    Saiyan saiyan =
        new Saiyan(
            1200,
            "Goku",
            new ArrayList<String>(Arrays.asList("Power Pole", "Scouter", "Flying Nimbus")),
            SaiyanForms.BASE,
            false);
    saiyan.setPowerLevel(2600);
    assertEquals(SaiyanForms.SSJ1, saiyan.getSaiyanForms());
    saiyan.setPowerLevel(3600);
    assertEquals(SaiyanForms.SSJ2, saiyan.getSaiyanForms());
    saiyan.setPowerLevel(4600);
    assertEquals(SaiyanForms.SSJ3, saiyan.getSaiyanForms());
  }

  @Test
  void testdoesHaveATail() {
    Saiyan saiyan =
        new Saiyan(
            1200,
            "Goku",
            new ArrayList<String>(Arrays.asList("Power Pole", "Scouter", "Flying Nimbus")),
            SaiyanForms.BASE,
            false);
    saiyan.setHasATail(true);
    assertEquals(true, saiyan.isHasATail());
  }

  @Test
  void testdoesNotHaveATail() {
    Saiyan saiyan =
        new Saiyan(
            1200,
            "Goku",
            new ArrayList<String>(Arrays.asList("Power Pole", "Scouter", "Flying Nimbus")),
            SaiyanForms.BASE,
            false);
    assertEquals(false, saiyan.isHasATail());
  }

  @Test
  void testgetName() {
    Saiyan saiyan =
        new Saiyan(
            1200,
            "Goku",
            new ArrayList<String>(Arrays.asList("Power Pole", "Scouter", "Flying Nimbus")),
            SaiyanForms.BASE,
            false);
    assertEquals("Goku", saiyan.getName());
  }

  @Test
  void testsetName() {
    Saiyan saiyan =
        new Saiyan(
            1200,
            "Goku",
            new ArrayList<String>(Arrays.asList("Power Pole", "Scouter", "Flying Nimbus")),
            SaiyanForms.BASE,
            false);
    saiyan.setName("Kakarot");
    assertEquals("Kakarot", saiyan.getName());
  }

  @Test
  void testgetAnAccessory() {
    Saiyan saiyan =
        new Saiyan(
            1200,
            "Goku",
            new ArrayList<String>(Arrays.asList("Power Pole", "Scouter", "Flying Nimbus")),
            SaiyanForms.BASE,
            false);
    assertEquals("Power Pole", saiyan.getAccessories().get(0));
  }

  @Test
  void testaddingAnAccessory() {
    Saiyan saiyan =
        new Saiyan(
            1200,
            "Goku",
            new ArrayList<String>(Arrays.asList("Power Pole", "Scouter", "Flying Nimbus")),
            SaiyanForms.BASE,
            false);
    saiyan.addAccessories("Senzu Bean");
    assertEquals(4, saiyan.getAccessories().size());
  }

  @Test
  void testremovingAllAccessories() {
    Saiyan saiyan =
        new Saiyan(
            1200,
            "Goku",
            new ArrayList<String>(Arrays.asList("Power Pole", "Scouter", "Flying Nimbus")),
            SaiyanForms.BASE,
            false);
    saiyan.removeAllAccessories();
    assertEquals(0, saiyan.getAccessories().size());
  }

  @Test
  void testremoveAccessories() {
    Saiyan saiyan =
        new Saiyan(
            1200,
            "Goku",
            new ArrayList<String>(Arrays.asList("Power Pole", "Scouter", "Flying Nimbus")),
            SaiyanForms.BASE,
            false);
    saiyan.removeAccessories("Power Pole");
    assertEquals(2, saiyan.getAccessories().size());
  }

  @Test
  void testcanNotGetZeroOrNegativePowerLevel() throws InvalidPowerLevelCustomExcepetion {
    Saiyan saiyan =
        new Saiyan(
            1200,
            "Goku",
            new ArrayList<String>(Arrays.asList("Power Pole", "Scouter", "Flying Nimbus")),
            SaiyanForms.BASE,
            false);

    try {
      saiyan.setPowerLevel(-10);
      fail("Expected InvalidPowerLevelCustomException to be thrown");
    } catch (InvalidPowerLevelCustomExcepetion e) {
      assertEquals("Power Level can not be zero or less!", e.getMessage());
    }
  }
}
