package com.codedifferently.lesson16.KimberleeObject;

import java.util.Arrays;

public class HeadPhones {
  @SuppressWarnings("unused")
  private static final Object PREFERRED_BRANDS = null;

  private int volume = 0;
  private boolean isPoweredOn = false;
  private HeadPhoneColor headPhoneColor = HeadPhoneColor.BLACK;
  private boolean isWireless = true;
  private String brands = "Beats";
  private boolean isConnectedToBluetooth = false;
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
}
