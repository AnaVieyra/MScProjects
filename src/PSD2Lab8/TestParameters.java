package PSD2Lab8;

/**
 * Created by anamv on 03/11/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class TestParameters
{
   public static void main(String[] args)
   {
      Parameters tester = new Parameters();
      int[] list1 = {11, 22, 33, 44, 55};
      int[] list2 = {99, 99, 99, 99, 99};

      System.out.println("Original array:");
      tester.printList(list1);
      tester.printList(list2);
      System.out.println();

      tester.passElement(list1[0]);
      System.out.println();
      System.out.println("After passing one element:");
      tester.printList(list1);
      tester.printList(list2);
      System.out.println();

      tester.changeElement(list1);
      System.out.println("After changing two elements:");
      tester.printList(list1);
      tester.printList(list2);
      System.out.println();

      tester.changeReference(list1, list2);
      System.out.println("After attempting to change a reference:");
      tester.printList(list1);
      tester.printList(list2);
      System.out.println();

      tester.copyArray(list1, list2);
      System.out.println("After copying each array element:");
      tester.printList(list1);
      tester.printList(list2);
      System.out.println();

      list1 = tester.returnReference(list2);
      System.out.println("After returning a reference:");
      tester.printList(list1);
      tester.printList(list2);

   }//main
}//class
