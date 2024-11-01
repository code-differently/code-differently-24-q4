package com.codedifferently.lesson16.LunchTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import com.codedifferently.lesson16.Lunch.InvalidCalorieException;
import com.codedifferently.lesson16.Lunch.Lunch;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LunchTest {

  private Lunch lunch;

  @BeforeEach
  public void setUp() throws InvalidCalorieException {
    lunch = new Lunch("Grilled Chicken", "Caesar Salad", 450, Lunch.LunchType.NON_VEGETARIAN);
  }

  @Test
  public void testAddDrink() {
    lunch.addDrink("Iced Tea");
    lunch.addDrink("Lemonade");

    // Verify that drinks were added correctly
    ArrayList<String> expectedDrinks = new ArrayList<>();
    expectedDrinks.add("Iced Tea");
    expectedDrinks.add("Lemonade");

    // Use reflection or a method to get the drinks if you have one
    assertEquals(expectedDrinks.size(), lunch.getDrinks().size());
    assertTrue(lunch.getDrinks().containsAll(expectedDrinks));
  }

  @Test
  public void testGetHealthMessageHealthy() throws InvalidCalorieException {
    lunch = new Lunch("Salad", "Fruit", 300, Lunch.LunchType.VEGAN);
    assertEquals("This lunch is healthy!", lunch.getHealthMessage());
  }

  @Test
  public void testGetHealthMessageUnhealthy() throws InvalidCalorieException {
    lunch = new Lunch("Cheeseburger", "Fries", 800, Lunch.LunchType.NON_VEGETARIAN);
    assertEquals("This lunch is high in calories.", lunch.getHealthMessage());
  }

  @Test
  public void testDisplayDrinks() {
    lunch.addDrink("Water");
    // Capture output or verify by using a mocked System.out or similar approach
    // For simplicity, you could check if a drink was added and assume display works
    assertTrue(lunch.getDrinks().contains("Water"));
  }

  // Helper method to access the drinks list for testing
  public ArrayList<String> getDrinks() {
    return lunch.getDrinks();
  }

  @Test
  public void testLunchType() throws InvalidCalorieException {
    lunch = new Lunch("Tofu Stir Fry", "Brown Rice", 350, Lunch.LunchType.VEGAN);
    assertEquals(Lunch.LunchType.VEGAN, lunch.getLunchType());
  }

  @Test
  public void testAddMultipleDrinks() {
    lunch.addDrink("Soda");
    lunch.addDrink("Juice");
    lunch.addDrink("Coffee");

    ArrayList<String> expectedDrinks = new ArrayList<>();
    expectedDrinks.add("Soda");
    expectedDrinks.add("Juice");
    expectedDrinks.add("Coffee");

    assertEquals(expectedDrinks.size(), lunch.getDrinks().size());
    assertTrue(lunch.getDrinks().containsAll(expectedDrinks));
  }

  @Test
  public void testHighCalories() throws InvalidCalorieException {
    lunch = new Lunch("Double Cheeseburger", "Loaded Fries", 2000, Lunch.LunchType.NON_VEGETARIAN);
    assertEquals(2000, lunch.getCalories());
  }

  @Test
  public void testEmptyMainDish() throws InvalidCalorieException {
    lunch = new Lunch("", "Salad", 300, Lunch.LunchType.VEGETARIAN);
    assertEquals("", lunch.getMainDish());
  }

  // Expected to fail with exception message: Calories cannot be zero or negative
  @Test
  public void testZeroCaloriesThrowsException() {
    try {
      lunch = new Lunch("Grilled Chicken", "Caesar Salad", 0, Lunch.LunchType.NON_VEGETARIAN);
      fail("Expected InvalidCalorieException to be thrown");
    } catch (InvalidCalorieException e) {
      assertEquals("Calories cannot be zero or negative.", e.getMessage());
    }
  }

  // Expected to fail with exception message: Calories cannot be zero or negative.
  @Test
  public void testNegativeCaloriesThrowsException() {
    try {
      lunch = new Lunch("Grilled Chicken", "Caesar Salad", -100, Lunch.LunchType.NON_VEGETARIAN);
      fail("Expected InvalidCalorieException to be thrown");
    } catch (InvalidCalorieException e) {
      assertEquals("Calories cannot be zero or negative.", e.getMessage());
    }
  }
}
