import java.io.FileWriter;
import java.io.IOException;

class WriteToFile {
    public static void main(String[] args) {
        try {
            //String message="Hello I am Shivangi !";
            FileWriter myWriter = new FileWriter("./Myfiles/shiv.txt");
            myWriter.write("Hello, World!");
            myWriter.close();
            System.out.println("file saved Successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
           // e.printStackTrace();
        }
    }
}