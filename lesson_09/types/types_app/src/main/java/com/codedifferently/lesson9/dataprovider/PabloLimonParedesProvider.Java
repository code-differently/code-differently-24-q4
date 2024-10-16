package com.codedifferently.lesson9.dataprovider;

import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class PabloLimonParedesProvider extends DataProvider {
  public String getProviderName() {
    return "pablolimonparedes";
  }

  public Map<String, Class> getColumnTypeByName() {
    return Map.of(
    "column1", Float.class,
    "column2", Short.class,
    "column3", Integer.class,
    "column4", Long.class,
    "column5", String.class,
    "column6", Double.class,
    "column7", Boolean.class);
  }
}