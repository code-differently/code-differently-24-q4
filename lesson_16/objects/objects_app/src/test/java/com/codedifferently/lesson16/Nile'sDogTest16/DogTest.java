import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.codedifferently.lesson16.Dog.Dog;
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

  public Colors getColors(Colors Colors) {
    return Colors;
  }

  @Test
  public Colors testGetColors(Colors Colors) {
    Colors testColor = Colors.BROWN;
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
    // Arrange
    Colors colorList = Colors.getBROWN();
    int negativeAge = -1;
    String breed = "Mutt";
    String gender = "male";
    boolean isFed = true;
    Enum Color1 = null;

    // Act & Assert
    assertThatThrownBy(() -> new Dog(negativeAge, breed, gender, Color1, isFed))
        .isInstanceOf(DogAgeException.class)
        .hasMessage("Age cannot be negative.");
  }

  @Test
  public String testaddFavoriteToy(String toy) {

    Enum Color1 = null;

    Dog dog = new Dog(2, "Mutt", "male", Color1, true);

    String favoriteToy = "Squeaky Fish";

    assertThat(favoriteToy).isEqualTo("Squeaky Fish");

    return toy;
  }
}
