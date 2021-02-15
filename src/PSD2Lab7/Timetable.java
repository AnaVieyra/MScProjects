package PSD2Lab7;
import java.util.Scanner;
/**
 * Created by anamv on 27/10/2020
 * Janes university timetable
 */
public class Timetable
{

   static Scanner keyboard = new Scanner(System.in);
   public static void main(String[] args)
   {
      String choice, day, time;
      int dayRow = 0, timeColumn = 0;

      //String array for days of the week
      String[] weekDays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
      String [] weekTimes = {"\t\t","9.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00"};


      //2d Array to store timetable
      final int MAXDAYS = 5;
      final int MAXSLOTS = 9;
      String[][] slots = new String[MAXDAYS][MAXSLOTS];

      for (int row = 0; row < MAXDAYS; row++)
      {
         for (int column = 0; column < MAXSLOTS; column++)
         {
            //module[row][column] = "  ";
            slots[0][0] = "COM465";
            slots[0][2] = "COM564";
            slots[0][3] = "COM564";
            slots[0][6] = "COM564";

            slots[1][1] = "COM564";
            slots[1][2] = "COM564";
            slots[1][5] = "COM640";
            slots[1][6] = "COM640";
            slots[1][7] = "COM640";

            slots[2][2] = "COM465";
            slots[2][6] = "COM465";

            slots[4][1] = "COM465";
            slots[4][4] = "COM640";
            slots[4][5] = "COM640";
         }//for col
      }//for rows

      System.out.println("\n This is your timetable");

      for (int row = 0; row < MAXSLOTS; row++) {
         System.out.print(weekTimes[row] + "  \t");
      }//for weekTimes
      System.out.println();

      for (int row = 0; row < MAXDAYS; row++) {
         System.out.print(weekDays[row] + "  \t");
         for (int column = 0; column < MAXSLOTS; column++) {
            if (slots[row][column] == null) {
               System.out.print("\t\t");
            }//if
            else {
               System.out.print(slots[row][column] + "\t");
            }//else
         }//for col
         System.out.println();
      }//for row



      System.out.println("\n\nDo you want to see the class scheduled for a particular day/time? (enter Y or N)");
      choice = keyboard.next();
      if ((choice.equals("Y")) || (choice.equals("y"))){
         System.out.println("Enter the day of the week (Monday-Friday): ");
         day = keyboard.next();
         for (int row = 0; row < MAXDAYS; row++){
            if (day.equals (weekDays[row])){
               dayRow = row;
            }//if
         }//for

         System.out.println("Enter the time (9.00-16.00): ");
         time = keyboard.next();
         for (int column = 0; column < MAXSLOTS; column++){
            if (time.equals(weekTimes[column])){
               timeColumn = column;
            }//if
         }//for
         if (slots[dayRow][timeColumn].equals("")){
            System.out.println("There is no class at this day/time, enjoy your break!");
         }//if
         else
         {
            System.out.println("The class on " + day + " at " + time + " is " + slots[dayRow][timeColumn]);
         }//else
      }//if
      else{
         System.out.println("Enjoy your classes!");
      }//else

   }//main
}//class
