package learn.core.java.concepts.learningavalibraries;
import com.jayway.jsonpath.JsonPath;

import java.util.List;

public class JsonPathExample {
    public static void main(String[] args) {
        String json = """
        {
          "store": {
            "book": [
              { "category": "fiction", "price": 10.99 },
              { "category": "horror", "price": 12.99 }
            ],
            "bicycle": {
              "color": "red",
              "price": 19.95
            }
          }
        }
        """;

        // Example: Get all book categories
        List<String> categories = JsonPath.read(json, "$.store.book[*].category");
        System.out.println("Categories: " + categories);

        // Example: Get the price of the bicycle
        double bicyclePrice = JsonPath.read(json, "$.store.bicycle.price");
        System.out.println("Bicycle Price: " + bicyclePrice);
    }
}
