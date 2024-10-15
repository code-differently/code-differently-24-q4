package com.codedifferently.lesson9.dataprovider;

import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class AmiyahJonesProvider extends DataProvider {
  public String getProviderName() {
    return "amiyahjones";
  }

  public Map<String, Class> getColumnTypeByName() {
    return Map.of(
        "column4", Boolean.class,
        "column2", Integer.class,
        "column1", Long.class,
        "column3", String.class,
        "column6", Float.class,
        "column7", Double.class,
        "column5", Short.class);
  }
}
