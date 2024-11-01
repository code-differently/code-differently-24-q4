import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codedifferently.lesson16.SmartPhone.Name;
import com.codedifferently.lesson16.SmartPhone.SmartPhone;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SmartPhoneTest {
  private SmartPhone smartPhone;

  @BeforeEach
  void BeforeTest() {
    smartPhone =
        new SmartPhone(
            Name.APPLE,
            "Iphone14",
            50,
            true,
            new ArrayList<>(Arrays.asList("Phone,Contacts,Photos,Settings,Calender")));
    // Turn phone on
  }

  @Test
  void testSmartPhoneCharge() {
    // Arrange

    // Act
    smartPhone.chargeSmartPhone(); // Method with a loop to increase the battery percentage
    // Assert
    assertEquals(smartPhone.getBatteryPercentage(), 50);
  }

  @Test
  void testSmartPhoneApps() {
    // Arrange
    var smartPhoneApps = "Instagram";
    // Act
    smartPhone.addSmartPhoneApps("Instagram"); // Method Add an app to my phone
    // Assert
    assertEquals(smartPhone.getSmartPhoneApps(), "Phone,Contacts,Photos,Settings,Calender");
  }

  @Test
  void testSmartPhoneRemoveApps() {
    // Arrange
    smartPhone.addSmartPhoneApps("Instagram");
    // Act
    smartPhone.removeSmartPhoneApps("Instagram"); // Method that removes the app from my phone
    // Assert
    assertEquals(
        smartPhone.getSmartPhoneApps(),
        "Phone,Contacts,Photos,Settings,Calender"); // Method that gets the apps on my phone
  }

  @Test
  void testSmartPhoneVolume() {
    // Arrange
    var smartPhoneOldVolume = 2;
    smartPhone.getSmartPhoneVolume(); // Method current/Old Volume of phone

    // Act
    smartPhone.addSmartPhoneVolume(); // Method add Volume to smart phone

    // Assert
    assertNotEquals(smartPhone.getSmartPhoneVolume(), smartPhoneOldVolume);
  }

  private void getSmartPhonePercentage() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Test
  void testSmartPhonePowerStatus() {
    // Act
    boolean isPhoneOn = smartPhone.isPowerOn(); // Method to check if the phone is on

    // Assert
    assertTrue(isPhoneOn); // Checks that the phone is indeed on
  }
}
