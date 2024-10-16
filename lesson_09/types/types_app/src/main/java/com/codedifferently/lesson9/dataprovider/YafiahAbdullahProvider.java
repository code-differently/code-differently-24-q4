package com.codedifferently.lesson9.dataprovider;

import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class YafiahAbdullahProvider extends DataProvider {
  public String getProviderName() {
    return "yafiahabdullah";
  }

  public Map<String, Class> getColumnTypeByName() {
    return Map.of(
        "column1", String.class,
        "column2", Float.class,
        "column3", Double.class,
        "column4", Boolean.class,
        "column5", Integer.class,
        "column6", Short.class,
        "column7", Long.class);
  }
}
