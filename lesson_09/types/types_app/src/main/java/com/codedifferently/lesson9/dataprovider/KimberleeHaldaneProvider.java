package main.java.com.codedifferently.lesson9.dataprovider;

import com.codedifferently.lesson9.dataprovider.DataProvider;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class KimberleeHaldaneProvider extends DataProvider {
  public String getProviderName() {
    return "kimberleehaldane";
  }

  public Map<String, Class> getColumnTypeByName() {
    return Map.of(
        "column1", Float.class,
        "column2", Double.class,
        "column3", Long.class,
        "column4", Integer.class,
        "column5", String.class,
        "column6", Boolean.class,
        "column7", Short.class);
  }
}
