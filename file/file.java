package file;
import java.io.*;
import java.util.Scanner;

public class file {
  public static void main(String[] args) throws  IOException {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Student Name: ");
    String name = sc.nextLine();
    System.out.println("Enter Roll Number: ");
    String roll = sc.nextLine();
    System.out.println("Enter Course: ");
    String course = sc.nextLine();
    File f= new File("student.txt");
    f.createNewFile();
    FileWriter fr = new FileWriter("student.txt");
    fr.write("Student Nme: "+name);
    fr.write("\nRoll Number: "+roll);
    fr.write("\nCourse: "+course);
    fr.close();
    System.out.println("Data written successfully");
    
    FileReader fr= new FileReader("student.txt");
    Scanner s = new Scanner(fr);
    System.out.println("Reading file Content:\n");
    while(s.hasNextLine()){
      String line= s.nextLine();
      System.out.println(line);
    }
    sc.close();
    s.close();
  }
}
