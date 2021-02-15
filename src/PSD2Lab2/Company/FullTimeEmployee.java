package PSD2Lab2.Company;

import java.text.DecimalFormat;

/**
 * Created by anamv on 23/09/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class FullTimeEmployee extends Employee
{
   DecimalFormat df = new DecimalFormat("0.00");

   //class variables
   private double annualSalary;

   //employee constructors
   public FullTimeEmployee(String number, String name, double pSalary) {
      Employee(number, name);
      annualSalary = pSalary;
   }//fullTimeEmployee

   protected void setAnnualSalary(double pSalary){
      annualSalary = pSalary;
   }//setNumber

   protected double getAnnualSalary(){
      return annualSalary;
   }//getAnnualSalary

   protected double calculateMonthlyPay(){
      return annualSalary / 12;
   }//calculateMonthlyPay


   protected void printAllDetails(String number, String name) {
      System.out.println("Employee number: " + number);
      System.out.println("Employee name: " + name);
      System.out.println("Monthly Pay: " + df.format(calculateMonthlyPay()));
      System.out.println("===============================");

   }//printAllDetails
}//class
