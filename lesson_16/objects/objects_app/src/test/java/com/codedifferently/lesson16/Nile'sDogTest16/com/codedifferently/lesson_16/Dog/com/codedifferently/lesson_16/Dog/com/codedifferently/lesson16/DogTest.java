package com.codedifferently.lesson16;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


public class DogTest {
  public abstract class EnumToArray {
    enum Colors {
      WHITE,
      BROWN,
      BLONDE;
    }
  }
  
  

  public int getAge(int age) {
    return age;
  }

  @Test
  public void testGetAge() {
    int getAge = getAge(2);
    int myDogsAge = getAge(2);
    assertThat(getAge(2)).isNotNull();
  }

  public String getbreed(String breed) {
    return breed;
  }

  @Test
  public void testGetBreed() {
    String getBreed = getbreed(getbreed("Mutt"));
    assertThat(getbreed("Mutt"));
  }

  public String getGender(String gender) {
    return gender;
  }

  @Test
  public String testGetGender() {
    String getGender = getGender(getGender("male"));

    assertThat(getGender("male"));
    return getbreed(getGender);
  }

  public Enum getColors(Enum Colors) {
    return Colors;
  }

  @Test
  public Enum testGetColors(Enum Colors) {
    Enum testColor = Colors;
    assertThat(getColors(Colors));
    return getColors(Colors);
  }

  @Test
  public void testgetColor() {
    assertThat(getColors(null));
  }

  @Test
  Boolean isFed(Boolean Fed) {
    var isNotFed = false;
    var isFed = true;
    var getFedStatus = Fed || isNotFed;
    assertThat(getFedStatus).isTrue();
    assertThat(Fed).isFalse();
    assertThat(getFedStatus).isEqualTo(isFed);
    return getFedStatus == Fed;
  }

  @Test
  public void testDogConstructorThrowsExceptionForNegativeAge() {
    public class newDog extends Dog {

    
    // Arrange
   Enum colorList = getColors(null);
    int negativeAge = -1;
    String breed = "Mutt";
    String gender = "male";
    boolean isFed = true;
    Enum Color1 = null;

    Dog dog = new Dog(2, "Mutt", "male", Color1, true);

    //None of this is going to work without the correct import configuration 


    // Act & Assert
    assertThatThrownBy(() -> new Dog(negativeAge, breed, gender, Color1, isFed))
        .isInstanceOf(DogAgeException.class)
        .hasMessage("Age cannot be negative.");
        return 
  }

  @Test
  public String testaddFavoriteToy(String toy) {

    Enum Color1 = null;

    String favoriteToy = "Squeaky Fish";

    assertThat(favoriteToy).isEqualTo("Squeaky Fish");

    return toy;
  }
}
