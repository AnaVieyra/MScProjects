package PSD2Lab6;
import java.util.Scanner;
/**
 * Created by anamv on 19/10/2020
 * Program to read in a number and count how many times it appears in an array
 */
public class CountNumbersInArray
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      int[] height = {78, 67, 66, 60, 73, 70, 75, 67};
      int search, total = 0;

      System.out.print("Enter search number: ");
      search = keyboard.nextInt();
      keyboard.close();

      for (int index = 0; index < height.length; index++){
         if (height[index] == search){
            total = total + 1;
         }//if
      }//for

      System.out.print(search + " occurs " + total + " times");

   }//main
}//class
