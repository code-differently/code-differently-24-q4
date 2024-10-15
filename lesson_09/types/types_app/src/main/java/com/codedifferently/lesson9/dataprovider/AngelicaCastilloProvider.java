package com.codedifferently.lesson9.dataprovider;

import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class AngelicaCastilloProvider extends DataProvider {
  public String getProviderName() {
    return "AngelicaCastillo";
  }

  public Map<String, Class> getColumnTypeByName() {
    return Map.of(
        "column1", Float.class,
        "column2", Double.class,
        "column3", Long.class,
        "column4", Integer.class,
        "column5", Boolean.class,
        "column6", String.class,
        "column7", Short.class);
  }
}
