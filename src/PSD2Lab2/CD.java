package PSD2Lab2;

import java.text.DecimalFormat;

/**
 * Created by anamv on 22/09/2020
 * Details of CDs
 */
public class CD
{
   DecimalFormat df = new DecimalFormat("0.00");

   //class variables
   private static int uniqueID = 1;

   //variables
   private int number, issueYear;
   private String artistName, albumName;
   private double costPrice, salePrice;
   private boolean single;

   //constructor methods
   public CD(){
      number = uniqueID;
      uniqueID = uniqueID + 1;
   }//default constructor

   public CD(String pArtist, String pAlbum, int pIssue, boolean pSingle){
      artistName = pArtist;
      albumName = pAlbum;
      issueYear = pIssue;
      single = pSingle;
      number = uniqueID;
      costPrice = 0;
      salePrice = 0;
      uniqueID = uniqueID + 1;
   }//alternative constructor - 4P

   public CD(String pArtist, String pAlbum, double pCost, double pSale, int pIssue, boolean pSingle){
      artistName = pArtist;
      albumName = pAlbum;
      costPrice = pCost;
      salePrice = pSale;
      issueYear = pIssue;
      single = pSingle;
      number = uniqueID;
      uniqueID = uniqueID + 1;
   }//default constructor

   //print info method
   public void printAllInfo(){
      System.out.println("This is CD number: " + number);
      System.out.println("This CD was issued in: " + issueYear);
      System.out.println("The Artist Name is: " + artistName);
      System.out.println("The Album Name is: " + albumName);
      System.out.println("The cost price of this CD is: £" + df.format(costPrice));
      System.out.println("The sale price of this CD is: £" + df.format(salePrice));
      System.out.println("This is a " + single + " CD");
      System.out.println("==============================");
   }//printAllInfo

   //get methods
   public int getYear(){
      return issueYear;
   }//getYear

   public void updatePrices(double pIncrease){
      costPrice = costPrice + pIncrease;
      salePrice = salePrice + (2 * pIncrease);
   }//updatePrices

   public double getProfit(){
      return salePrice - costPrice;
   }//getProfit

}//class
