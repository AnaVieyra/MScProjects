package PSD2Lab10;
import java.util.Scanner;

/**
 * Created by anamv on 16/11/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class DivideByZero
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      int number, divisor, answer;
      boolean invalid = true;

      do {
         System.out.print("Enter a number: ");
         number = keyboard.nextInt();
         System.out.print("Enter a divisor: ");
         divisor = keyboard.nextInt();
         try {
            answer = number / divisor;
            System.out.println("Answer = " + answer);
            invalid = false;
         }//try
         catch (ArithmeticException error) {
            System.out.println("Error - " + error.getMessage());
         }//catch
      } while (invalid);

   }//main
}//class
