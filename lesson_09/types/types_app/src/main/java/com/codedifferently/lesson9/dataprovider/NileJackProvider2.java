package com.codedifferently.lesson9.dataprovider;

import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class NileJackProvider2 extends DataProvider {
  @Override
  public String getProviderName() {
    return "nilejack";
  }

  @SuppressWarnings("rawtypes")
  @Override
  public Map<String, Class> getColumnTypeByName() {
    return Map.of(
        "column1", Double.class,
        "column2", String.class,
        "column3", Short.class,
        "column4", Integer.class,
        "column5", Boolean.class,
        "column6", Float.class,
        "column7", Long.class);
  }
}
