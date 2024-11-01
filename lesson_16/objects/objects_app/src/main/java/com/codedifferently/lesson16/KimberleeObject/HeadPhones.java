package com.codedifferently.lesson16.KimberleeObject;

public class HeadPhones {
  private int volume = 0;
  private boolean isPoweredOn = false;
  private HeadPhoneColor headPhoneColor = HeadPhoneColor.BLACK;
  private boolean isWireless = true;
  private String brands = "Beats";

  public enum HeadPhoneColor {
    RED,
    BLUE,
    ROSEGOLD,
    PINK,
    WHITE,
    BLACK;
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
}
