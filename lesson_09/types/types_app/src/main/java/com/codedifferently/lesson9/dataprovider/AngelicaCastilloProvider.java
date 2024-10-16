package com.codedifferently.lesson9.dataprovider;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class AngelicaCastilloProvider extends DataProvider {
  public String getProviderName() {
    return "AngelicaCastillo";
  }

  public Map<String, Class> getColumnTypeByName() {
    return Map.of(
        "column1", Integer.class,
        "column2", Long.class,
        "column3", String.class,
        "column4", Float.class,
        "column5", Short.class,
        "column6", Boolean.class,
        "column7", Double.class);
  }
}
