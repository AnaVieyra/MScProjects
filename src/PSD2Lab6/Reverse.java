package PSD2Lab6;
import java.util.Scanner;
/**
 * Created by anamv on 19/10/2020
 * print out the 6 numbers neatly spaced on one line then print the numbers in reverse on the next line
 */
public class Reverse
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      final int MAX = 6;
      int [] numbers = new int[MAX];

      for (int index = 0; index < MAX; index++){
         System.out.print("Enter a number to add to the array: ");
         numbers [index] = keyboard.nextInt();
      }//forEntry

      System.out.println("The array of numbers entered is: ");
      for (int index = 0; index < MAX; index++){
         System.out.println(numbers[index]);
      }//forPrint

      System.out.println("The array of numbers entered in reverse is: ");
      for (int index = 5; index > -1 ; index--){
         System.out.println(numbers[index]);
      }//forPrintReverse


   }//main
}//class
