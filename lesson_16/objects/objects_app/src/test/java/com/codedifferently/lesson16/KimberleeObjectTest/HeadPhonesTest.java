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
  // Arrange

  // Act

  // Assert

}
