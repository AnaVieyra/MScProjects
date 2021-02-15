package PSD2Lab3.University;
import java.util.Scanner;
/**
 * Created by anamv on 30/09/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class TestMember
{


   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      //creating staff objects
      Staff staff1 = new Staff("George McMullan", "g.mcmullan@ulster.ac.uk",
            "Lecturer", "F34", 30000);

      Staff staff2 = new Staff("James Hollinger", "j.hollinger@ulster.ac.uk");

      //Creation and user prompts for staff3
      Staff staff3 = new Staff();
      System.out.println("Please enter the details for the new staff member: ");
      System.out.println("Enter the Name: ");
      staff3.setName(keyboard.nextLine());
      System.out.println("Enter the Email: ");
      staff3.setEmail(keyboard.nextLine());
      System.out.println("Enter the Job Title: ");
      staff3.setJobTitle(keyboard.nextLine());
      System.out.println("Enter the Room Number: ");
      staff3.setRoom(keyboard.nextLine());
      System.out.println("Enter the Salary: ");
      staff3.setSalary(keyboard.nextDouble());
      System.out.println("------------------------------");

      //printing staff info
      System.out.println("\n\n------------------------------");
      System.out.println("Details of staff members currently in the system");
      System.out.println(staff1);
      System.out.println(staff2);
      System.out.println(staff3);
      System.out.println("To date, there have been " + Staff.numberOfStaff() +
            " staff members entered in the system.");

      //creating student objects
      Student student1 = new Student("Fred Johnston",
            "johnston-f1@email.ulster.ac.uk",
            "Computing", 56, 67, 44);

      Student student2 = new Student("Jane Robinson",
            "robinson.j6@email.ulster.ac.uk", "Media Studies");

      //printing student info
      System.out.println("\n\n------------------------------");
      System.out.println("Details of students currently in the system");
      System.out.println(student1);
      System.out.println(student2);
      System.out.println("To date, there have been " + Student.numberOfStudents() +
            " students entered in the system.");

      //Provide code that will invoke the instance method called setMarks which
      // will set the marks of student2 to 80, 75 and 77.
      student2.setMark1(80);
      student2.setMark2(75);
      student2.setMark3(77);
      //Print out the details of student2.
      System.out.println("Please see new details for this student:\n" + student2);
      //Change mark2 of student1 to 76.
      student1.setMark2(76);
      //Print out the details of student1.
      System.out.println("Please see new details for this student:\n" + student1);
      //Set the salary of James Hollinger to £45,000.
      staff2.setSalary(45000);
      //Print out the details of staff2.
      System.out.println("Please see new details for this staff member:\n" + staff2);
      //Print out the status of staff3.
      System.out.println("Staff3 is a "+ staff3.getStatus() + " member.");


   }//main
}//class
