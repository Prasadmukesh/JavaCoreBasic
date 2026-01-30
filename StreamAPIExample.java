import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {
    public static void main(String[] args) {
        // Given array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


       
        // 1. Filter: Select even numbers
        List<Integer> evenNumbers = Arrays.stream(numbers)
                                          .filter(n -> n % 2 == 0)
                                          .boxed()  // Convert from int to Integer (because streams of primitive types are different)
                                          .collect(Collectors.toList());
        System.out.println("Filtered even numbers: " + evenNumbers);
        
        // 2. Map: Square each number
        List<Integer> squaredNumbers = Arrays.stream(numbers)
                                              .map(n -> n * n)  // Square each number
                                              .boxed()
                                              .collect(Collectors.toList());
        System.out.println("Squared numbers: " + squaredNumbers);
        
        // 3. Reduce: Sum of all numbers
        int sum = Arrays.stream(numbers)
                        .reduce(0, (a, b) -> a + b);  // Starts with 0 and adds each number
        System.out.println("Sum of all numbers: " + sum);
        
        // 4. Reduce: Multiply all numbers (product of all numbers)
        long product = Arrays.stream(numbers)
                            .reduce(1, (a, b) -> a * b);  // Starts with 1 and multiplies each number
        System.out.println("Product of all numbers: " + product);
    }
}
