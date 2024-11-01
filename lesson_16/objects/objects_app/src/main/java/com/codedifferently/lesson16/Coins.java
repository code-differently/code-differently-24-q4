package com.codedifferently.lesson16;

import java.util.List;

public class Coins {

    public enum CoinType{
        PENNY, NICKEL, DIME, QUARTER
    }
      private final CoinType coinType;
      private final int coinValue;    
      private final boolean coinIsRare;
      private final double coinGramWeight;
      private final int coinAge;
      private final List<String> material;
    
        //constructor
    public Coins(CoinType coinType, int coinValue, Boolean coinIsRare, Double coinGramWeight,int coinAge, List<String> material) {
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
