package PSD2Lab7;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Created by anamv on 27/10/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Results
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("00.0");

      final int NOOFSTUDENTS = 5;
      final int NOOFMODULES = 3;
      int total;
      final int DISTINCTION = 70;
      final int PASS = 40;

      // Array to store names
      String[] names = new String[NOOFSTUDENTS];
      // Array to store marks
      int[][] marks = new int[NOOFSTUDENTS][NOOFMODULES];
      // Array to student averages
      double[] studentAverage = new double[NOOFSTUDENTS];
      // Array to store module averages
      double[] moduleAverage = new double[NOOFMODULES];

      //Read in the name and marks for each student
      for (int row = 0; row < NOOFSTUDENTS; row++) {
         System.out.print("Enter a name: ");
         names[row] = keyboard.nextLine();
         for (int column = 0; column < NOOFMODULES; column++) {
            System.out.print("Enter a mark: ");
            marks[row][column] = keyboard.nextInt();
         }//for
         keyboard.nextLine();
      }//for

      // Calculate the average mark for each student
      for (int row = 0; row < NOOFSTUDENTS; row++) {
         total = 0;
         for (int column = 0; column < NOOFMODULES; column++) {
            total = total + marks[row][column];
         }//for
         studentAverage[row] = (double) total / NOOFMODULES;
      }//for

      // Calculate the average mark for each module
      for (int column = 0; column < NOOFMODULES; column++) {
         total = 0;
         for (int row = 0; row < NOOFSTUDENTS; row++) {
            total = total + marks[row][column];
         }//for
         moduleAverage[column] = (double) total / NOOFSTUDENTS;
      }//for

      // Output the results of mark1, mark 2, mark3 and the averagemark
      System.out.println("\nName\t\tMark 1\t\tMark 2\t\tMark 3\t\tAverage");
      for (int row = 0; row < NOOFSTUDENTS; row++) {
         System.out.print(names[row]);
         for (int column = 0; column < NOOFMODULES; column++) {
            System.out.print("\t\t" + marks[row][column]);
         }//for
         System.out.println("\t\t" + df.format(studentAverage[row]));
      }//for

      //prints out the module average mark of the students
      System.out.print("Module Average\t\t");
      for (int column = 0; column < NOOFMODULES; column++) {
         System.out.print(df.format(moduleAverage[column]) + "\t");
      }//for
      System.out.println();

      //prints out whether the student received a distinction, pass or fail grade.
      System.out.println("\n\nName\t\t\t\tGrade");
      for (int index = 0; index < NOOFSTUDENTS; index++) {
         System.out.print(names[index] + "\t\t"  + "\t\t");
         if (studentAverage[index] >= DISTINCTION) {
            System.out.println("Distinction");
         }//if
         else {
            if (studentAverage[index] >= PASS) {
               System.out.println("Pass");
            }//if
            else {
               System.out.println("Fail");
            }
         }
      }
   }//main
}//class
