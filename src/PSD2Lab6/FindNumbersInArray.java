package PSD2Lab6;
import java.util.Scanner;
/**
 * Created by anamv on 19/10/2020
 *  Program to read in a number and find its position in an array
 */
public class FindNumbersInArray
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      int[] numbers = {10, 20, 30, 40, 50};
      int search, index = 0;
      boolean found = false;

      System.out.print("Enter search number: ");
      search = keyboard.nextInt();

      while (!(found) && (index < numbers.length)) {
         if (numbers[index] == search) {
            found = true;
            System.out.println(search + " has been found at location " + index);
         }//if
         index = index + 1;
      }//while
      if (!found) {
         System.out.println(search + " has not been found");
      }//if

   }//main
}//class
