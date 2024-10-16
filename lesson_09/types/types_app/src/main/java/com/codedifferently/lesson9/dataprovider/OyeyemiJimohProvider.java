package com.codedifferently.lesson9.dataprovider;

import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class OyeyemiJimohProvider extends DataProvider {
  public String getProviderName() {
    return "oyeyemijimoh";
  }

  public Map<String, Class> getColumnTypeByName() {
    return Map.of(
        "column1", Short.class,
        "column2", Long.class,
        "column3", Boolean.class,
        "column4", Integer.class,
        "column5", Double.class,
        "column6", String.class,
        "column7", Float.class);
  }
}
