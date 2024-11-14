package com.codedifferently.lesson16.shawndunsmore;

import java.util.ArrayList;
import java.util.Collections;

public class SlotMachine {
  private int numOfSlots;
  private int payAmount;
  private String name;
  private BuyType buyType;
  private ArrayList<String> iconList;
  private int moneyNeeded;

  public SlotMachine(
      int numOfSlots,
      int payAmount,
      String name,
      BuyType buyType,
      ArrayList<String> iconList,
      int moneyNeeded) {
    this.numOfSlots = numOfSlots;
    this.payAmount = payAmount;
    this.name = name;
    this.buyType = buyType;
    this.iconList = iconList;
    this.moneyNeeded = moneyNeeded;
  }

  public int getNumOfSlots() {
    return numOfSlots;
  }

  public int getPayAmount() {
    return payAmount;
  }

  public String getName() {
    return name;
  }

  public BuyType getBuyType() {
    return buyType;
  }

  public ArrayList<String> getIconList() {
    return iconList;
  }

  public int payOut() {
    if (buyType.equals(BuyType.DOUBLE_CHANCE)) {
      return payAmount * 2;
    }

    if (buyType.equals(BuyType.BONUS_BUY)) {
      return payAmount * 3;
    }
    return payAmount;
  }

  public ArrayList<String> spin(int money) throws InvalidPayAmountException {
    if (money < moneyNeeded) {
      throw new InvalidPayAmountException("Amount inavalid");
    }
    Collections.shuffle(iconList);
    return iconList;
  }

  public ArrayList<String> spin(int money, int numOfSpins) throws InvalidPayAmountException {
    if (money < moneyNeeded) {
      throw new InvalidPayAmountException("Amount inavalid");
    }
    for (int i = 0; i < numOfSpins; i++) {
      Collections.shuffle(iconList);
    }

    return iconList;
  }

  public int getMoneyNeeded() {
    return moneyNeeded;
  }

  public void setNumOfSlots(int numOfSlots) {
    this.numOfSlots = numOfSlots;
  }

  public void setPayAmount(int payAmount) {
    this.payAmount = payAmount;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBuyType(BuyType buyType) {
    this.buyType = buyType;
  }

  public void setIconList(ArrayList<String> iconList) {
    this.iconList = iconList;
  }

  public void setMoneyNeeded(int moneyNeeded) {
    this.moneyNeeded = moneyNeeded;
  }
}
