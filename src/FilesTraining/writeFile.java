package FilesTraining;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeFile {

  public static void main(String[] args) {
    // 1. Define the path to write
    String filename = "/Users/jzilch/Desktop/Web Projects/Java/JavaTraining/src/FilesTraining/filesData.html";
    String message = "Im writing data that will be placed in the file";
    // 2. Create the file in Java
    File file = new File(filename);

    // 3. Open the file

    try {
      FileWriter fw = new FileWriter(file);

      // 4. write to the file
      fw.write(message);

      // 5. Close the resources
      fw.close();
    } catch (IOException e) {
      System.out.println("ERROR: Could not read file: " + filename);
      e.printStackTrace();
    } finally {
      System.out.println("Closing the filewriter");
    }




  }
}
