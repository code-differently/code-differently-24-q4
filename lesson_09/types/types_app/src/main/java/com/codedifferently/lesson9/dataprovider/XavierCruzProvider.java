package main.java.com.codedifferently.lesson9.dataprovider;

import com.codedifferently.lesson9.dataprovider.DataProvider;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class XavierCruzProvider extends DataProvider {
  public String getProviderName() {
    return "xaviercruz";
  }

  public Map<String, Class> getColumnTypeByName() {
    return Map.of(
        "column1", Short.class,
        "column2", Double.class,
        "column3", Long.class,
        "column4", Integer.class,
        "column5", Double.class,
        "column6", String.class,
        "column7", Boolean.class);
  }
}
