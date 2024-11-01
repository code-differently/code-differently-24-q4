package com.codedifferently.lesson16.KimberleeObject;

public class HeadPhones {
  @SuppressWarnings("unused")
  private int volume = 0;

  private boolean isPoweredOn = false;
  private String HeadPhoneColor = "BLACK";
  private boolean isWireless = true;
  private String brands = "Beats";

  public int getVolume(int volume) {
    return volume;
  }

  public String getHeadPhoneColor() {
    return HeadPhoneColor;
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
}
