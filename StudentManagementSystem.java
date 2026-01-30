import java.io.*;
import java.util.*;

class Student {
    private String id;
    private String name;
    private int age;
    private String grade;

    public Student(String id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters and setters
    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGrade() { return grade; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGrade(String grade) { this.grade = grade; }

    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Age: %d, Grade: %s", id, name, age, grade);
    }
}

public class StudentManagementSystem {
    private static final String FILE_NAME = "MyFiles/students.txt";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    System.out.println("Exiting system...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent() {
        try {
            System.out.print("Enter Student ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Grade: ");
            String grade = scanner.nextLine();

            Student student = new Student(id, name, age, grade);
            saveStudentToFile(student);
            System.out.println("Student added successfully!");
        } catch (Exception e) {
            System.out.println("Error adding student: " + e.getMessage());
        }
    }

    private static void saveStudentToFile(Student student) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(student.getId() + "," + student.getName() + "," + 
                        student.getAge() + "," + student.getGrade());
            writer.newLine();
        }
    }
/* 
    private static void viewAllStudents() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\nAll Students:");
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int age = Integer.parseInt(parts[2]);
                Student student = new Student(parts[0], parts[1],age, parts[3]);
                System.out.println(student);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
*/
private static void viewAllStudents() {
    try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
        String line;
        System.out.println("\nAll Students:");
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 4) {
                try {
                    int age = Integer.parseInt(parts[2]);
                    Student student = new Student(parts[0], parts[1], age, parts[3]);
                    System.out.println(student);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid age format in line: " + line);
                }
            } else {
                System.out.println("Invalid data format in line: " + line);
            }
        }
    } catch (IOException e) {
        System.out.println("Error reading file: " + e.getMessage());
    }
}

    private static void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        String searchId = scanner.nextLine();
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(searchId)) {
                    Student student = new Student(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3]);
                    System.out.println("Student found:\n" + student);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Student with ID " + searchId + " not found.");
            }
        } catch (IOException e) {
            System.out.println("Error searching student: " + e.getMessage());
        }
    }

    private static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        String updateId = scanner.nextLine();
        List<String> lines = new ArrayList<>();
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(updateId)) {
                    System.out.print("Enter new Name (current: " + parts[1] + "): ");
                    String name = scanner.nextLine();
                    System.out.print("Enter new Age (current: " + parts[2] + "): ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new Grade (current: " + parts[3] + "): ");
                    String grade = scanner.nextLine();

                    line = parts[0] + "," + name + "," + age + "," + grade;
                    found = true;
                    System.out.println("Student updated successfully!");
                }
                lines.add(line);
            }

            if (found) {
                // Rewrite the entire file with updated data
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
                    for (String updatedLine : lines) {
                        writer.write(updatedLine);
                        writer.newLine();
                    }
                }
            } else {
                System.out.println("Student with ID " + updateId + " not found.");
            }
        } catch (IOException e) {
            System.out.println("Error updating student: " + e.getMessage());
        }
    }

    private static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        String deleteId = scanner.nextLine();
        List<String> lines = new ArrayList<>();
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(deleteId)) {
                    found = true;
                    continue; // Skip adding this line to the list
                }
                lines.add(line);
            }

            if (found) {
                // Rewrite the file without the deleted student
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
                    for (String remainingLine : lines) {
                        writer.write(remainingLine);
                        writer.newLine();
                    }
                }
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("Student with ID " + deleteId + " not found.");
            }
        } catch (IOException e) {
            System.out.println("Error deleting student: " + e.getMessage());
        }
    }
}