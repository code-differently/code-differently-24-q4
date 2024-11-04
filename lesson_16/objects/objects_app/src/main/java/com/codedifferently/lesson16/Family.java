package com.codedifferently.lesson16;

import java.util.ArrayList;

public class Family {
  private ArrayList<Integer> ages;
  private ArrayList<Integer> divisions;

  public Family() {
    ages = new ArrayList<>();
    divisions = new ArrayList<>();
  }

  public void addPerson(int id, int division, String name, int age) {
    ages.add(age);
    divisions.add(division);
  }

  public boolean hasA12YO() {
    // TODO Auto-generated method stub
    for (int age : ages) {
      if (age == 12) {
        return true;
      }
    }
    return false;
  }

  public boolean hasADivThree() {
    for (int division : divisions) {
      if (division == 3) {
        return true;
      }
    }
    return false;
  }

  public int agesSizeValue() {
    return ages.size();
  }

  public boolean hasSixKids() {
    // TODO Auto-generated method stub
    int num = ages.size();

    return num < 6;
  }

  // throw new UnsupportedOperationException("Unimplemented method 'hasA12YO'");
}
