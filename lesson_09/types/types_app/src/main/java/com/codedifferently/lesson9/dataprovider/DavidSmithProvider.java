package com.codedifferently.lesson9.dataprovider;

import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class DavidSmithProvider extends DataProvider {
  public String getProviderName() {
    return "davidsmith";
  }

  public Map<String, Class> getColumnTypeByName() {
    return Map.of(
        "column1", Float.class,
        "column2", Long.class,
        "column3", Short.class,
        "column4", Double.class,
        "column5", Boolean.class,
        "column6", String.class,
        "column7", Integer.class);
  }
}
