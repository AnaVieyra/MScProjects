package PSD2Lab2.Company;

import java.util.Scanner;

/**
 * Created by anamv on 23/09/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class TestEmployee
{


   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);


      //create employee 1 and print
      Employee employee1 = new Employee();


      //create employee 2 and print
      FullTimeEmployee employee2 = new FullTimeEmployee("E001", "Jane Doe", 20000);
      /**   System.out.println("Please enter your employee ID: ");
       employee1.setNumber(keyboard.next());
       System.out.println("Please enter your name: ");
       employee1.setName(keyboard.next());
       System.out.println("Please enter your Annual Salary: ");
       employee1.setAnnualSalary(keyboard.nextDouble());
       */
      System.out.println("======================");
      System.out.println("Employee Details ");
      employee2.printAllDetails(employee2.getNumber(), employee2.getName());

      //create employee 2 and print
      CasualEmployee employee3 = new CasualEmployee("E002", "John Doe", 8.5, 15);
      /**
       System.out.println("Please enter your employee ID: ");
       employee2.setNumber(keyboard.next());
       System.out.println("Please enter your name: ");
       employee2.setName(keyboard.next());
       System.out.println("Please enter your Hourly Pay: ");
       employee2.setHourlyPay(keyboard.nextDouble());
       System.out.println("Please enter your Weekly Hours: ");
       employee2.setWeeklyHours(keyboard.nextDouble());
       */
      System.out.println("======================");
      System.out.println("Employee Details ");
      employee3.printAllDetails(employee3.getNumber(), employee3.getName());

      //create employee 4, set details and print
      PartTimeEmployee employee4 = new PartTimeEmployee();
      System.out.println("Please enter your employee ID: ");
      employee4.setNumber(keyboard.next());
      System.out.println("Please enter your name: ");
      employee4.setName(keyboard.next());
      System.out.println("Please enter your Hourly Pay: ");
      employee4.setHourlyPay(keyboard.nextDouble());
      System.out.println("Please enter your Monthly Hours: ");
      employee4.setHoursPerMonth(keyboard.nextDouble());
      System.out.println("======================");
      System.out.println("Employee Details ");
      employee4.printAllDetails(employee4.getNumber(), employee4.getName());

   }//main
}//class
