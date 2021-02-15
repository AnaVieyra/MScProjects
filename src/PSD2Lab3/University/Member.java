package PSD2Lab3.University;

/**
 * Created by anamv on 30/09/2020
 * abstract class
 */
abstract public class Member {

   //instance variables
   protected String name, email;

   //constructors
   protected Member (){
   }//default constructor

   protected Member (String mName, String mEmail){
      name = mName;
      email = mEmail;
   }//Alternative constructor

   protected void setName(String mName){
      name = mName;
   }//setName

   protected void setEmail(String mEmail){
      email = mEmail;
   }//setEmail

   protected String getName(){
      return name;
   }//getName

   protected String getEmail(){
      return email;
   }//getEmail

   //getStatus abstract method gets status from Staff or Student class
   abstract protected String getStatus();

   public String toString(){
      return("Name: " + name + "\n" + "Email: " + email);
   }//toString

}//class
