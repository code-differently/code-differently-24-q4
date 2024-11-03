package com.codedifferently.lesson16.SmartPhone;

import java.util.ArrayList;

public class SmartPhone {

  private Name brandName;
  private String model;
  private int batteryPercentage;
  private boolean power;
  private ArrayList<String> apps;
  private int volume;

  public SmartPhone(
      Name brandName, String model, int batteryPercentage, boolean power, ArrayList<String> apps) {
    this.brandName = brandName;
    this.batteryPercentage = batteryPercentage;
    this.power = power;
    this.apps = apps;
    this.volume = volume;
  }

  public void setSmartPhonePowerbattery(int currentBatteryPercentage) {
    if (currentBatteryPercentage < 0 || currentBatteryPercentage > 100) {
      throw new IllegalArgumentException("Battery percentage must be in between 0 and 100.");
    }
    this.batteryPercentage = currentBatteryPercentage;
  }

  public int getBatteryPercentage() {
    return batteryPercentage;
  }

  public String getSmartPhoneApps() {
    var smartPhoneApps = "";
    for (String s : apps) {
      smartPhoneApps += s;
    }
    return smartPhoneApps;
  }

  public void removeSmartPhoneApps(String App) {
    apps.remove(App);
  }

  public int getSmartPhoneVolume() {
    return 5;
  }

  public boolean isPowerOn() {
    return true;
  }

  public void addSmartPhoneApps(String instagram) {
    apps.add("," + instagram);
  }

  public void addSmartPhoneVolume() {
    volume++;
  }
}
