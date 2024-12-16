import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    private int id;
    private String title;
    private double price;
    private String category;

    // Constructor
    public Product(int id, String title, double price, String category) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.category = category;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    // ToString for printing
    @Override
    public String toString() {
        return "Product{" +
                "ID=" + id +
                ", Title='" + title + '\'' +
                ", Price=" + price +
                ", Category='" + category + '\'' +
                '}';
    }
}

public class ProductFilterExample {
    public static void main(String[] args) {
        // Create an ArrayList of products
        List<Product> products = new ArrayList<>();

        // Add products to the list
        products.add(new Product(1, "Laptop", 1500.00, "Electronics"));
        products.add(new Product(2, "Smartphone", 800.00, "Electronics"));
        products.add(new Product(3, "Desk Chair", 120.00, "Furniture"));
        products.add(new Product(4, "Book", 20.00, "Books"));
        products.add(new Product(5, "Tablet", 400.00, "Electronics"));
        products.add(new Product(6, "Coffee Table", 200.00, "Furniture"));

        // Filter products by category "Electronics"
        List<Product> electronics = products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Electronics"))
                .collect(Collectors.toList());

        System.out.println("Electronics:");
        electronics.forEach(System.out::println);

        // Filter products with price less than 500
        List<Product> affordableProducts = products.stream()
                .filter(p -> p.getPrice() < 500)
                .collect(Collectors.toList());

        System.out.println("\nProducts with Price < 500:");
        affordableProducts.forEach(System.out::println);

        // Filter products whose title contains the word "Table"
        List<Product> tableProducts = products.stream()
                .filter(p -> p.getTitle().toLowerCase().contains("table"))
                .collect(Collectors.toList());

        System.out.println("\nProducts with 'Table' in the Title:");
        tableProducts.forEach(System.out::println);
    }
}
