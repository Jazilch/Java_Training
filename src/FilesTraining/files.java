package FilesTraining;

import java.io.*;

public class files {

  public static void main(String[] args){
    // 1. Define the file we want to read
    String filename = "/Users/jzilch/Desktop/Web Projects/Java/JavaTraining/src/FilesTraining/filesData.html";
    String text = null;

    // 2. Create the file in Java
    File file = new File(filename);

    try {
      // 3. Open the file
      BufferedReader br = new BufferedReader(new FileReader(file));

      // 4. Read the file
      text = br.readLine();

      br.close();
    } catch (FileNotFoundException e) {
      System.out.println("ERROR: File not found " + filename);
      e.printStackTrace();
    } catch (IOException e) {
      System.out.println("ERROR: Could not read the data: "+ filename);
      e.printStackTrace();
    } finally {
      System.out.println("Finished reading the file");
    }

    System.out.println(text);

  }

}
