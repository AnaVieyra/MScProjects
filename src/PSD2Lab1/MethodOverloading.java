package PSD2Lab1;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Created by anamv on 16/09/2020
 * Program to demonstrate method overloading
 * */
public class MethodOverloading{

   static Scanner keyboard = new Scanner(System.in);
   static DecimalFormat df = new DecimalFormat("0.00");

   //method to calculate the area of an equilateral triangle
   public static double calculateArea(int pSide){
      double area, sideSum = (pSide + pSide + pSide) / 2;
      area = Math.sqrt(sideSum * Math.pow((sideSum - pSide),3));
      return area;
   }//calculateArea

   //method to calculate the area of an isosceles triangle
   public static double calculateArea(int pSideA, int pSideB){
      double area, sideSum = (pSideA + pSideA + pSideB) / 2;
      area = Math.sqrt(sideSum * (sideSum - pSideA) * (sideSum - pSideA) * (sideSum - pSideB));
      return area;
   }//calculateArea

   //method to calculate the area of a scalene triangle
   public static double calculateArea(int pSideA, int pSideB, int pSideC){
      double area, sideSum = (pSideA + pSideB + pSideC) / 2;
      area = Math.sqrt(sideSum * (sideSum - pSideA) * (sideSum - pSideB) * (sideSum - pSideC));
      return area;
   }//calculateArea

   public static void main(String[] args){
      int equilateralSide;
      int isoscelesShortest, isoscelesLongest;
      int scaleneShortest, scaleneMiddle, scaleneLongest;

      //Test the calculateArea method for an Equilateral triangle
      System.out.println("Equilateral Triangle");
      System.out.println("********************");
      System.out.print("Enter the length of the side of the equilateral triangle: ");
      equilateralSide = keyboard.nextInt();
      System.out.println("The area of the triangle is " + df.format(calculateArea(equilateralSide)) + " units squared\n");

      //Test the calculateArea method for an Isosceles Triangle
      System.out.println("Isosceles Triangle");
      System.out.println("********************");
      System.out.print("Enter the length of the two sides that are the same for the Isosceles triangle: ");
      isoscelesShortest = keyboard.nextInt();
      System.out.print("Enter the length of the other side of the Isosceles triangle: ");
      isoscelesLongest = keyboard.nextInt();
      System.out.println("The area of the triangle is " + df.format(calculateArea(isoscelesShortest, isoscelesLongest)) + " units squared\n");

      //Test the calculateArea method for an Scalene Triangle
      System.out.println("Scalene Triangle");
      System.out.println("********************");
      System.out.print("Enter the length of the shortest side of the Scalene triangle: ");
      scaleneShortest = keyboard.nextInt();
      System.out.print("Enter the length of the second shortest side of the Scalene triangle: ");
      scaleneMiddle = keyboard.nextInt();
      System.out.print("Enter the length of the longest side of the Scalene triangle: ");
      scaleneLongest = keyboard.nextInt();
      System.out.println("The area of the triangle is " + df.format(calculateArea(scaleneShortest, scaleneMiddle, scaleneLongest)) + " units squared\n");
   }//main
}//class
