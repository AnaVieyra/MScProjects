package PSD2Lab6;

import java.util.Scanner;

/**
 * Created by anamv on 19/10/2020
 * reads in a sequence of up to 100 characters (all 'A' to 'Z'), stores each character in an array,
 * then checks if the word is a palindrome
 */
public class Palindrome
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      final int MAX = 100;
      String [] word = new String[MAX];
      int length;
      boolean palindrome = true;
      String entry = "";

      System.out.println("This is a palindrome checker. Enter your word, one character at a time: ");

      do
      {
         for (int index = 0; index < MAX; index++)
         {
            System.out.print("Enter a character: ");
            entry = keyboard.next();
            word[index] = entry;
         }//forEntry
      }//do
      while (entry != "stop");

      length = word.length;

      for(int index = 0; index < length; index++){
         if (word[index] == word[index-1]){
            index++;
         }//if
         else{
            palindrome = false;
            System.out.println("This word is not a  palindrome");
         }//else
      }//for
      if (palindrome){
         System.out.println("This word is a  palindrome");
      }//if
   }//main
}//class
