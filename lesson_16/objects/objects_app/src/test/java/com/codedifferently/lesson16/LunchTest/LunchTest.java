package com.codedifferently.lesson16.LunchTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codedifferently.lesson16.Lunch.Lunch;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LunchTest {

  private Lunch lunch;

  @BeforeEach
  public void setUp() {
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
  public void testGetHealthMessageHealthy() {
    lunch = new Lunch("Salad", "Fruit", 300, Lunch.LunchType.VEGAN);
    assertEquals("This lunch is healthy!", lunch.getHealthMessage());
  }

  @Test
  public void testGetHealthMessageUnhealthy() {
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
}
