package com.codedifferently.Coins;

    //class
public class Coins {

public enum CoinType{
    penny, nickel, dime, quarter
}
  private int coinValue;    
  private boolean coinIsRare;
  private double coinGramWeight;
  private int coinAge;
  private Arraylist<Coins> coincollection;

    //constructor
public Coins(CoinType coinType, int coinValue, Boolean coinIsRare, Double coinGramWeight) {
    this.coinType = coinType;
    this.coinValue = coinValue;
    this.coinIsRare = coinIsRare;
    this.coinGramWeight = coinGramWeight;
    this.coinAge = coinAge;
    this.coincollection = coinCollection;
  }
}
// for loop for coin collection and check if rare add to collection
