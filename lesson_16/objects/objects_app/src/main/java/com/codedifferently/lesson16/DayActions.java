package com.codedifferently.lesson16;

import java.util.ArrayList;

public class DayActions {
  private ArrayList<String> names;
  private ArrayList<Double> lunchMoneys;

  public DayActions() {
    names = new ArrayList<>();
    lunchMoneys = new ArrayList<>();
  }

  public void AddDay(
      int id,
      String name,
      boolean inBed,
      boolean showered,
      boolean dressed,
      boolean uniform,
      boolean lunch,
      double lunchMoney) {
    names.add(name);
    lunchMoneys.add(lunchMoney);
  }
}
