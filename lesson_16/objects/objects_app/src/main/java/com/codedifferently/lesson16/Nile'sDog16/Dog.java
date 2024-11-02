import java.util.ArrayList;
import java.util.List;

public class Dog {
  public abstract class EnumToArray {
    enum Colors {
      WHITE,
      BROWN,
      BLONDE;
    }
//
    public static void main(Enum[] args) {

      List<Colors> colorList = new ArrayList<>();
      for (Colors color : Colors.values()) {}
    }

    // Attributes
    private int age;
    private String breed;
    private String gender;
    private Boolean isFed, isNotFed;
    private Colors color;

    // Constructor
    public void Dog(int age, String breed, String gender, Enum Colors, boolean isFed) {
      this.age = age;
      this.breed = breed;
      this.gender = gender;
      this.color = color;
      this.isFed = isFed | isNotFed;
    }

    public static int myDogsAge(int Age) {
      return 2;
    }

    public static String getbreed(String breed) {
      return "mutt";
    }

    public static String getGender(String Gender) {
      return "male";
    }

    public static Enum getColors(Enum Colors) {
      return Colors;
    }

    public Boolean isFed(Boolean Fed) {

      Boolean getFedStatus = isFed, isNotFed;

      return getFedStatus == Fed;
    }
  }
}
