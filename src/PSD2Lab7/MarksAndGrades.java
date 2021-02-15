package PSD2Lab7;
import java.util.Scanner;

/**
 * Created by anamv on 27/10/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class MarksAndGrades
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      final int MAX = 5;
      final int DISTINCTION = 70;
      final int PASS = 40;
      String[] names = new String[MAX];
      int[] marks = new int[MAX];


      // Read in and store names and marks
      for (int index = 0; index < MAX; index++) {
         System.out.print("Enter a name: ");
         names[index] = keyboard.nextLine();
         System.out.print("Enter a mark: ");
         marks[index] = keyboard.nextInt();
         keyboard.nextLine();
      }//for


      // Output results
      System.out.println("\n\nName\t\tMark\t\tGrade");
      System.out.println("===========================================");
      for (int index = 0; index < MAX; index++) {
         System.out.print(names[index] + "\t\t" + marks[index] + "\t\t");
         if (marks[index] >= DISTINCTION) {
            System.out.println("Distinction");
         }//if
         else {
            if (marks[index] >= PASS) {
               System.out.println("Pass");
            }//if
            else {
               System.out.println("Fail");
            }//else
         }//else
      }//for

   }//main
}//class
