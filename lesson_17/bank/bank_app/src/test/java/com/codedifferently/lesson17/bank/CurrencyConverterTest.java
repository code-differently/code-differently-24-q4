package com.codedifferently.lesson17.bank;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Currency;
import org.junit.jupiter.api.Test;

class CurrencyConverterTest {

  @Test
  void testConvert_EuroToCAD() {
    // Arrange
    double amountInEUR = 100.0;
    Currency euro = Currency.getInstance("EUR");
    Currency cad = Currency.getInstance("CAD");

    // Act
    double convertedAmount = CurrencyConverter.convert(amountInEUR, euro, cad);

    // Assert
    double expectedAmount = amountInEUR * 1.50;
    assertThat(convertedAmount).isEqualTo(expectedAmount);
  }

  @Test
  void testConvert_GBPToCAD() {
    // Arrange
    double amountInGBP = 100.0;
    Currency gbp = Currency.getInstance("GBP");
    Currency cad = Currency.getInstance("CAD");

    // Act
    double convertedAmount = CurrencyConverter.convert(amountInGBP, gbp, cad);

    // Assert
    double expectedAmount = amountInGBP * 1.75; // GBP to CAD exchange rate
    assertThat(convertedAmount).isEqualTo(expectedAmount);
  }
}
