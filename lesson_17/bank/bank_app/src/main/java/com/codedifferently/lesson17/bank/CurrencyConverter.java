package com.codedifferently.lesson17.bank;

import com.codedifferently.lesson17.bank.exceptions.UnsupportedCurrencyException;
import java.util.Map;

public class CurrencyConverter {
  private static final Map<String, Double> exchangeRates =
      Map.of(
          "USD", 1.0,
          "EUR", 0.9,
          "GBP", 0.8,
          "JPY", 110.0);

  public static double convert(double amount, String fromCurrency, String toCurrency)
      throws UnsupportedCurrencyException {
    if (!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
      throw new UnsupportedCurrencyException("Unsupported currency type.");
    }
    double amountInUSD = amount / exchangeRates.get(fromCurrency);
    return amountInUSD * exchangeRates.get(toCurrency);
  }
}
