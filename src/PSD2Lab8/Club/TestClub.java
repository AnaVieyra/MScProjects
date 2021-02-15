package PSD2Lab8.Club;
import java.util.Scanner;
/**
 * Created by anamv on 03/11/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class TestClub
{
   static Scanner keyboard = new Scanner (System.in);
   public static void main(String[] args)
   {
      Membership hockey = new Membership("Coleraine Hockey Club", 3);
      System.out.println(hockey);

      Membership rugby = new Membership("Ballymoney Rugby Club", 4);
      System.out.println(rugby);

      int number;
      Member person;

      //Return membership number
      hockey.getClubName();


      System.out.print("Enter the membership number of the person you want to find in " + hockey.getClubName() + ": ");
      number = keyboard.nextInt();
      keyboard.nextLine();

      //Search for the person
      person = hockey.findMember(number);
      if (person == null) {
         System.out.println("No match found");
      }//if
      else {
         System.out.println("The search found the following member:\n" + person);
      }//else
   }//main
}//class
