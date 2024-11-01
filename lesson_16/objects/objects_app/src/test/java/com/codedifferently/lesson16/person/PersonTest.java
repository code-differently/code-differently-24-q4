package com.codedifferently.lesson16.person;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {

    Person person;
  
    @BeforeEach
    void setUp() {
      ArrayList<String> hairColor = new ArrayList<>();
      hairColor.add("Black");
      hairColor.add("Purple");
      person = new Person("Chigazo", "Male", "African-American", 20, 1.8288, hairColor, true);
    }
  
    @Test
    public void testGetName() {
      // Act
      String actualName = person.getName();
      // Arrange
      String expectedName = "Chigazo";
      // Assert
      assertEquals(expectedName, actualName);
    }
  
    @Test
    public void testSetName() {
      // Arrange
      String expectedSet = "Austin";
      // Act
      person.setName(expectedSet);
      // Assert
      assertEquals(expectedSet, person.getName());
    }
  
    @Test
    public void testGetSex() {
      // Act
      String actualSex = person.getSex();
      // Arrange
      String expectedSex = "Male";
      // Assert(Checking the value)
      assertEquals(expectedSex, actualSex);
    }
  
    @Test
    public void testSetSex() {
      // Arrange
      String expectedSex = "Female";
      // Act
      person.setSex(expectedSex);
      // Assert
      assertEquals(expectedSex, person.getSex());
    }
  
    @Test
    public void testGetRace() {
      // Act
      String actualRace = person.getRace();
      // Arrange
      String expectedRace = "African-American";
      // Assert(Checking the value)
      assertEquals(expectedRace, actualRace);
    }
  
    @Test
    public void testSetRace() {
      // Arrange
      String expectedRace = "Asian";
      // Act
      person.setRace(expectedRace);
      // Assert
      assertEquals(expectedRace, person.getRace());
    }
  
    @Test
    public void testGetAge() {
      // Act
      int actualAge = person.getAge();
      // Arrange
      int expectedAge = 20;
      // Assert(Checking the value)
      assertEquals(expectedAge, actualAge);
    }
  
    @Test
    public void testSetAge() {
      // Arrange
      int expectedAge = 21;
      // Act
      person.setAge(expectedAge);
      // Assert
      assertEquals(expectedAge, person.getAge());
    }
  
    @Test
    public void testGetHeight() {
      // Act
      double actualHeight = person.getHeight();
      // Arrange
      double expectedHeight = 1.8288;
      // Assert(Checking the value)
      assertEquals(expectedHeight, actualHeight);
    }
  
    @Test
    public void testSetHeight() {
      // Arrange
      double expectedHeight = 1.92024;
      // Act
      person.setHeight(expectedHeight);
      // Assert
      assertEquals(expectedHeight, person.getHeight());
    }
  
    @Test
    public void testGetHairColor() {
      // Act
      ArrayList<String> actualHairColor = person.getHairColor();
      // Arrange
      ArrayList<String> expectedHairColor = new ArrayList<>();
      expectedHairColor.add("Black");
      expectedHairColor.add("Purple");
      // Assert
      assertEquals(expectedHairColor, actualHairColor);
    }

   @Test
    public void testGetHairColor__hairColorDoesNotExist() {
      // Arrange
      Person baldPerson = new Person("John", "Male", "Caucasian", 25, 1.75, null, true);
      // Act
      Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
          baldPerson.getHairColor();
      });
      // Assert
      assertEquals("No hair color? This person must be bald!", exception.getMessage());
    }
  
    @Test
    public void testGetNaturalHairColor() {
      ArrayList<String> expectedNaturalHairColor = new ArrayList<>();
      expectedNaturalHairColor.add("Black");
      ArrayList<String> actualNaturalHairColor = person.getNaturalHairColor();
      assertEquals(expectedNaturalHairColor, actualNaturalHairColor);
    }

    @Test
    public void testSetHairColor() {
      // Arrange
      ArrayList<String> expectedHairColor = new ArrayList<>();
      expectedHairColor.add("Brown");
      // Act
      person.setHairColor(expectedHairColor);
      // Assert
      assertEquals(expectedHairColor, person.getHairColor());
  }

   @Test
  public void testGetLifeStatus() {
    // Act
    String actualLifeStatus = person.getLifeStatus();
    // Arrange
    String expectedHairColor = "Alive";
    // Assert
    assertEquals(expectedHairColor, actualLifeStatus);
  }

  @Test
  public void testSetLifeStatus() {
    // Arrange
    boolean expectedLifeStatus = false;
    // Act
    person.setLifeStatus(expectedLifeStatus);
    // Assert
    assertEquals("Deceased", person.getLifeStatus());
  }

  @Test
  public void testGetPersonInfo() {
    String expectedPersonInfo = "Name: Chigazo| Gender Identity: Male| Race: African-American| Age: 20| Height(In meters): 1.8288| Hair Color: [Black, Purple]| Status: Alive";
    
    // Act
    String actualPersonInfo = person.getPersonInfo();

    //Assert
    assertEquals(expectedPersonInfo, actualPersonInfo);
  }
}
