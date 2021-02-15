package PSD2Lab3;

import java.text.DecimalFormat;

/**
 * Created by anamv on 04/10/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class TimePiece
{

   DecimalFormat tf = new DecimalFormat("00");
   DecimalFormat df = new DecimalFormat("0,000.00");

   //variables
   private String type, readOut;
   private double costPrice;
   private int hrs, min;
   private boolean canTalk;
   private final int HRSINDAY = 24, MININHR = 60;

   protected TimePiece(){
   }//default constructor

   protected TimePiece(String pType, String pRead, double pCost, boolean pTalk) {
      type = pType;
      readOut = pRead;
      costPrice = pCost;
      canTalk = pTalk;
      hrs = 0;
      min = 0;
   }//alternative constructor 4p

   protected TimePiece(String pType, String pRead, double pCost,int pHrs, int pMin, boolean pTalk) {
      type = pType;
      readOut = pRead;
      costPrice = pCost;
      hrs = pHrs;
      min = pMin;
      canTalk = pTalk;
   }//alternative constructor 6p

   private String canTalk(){
      if (canTalk == true){
         return "\nThis time piece can talk";
      }//if
      else{
         return "\nThis time piece cannot talk";
      }//else
   }//canTalk

   protected String showTime(){
      return tf.format(hrs) + ":" + tf.format(min);
   }//showTime

   protected void setMinutes(int pMin){
      min = pMin;
   }//setMinutes

   protected void setHours(int pHrs){
      hrs = pHrs;
   }//setHours

   protected void setTime(int pHrs, int pMin){
      setHours(pHrs);
      setMinutes(pMin);
   }//setTime

   protected void updateTime(int pMin, int pHrs){
      min = min + pMin;
      if (min >= MININHR){
         min = min - MININHR;
         hrs = hrs + 1;
      }//if
      hrs = hrs + pHrs;
      if (hrs >= HRSINDAY){
         hrs = hrs - HRSINDAY;
      }//if
      setMinutes(min);
      setHours(hrs);
   }//updateTime

   public String toString(){
      return("Details of " + type + "\n====================================" +
            "\nCost Price:\t\t£" + df.format(costPrice) +"\nType of read out:   " + readOut
            + "\nCurrent Time:\t  " + showTime() + canTalk() +
            "\n====================================" );
   }//toString

}//class
