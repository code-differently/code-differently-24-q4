import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class DogTest {

  @Test
  public void testGetAge() throws Dog.DogAgeException {
    Dog dog = new Dog(2, "Mutt", "male", Dog.Colors.BROWN, true);
    assertThat(dog.getAge()).isEqualTo(2);
  }

  @Test
  public void testGetBreed() throws Dog.DogAgeException {
    Dog dog = new Dog(2, "Mutt", "male", Dog.Colors.BROWN, true);
    assertThat(dog.getBreed()).isEqualTo("Mutt");
  }

  @Test
  public void testGetGender() throws Dog.DogAgeException {
    Dog dog = new Dog(2, "Mutt", "male", Dog.Colors.BROWN, true);
    assertThat(dog.getGender()).isEqualTo("male");
  }

  @Test
  public void testGetColor() throws Dog.DogAgeException {
    Dog dog = new Dog(2, "Mutt", "male", Dog.Colors.BROWN, true);
    assertThat(dog.getColor()).isEqualTo(Dog.Colors.BROWN);
  }

  @Test
  public void testIsFed() throws Dog.DogAgeException {
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
