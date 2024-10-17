package com.codedifferently.lesson9.dataprovider;

import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class NileJacksonProvider extends DataProvider {

  @Override
  public String getProviderName() {

    return "nilejack";
  }

  @SuppressWarnings("rawtypes")
  @Override
  public Map<String, Class> getColumnTypeByName() {

    return Map.of(
        "column1", Boolean.class,
        "column2", Double.class,
        "column3", Integer.class,
        "column4", Long.class,
        "column5", Short.class,
        "column6", Float.class,
        "column7", String.class);
  }
}
