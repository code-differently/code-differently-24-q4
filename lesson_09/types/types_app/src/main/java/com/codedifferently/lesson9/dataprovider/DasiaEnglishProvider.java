package com.codedifferently.lesson9.dataprovider;

import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class DasiaEnglishProvider extends DataProvider {
  public String getProviderName() {
    return "dasiaenglish";
  }

  public Map<String, Class> getColumnTypeByName() {
    return Map.of(
        "column1", Short.class,
        "column2", Boolean.class,
        "column3", Double.class,
        "column4", Float.class,
        "column5", Integer.class,
        "column6", String.class,
        "column7", Long.class);
  }
}
