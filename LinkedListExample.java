import java.util.*;  
class Book implements Comparable<Book> {  
    int id;  
    String name, author, publisher;  
    int quantity;  
    // Constructor to initialize Book object  
    public Book(int id, String name, String author, String publisher, int quantity) {  
        this.id = id;  
        this.name = name;  
        this.author = author;  
        this.publisher = publisher;  
        this.quantity = quantity;  
    }  
    // compareTo method to compare Books based on 'id'  
    public int compareTo(Book b) {  
        if (id > b.id) {  
            return 1;  
        } else if (id < b.id) {  
            return -1;  
        } else {  
            return 0;  
        }  
    }  
}  
 class LinkedListExample {  
    public static void main(String[] args) {  
        // Creating a PriorityQueue to store Book objects  
        Queue<Book> queue = new PriorityQueue<Book>();  
        // Creating Book objects  
        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);  
        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);  
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);  
        // Adding Book objects to the queue  
        queue.add(b1);  public class Student implements Comparable<Student> {
            private int rollNumber;
            private String name;
            private double marks;
        
            public Student(int rollNumber, String name, double marks) {
                this.rollNumber = rollNumber;
                this.name = name;
                this.marks = marks;
            }
        
            public int getRollNumber() {
                return rollNumber;
            }
        
            public String getName() {
                return name;
            }
        
            public double getMarks() {
                return marks;
            }
        
            // Natural order: by roll number
            @Override
            public int compareTo(Student other) {
                return Integer.compare(this.rollNumber, other.rollNumber);
            }
        
            @Override
            public String toString() {
                return rollNumber + " - " + name + " - " + marks;
            }
        }
        
        queue.add(b2);  
        queue.add(b3);  
        // Displaying the elements of the queue  
        System.out.println("Traversing the queue elements:");  
        for (Book b : queue) {  
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);  
        }  
        // Removing the head of the queue  
        queue.remove();  
        // Displaying the elements of the queue after removing one element  
        System.out.println("After removing one book record:");  
        for (Book b : queue) {  
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);  
        }  
    }  
}  