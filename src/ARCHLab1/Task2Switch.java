package ARCHLab1;
import java.util.Scanner;

/**
 * Created by anamv on 18/01/2021
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Task2Switch
{
   static Scanner keyboard = new Scanner(System.in);

   public static void main(String[] args) {
      System.out.println("Enter a letter to check: ");
      char choice = keyboard.next().charAt(0);
      checkLetter(choice);

   }//Main
   public static void checkLetter(char letter){
      boolean isVowel = false;
      switch (letter){
         case 'a':
            isVowel = true;
         case 'e':
            isVowel = true;
         case 'i':
            isVowel = true;
         case 'o':
            isVowel = true;
         case 'u':
            isVowel = true;
         case 'A':
            isVowel = true;
         case 'E':
            isVowel = true;
         case 'I':
            isVowel = true;
         case 'O':
            isVowel = true;
         case 'U':
            isVowel = true;
      }//switch

      if (isVowel == true){
         System.out.println("This letter is a vowel");
      }//if
      else{
         System.out.println("This letter is a consonant");
      }//else

   }//checkLetter

}//class
