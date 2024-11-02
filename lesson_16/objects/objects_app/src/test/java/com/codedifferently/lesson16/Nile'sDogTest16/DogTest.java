import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class DogTest {
  // public static void newDog(String[] args) {

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
  private Enum testGetColors(Enum Colors) {
    Enum getColors = Colors;
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
    var getFedStatus = Fed | isNotFed;
    assertThat(getFedStatus).isTrue();
    assertThat(Fed).isFalse();
    assertThat(getFedStatus).isEqualTo(isFed);
    return getFedStatus == Fed;
  }
}
