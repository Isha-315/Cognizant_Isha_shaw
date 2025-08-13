
import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {
        // EXPLICIT Product[] declaration
        Product[] products = new Product[] {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mouse", "Electronics"),
            new Product(103, "Shirt", "Clothing"),
            new Product(104, "Shoes", "Footwear"),
            new Product(105, "Keyboard", "Electronics")
        };

        // ✅ WORKING sort with lambda – Java knows it's Product[]
        Arrays.sort(products, (Product a, Product b) ->
            a.productName.compareToIgnoreCase(b.productName)
        );

        // Linear Search
        Product result1 = SearchAlgorithms.linearSearch(products, "Shirt");
        System.out.println("Linear Search Result: " + result1);

        // Binary Search
        Product result2 = SearchAlgorithms.binarySearch(products, "Shirt");
        System.out.println("Binary Search Result: " + result2);
    }
}
