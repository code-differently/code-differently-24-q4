package com.codedifferently.lesson9.dataprovider;

import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class JosephCaballeroProvider extends DataProvider {
  public String getProviderName() {
    return "josephcaballero";
  }

  public Map<String, Class> getColumnTypeByName() {
    return Map.of(
        "column1", Boolean.class,
        "column2", Integer.class,
        "column3", Short.class,
        "column4", Long.class,
        "column5", Double.class,
        "column6", String.class,
        "column7", Float.class);
  }
}
