package com.codedifferently.lesson16.HummadTanweer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import com.codedifferently.lesson16.HummadTanweer.Person.Gender;
import com.codedifferently.lesson16.HummadTanweer.Person.HobbyLimitExceededException;
import org.junit.jupiter.api.Test;

public class PersonTest {
  @Test
  void testIsAdult() {
    Person adult = new Person("xyz", 29, Gender.MALE, "xyz@gmail.com");
    assertTrue(adult.isAdult(), "True for 29");
    Person minor = new Person("abc", 15, Gender.FEMALE, "abc@gmail.com");
    assertFalse(minor.isAdult(), "False for 15");
  }

  @Test
  void testAddHobby() throws HobbyLimitExceededException {
    Person person = new Person("xyz", 29, Gender.MALE, "xyz@gmail.com");

    person.addHobby("Football");
    person.addHobby("Pickleball");

    assertEquals(2, person.getHobbies().size());
    assertTrue(person.getHobbies().contains("Football"));
    assertTrue(person.getHobbies().contains("Pickleball"));
  }

  @Test
  public void testGetName() {
    Person person = new Person("xyz", 29, Gender.MALE, "xyz@gmail.com");
    assertEquals("xyz", person.getName());
  }

  @Test
  public void getEmail() {
    Person person = new Person("xyz", 29, Gender.MALE, "xyz@gmail.com");
    assertEquals("xyz@gmail.com", person.getEmail());
  }

  @Test
  void testAddHobbyExceedsLimit() throws HobbyLimitExceededException {
    Person person = new Person("xyz", 29, Gender.MALE, "xyz@gmail.com");

    try {
      person.addHobby("Football");
      person.addHobby("Pickleball");
      person.addHobby("Basketball");
      fail("Expected HobbyLimitExceededException to be thrown");
    } catch (HobbyLimitExceededException e) {
      assertEquals("Cannot add more than 2 hobbies.", e.getMessage());
    }
  }
}
