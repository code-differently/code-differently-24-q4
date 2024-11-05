package com.codedifferently.lesson16.KimberleeObject;

import java.util.Arrays;

public class HeadPhones {

  private int volume = 0;
  private boolean isPoweredOn = false;
  private HeadPhoneColor headPhoneColor = HeadPhoneColor.BLACK;
  private boolean isWireless = true;
  private String brands = "Beats";
  private boolean isConnectedToBluetooth = false;
  private BoostMode currentMode;
  private BoostMode[] modes = BoostMode.values();
  private int currentModeIndex = 0;

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

  public enum BoostMode {
    BASS_BOOST,
    VOCAL_BOOST,
    TREBLE_BOOST;
  }

  public void headPhones() {
    this.currentMode = BoostMode.BASS_BOOST;
  }

  public int getVolume(int i) {
    return volume;
  }

  public HeadPhoneColor getHeadPhoneColor() {
    return headPhoneColor;
  }

  public boolean isPoweredOn() {
    return isPoweredOn;
  }

  public boolean isWireless() {
    return isWireless;
  }

  public String getBrandsArray() {
    return brands;
  }

  public void turnOn() {
    isPoweredOn = true;
  }

  public void turnOff() {
    isPoweredOn = false;
  }

  public void increaseVolume() {
    if (volume < 100) {
      volume++;
    }
  }

  public void setVolume(int volume) {
    if (volume >= 0 && volume <= 100) {
      this.volume = volume;
    }
  }

  public void decreaseVolume() {
    if (volume > 0) {
      volume--;
    }
  }

  public void setColor(HeadPhoneColor color) {
    this.headPhoneColor = color;
  }

  public class BrandUtils {
    private static final String[] PREFERRED_BRANDS = {
      "Beats", "Sony", "Bose", "SkullCandy", "Juicy"
    };

    public static boolean isPreferredBrand(String brand) {
      return Arrays.asList(PREFERRED_BRANDS).contains(brand);
    }
  }

  public boolean connectToBluetooth() {
    if (isPoweredOn && isWireless) {
      isConnectedToBluetooth = true;
    }
    return isConnectedToBluetooth;
  }

  public boolean isConnectedToBluetooth() {
    return connectToBluetooth();
  }

  public void wirelessConnection() throws ConnectionNotFoundException {
    if (!isConnectedToBluetooth) {
      throw new ConnectionNotFoundException("Headphones Wireless Connection Not Found.");
    }
  }

  public void nextBoostMode() {
    currentModeIndex = (currentModeIndex + 1) % modes.length;
    currentMode = modes[currentModeIndex];
  }

  public BoostMode getCurrentMode() {
    return currentMode;
  }
}
