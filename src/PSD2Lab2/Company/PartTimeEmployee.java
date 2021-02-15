package PSD2Lab2.Company;

import java.text.DecimalFormat;

/**
 * Created by anamv on 23/09/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class PartTimeEmployee extends Employee
{
   DecimalFormat df = new DecimalFormat("0.00");

   //class variables
   private double hourlyPay, hoursPerMonth;

   //employee constructors
   public PartTimeEmployee(){
   }//default constructor

   public  PartTimeEmployee(String number, String name, double pHourlyPay, double pHoursPerMonth) {
      Employee(number, name);
      hourlyPay = pHourlyPay;
      hoursPerMonth = pHoursPerMonth;
   }//partTimeEmployee

   protected void setHourlyPay(double pHourlyPay){
      hourlyPay = pHourlyPay;
   }//setHourlyPay

   protected double getHourlyPay(){
      return hourlyPay;
   }//getHourlyPay

   protected void setHoursPerMonth(double pHoursPerMonth){
      hoursPerMonth = pHoursPerMonth;
   }//setHoursPerMonth

   protected double getHoursPerMonth(){
      return hoursPerMonth;
   }//getHoursPerMonth

   protected double calculateMonthlyPay(){
      return hourlyPay * hoursPerMonth;
   }//calculateMonthlyPay

   protected void printAllDetails(String number, String name)
   {
      System.out.println("Employee number: " + number);
      /**System.out.println("Employee name: " + name);
       */
      System.out.println("Monthly Pay: " + df.format(calculateMonthlyPay()));
      System.out.println("===============================");
   }//printAllDetails
}//class
