import java.util.Arrays;

public class ECommerceSearch {

    // Linear Search Implementation
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.getProductId() == targetId) {
                return product; // Found
            }
        }
        return null; // Not found
    }

    // Binary Search Implementation
    public static Product binarySearch(Product[] sortedProducts, int targetId) {
        int low = 0;
        int high = sortedProducts.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid potential overflow
            Product midProduct = sortedProducts[mid];

            if (midProduct.getProductId() == targetId) {
                return midProduct; // Found
            }

            if (midProduct.getProductId() < targetId) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }
        return null; // Not found
    }

    public static void main(String[] args) {
        // Setup: Create an array of products
        Product[] products = {
                new Product(5, "Laptop", "Electronics"),
                new Product(2, "Smartphone", "Electronics"),
                new Product(8, "Desk Chair", "Furniture"),
                new Product(1, "Coffee Maker", "Appliances"),
                new Product(9, "Headphones", "Electronics")
        };

        // --- Linear Search Demonstration ---
        System.out.println("--- Testing Linear Search ---");
        Product foundProductLinear = linearSearch(products, 8);
        System.out.println("Found with Linear Search: " + foundProductLinear);

        Product notFoundProductLinear = linearSearch(products, 10);
        System.out.println("Found with Linear Search (ID 10): " + notFoundProductLinear);
        System.out.println();


        // --- Binary Search Demonstration ---
        System.out.println("--- Testing Binary Search ---");
        // IMPORTANT: Binary search requires a sorted array.
        Arrays.sort(products); // Sorts the array based on the compareTo method
        System.out.println("Sorted products for Binary Search:");
        for(Product p : products) {
            System.out.println(p);
        }

        Product foundProductBinary = binarySearch(products, 8);
        System.out.println("Found with Binary Search: " + foundProductBinary);

        Product notFoundProductBinary = binarySearch(products, 10);
        System.out.println("Found with Binary Search (ID 10): " + notFoundProductBinary);
    }
}
