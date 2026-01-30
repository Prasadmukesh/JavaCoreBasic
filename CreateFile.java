// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.File;
import java.io.IOException;

public class CreateFile {
   public CreateFile() {
   }

   public static void main(String[] var0) {
      try {
         File var1 = new File("./Myfiles/shiv.txt");
         if (var1.createNewFile()) {
            System.out.println("File created: " + var1.getName());
         } else {
            System.out.println("File already exists.");
         }
      } catch (IOException var2) {
         System.out.println("An error occurred.");
      }

   }
}