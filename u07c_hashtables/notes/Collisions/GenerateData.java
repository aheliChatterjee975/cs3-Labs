import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class

public class GenerateData {
  public static void main(String[] args) {
    try {
      String fileName = "powersOfTwo.dat";
      File myObj = new File(fileName);
      myObj.createNewFile();
      FileWriter myWriter = new FileWriter(fileName);
      for(int n=1; n<20000000; n*=2)
      {
         myWriter.write(n + "\n"); 
      }
      myWriter.close();
      
      /*
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
      */
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
