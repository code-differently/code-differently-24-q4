package com.codedifferently.lesson16.Lunch;

import java.util.ArrayList;

public class Lunch {

  public enum LunchType {
    VEGETARIAN,
    NON_VEGETARIAN,
    VEGAN,
    GLUTEN_FREE
  }

  // Member variables
  private final String mainDish; // String type
  private final String sideDish; // String type
  private final int calories; // Integer type
  private final LunchType lunchType; // Enum type
  private final ArrayList<String> drinks; // Collection type (ArrayList)

  // Constructor
  public Lunch(String mainDish, String sideDish, int calories, LunchType lunchType) throws InvalidCalorieException {
    if (calories <= 0) {
        throw new InvalidCalorieException("Calories cannot be zero or negative.");
    }
    this.mainDish = mainDish;
    this.sideDish = sideDish;
    this.calories = calories;
    this.lunchType = lunchType;
    this.drinks = new ArrayList<>();
  }

  // Member function to add a drink
  public void addDrink(String drink) {
    drinks.add(drink);
  }

  // Member function to get a healthy message based on calories
  public String getHealthMessage() {
    return (calories < 500) ? "This lunch is healthy!" : "This lunch is high in calories.";
  }

  // Member function to display all drinks
  public void displayDrinks() {
    System.out.println("Available drinks:");
    for (String drink : drinks) {
      System.out.println("- " + drink);
    }
  }

  // Getters for member variables (optional)
  public String getMainDish() {
    return mainDish;
  }

  public String getSideDish() {
    return sideDish;
  }

  public int getCalories() {
    return calories;
  }

  public LunchType getLunchType() {
    return lunchType;
  }

  public ArrayList<String> getDrinks() {
    return drinks;
  }
}
