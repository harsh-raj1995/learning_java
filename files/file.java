package files;
import java.io.*;
import java.util.Scanner;

public class file {
  public static void main(String[] args) throws IOException {
    File f = new File("text.txt");
    // if (f.createNewFile()) {
    //   System.out.println("File created: " + f.getName());
    // } else {
    //   System.out.println("File already exists.");
    // }
    // FileWriter fw = new FileWriter("text.txt");
    // // FileWriter fw2 = new FileWriter("text.txt");
    // fw.write("Good morning");
    // fw.write("\n");
    // fw.write("Good afternoon");
    // // fw2.write("Good evening");
    // // fw2.close();
    // fw.close();
    // FileReader fr = new FileReader("text.txt");
    
    // Scanner sc = new Scanner(fr);
    // while (sc.hasNextLine()) {
    //   String line = sc.nextLine();
    //   System.out.println(line);
    // }
    if(f.delete()) {
      System.out.println("File deleted successfully");
    } else {
      System.out.println("Failed to delete the file");
    }
  }
}