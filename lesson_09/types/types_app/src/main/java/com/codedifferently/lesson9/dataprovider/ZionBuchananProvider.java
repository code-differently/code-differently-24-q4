package com.codedifferently.lesson9.dataprovider;

import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class ZionBuchananProvider extends DataProvider {
  public String getProviderName() {
    return "zionbuchanan";
  }

  public Map<String, Class> getColumnTypeByName() {
    return Map.of(
        "column1", Boolean.class,
        "column2", Short.class,
        "column3", Float.class,
        "column4", Long.class,
        "column5", String.class,
        "column6", Integer.class,
        "column7", Double.class);
  }
}
