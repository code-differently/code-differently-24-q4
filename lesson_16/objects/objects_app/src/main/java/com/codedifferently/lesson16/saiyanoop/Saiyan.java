package com.codedifferently.lesson16.saiyanoop;

import java.util.ArrayList;

public class Saiyan {
  enum SaiyanForms {
    BASE, // 0 - 1999
    SSJ1, // 2000 - 2999
    SSJ2, // 3000 - 3999
    SSJ3 // 4000
  }

  private int powerLevel;
  private String name;
  private ArrayList<String> accessories;
  private SaiyanForms saiyanForms;
  private boolean hasATail;

  public Saiyan(
      int powerLevel,
      String name,
      ArrayList<String> accessories,
      SaiyanForms saiyanForms,
      boolean hasATail) {
    this.powerLevel = powerLevel;
    this.name = name;
    this.accessories = accessories;
    this.saiyanForms = saiyanForms;
    this.hasATail = hasATail;
  }

  public int getPowerLevel() {
    return powerLevel;
  }

  public void setPowerLevel(int powerLevel) throws InvalidPowerLevelCustomExcepetion {
    this.powerLevel = powerLevel;
    if (powerLevel <= 0) {
      throw new InvalidPowerLevelCustomExcepetion("Power Level can not be zero or less!");
    }

    SaiyanForms form = SaiyanForms.BASE;
    if (powerLevel > 2000 && powerLevel < 2999) {
      form = SaiyanForms.SSJ1;
    } else if (powerLevel > 3000 && powerLevel < 3999) {
      form = SaiyanForms.SSJ2;
    } else if (powerLevel > 4000) {
      form = SaiyanForms.SSJ3;
    }
    setSaiyanForms(form);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<String> getAccessories() {
    return accessories;
  }

  public void addAccessories(String addingAcc) {
    this.accessories.add(addingAcc);
  }

  public void removeAccessories(String removeAcc) {
    accessories.remove(removeAcc);
  }

  public void removeAllAccessories() {
    accessories.removeAll(accessories);
    for (int i = accessories.size() - 1; i >= 0; i--) {
      accessories.remove(i);
    }
  }

  public SaiyanForms getSaiyanForms() {
    return saiyanForms;
  }

  public void setSaiyanForms(SaiyanForms saiyanForms) {
    this.saiyanForms = saiyanForms;
  }

  public boolean isHasATail() {
    return hasATail;
  }

  public void setHasATail(boolean hasATail) {
    this.hasATail = hasATail;
  }
}
