package com.codedifferently.lesson16.person;

import java.util.ArrayList;

public class Person {

  private String name;
  private String sex;
  private String race;
  private int age;
  private boolean alive;
  private double height;
  private ArrayList<String> hairColor;

  public Person(String name, String sex, String race, int age, double height, ArrayList<String> hairColor, boolean alive) {
    this.name = name;
    this.sex = sex;
    this.race = race;
    this.age = age;
    this.height = height;
    this.hairColor = hairColor;
    this.alive = alive;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public ArrayList<String> getHairColor() {
    if (hairColor == null || hairColor.isEmpty()) {
      this.hairColor = new ArrayList<>();
      hairColor.add("Bald");
      throw new IllegalArgumentException("No hair color? This person must be bald!");
    }
    return hairColor;
  }

  public void setHairColor(ArrayList<String> hairColor) {
    this.hairColor = hairColor;
  }

  public ArrayList<String> getNaturalHairColor() {
    ArrayList<String> naturalHairColor = new ArrayList<>();
    ArrayList<String> possibleNaturalColor = new ArrayList<>();
    possibleNaturalColor.add("Black");
    possibleNaturalColor.add("Brown");
    possibleNaturalColor.add("Blonde");
    possibleNaturalColor.add("Ginger");
    possibleNaturalColor.add("Auburn");
    possibleNaturalColor.add("Albino");
    possibleNaturalColor.add("Grey");

    for (String color : hairColor) {
      if (possibleNaturalColor.contains(color)) {
        naturalHairColor.add(color);
        break;
      }
    }
    return naturalHairColor;
  }

  public String getLifeStatus() {
    if (alive == true) {
      return "Alive";
    } else {
      return "Deceased";
    }
  }

  public void setLifeStatus(boolean alive) {
    this.alive = alive;
  }

  public String getPersonInfo() {
    return "Name: "
        + name
        + "| Gender Identity: "
        + sex
        + "| Race: "
        + race
        + "| Age: "
        + age
        + "| Height(In meters): "
        + height
        + "| Hair Color: "
        + hairColor
        + "| Status: "
        + getLifeStatus();
  }
}
