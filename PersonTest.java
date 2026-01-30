import java.util.LinkedList;

class PersonTest {
    public static void main(String[] args) {
        LinkedList<Person> people = new LinkedList<>();

        // Add elements
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.addFirst(new Person("Zara", 40));
        people.addLast(new Person("Charlie", 35));
        people.add(2, new Person("David", 28));  // Insert at index

        System.out.println("List after adding elements:");
        printList(people);

        // Accessing elements
        System.out.println("\nFirst person: " + people.getFirst());
        System.out.println("Last person: " + people.getLast());
        System.out.println("Person at index 2: " + people.get(2));

        // Remove elements
        people.removeFirst();
        people.removeLast();
        people.remove(1);
        System.out.println("\nList after removals:");
        printList(people);

        // Contains (relies on equals())
        Person search = new Person("Alice", 30);
        System.out.println("\nList contains 'Alice (30)': " + people.contains(search));

        // Size
        System.out.println("Size of list: " + people.size());

        // Clear all
        people.clear();
        System.out.println("List cleared. Is empty? " + people.isEmpty());
    }

    public static void printList(LinkedList<Person> list) {
        for (Person p : list) {
            System.out.println(p);
        }
    }
}
