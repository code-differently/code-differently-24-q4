package data;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.codedifferently.lesson9.dataprovider.DataProvider;

@Service
public class ChigazoGrahamProvider extends DataProvider {
  public String getProviderName() {
    return "chigazograham";
  }

  public Map<String, Class> getColumnTypeByName() {
    return Map.of(
        "column1",String.class,
        "column2",Boolean.class,
        "column3", Long.class,
        "column4", Float.class,
        "column5", Double.class,
        "column6", Short.class,
        "column7", Integer.class);
  }
}

