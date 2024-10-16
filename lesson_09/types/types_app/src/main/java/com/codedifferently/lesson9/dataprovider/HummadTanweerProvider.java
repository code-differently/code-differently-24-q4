package com.codedifferently.lesson9.dataprovider;

import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class HummadTanweerProvider extends DataProvider {
  public String getProviderName() {
    return "hummadtanweer";
  }

  public Map<String, Class> getColumnTypeByName() {
    return Map.of(
        "column1", Short.class,
        "column2", Integer.class,
        "column3", Double.class,
        "column4", Long.class,
        "column5", String.class,
        "column6", Boolean.class,
        "column7", Float.class);
  }
}
