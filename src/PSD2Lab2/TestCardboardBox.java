package PSD2Lab2;
import java.util.Scanner;
/**
 * Created by anamv on 21/09/2020
 * Program to test CardboardBox
 */
public class TestCardboardBox
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      //declare test variable
      int sugarVolume;

      //Create myBox and print out the details
      CardboardBox myBox = new CardboardBox();
      System.out.println("======================");
      System.out.println("This is myBox");
      myBox.showAllDetails();

      //Create yourBox and print out the details
      //Width = 15 Height = 5 Depth = 25
      CardboardBox yourBox = new CardboardBox(15, 5, 25);
      System.out.println("======================");
      System.out.println("This is yourBox");
      yourBox.showAllDetails();

      //Print out the Top Area, Front Area and Side Area of yourBox
      yourBox.printTopArea();
      yourBox.printFrontArea();
      yourBox.printSideArea();

      //Create aBox and print out the details
      //Width = 20 Height = 15 Depth = 10 Colour = brown
      CardboardBox aBox = new CardboardBox(20, 15, 10, "brown");
      System.out.println("======================");
      System.out.println("This is aBox");
      aBox.showAllDetails();

      //Print out the Top Area, Front Area and Side Area of aBox
      aBox.printTopArea();
      aBox.printFrontArea();
      aBox.printSideArea();

      //Prompt the user for the 4 attributes and assign these
      //using the appropriate set methods to myBox
      System.out.println("======================");
      System.out.println("Please enter a new width for myBox: ");
      myBox.setWidth(keyboard.nextInt());
      System.out.println("Please enter a new height for myBox: ");
      myBox.setHeight(keyboard.nextInt());
      System.out.println("Please enter a new depth for myBox: ");
      myBox.setDepth(keyboard.nextInt());
      System.out.println("Please enter a new colour for myBox: ");
      myBox.setColour(keyboard.next());

      // Print out all the details of myBox
      System.out.println("======================");
      System.out.println("This is the new myBox");
      myBox.showAllDetails();

      //Print out the number of boxes that have been created
      System.out.println("======================");
      System.out.println("So far, you have created " + CardboardBox.noOfBoxes() + " number of boxes.");

      //create a CardboardBox object called testBox
      CardboardBox testBox = new CardboardBox();

      //prompt user to input dimensions for testBox
      System.out.println("======================");
      System.out.println("Please enter the volume of sugar you require storage for: ");
      sugarVolume = keyboard.nextInt();
      System.out.println("Please enter the dimensions of the boxes to be used for storage");
      System.out.println("Enter the width: ");
      testBox.setWidth(keyboard.nextInt());
      System.out.println("Enter the  height: ");
      testBox.setHeight(keyboard.nextInt());
      System.out.println("Enter the depth: ");
      testBox.setDepth(keyboard.nextInt());
      //calculate volume of available box
      int boxVolume = testBox.calculateVolume();
      System.out.println("The box volume is: " + boxVolume);

      //print out required amount of boxes
      System.out.println("======================");
      System.out.println("You will need " + CardboardBox.requiredBoxes(sugarVolume, boxVolume) + " boxes to store " + sugarVolume + " units of sugar.");

   }//main
}//class
