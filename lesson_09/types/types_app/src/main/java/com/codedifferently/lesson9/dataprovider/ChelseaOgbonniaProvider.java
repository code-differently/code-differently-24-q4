package com.codedifferently.lesson9.dataprovider;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ChelseaOgbonniaProvider extends DataProvider {
  public String getProviderName() {
    return "chelseaogbonnia";
  }

  public Map<String, Class> getColumnTypeByName() {
    return Map.of(
        "column1", Boolean.class,
        "column2", String.class,
        "column3", Long.class,
        "column4", Float.class,
        "column5", Short.class,
        "column6", Double.class,
        "column7", Integer.class);
  }
}
