package com.codedifferently.lesson9.dataprovider;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class NileJackProvider extends DataProvider {
  public String getProviderName() {
    return "nilejack";
  }

  public Map<String, Class> getColumnTypeByName() {
    return Map.of(
        "column1", Float.class,
        "column2", Integer.class,
        "column3", Short.class,
        "column4", String.class,
        "column5", Boolean.class,
        "column6", Double.class,
        "column7", Long.class);
  }
}
