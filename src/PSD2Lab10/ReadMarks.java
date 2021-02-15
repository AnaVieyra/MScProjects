package PSD2Lab10;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Created by anamv on 16/11/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class ReadMarks
{

   static FileReader myFileName;
   static Scanner readMyFile;

   public static void main(String[] args)
   {
      int noOfMarks = 0, number;

      try {
         myFileName = new FileReader("marks.txt");
         readMyFile = new Scanner(myFileName);
      }//try
      catch (FileNotFoundException error) {
         System.out.println("Cannot open input file ");
         System.out.println(error.getMessage());
      }//catch

      try {
         if (readMyFile.hasNext()) {
            noOfMarks = readMyFile.nextInt();
            System.out.println("Number of marks: " + noOfMarks);
         }//if
      }//try
      catch (Exception error) {
         System.out.println("Problem reading number of rows");
         System.out.println(error.getMessage());
         return;
      }//catch

      try {
         while (noOfMarks != 0) {
            for (int index = 0; index < noOfMarks; index++) {
               number = readMyFile.nextInt();
               System.out.println("Mark = " + number);
            }//for
            noOfMarks = readMyFile.nextInt();
         }//while
         System.out.println("End of File");
      }//try
      catch (Exception error) {
         System.out.println(error.getMessage());
      }//catch
   }//main
}//class
