package PSD2Lab8.Club;

/**
 * Created by anamv on 03/11/2020
 * Class to create Member objects
 */
public class Member
{
   // Define instance variables
   private int memberNumber;
   private String memberName;


   public Member(int number, String name) {
      memberNumber = number;
      memberName = name;
   }// Constructor

   public int getMembershipNumber(){
      return memberNumber;
   }//getMembershipNumber()

   public String toString() {
      return (memberNumber + "\t\t" + memberName + "\n");
   }// toString
}//class
