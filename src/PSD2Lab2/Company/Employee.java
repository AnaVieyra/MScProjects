package PSD2Lab2.Company;

/**
 * Created by anamv on 23/09/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Employee {

   //class variables
   private String number, name;

   //employee constructors
   public void Employee (String pNumber, String pName){
      number = pNumber;
      name = pName;
   }//Employee

   public void setName(String pName){
      name = pName;
   }//setName

   public void setNumber(String pNumber){
      number = pNumber;
   }//setNumber

   public String getName(){
      return name;
   }//getName

   public String getNumber(){
      return number;
   }//getNumber

}//class
