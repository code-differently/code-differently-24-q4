package com.codedifferently.lesson16.KimberleeObjectTest;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import com.codedifferently.lesson16.KimberleeObject.ConnectionNotFoundException;
import com.codedifferently.lesson16.KimberleeObject.HeadPhones;
import com.codedifferently.lesson16.KimberleeObject.HeadPhones.BoostMode;
import com.codedifferently.lesson16.KimberleeObject.HeadPhones.HeadPhoneColor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HeadPhonesTest {

  private HeadPhones headphones;

  @BeforeEach
  public void setUp() {
    headphones = new HeadPhones();
  }

  @Test
  public void testDefaultState() {
    assertEquals(0, headphones.getVolume(), "Volume should be 0 by default.");
    assertEquals(
        HeadPhoneColor.BLACK, headphones.getHeadPhoneColor(), "Color should be black by default.");
    assertFalse(headphones.isPoweredOn(), "HeadPhones should be off by default.");
    assertTrue(headphones.isWireless(), "HeadPhones should be wireless by default.");
    assertArrayEquals(new String[] {"Beats"}, new String[] {"Beats"});
    assertEquals(
        BoostMode.BASS_BOOST,
        headphones.getCurrentMode(),
        "BASS_BOOST should be the default setting.");
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
    assertEquals(1, headphones.getVolume(), "Volume should increase by 1");
    // Act
    headphones.setVolume(99);
    headphones.increaseVolume();
    // Assert
    assertEquals(100, headphones.getVolume(), "Volume should not exceed 100.");
  }

  @Test
  public void testDecreaseVolume() {
    // Arrange
    headphones.turnOn();
    headphones.setVolume(1);
    headphones.decreaseVolume();
    assertEquals(0, headphones.getVolume(), "Volume should decrease to 0.");
    // Act
    headphones.decreaseVolume();
    // Assert
    assertEquals(0, headphones.getVolume(), "Volume should not go lower than 0.");
  }

  @Test
  public void testSetColor() {
    // Act
    headphones.setColor(HeadPhoneColor.ROSEGOLD);
    // Assert
    assertEquals(
        HeadPhoneColor.ROSEGOLD,
        headphones.getHeadPhoneColor(),
        "Headphone color should be set to Rose Gold.");
  }

  @Test
  public void testPreferredBrand() {
    // Assert
    assertTrue(
        HeadPhones.BrandUtils.isPreferredBrand("Beats"), "Beats should be a preferred brand.");
    assertTrue(HeadPhones.BrandUtils.isPreferredBrand("Sony"), "Sony should be a preferred brand.");
    assertFalse(
        HeadPhones.BrandUtils.isPreferredBrand("Apple"), "Apple should not be a preferred brand.");
    assertTrue(
        HeadPhones.BrandUtils.isPreferredBrand("SkullCandy"),
        "SkullCandy should be a preferred brand.");
    assertTrue(
        HeadPhones.BrandUtils.isPreferredBrand("Juicy"), "Juicy should be a preferred brand.");
  }

  @Test
  public void testwirelessConnection() throws Exception {
    // Arrange
    headphones.turnOn();
    // Act
    headphones.connectToBluetooth();
    // Assert
    assertTrue(
        headphones.isConnectedToBluetooth(),
        "Headphones should connect to bluetooh when wireless and turned on.");
  }

  @Test
  public void testwirelessConnection_connectionNotFound() throws Exception {
    // Act
    assertThatThrownBy(() -> headphones.wirelessConnection())
        .isInstanceOf(ConnectionNotFoundException.class)
        .hasMessage("Headphones Wireless Connection Not Found.");
  }

  @Test
  public void testBoostMode() {
    assertEquals(
        BoostMode.BASS_BOOST,
        headphones.getCurrentMode(),
        "BASS_BOOST should be the default setting.");

    headphones.nextBoostMode();
    assertEquals(
        BoostMode.VOCAL_BOOST,
        headphones.getCurrentMode(),
        "The next Boost setting should be VOCAL.");

    headphones.nextBoostMode();
    assertEquals(
        BoostMode.TREBLE_BOOST,
        headphones.getCurrentMode(),
        "The next Boost setting should be TREBLE.");

    headphones.nextBoostMode();
    assertEquals(
        BoostMode.BASS_BOOST,
        headphones.getCurrentMode(),
        "BoostMode cycle should return to BASS_BOOST.");
  }
}
