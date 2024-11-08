package com.codedifferently.lesson16.coins;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import com.codedifferently.lesson16.coins.Coins.CoinType;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class CoinTest {

  @Test
  void testCheckCoinInPocket() {
    // arrange
    Coins coin = new Coins(CoinType.NICKEL, 5, false, 5.0, 1953, List.of("nickel", "copper"));
    // act action
    Coins.CoinType actualCoin = coin.getCoinType();
    int coinValue = coin.getCoinValue();
    boolean coinRarity = coin.isCoinRare();

    // assert
    assertEquals(CoinType.NICKEL, actualCoin);
    assertEquals(5, coinValue);
    assertFalse(coinRarity);
  }

  @Test
  void testWeighCoins() {
    // arrange
    Coins coin = new Coins(CoinType.NICKEL, 5, false, 5.0, 1953, List.of("nickel", "copper"));
    double expectedWeight = 5.0;
    // act
    double coinWeight = coin.getCoinGramWeight();
    // assert
    assertEquals(expectedWeight, coinWeight);
  }

  @Test
  void testConvertCoins() {
    // arrange
    List<Coins> coinCollection = new ArrayList<>();
    coinCollection.add(new Coins(CoinType.NICKEL, 5, false, 5.0, 1953, List.of()));
    coinCollection.add(new Coins(CoinType.NICKEL, 5, false, 5.0, 1953, List.of()));
    // act
    int totalNickles = coinCollection.size();
    int dimes = Coins.convertNickelsToDimes(totalNickles);
    // assert
    assertEquals(1, dimes);
  }

  @Test
  void testCoinCollection() {
    // arrange
    List<Coins> coinCollection = Coins.setCoinCollection();

    assertEquals(3, coinCollection.size());
  }

  @Test
  void testGetAgeCoin() {
    // arrange
    Coins dime = new Coins(CoinType.DIME, 10, true, 10.0, 1957, List.of("nickel", "copper"));
    // Act
    int age = dime.getCoinAge();
    // Assert
    assertEquals(1957, age);
  }

  @Test
  void testGetMaterialComposition() {
    // arrange
    Coins penny = new Coins(CoinType.PENNY, 1, true, 2.5, 1977, List.of("zinc", "copper"));
    // act
    List<String> materialComposition = penny.getMaterial();
    // assert
    assertThat(materialComposition).containsExactly("zinc", "copper");
  }

  @Test
  void testCannotConvert() {
    assertThatThrownBy(
            () -> {
              Coins.convertNickelsToDimes(0);
            })
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("you do not have enough nickles");
  }
}
