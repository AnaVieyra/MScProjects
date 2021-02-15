package PSD2Lab6;

import java.util.Scanner;

/**
 * Created by anamv on 19/10/2020
 * read in the sales of each of the ten salesmen, print out the reference number of those salesmen who qualify for
 * commission, together with the amount that qualifies for commission
 */
public class Commission
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      final int MAX = 10;
      double sales, totalSales = 0, average, commissionCutOff;
      int reference;
      int [] salesStaff = new int[MAX];
      double [] groupSales = new double[MAX];

      for (int index = 0; index < MAX; index++){
         System.out.println("Please enter the Reference Number (1-10) of the first sales staff member: ");
         reference = keyboard.nextInt();
         salesStaff [index] = reference;
         System.out.println("Enter the sales total for this staff member: ");
         sales = keyboard.nextDouble();
         groupSales[index] = sales;
         totalSales += sales;
      }//for
      average = totalSales / MAX;
      commissionCutOff = average/ 3 * 2;

      for (int index = 0; index < MAX; index++){
         if (groupSales[index] > commissionCutOff){
            System.out.println("Staff member with reference number " + salesStaff[index] + " has a sales total of £" +
                  groupSales[index] + " which exceeds two-thirds of the average sales of the group.");
         }//if
      }//for

   }//main
}//class
