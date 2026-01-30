import java.util.Map;  
import java.util.HashMap;  
public class ForEachMapExample {  
    public static void main(String[] args) {  
        // Create a map of Integer keys and String values  
        Map<Integer, String> map = new HashMap<>();  
        map.put(1, "One");  
        map.put(2, "Two");  
        map.put(3, "Three");  
        map.put(4, "Four");  
        map.put(5, "Five");  
        map.put(6, "Six");  
        map.put(7, "Seven");  
        map.put(8, "Eight");  
        map.put(9, "Nine");  
        map.put(10, "Ten");  
        // Use forEach to iterate over the map and print each key-value pair  
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));  
    }  
}  