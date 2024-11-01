package com.codedifferently.lesson16.ShawnDunsmore;

import java.util.ArrayList;

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


  public int getMoneyNeeded() {
    return moneyNeeded;
  }
}
