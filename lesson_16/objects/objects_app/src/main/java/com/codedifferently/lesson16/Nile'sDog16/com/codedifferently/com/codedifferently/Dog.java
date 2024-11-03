package com.codedifferently.lesson16.dog;

import java.util.ArrayList;
import java.util.List;

public class Dog implements DogTest {

  // Custom exception
  public static class DogAgeException extends Exception {

    public DogAgeException(String message) {
      super(message);
    }
  }

  // Enum for dog colors
  public enum Colors {
    WHITE,
    BROWN,
    BLONDE
  }

  // Member variables
  private int age;
  private String breed;
  private String gender;
  private Colors color;
  private boolean isFed;
  private List<String> favoriteToys;

  // Constructor
  public Dog(int age, String breed, String gender, Colors color, boolean isFed)
      throws DogAgeException {
    if (age < 0) {
      throw new DogAgeException("Age cannot be negative.");
    }
    this.age = age;
    this.breed = breed;
    this.gender = gender;
    this.color = color;
    this.isFed = isFed;
    this.favoriteToys = new ArrayList<>();
  }

  // Member functions
  public String getDogDescription() {
    return age > 5 ? "Senior Dog" : "Young Dog"; // Conditional expression
  }

  public void addFavoriteToy(String toy) {
    favoriteToys.add(toy);
  }

  public List<String> getFavoriteToys() {
    List<String> toys = new ArrayList<>();
    for (String toy : favoriteToys) { // Loop
      toys.add(toy);
    }
    return toys;
  }

  // Getters
  public int getAge() {
    return age;
  }

  public String getBreed() {
    return breed;
  }

  public String getGender() {
    return gender;
  }

  public Colors getColor() {
    return color;
  }

  public boolean isFed() {
    return isFed;
  }

  public String getFavoriteToys() {
    return favoriteToy;
  }
}
