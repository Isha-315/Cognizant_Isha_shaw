

public class SearchAlgorithms {
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String targetName) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = targetName.compareToIgnoreCase(products[mid].productName);
            if (cmp == 0) return products[mid];
            if (cmp < 0) high = mid - 1;
            else low = mid + 1;
        }
        return null;
    }
}
