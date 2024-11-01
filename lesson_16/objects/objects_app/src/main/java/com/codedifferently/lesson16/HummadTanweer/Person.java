package com.codedifferently.lesson16.HummadTanweer;
import java.util.ArrayList;

public class Person {
  private final String name;
  private final int age;
  private final Gender gender;
  private final ArrayList<String> hobbies;
  private final String email;
  private final int MAX_HOBBIES = 2;

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

  public void displayHobbies() {
    if (hobbies.isEmpty()) {
      System.out.println(name + " has no hobbies.");
    } else {
      System.out.println(name + "'s hobbies:");
      for (String hobby : hobbies) {
        System.out.println("- " + hobby);
      }
    }
  }

  public boolean isAdult() {
    return age >= 18;
  }

  public String getName() {
    return name;
  }

  public Gender getGender() {
    return gender;
  }

  public String getEmail() {
    return email;
  }

  public static void main(String[] args) {
    Person person = new Person("xyz", 29, Gender.MALE, "xyz@gmail.com");

    try {
      person.addHobby("Football");
      person.addHobby("Pickleball");
      person.addHobby("Basketball");
    } catch (HobbyLimitExceededException e) {
      System.out.println(e.getMessage());
    }

    person.displayHobbies();

    if (person.isAdult()) {
      System.out.println(person.getName() + " Adult");
    } else {
      System.out.println(person.getName() + " Not an adult");
    }
  }
}
