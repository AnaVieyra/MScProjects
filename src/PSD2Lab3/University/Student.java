package PSD2Lab3.University;

/**
 * Created by anamv on 30/09/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Student extends Member {

   //variables
   private static int uniqueID = 1, studentCount = 0;
   private int studentID, mark1, mark2, mark3;
   private String course;


   //constructors
   protected Student(){
      studentID = uniqueID + 1;
      uniqueID = uniqueID + 1;
      studentCount = studentCount + 1;
   }//default constructor

   protected Student(String name, String email, String sCourse){
      super (name, email);
      course = sCourse;
      mark1 = -1;
      mark2 = -1;
      mark3 = -1;
      studentID = uniqueID + 1;
      uniqueID = uniqueID + 1;
      studentCount = studentCount + 1;
   }//alternative constructor 3p

   protected Student(String name, String email, String sCourse, int sMark1, int sMark2, int sMark3){
      super (name, email);
      course = sCourse;
      mark1 = sMark1;
      mark2 = sMark2;
      mark3 = sMark3;
      studentID = uniqueID + 1;
      uniqueID = uniqueID + 1;
      studentCount = studentCount + 1;
   }//alternative constructor 6p

   protected int getID(){
      return studentID;
   }//getID

   protected void setCourse(String sCourse){
      course = sCourse;
   }//setCourse

   protected void setMark1(int sMark1){
      mark1 = sMark1;
   }//setMark1

   protected void setMark2(int sMark2){
      mark1 = sMark2;
   }//setMark1

   protected void setMark3(int sMark3){
      mark1 = sMark3;
   }//setMark1

   protected void setMarks(int sMark1, int sMark2, int sMark3){
      mark1 = sMark1;
      mark2 = sMark2;
      mark3 = sMark3;
   }//setMarks

   protected String getCourse(){
      return course;
   }//getCourse

   protected int getMark1(){
      return mark1;
   }//getMark1

   protected int getMark2(){
      return mark2;
   }//getMark2

   protected int getMark3(){
      return mark3;
   }//getMark3

   protected double getAverage(){
      return (mark1 + mark2 + mark3) / 3;
   }//getAverage

   protected String getStatus(){
      return("Student");
   }//getStatus

   public String toString(){
      if (getAverage() < 0){
         return("The Student ID is: " + studentID + "\n" +
               super.toString() + "\n" +//prints name and Email from super class
               "Course: " + course + "\n" +
               "The student's three marks are: " + "\n\t\t" +
               mark1 + "\n\t\t" + mark2 + "\n\t\t" + mark3 + "\n" +
               "The average mark of the student is unknown as there are no valid marks entered "
               + "\n\n\n");
      }//if
      else{
         return ("The Student ID is: " + studentID + "\n" +
               super.toString() + "\n" +//prints name and Email from super class
               "Course: " + course + "\n" +
               "The student's three marks are: " + "\n\t\t" +
               mark1 + "\n\t\t" + mark2 + "\n\t\t" + mark3 + "\n" +
               "The average mark of the students is: " + getAverage() + "\n\n\n");
      }//else
   }//toString

   public static int numberOfStudents(){
      return studentCount;
   }

}//class
