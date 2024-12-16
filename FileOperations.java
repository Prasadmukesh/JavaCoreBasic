import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileOperations {
    // Method to create a file
    public void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    // Method to write to a file
    public void writeFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Method to read from a file
    public void readFile(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            System.out.println("File content:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    // Method to delete a file
    public void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    public static void main(String[] args) {
        FileOperations fileOps = new FileOperations();
        
        String fileName = "example.txt";
        String content = "This is an example content for the file.";

        // Create a file
        fileOps.createFile(fileName);

        // Write to the file
        fileOps.writeFile(fileName, content);

        // Read the file
        fileOps.readFile(fileName);

        // Delete the file
        fileOps.deleteFile(fileName);
    }
}
