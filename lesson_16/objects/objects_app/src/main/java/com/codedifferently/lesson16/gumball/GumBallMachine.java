package com.codedifferently.lesson16.gumball;

import java.util.HashMap;
import java.util.Random;

public class GumBallMachine {
  private Colors colors; // Current color of the gumball
  private int gumBallCount; // Count of gumballs in the machine
  private boolean isBroken; // Status of the machine
  private HashMap<Colors, Integer> gumball; // Collection of gumballs
  private Random rand; // Random object for color selection

  // Constructor
  public GumBallMachine(int gumBallCount, boolean isBroken) {
    this.colors = Colors.GREEN; // Default color
    this.gumBallCount = gumBallCount;
    this.isBroken = isBroken;
    this.gumball = new HashMap<>();
    this.rand = new Random();
  }

  public Colors getCurrentColor() {
    return this.colors;
  }

  public void setRandomColors() {
    Colors[] colorArray = Colors.values();
    int randIndex = rand.nextInt(colorArray.length);
    this.colors = colorArray[randIndex]; // Set a random color
  }

  public int dispenseGumBallCount() {
    return this.gumBallCount;
  }

  public void dispenseGumBall(double quarter) throws invalidCoinInsertedException {
    if (quarter != 0.25) {
      throw new invalidCoinInsertedException("You need a quarter!");
    }
    if (gumBallCount > 0 && !isBroken) {
      gumBallCount--; // Dispense a gumball
    } else if (gumBallCount == 0) {
      throw new invalidCoinInsertedException("No more gumballs!");
    } else {
      throw new invalidCoinInsertedException("Machine is broken!");
    }
  }

  public boolean isBroken() {
    return isBroken;
  }

  public void breakMachine() {
    isBroken = true;
  }
}
