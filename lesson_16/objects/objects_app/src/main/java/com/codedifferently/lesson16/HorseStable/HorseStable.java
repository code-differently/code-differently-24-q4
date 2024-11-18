package com.codedifferently.lesson16.horseStable;

import java.util.ArrayList;
import java.util.List;

public class HorseStable {

  public enum StableType {
    PRIVATE,
    COMMERCIAL,
    RACE,
    SHOW
  }

  private final String name;
  private final String location;
  private final int capacity;
  private final StableType stableType;
  private final List<String> horses;

  // constructur
  public HorseStable(String name, String location, int capacity, StableType stableType) {
    this.name = name;
    this.location = location;
    this.capacity = capacity;
    this.stableType = stableType;
    this.horses = new ArrayList<>();
  }

  // getters & setters
  public String getName() {
    return name;
  }

  public String getLocation() {
    return location;
  }

  public int getCapacity() {
    return capacity;
  }

  public StableType getStableType() {
    return stableType;
  }

  public List<String> getHorses() {
    return horses;
  }

  // methods
  public String stableFull() {
    if (horses.size() >= capacity) {
      return "The stable is full. Cannot add more horses.";
    } else {
      return "Space available in the stable.";
    }
  }

  public void addHorse(String horseName) throws StableFullException {
    if (horses.size() >= capacity) {
      throw new StableFullException("Cannot add horse: stable is at full capacity!");
    }
    horses.add(horseName);
  }

  public void removeHorse(String horseName) {
    if (!horses.contains(horseName)) {
      throw new IllegalArgumentException("Horse not found in the stable.");
    }
    horses.remove(horseName);
  }

  public String displayHorses() {
    if (horses.isEmpty()) {
      return "No horses in the stable.";
    }
    return "There are " + horses.size() + " horses in " + name + ".";
  }
}
