package PSD2Lab7;
import java.util.Scanner;
/**
 * Created by anamv on 08/11/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class BinarySearch
{
   static Scanner keyboard = new Scanner(System.in);
   public static void main(String[] args)
   {
      int [] myArray = {23,27,32,45,56,57,60,67};
      final int SIZE = myArray.length;
      int top = SIZE - 1;
      int bottom = 0;
      boolean found = false;
      int location = 0;

      System.out.print("\n\t" + "Enter search value: ");
      int search = keyboard.nextInt();


      do
      {
         int middle = (top + bottom) / 2;
         if (myArray[middle] == search) {
            found = true;
            location = middle;
         }//if
         else
         {
            if (myArray[middle] < search)
            {
               bottom = middle + 1;
            }//if
            else
            {
               top = middle - 1;

            }//else
         }//else

      } while ((!found) && (bottom <=top));
      if (found) {
         System.out.println("\tNumber found at index position " +
               location);
      } else
         System.out.println("\t" + search + " has not been found");


   }//main
}//class
