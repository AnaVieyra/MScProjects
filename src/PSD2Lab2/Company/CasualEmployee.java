package PSD2Lab2.Company;

import java.text.DecimalFormat;

/**
 * Created by anamv on 23/09/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class CasualEmployee extends Employee {

   DecimalFormat df = new DecimalFormat("0.00");

   //class variables
   private double hourlyPay, weeklyHours;

   public CasualEmployee(String number, String name, double pHourlyPay, double pWeeklyHours) {
      Employee(number, name);
      hourlyPay = pHourlyPay;
      weeklyHours = pWeeklyHours;
   }//casualEmployee

   protected void setHourlyPay(double pHourlyPay){
      hourlyPay = pHourlyPay;
   }//setHourlyPay

   protected void setWeeklyHours(double pWeeklyHours){
      weeklyHours = pWeeklyHours;
   }//setWeeklyHours

   protected double getHourlyPay(){
      return hourlyPay;
   }//getAnnualSalary

   protected double getWeeklyHours(){
      return weeklyHours;
   }//getWeeklyHours

   protected double calculateWeeklyPay(){
      return hourlyPay * weeklyHours;
   }//calculateMonthlyPay

   protected void printAllDetails(String number, String name)
   {
      System.out.println("Employee number: " + number);
      System.out.println("Employee name: " + name);
      System.out.println("Weekly Pay: " + df.format(calculateWeeklyPay()));
      System.out.println("===============================");
   }//printAllDetails
}//class
