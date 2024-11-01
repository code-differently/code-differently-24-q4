package com.codedifferently.lesson16.KimberleeObjectTest;

import java.util.Arrays;
import java.util.List;

public class BrandsArray {

  // Preferred brands stored in a List
  private static final List<String> PREFERRED_BRANDS =
      Arrays.asList("Beats", "Sony", "Bose", "SkullCandy", "Juicy");

  // Method to check if a brand is preferred
  public static Boolean isPreferredBrand(String brand) {
    return PREFERRED_BRANDS.contains(brand);
  }
}
