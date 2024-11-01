package com.codedifferently.lesson16.boxer;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Boxer {
  public enum BoxerStyle {
    SWITCHHITTER,
    BOXERPUNCHER,
    SOUTHPAW,
    INFIGHTER,
    SLUGGER,
    OUTFIGHTER,
    ORTHODOX;
  }

  public class BoxerIsRetiredException extends Exception {
    public BoxerIsRetiredException(String message) {
      super(message);
    }
  }

  public class BoxerHasNoFightsException extends Exception {
    public BoxerHasNoFightsException(String message) {
      super(message);
    }
  }

  private String name;
  private HashMap<String, Character> fights;
  private int power;
  private int health;
  private BoxerStyle skillSet;
  private boolean ableToFight;
  private BoxerStyle[] style = BoxerStyle.values();
  private static Random rand = new Random();

  public Boxer(String name, int power, int health) {
    this.name = name;
    this.power = power;
    this.health = health;
    this.ableToFight = true;
    this.skillSet = BoxerStyle.ORTHODOX;
    fights = new HashMap<>();
  }

  public String getName() {
    return name;
  }

  public boolean getAbleToFight() {
    return ableToFight;
  }

  public void workout(int additional) {
    power += additional;
  }

  public int getPower() {
    return power;
  }

  public HashMap<String, Character> getFightHistory() {
    return fights;
  }

  public int getHealth() {
    return health;
  }

  public void rest() {
    health += 1;
  }

  public void rollSkillSet() {
    int randomIndex = rand.nextInt(style.length);
    BoxerStyle newStyle = style[randomIndex];
    skillSet = newStyle;
    System.out.println("Random style: " + skillSet);
  }

  public void addFights(String name, char d) throws BoxerIsRetiredException {
    if (ableToFight == false) {
      throw new BoxerIsRetiredException("Boxer is retired");
    }
    fights.put(name, d);
  }

  public void retire() throws BoxerIsRetiredException {
    checkRetirementStatus();
    ableToFight = false;
  }

  private void checkRetirementStatus() throws BoxerIsRetiredException {
    if (ableToFight == false) {
      throw new BoxerIsRetiredException("Boxer is already retired");
    }
  }

  private void checkBoxerHasntFoughtAnyone() throws BoxerHasNoFightsException {
    if (fights.isEmpty()) {
      throw new BoxerHasNoFightsException("Boxer hasnt fought anyone");
    }
  }

  public String getFights() throws BoxerHasNoFightsException {
    checkBoxerHasntFoughtAnyone();
    String fightsHad = "";
    for (Map.Entry<String, Character> entry : fights.entrySet()) {
      String key = entry.getKey();
      char value = entry.getValue();
      fightsHad += "You fought " + key + " " + value;
    }
    return fightsHad;
  }

  public void bout(Boxer boxer) throws BoxerIsRetiredException {
    if (ableToFight == false) {
      throw new BoxerIsRetiredException("Boxer is retired");
    }
    String boxerName = boxer.getName();
    if (power < boxer.getPower()) {
      ableToFight = false;
      fights.put(boxerName, 'L');
    } else if (power == boxer.getPower()) {
      fights.put(boxerName, 'D');
    } else {
      fights.put(boxerName, 'W');
    }
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setFights(HashMap<String, Character> fights) {
    this.fights = fights;
  }

  public void setPower(int power) {
    this.power = power;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public BoxerStyle getSkillSet() {
    return skillSet;
  }

  public void setSkillSet(BoxerStyle skillSet) {
    this.skillSet = skillSet;
  }

  public void setAbleToFight(boolean ableToFight) {
    this.ableToFight = ableToFight;
  }

  public BoxerStyle[] getStyle() {
    return style;
  }

  public void setStyle(BoxerStyle[] style) {
    this.style = style;
  }

  public static Random getRand() {
    return rand;
  }

  public static void setRand(Random rand) {
    Boxer.rand = rand;
  }
}
