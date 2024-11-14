package com.codedifferently.lesson16.hummadtanweer;

import java.util.ArrayList;

public class Person {
  private final String name;
  private final int age;
  private final Gender gender;
  private final ArrayList<String> hobbies;
  private final String email;
  private final int MAX_HOBBIES = 2;

  public class HobbyLimitExceededException extends Exception {
    public HobbyLimitExceededException(String message) {
      super(message);
    }
  }

  enum Gender {
    MALE,
    FEMALE,
    OTHER
  }

  public Person(String name, int age, Gender gender, String email) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.email = email;
    this.hobbies = new ArrayList<>();
  }

  public void addHobby(String hobby) throws HobbyLimitExceededException {
    if (hobbies.size() >= MAX_HOBBIES) {
      throw new HobbyLimitExceededException("Cannot add more than " + MAX_HOBBIES + " hobbies.");
    }
    hobbies.add(hobby);
  }

  public ArrayList<String> getHobbies() {
    return hobbies;
  }

  public boolean isAdult() {
    return age >= 18;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }
}
