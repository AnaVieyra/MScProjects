package PSD2Lab3;

/**
 * Created by anamv on 04/10/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class TestTimePiece
{
   public static void main(String[] args)
   {
      //create objects
      TimePiece myWatch = new TimePiece("watch", "digital", 12.99, 9, 45, true);

      TimePiece bigBen = new TimePiece("clock", "analog", 100000, false);

      //print details
      System.out.println("\n\n" + bigBen);
      System.out.println("\n\n------------------------------");
      System.out.println("The time on my watch is " + myWatch.showTime());
      System.out.println("------------------------------");
      myWatch.setHours(10);
      myWatch.setMinutes(50);
      bigBen.setTime(22, 5);
      System.out.println("The time on big ben is " + bigBen.showTime());
      bigBen.updateTime(5, 2);
      System.out.println("------------------------------");
      System.out.println("\n\n" +myWatch);
      System.out.println("\n\n" +bigBen);

   }//main
}//class
