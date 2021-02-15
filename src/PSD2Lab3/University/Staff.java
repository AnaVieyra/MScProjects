package PSD2Lab3.University;
import java.text.DecimalFormat;

/**
 * Created by anamv on 30/09/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Staff extends Member {

   DecimalFormat df = new DecimalFormat("0,000.00");
   //variables
   private static int uniqueID = 100001, staffCount = 0;
   private int staffID;
   private String jobTitle, room;
   private double salary;

   //constructors
   protected Staff(){
      staffID = uniqueID;
      uniqueID = uniqueID + 1;
      staffCount = staffCount + 1;
   }//default constructor

   protected Staff(String name, String email, String sTitle, String sRoom, double sSalary){
      super (name, email);
      jobTitle = sTitle;
      room = sRoom;
      salary = sSalary;
      staffID = uniqueID;
      uniqueID = uniqueID + 1;
      staffCount = staffCount + 1;
   }//alternative constructor 5p

   protected Staff(String name, String email){
      super (name, email);
      jobTitle = "";
      room = "";
      salary = 0;
      staffID = uniqueID;
      uniqueID = uniqueID + 1;
      staffCount = staffCount + 1;
   }//alternative constructor 2p

   protected int getID(){
      return uniqueID;
   }//getID

   protected void setJobTitle(String sTitle){
      jobTitle = sTitle;
   }//setJobTitle

   protected void setRoom(String sRoom){
      room = sRoom;
   }//setRoom

   protected void setSalary(double sSalary){
      salary = sSalary;
   }//setSalary

   protected String getJobTitle(){
      return jobTitle;
   }//getJobTitle

   protected String getRoom(){
      return room;
   }//getRoom

   protected double getSalary(){
      return salary;
   }//getSalary

   protected String getStatus(){
      return("Staff");
   }//getStatus

   public String toString(){
      return("The Staff ID is: " + staffID + "\n" +
            super.toString() + "\n" +//prints name and Email from super class
            "Job Title: " + jobTitle + "\n" +
            "Room: " + room + "\n" +
            "Salary: " + df.format(salary) + "\n\n\n");
   }//toString

   public static int numberOfStaff(){
      return staffCount;
   }//numberOfStaff

}//class
