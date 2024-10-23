package main.java.com.codedifferently.lesson9.dataprovider;

import com.codedifferently.lesson9.dataprovider.DataProvider;
import java.util.Map;
import org.springframework.stereotype.Service;

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
