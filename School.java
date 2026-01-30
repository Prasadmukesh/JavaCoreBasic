import java.util.*;

class School {
    public static void main(String[] args) {
        List<Studentdemo> students = new ArrayList<>();
        students.add(new Studentdemo(103, "Alice", 88.5));
        students.add(new Studentdemo(101, "Bob", 92.0));
        students.add(new Studentdemo(102, "Mharlie", 85.3));
        students.add(new Studentdemo(107, "Zharlie", 75.3));
        students.add(new Studentdemo(108, "Yharlie", 85.3));
        students.add(new Studentdemo(104, "Vharlie", 95.3));
        students.add(new Studentdemo(105, "Rharlie", 85.3));
        students.add(new Studentdemo(106, "Tharlie", 65.3));
        students.add(new Studentdemo(109, "Hharlie", 75.3));
        students.add(new Studentdemo(110, "Pharlie", 85.3));
        students.add(new Studentdemo(112, "Kharlie", 65.3));

        // Sort by natural order (roll number)
        Collections.sort(students);
        System.out.println("Sorted by Roll Number:");
        students.forEach(System.out::println);

        // Sort by name
        Collections.sort(students, new NameComparator());
        System.out.println("\nSorted by Name:");
        students.forEach(System.out::println);

        // Sort by marks
        Collections.sort(students, new MarksComparator());
        System.out.println("\nSorted by Marks:");
        students.forEach(System.out::println);
    }
}
