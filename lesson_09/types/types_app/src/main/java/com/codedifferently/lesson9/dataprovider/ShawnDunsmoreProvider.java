package main.java.com.codedifferently.lesson9.dataprovider;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.codedifferently.lesson9.dataprovider.DataProvider;

@Service
public class ShawnDunsmoreProvider extends DataProvider {
  public String getProviderName() {
    return "shawmdunsmore";
  }

  public Map<String, Class> getColumnTypeByName() {
    return Map.of(
        "column1", Float.class,
        "column2", Integer.class,
        "column3", Float.class,
        "column4", Integer.class,
        "column5", String.class,
        "column6", Integer.class,
        "column7", Boolean.class);
  }
}
