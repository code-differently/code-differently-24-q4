package com.codedifferently.lesson16.xaviercruz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {
  private String name;
  private int age;
  private Position position;
  private List<String> traits;
  private Color eyeColor;
  private final int max_traits = 10;

  public Person(String name, int age, Position position, List<String> traits, Color eyeColor) {
    this.name = name;
    this.age = age;
    this.position = position;
    this.traits = traits;
    this.eyeColor = eyeColor;
  }

  public void changeName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void increaseAge() {
    age++;
  }

  // Added for mistakes in age.
  public void updateAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void updatePosition(Position position) {
    this.position = position;
  }

  public Position getPosition() {
    return position;
  }

  public void addToTraits(String newTrait) throws TooManyTraitsException {
    if ((traits.size() + 1) > max_traits) {
      throw new TooManyTraitsException("Error too many traits assigned");
    }
    traits.add(newTrait);
  }

  public void addToTraits(String[] traits) throws TooManyTraitsException {
    if ((this.traits.size() + traits.length) > max_traits) {
      throw new TooManyTraitsException("Error too many traits assigned");
    }
    this.traits.addAll(Arrays.asList(traits));
  }

  public void addToTraits(ArrayList<String> traits) throws TooManyTraitsException {
    if ((this.traits.size() + traits.size()) > max_traits) {
      throw new TooManyTraitsException("Error too many traits assigned");
    }
    for (String trait : traits) {
      this.traits.add(trait);
    }
  }

  public List<String> getTraits() {
    return traits;
  }

  public Color getEyeColor() {
    return eyeColor;
  }

  // Added for mistakes in eye color
  public void setEyeColor(Color eyeColor) {
    this.eyeColor = eyeColor;
  }
}
