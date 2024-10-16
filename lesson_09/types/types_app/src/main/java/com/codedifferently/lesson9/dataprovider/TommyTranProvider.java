package com.codedifferently.lesson9.dataprovider;

import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class TommyTranProvider extends DataProvider {
  public String getProviderName() {
    return "tommytran";
  }

  public Map<String, Class> getColumnTypeByName() {
    return Map.of(
        "column1", Integer.class,
        "column2", Long.class,
        "column3", Short.class,
        "column4", Boolean.class,
        "column5", String.class,
        "column6", Float.class,
        "column7", Double.class);
  }
}
