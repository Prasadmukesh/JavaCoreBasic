import java.io.*;
import java.util.*;

public class StudentManager {
    private static final String FILE_NAME = "students.txt";

    public static void addStudent(String rollNo, String name, String marks) throws IOException {
        FileWriter writer = new FileWriter(FILE_NAME, true);
        writer.write(rollNo + "," + name + "," + marks + "\n");
        writer.close();
        System.out.println("Student added successfully.");
    }

    public static void viewStudents() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
        String line;
        System.out.println("Roll No | Name | Marks");
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            System.out.println(parts[0] + " | " + parts[1] + " | " + parts[2]);
        }
        reader.close();
    }

    public static void searchStudent(String rollNo) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
        String line;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts[0].equals(rollNo)) {
                System.out.println("Found: " + line);
                found = true;
                break;
            }
        }
        reader.close();
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public static void deleteStudent(String rollNo) throws IOException {
        File inputFile = new File(FILE_NAME);
        File tempFile = new File("temp.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String line;
        boolean deleted = false;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (!parts[0].equals(rollNo)) {
                writer.write(line + "\n");
            } else {
                deleted = true;
            }
        }

        reader.close();
        writer.close();

        inputFile.delete();
        tempFile.renameTo(inputFile);

        if (deleted) {
            System.out.println("Student deleted.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add\n2. View\n3. Search\n4. Delete\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Roll No: ");
                    String roll = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Marks: ");
                    String marks = sc.nextLine();
                    addStudent(roll, name, marks);
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    System.out.print("Enter Roll No to search: ");
                    searchStudent(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Enter Roll No to delete: ");
                    deleteStudent(sc.nextLine());
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
