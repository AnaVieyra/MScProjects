package PSD2Lab1;
import java.text.DecimalFormat;
import java.util.*;

/**
 * Created by anamv on 16/09/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Transport
{
   static Scanner keyboard = new Scanner(System.in);
   static DecimalFormat df = new DecimalFormat("0.00");

   //method to prompt user entry for container weight
   public static int getWeight(int pNumber){
      System.out.print("Please enter the weight of container " + pNumber + " (in kg) or -1 to finish. ");
      return keyboard.nextInt();
   }//getWeight

   //method to calculate cost of each container
   public static double calculateCost(int pNumber, int pWeight){
      double cost;
      final int HIGHWEIGHT = 1000, LOWWEIGHT = 500;
      final int HIGHCOST = 1200, MIDDLECOST = 750, LOWCOST = 400;
      final int DISCOUNTNUMBER = 5;
      final double DISCOUNTRATE = 0.25;

      if (pWeight > HIGHWEIGHT){
         cost = MIDDLECOST;
      }//if
      else {
         cost = LOWCOST;
      }//else
      if (pNumber >= DISCOUNTNUMBER){
         cost = cost - (cost * DISCOUNTRATE);
      }//if
      return cost;
   }//calculateCost

   public static void main(String[] args)   {
      int weight = 0;
      int totalWeight = 0, numberOfContainers = 0;
      final int TERMINATOR = -1;
      double cost;

      while (weight != TERMINATOR){
         weight = getWeight(1);
         totalWeight = totalWeight + weight;
         numberOfContainers = numberOfContainers + 1;

      }//while

      cost = calculateCost(numberOfContainers, totalWeight);

      //output results
      System.out.println("The total number of containers is:\t\t" + (numberOfContainers - 1 ));
      System.out.println("The total weight of the containers is:\t\t" + (totalWeight + 1 ) + "kg");
      System.out.println("The total cost of transport is:\t\t£" + df.format(cost));

   }//main
}//class
