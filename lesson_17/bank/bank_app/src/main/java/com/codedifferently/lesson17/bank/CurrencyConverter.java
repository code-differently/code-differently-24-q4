package com.codedifferently.lesson17.bank;

import java.util.Currency;

public class CurrencyConverter {
  public static double convert(double amount, Currency fromCurrency, Currency toCurrency) {
    if (fromCurrency.equals(toCurrency)) {
      return amount; // No conversion needed
    }

    double exchangeRate = getExchangeRate(fromCurrency, toCurrency);
    return amount * exchangeRate;
  }

  private static double getExchangeRate(Currency fromCurrency, Currency toCurrency) {
    // Example exchange rates
    if (fromCurrency.getCurrencyCode().equals("USD")
        && toCurrency.getCurrencyCode().equals("EUR")) {
      return 0.85; // USD to EUR
    } else if (fromCurrency.getCurrencyCode().equals("EUR")
        && toCurrency.getCurrencyCode().equals("USD")) {
      return 1.18; // EUR to USD
    } else if (fromCurrency.getCurrencyCode().equals("USD")
        && toCurrency.getCurrencyCode().equals("GBP")) {
      return 0.75; // USD to GBP
    } else if (fromCurrency.getCurrencyCode().equals("GBP")
        && toCurrency.getCurrencyCode().equals("USD")) {
      return 1.33; // GBP to USD
    } else if (fromCurrency.getCurrencyCode().equals("EUR")
        && toCurrency.getCurrencyCode().equals("GBP")) {
      return 0.88; // EUR to GBP
    } else if (fromCurrency.getCurrencyCode().equals("GBP")
        && toCurrency.getCurrencyCode().equals("EUR")) {
      return 1.14; // GBP to EUR
    } else if (fromCurrency.getCurrencyCode().equals("USD")
        && toCurrency.getCurrencyCode().equals("CAD")) {
      return 1.25; // USD to CAD
    } else if (fromCurrency.getCurrencyCode().equals("CAD")
        && toCurrency.getCurrencyCode().equals("USD")) {
      return 0.80; // CAD to USD
    } else if (fromCurrency.getCurrencyCode().equals("EUR")
        && toCurrency.getCurrencyCode().equals("CAD")) {
      return 1.50; // EUR to CAD
    } else if (fromCurrency.getCurrencyCode().equals("CAD")
        && toCurrency.getCurrencyCode().equals("EUR")) {
      return 0.67; // CAD to EUR
    } else if (fromCurrency.getCurrencyCode().equals("GBP")
        && toCurrency.getCurrencyCode().equals("CAD")) {
      return 1.75; // GBP to CAD
    } else if (fromCurrency.getCurrencyCode().equals("CAD")
        && toCurrency.getCurrencyCode().equals("GBP")) {
      return 0.57; // CAD to GBP
    }
    // Add other currency pairs as needed
    return 1.0; // Default to 1.0 if no conversion is defined
  }
}
