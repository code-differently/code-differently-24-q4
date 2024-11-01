package com.codedifferently.lesson16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class CoinTest{

@Test 
  void testCheckCoinInPocket(){
//arrange
    Coins coin = new Coin(Coins.CoinType.NICKEL, 5, false, 5.0, 1966, new ArrayList<>(nickel,copper));
//act action
    CoinType actualCoin = CoinType.NICKEL;   

//assert
    assertEquals(CoinType.NICKEL,coins.checkCoinType())
}
@Test 
  void testWeighCoins(){
//arrange
    Coins coin = new Coin(Coins.CoinType.NICKEL, 5, false, 5.0, 1966, new ArrayList<>(nickel,copper));
    double expectedWeight = 5.0;
//act
    double coinWeight = coin.coinGramWeight();
//assert
    assertEquals(expected, coinWeight);
}
@Test 
  void testConvertCoins(){
//arrange
    coinCollection = new Arraylist<>();
    Coin nickel1 = new Coin();
    Coin nickel2 = new coin();
    coinCollection.add(nickel1);
    coinCollection.add(nickel2);

//act
    Coin Dime = Coin.convertNickelsToDime(nickel1, nickel2);
//assert
    Assert(10, Dime.getValue())
}
@Test 
  void testCollectCoins(){
//arrange
    coinCollection = new Arraylist<>();
    Coin penny = new Coin();
    Coin nickel = new Coin();
    Coin dime = new Coin ();
//act
    AddCoin(penny);
    AddCoin(nickel);
    AddCoin(dime);
//assert
    AssertEquals(3,coinCollection());
}
@Test
  void testGetAgeCoin(){
//arrange
    Coin coin = new Coin();
// Act
    int age = coin.geCoinAge();
// Assert
    assertEquals(1954, age);
  }
@Test  
  void testGetMaterialComposition(){
    Coin Penny = new Coin(new Arraylist<>(Array.asList("copper,zinc")))

}
}
