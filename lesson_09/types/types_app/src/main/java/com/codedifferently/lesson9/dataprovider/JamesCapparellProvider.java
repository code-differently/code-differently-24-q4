package com.codedifferently.lesson9.dataprovider;

import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class JamesCapparellProvider extends DataProvider {
  public String getProviderName() {
    return "jamescapparell";
  }

  public Map<String, Class> getColumnTypeByName() {
    return Map.of(
        "column1", Float.class,
        "column2", Short.class,
        "column3", Long.class,
        "column4", Boolean.class,
        "column5", Double.class,
        "column6", Integer.class,
        "column7", String.class);
  }
}
