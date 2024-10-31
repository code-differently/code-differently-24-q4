package com.codedifferently.lesson16;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CoinTest{

@test 
void testCheckCoininPocket(){
//arrange
Coins coin = new Coin(to fill in);

//act action
CoinType actualCoin = CoinType.nickel;   

//assert
assertEquals(nickel,coins.checkCoinType())
}
@test 
void testWeighCoins(){
//arrange
Coins coin = new Coin(to fill in);
double expectedWeight = 5.0;
//act
double coinWeight = coin.coinGramWeight();
//assert
assertEquals(expected, coinweight);
}
@test 
void testConvertCoins(){
//arrange
coinCollection = new Arraylist<>();
Coin nickel1 = new coin();
Coin nickel2 = new coin();
coinCollection.add(nickel1);
coinCollection.add(nickel2);

//act
Coin Dime = Coin.convertNickelsToDime();
//assert
Assert(10, Dime.getValue())
}
@Test 
void testCollectCoins(){
//arrange
coinCollection = new Arraylist<>();
Coin penny = new coin();
Coin nickel = new coin();
Coin dime = new coin ();
add coins to coin collection
//act
AddCoin(penny);
AddCoin(nickel);
AddCoin(dime);
//assert
AssertEquals(3,coinCollection());
}
@test
void testGetAgeCoin(){
//arrange
    Coin coin = new coin();
// Act
    int age = coin.geCoinAge();
// Assert
    assertEquals(1954, actual);
  }
}