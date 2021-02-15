package ARCHCodingSprint;
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
/**
 * Created by anamv on 11/01/2021
 * COM742 Coding Sprint and Test wk0
 */
public class CodingSprint
{
   static DecimalFormat df = new DecimalFormat("#,###,###.###");

   public static void main(String[] args) {


      // Read array from file and print
      int[] numbers = readArrayFromFile("test.txt");

      //System.out.println(numbers.length);
      // Task: Complete main method below
      // Read array from supplied text file (practice.txt) using method provided

      // Sort array using Bubble sort (code provided)
      bubbleSort(numbers);
      // Search for key = 3555318 using Binary search
      binarySearch(numbers,84726);
      // Compute the following stats from array obtained from text file
      // Total number of negative values
      countNegativeValues(numbers);
      // Minimum value
      minArrayValue(numbers);
      // Maximum value
      maxArrayValue(numbers);
      // Median and mode values
      medianArrayValue(numbers);
      modeArrayValue(numbers);

      //TEST METHODS
      System.out.println("\nThese are the results from the new methods");
      System.out.println("Mean value in array: " + meanArrayValue(numbers));
      System.out.println("Mean value of odd numbers in array: " +
            df.format(meanOddValue(numbers, -35000, 20000)));
      System.out.println("Total negative odd values in array: " + df.format(countNegativeOddValues(numbers)));
      System.out.println("Total zero values in array: "+ countZeroValues(numbers));
      System.out.println("Total positive values in array: " + df.format(countPositiveValues(numbers, 12000)));
      System.out.println("Sum of positive values in array: " + df.format(sumPositiveValues(numbers,25000 )));

   }//main

   public static int[] readArrayFromFile(String filename) {
        /*
        Description: Reads an array from file using UUlib.
        Parameters:  filename of textfile.
        Returns: int array of numbers
        */
      int[] array = new int[1];

      try {

         FileReader fr = new FileReader(filename);
         BufferedReader br = new BufferedReader(fr);
         String c = br.readLine();
         Integer size = Integer.parseInt(c);
         array = new int[size];
         //System.out.println(array.length);

         for (int i=0; i< size; i++) {

            c = br.readLine();
            array[i] = Integer.parseInt(c);
            //System.out.println(array[i]);
         }
         br.close();
         fr.close();
      }
      catch (IOException e) {
         System.out.println(e);
      }
      return array;
   }

   public static int countNegativeValues(int[] array) {
        /*
        Description: Counts the negative integer values in an array
        Parameters:  int array to be counted
        Returns: int number of nagative values
        */

      // Task: Complete method code
      int count = 0;
      for (int i = 0; i < array.length; i++){
         if (array[i] < 0){
            count++;
         }//if
      }//for
      System.out.println("Total Negatives in Array = " + count);
      return count;
   }//countNegativeValues

   public static double medianArrayValue(int[] array) {
        /*
        Description: Computes median value from a sorted array
        Parameters:  int array of values from which median is computed
        Returns: double calculated median value
        Note: Array must be sorted
        */
      // Task: Complete method code
      Arrays.sort(array);
      double median;
      if (array.length % 2 == 0){
         median = ((double)array[array.length/2] + (double)array[array.length/2-1]) / 2;
      }//if
      else{
         median = (double)array[array.length / 2];
      }//else
      System.out.println("Median value in array = " + median);
      return median;
   }//medianArrayValue

   public static int modeArrayValue(int[] array) {
        /*
        Description: Computes the first mode value from a sorted array
        Parameters:  int array of values from which mode is computed
        Returns: int first mode value
        Note: Array must be sorted
        */

   // Task: Complete method code
      Arrays.sort(array);
      int count1=0, count2=0, mode1, mode2=0;

      for (int i = 0; i < array.length; i++){
         mode1 = array[i];
         count1 = 1;

         for(int n = i+1; n < array.length; n++)
         {
            if (mode1 == array[n])
            {
               count1++;
            }//if
         }//for

         if (count1 > count2){
            mode2 = mode1;
            count2 = count1;
         }//if
      }//for
      System.out.println("Mode value in Array = " + mode2);
      return mode2;
   }//modeArrayValue

   public static int minArrayValue(int[] array) {
        /*
        Description: Computes minimum value from an int array
        Parameters:  int array of values from which to find minimum
        Returns: int minimum value
        */

      // Task: Complete method code
      Arrays.sort(array);
      int min = array[0];
      System.out.println("Minimum value in Array = " + min);
      return min;
     /* int min = 0;
      for (int i = 0; i < array.length; i++){
         min = array[i];
         if (i < (array.length-1)){
            if (array[i + 1] < array[i])
            {
               min = array[i + 1];
            }//if
         }//if
      }//for
      System.out.println("Minimum value in Array = " + min);
      return min;*/
   }//minArrayValue

   public static int maxArrayValue(int[] array)  {
        /*
        Description: Computes maximum value from an int array
        Parameters:  int array of values from which to find maximum
        Returns: int maximum value
        */

      // Task: Complete method code
      int max = 0;
      for (int i = 0; i < array.length; i++){
         max = array[i];
         if (i < (array.length-1)){
            if (array[i+1] > array[i])
            {
               max = array[i + 1];
            }//if
         }//if
      }//for
      System.out.println("Maximum value in Array = " + max);
      return max;
   }//maxArrayValue

   public static void swap(int[] array, int posA, int posB) {
        /*
        Description: Swaps two values in an int array
        Parameters:  int array of values and positions of elements to be swapped
        Returns: void
        */
      int tmp = array[posA];
      array[posA] = array[posB];
      array[posB] = tmp;
   }

   public static void bubbleSort(int[] array) {
        /*
        Description: Sorts a int array using bubblesort algoritm
        Parameters:  int array of values to be sorted
        Returns: void
        */
      int ncomps=0, nswaps=0; // declare and initialise counters
      for (int out = array.length-1; out > 0; out--) {
         for (int in = 0; in < out; in++) {
            ncomps++; // increment number of comparisons
            if (array[in] > array[in+1]) {
               nswaps++;  // increment number of swaps
               swap(array, in, in+1);
            }
         }
      }
      System.out.println("Bubble sort: Comparisons=" + ncomps + ", Swaps="+nswaps);
   }//bubbleSort

   public static int binarySearch(int array[], int key) {
        /*
        Description: Performs binary search on an array for a specified value
        Parameters:  int array of values and int key which item to be searched
        Returns: int indicating first location of item, or -1 in case not found
        */
   // Task: Complete method code
      final int SIZE = array.length;
      int first = 0, last = SIZE -1, location = 0, comparisons = 0;
      boolean found = false;
      do{
         int middle = (last + first) / 2;
         if (array[middle] == key) {
            found = true;
            location = middle;
         }//if
         else{
            if (array[middle] < key)
            {
               first = middle + 1;
            }//if
            else
            {
               last = middle - 1;
            }//else
         }//else
      comparisons++;
      } while ((!found) && (first <=last));

      if (found) {
         System.out.println("Binary Search: Comparisons = " + comparisons + "\nLocation of key:" + location);
         return location;
      } else
         System.out.println("Binary Search: Comparisons = " + comparisons + "\nLocation of key:-1" );
      return -1;
   }//binarySearch

   public static double meanArrayValue(int [] array){
             /*
        Description: Computes mean value from an array
        Parameters:  int array of values from which mean is computed
        Returns: double calculated mean value
        */

      // Task: Complete method code
      return Arrays.stream(array).sum() / array.length;
   }//meanArrayValue

   public static double meanOddValue(int[] array, int start, int end) {

   /*
   Description: Compute the mean of the odd numbers between start and end from an array
   Parameters:  int array of values from which mean is computed, start value, end value
   Returns: double calculated mean value
   */
      // Task: Complete method code
      double total = 0;
      int count=0;
      for (int i = 0; i < array.length; i++){
         //if (array[i] % 2 != 0) {
         if ((array[i] % 2 != 0) && (array[i] > start) && (array[i] < end)){
            total = total + array[i];
            count++;
         }//if
      }//for
      return total / count;
   }//meanOddValue

   public static int countNegativeOddValues(int[] array) {
        /*
        Description: Counts the negative odd integer values in an array
        Parameters:  int array to be counted
        Returns: int number of negative odd values
        */

      // Task: Complete method code
      int count = 0;
      for (int i = 0; i < array.length; i++){
         if ((array[i] < 0) && (array[i] % 2 != 0)){
            count++;
         }//if
      }//for
      return count;
   }

   public static int countZeroValues(int[] array) {
        /*
        Description: Counts the zero integer values in an array
        Parameters:  int array to be counted
        Returns: int number of zero values
        */

      // Task: Complete method code
      int count = 0;
      for (int i = 0; i < array.length; i++){
         if (array[i] == 0){
            count++;
         }//if
      }//for
      return count;
   }

   public static int countPositiveValues(int[] array, int threshold) {
        /*
       Description: Counts the Positive integer values in an array greater than a     given value (e.g, count the number of values greater than 10000)
        Parameters:  int array to be counted, threshold value
        Returns: int number of values greater than threshold
       */
   // Task: Complete method code
      int count = 0;
      for (int i = 0; i < array.length; i++){
         if (array[i] > 0) {//&& (array[i] > threshold)){
            count++;
         }//if
      }//for
      return count;
   }//countPositiveValues

   public static int sumPositiveValues(int[] array, int threshold) {
        /*
        Description: Sums the positive integer values in an array above a given threshold (e.g, sum the number of values greater than 10000)
        Parameters:  int array to be counted
        Returns: int sum of positive values
        */

      // Task: Complete method code
      int sum = 0;
      for (int i = 0; i < array.length; i++){
         if (array[i] > 0){
         //if ((array[i] > 0) && (array[i] > threshold)){
            sum = sum + array[i];
         }//if
      }//for
      return sum;
   }//SumPositiveValues


}//class
