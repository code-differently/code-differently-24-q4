package com.codedifferently.lesson16;

public class Coins {

public enum CoinType{
    PENNY, NICKEL, DIME, QUARTER
}
  private CoinType coinType;
  private int coinValue;    
  private boolean coinIsRare;
  private double coinGramWeight;
  private int coinAge;
  private Arraylist<String> material;

    //constructor
public Coins(CoinType coinType, int coinValue, Boolean coinIsRare, Double coinGramWeight, Arraylist material) {
    this.coinType = coinType;
    this.coinValue = coinValue;
    this.coinIsRare = coinIsRare;
    this.coinGramWeight = coinGramWeight;
    this.coinAge = coinAge;
    this.material = material;
}
  //Getters and Setters
public CoinType getCoinType(){
    return coinType; 
}
public int getCoinValue(){
    return coinValue;
}
public boolean isCoinRare(){
    return coinIsRare; 
}
public double getCoinGramWeight(){
    return coinGramWeight;
}
public int getCoinAge() {
    return coinAge;
}
public List<String> getMaterial(){
    return material;}
}
//todo
// for loop for coin collection and check if rare add to collection