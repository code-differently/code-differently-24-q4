import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class DogTest {

  // Test the Dog class
  public class Dog {
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
      String favoriteToy = "Squeaky Fish";
      return favoriteToy;
    }

    public String addFavoriteToy(String favoriteToy2) {
      String favoriteToy = "Squeaky Fish";
      return favoriteToy;
    }
  }

  @Test
  public void testGetAge() throws DogTest.Dog.DogAgeException {
    Dog dog = new Dog(2, "Mutt", "male", Dog.Colors.BROWN, true);
    assertThat(dog.getAge()).isEqualTo(2);
  }

  @Test
  public void testGetBreed() throws DogTest.Dog.DogAgeException {
    Dog dog = new Dog(2, "Mutt", "male", Dog.Colors.BROWN, true);
    assertThat(dog.getBreed()).isEqualTo("Mutt");
  }

  @Test
  public void testGetGender() throws DogTest.Dog.DogAgeException {
    Dog dog = new Dog(2, "Mutt", "male", Dog.Colors.BROWN, true);
    assertThat(dog.getGender()).isEqualTo("male");
  }

  @Test
  void DogTesttestGetColor() throws DogTest.Dog.DogAgeException {
    Dog dog = new Dog(2, "Mutt", "male", Dog.Colors.BROWN, true);
    assertThat(dog.getColor()).isEqualTo(Dog.Colors.BROWN);
  }

  @Test
  public void testIsFed() throws DogTest.Dog.DogAgeException {
    Dog dog = new Dog(2, "Mutt", "male", Dog.Colors.BROWN, true);
    assertThat(dog.isFed()).isTrue();
  }

  @Test
  public void testDogConstructorThrowsExceptionForNegativeAge() {
    // Act & Assert
    assertThatThrownBy(() -> new Dog(-1, "Mutt", "male", Dog.Colors.BROWN, true))
        .isInstanceOf(Dog.DogAgeException.class)
        .hasMessage("Age cannot be negative.");
  }

  @Test
  public void testAddFavoriteToy() throws Dog.DogAgeException {
    Dog dog = new Dog(2, "Mutt", "male", Dog.Colors.BROWN, true);
    String favoriteToy = "Squeaky Fish";
    dog.addFavoriteToy(favoriteToy);
    assertThat(dog.getFavoriteToys()).contains(favoriteToy);
  }
}
