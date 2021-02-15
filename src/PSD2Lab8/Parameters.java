package PSD2Lab8;

/**
 * Created by anamv on 03/11/2020
 * Define a class with several methods that accept arrays or array elements
 * as parameters and performs simple modifications
 */
public class Parameters
{
   protected void passElement(int number) {
      System.out.println("Number = " + number);
      number = 1234;
      System.out.println("Now Number = " + number);
   }//passElement

   protected void changeElement(int[] myList) {
      myList[2] = 77;
      myList[4] = 88;
   }//changeElement

   protected void changeReference(int[] myList1, int[] myList2) {
      myList1 = myList2;
   }//changeReference

   protected void copyArray(int[] myList1, int[] myList2) {
      for (int count = 0; count < myList1.length; count++) {
         myList1[count] = myList2[count];
      }//for
   }//copyArray

   protected int[] returnReference(int[] myList) {
      myList[1] = 9876;
      return myList;
   }//returnReference

   protected void printList(int[] myList) {
      for (int count = 0; count < myList.length; count++) {
         System.out.print(myList[count] + " ");
      }//for
      System.out.println();
   }//output
}//class
