package com.codedifferently.lesson17.bank;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Currency;
import org.junit.jupiter.api.Test;

class CurrencyConverterTest {

  @Test
  void testConvert_EuroToCAD() {
    double amountInEUR = 100.0;
    Currency euro = Currency.getInstance("EUR");
    Currency cad = Currency.getInstance("CAD");
    double convertedAmount = CurrencyConverter.convert(amountInEUR, euro, cad);
    double expectedAmount = amountInEUR * 1.50; // EUR to CAD exchange rate
    assertThat(convertedAmount).isEqualTo(expectedAmount);
  }

  @Test
  void testConvert_GBPToCAD() {
    double amountInGBP = 100.0;
    Currency gbp = Currency.getInstance("GBP");
    Currency cad = Currency.getInstance("CAD");
    double convertedAmount = CurrencyConverter.convert(amountInGBP, gbp, cad);
    double expectedAmount = amountInGBP * 1.75; // GBP to CAD exchange rate
    assertThat(convertedAmount).isEqualTo(expectedAmount);
  }
}
