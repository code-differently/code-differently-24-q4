package com.codedifferently.lesson16.KimberleeObjectTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.codedifferently.lesson16.KimberleeObject.HeadPhones;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HeadPhonesTest {

  private HeadPhones headphones;

  @BeforeEach
  public void setUp() {
    headphones = new HeadPhones();
  }

  public enum HeadPhoneColor {
    RED,
    BLUE,
    ROSEGOLD,
    PINK,
    WHITE,
    BLACK;
  }

  public void BrandsArray() {
    String[] brands = new String[5];
    brands[0] = "Beats";
    brands[1] = "Sony";
    brands[2] = "Bose";
    brands[3] = "SkullCandy";
    brands[4] = "Juicy";
  }

  @Test
  public void testDefaultState() {
    assertEquals(0, headphones.getVolume(0), "Volume should be 0 by default.");
    assertEquals("BLACK", headphones.getHeadPhoneColor(), "Color should be black by default.");
    assertFalse(headphones.isPoweredOn(), "HeadPhones should be off by default.");
    assertTrue(headphones.isWireless(), "HeadPhones should be wireless by default.");
    assertArrayEquals(new String[] {"Beats"}, new String[] {"Beats"});
  }

  @Test
  public void testTurnOn() {
    // Act
    headphones.turnOn();
    // Assert
    assertTrue(headphones.isPoweredOn(), "Headphones should turn on after calling turnOn");
  }

  @Test
  public void testTurnOff() {
    // Arrange
    headphones.turnOn();
    // Act
    headphones.turnOff();
    // Assert
    assertFalse(headphones.isPoweredOn(), "Headphones should turn off after calling");
  }

  @Test
  public void testIncreaseVolume() {
    // Arrange
    headphones.turnOn();
    headphones.increaseVolume();
    assertEquals(1, headphones.getVolume(0), "Volume should increase by 1");
    // Act
    headphones.setVolume(99);
    headphones.increaseVolume();
    // Assert
    assertEquals(100, headphones.getVolume(0), "Volume should not exceed 100.");
  }

  @Test
  public void testDecreaseVolume() {
    // Arrange
    headphones.turnOn();
    headphones.setVolume(1);
    headphones.decreaseVolume();
    assertEquals(0, headphones.getVolume(0), "Volume should decrease to 0.");
    // Act
    headphones.decreaseVolume();
    // Assert
    assertEquals(0, headphones.getVolume(0), "Volume should not go lower than 0.");
  }
}
