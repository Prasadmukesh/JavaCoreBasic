import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Initial list: " + fruits);

        // Insert element at index 1
        fruits.add(1, "Mango");
        System.out.println("After inserting Mango at index 1: " + fruits);

        // Access element at index 2
        String fruit = fruits.get(2);
        System.out.println("Element at index 2: " + fruit);

        // Update element at index 0
        fruits.set(0, "Orange");
        System.out.println("After updating index 0 to Orange: " + fruits);

        // Remove element by index
        fruits.remove(3);
        System.out.println("After removing element at index 3: " + fruits);

        // Remove element by value
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Check if list contains "Cherry"
        boolean hasCherry = fruits.contains("Cherry");
        System.out.println("Contains Cherry? " + hasCherry);

        // Get size of the list
        int size = fruits.size();
        System.out.println("List size: " + size);

        // Sort the list
        Collections.sort(fruits);
        System.out.println("Sorted list: " + fruits);

        // Clear the list
        fruits.clear();
        System.out.println("After clearing: " + fruits);
    }
}
