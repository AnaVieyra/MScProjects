package PSD2Lab2;

import java.text.DecimalFormat;

/**
 * Created by anamv on 22/09/2020
 * Testing CD.java
 */
public class TestCD {



   public static void main(String[] args) {

      DecimalFormat df = new DecimalFormat("0.00");

      //create CD objects
      CD myCD;
      myCD = new CD("Bob Marley", "Legend", 1980, true);
      myCD.printAllInfo();

      //break
      System.out.println("==============================");

      CD yourCD = new CD("Bonnie Raitt", "Nick of Time", 6.25, 11.99, 1989, true);
      yourCD.printAllInfo();

      //break
      System.out.println("==============================");

      //invoke the instance method called getYear() and print out this information.
      System.out.println("The album Legend was released in " + myCD.getYear());

      //break
      System.out.println("==============================");

      //increase the cost price and the sales price of the yourCD object by £2.50 and £5.00 (respectively)
      yourCD.updatePrices(2.5);

      //Print out all the details of yourCD
      yourCD.printAllInfo();

      //break
      System.out.println("==============================");

      //call the method getProfit()
      System.out.println("The profit made from the sale of one Bonnie Raitt CD is: £" + df.format(yourCD.getProfit()));

      //break
      System.out.println("==============================");

   }//main
}//class
