package com.codedifferently.lesson9.dataprovider;

import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class DwightBlueProvider extends DataProvider {
  public String getProviderName() {
    return "dwightblue";
  }

  public Map<String, Class> getColumnTypeByName() {
    return Map.of(
        "column1", Long.class,
        "column2", Boolean.class,
        "column3", Float.class,
        "column4", String.class,
        "column5", Double.class,
        "column6", Short.class,
        "column7", Integer.class);
  }
}
