package com.codedifferently.lesson16;

import java.util.ArrayList;
import java.util.List;

public class Coins {

  public enum CoinType {
    PENNY,
    NICKEL,
    DIME,
    QUARTER
  }

  private final CoinType coinType;
  private final int coinValue;
  private final boolean coinIsRare;
  private final double coinGramWeight;
  private final int coinAge;
  private final List<String> material;
  private static final List<Coins> coinCollection = new ArrayList<>();

  // constructor
  public Coins(
      CoinType coinType,
      int coinValue,
      Boolean coinIsRare,
      Double coinGramWeight,
      int coinAge,
      List<String> material) {
    this.coinType = coinType;
    this.coinValue = coinValue;
    this.coinIsRare = coinIsRare;
    this.coinGramWeight = coinGramWeight;
    this.coinAge = coinAge;
    this.material = material;
  }

  // Getters and Setters
  public CoinType getCoinType() {
    return coinType;
  }

  public int getCoinValue() {
    return coinValue;
  }

  public boolean isCoinRare() {
    return coinIsRare;
  }

  public double getCoinGramWeight() {
    return coinGramWeight;
  }

  public int getCoinAge() {
    return coinAge;
  }

  public List<String> getMaterial() {
    return material;
  }

  public static int convertNickelsToDimes(int totalNickels) {
    if (totalNickels < 1) {
      throw new IllegalArgumentException("you do not have enough nickles");
    }
    return totalNickels / 2;
  }

  public static List<Coins> CollectCoins() {
    Coins penny = new Coins(Coins.CoinType.PENNY, 1, true, 2.5, 1977, List.of("zinc", "copper"));
    Coins nickel =
        new Coins(Coins.CoinType.NICKEL, 5, true, 5.0, 1953, List.of("nickel", "copper"));
    Coins dime = new Coins(CoinType.DIME, 10, true, 10.0, 1957, List.of("nickel", "copper"));

    coinCollection.add(penny);
    coinCollection.add(nickel);
    coinCollection.add(dime);
    return coinCollection;
  }
}
