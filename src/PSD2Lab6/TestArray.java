package PSD2Lab6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by anamv on 19/10/2020
 * Declare an array to hold 8 numbers and calculate num of odd/even numbers, sum and average
 */
public class TestArray
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("0.00");

      final int MAX = 8;
      int [] myNumbers = new int[MAX];
      int oddNumbers = 0, evenNumbers = 0, sum = 0;
      double average;
      int entry;

      for (int index = 0; index < MAX; index++){
         System.out.print("Enter a number to add to the array: ");
         entry = keyboard.nextInt();
         myNumbers [index] = entry;
         sum += entry;
         if (entry % 2 == 0 ){
            evenNumbers++;
         }//if
         else {
            oddNumbers++;
         }
      }//forEntry

      average = sum /(double)MAX;

      System.out.println("The array of numbers entered is: ");
      for (int index = 0; index < MAX; index++){
         System.out.println(myNumbers[index]);
      }//forPrint
      System.out.println("From this array, " + evenNumbers + " are even numbers, " + oddNumbers + " are odd numbers.");
      System.out.println("The sum of the numbers entered is: " + sum);
      System.out.println("The average of the numbers entered is: " + df.format(average));
   }//main
}//class
