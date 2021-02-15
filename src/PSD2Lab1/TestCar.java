package PSD2Lab1;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by anamv on 14/09/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class TestCar
{
   static Scanner keyboard = new Scanner(System.in);
   static DecimalFormat df = new DecimalFormat("0,000.00");

   public static void main(String[] args)    {
      double depreciationRate;

      Car myCar;
      myCar = new Car();
      myCar.printCarInfo();

      Car sistersCar = new Car(100, 2008, 105, "Ford", "My sister Mary", "Red", 10995);
      sistersCar.printCarInfo();

      Car bossCar = new Car(101, 2011, 210, "Honda", "Pat Bell", "Silver", 27500);
      bossCar.printCarInfo();

      Car aCar = new Car(102, "Ford", "Janet Allison", "Red");
      aCar.printCarInfo();

      Car bCar = new Car(103, "John Smith", 100);
      bCar.printCarInfo();

      //break
      System.out.println("===========\n\n");
      /**
       // Use of get methods
       System.out.println("Colour of car " + herCar.getRegNumber() + " is " + herCar.getColour());
       System.out.println(johnCar.getRegNumber() + " has " +
       johnCar.getNoOfDoors() + " doors" + "\n");

       // Use of set methods
       janeCar.setColour("Green");
       System.out.println("Colour of " + janeCar.getRegNumber() + " is now " + janeCar.getColour() + "\n");

       myCar.setColour("Blue");
       myCar.setRegNumber("BWF 2341");
       myCar.setNoOfDoors(4);
       myCar.setHasACD(false);
       myCar.printCarDetails();
       */

      //3.5 bCar printed with different attributes
      bCar.setMake("Vauxhall");
      bCar.setOwnerName("James Rodgers");
      bCar.setYearOfManufacture(2012);
      bCar.setCostPrice(10000);
      bCar.printCarInfo();

      //break
      System.out.println("===========\n\n");

      //3.6 add cCar, set attributes and print
      Car cCar = new Car();
      cCar.setId(104);
      cCar.setMake("Toyota");
      cCar.setOwnerName("Robert Smith");
      cCar.setColour("Blue");
      cCar.setYearOfManufacture(2010);
      cCar.setTopSpeed(120);
      cCar.setCostPrice(12000);
      cCar.printCarInfo();

      //break
      System.out.println("===========\n\n");

      //3.7 Print out make, colour and year of manufacture of bCar
      System.out.println("The make of the bCar is " + bCar.getMake());
      System.out.println("The colour of the bCar is " + bCar.getColour());
      System.out.println("The Year of Manufacture of bCar is " + bCar.getYearOfManufacture());

      //break
      System.out.println("===========\n\n");

      //3.9 Print out age of cCar
      System.out.println("The Year of Manufacture of cCar is " + cCar.getYearOfManufacture() + ". cCar is " + cCar.ageOfCar() + " years old!");

      //break
      System.out.println("===========\n\n");

      //3.10 Print out age of aCar
      System.out.println("The Year of Manufacture of aCar is " + aCar.getYearOfManufacture() + ". aCar is " + aCar.ageOfCar() + " years old!");

      //break
      System.out.println("===========\n\n");

      //3.12 print current value of cCar taking into consideration depreciation
      System.out.println("Please enter a depreciation rate (as a percentage): ");
      depreciationRate = keyboard.nextDouble();
      double cCarCost = cCar.getCostPrice();
      int cCarAge = cCar.ageOfCar();
      System.out.println("The current value of cCar is £" + df.format(cCar.currentValue(depreciationRate)));

      //break
      System.out.println("===========\n\n");

      //3.13 print current value of aCar taking into consideration depreciation
      System.out.println("Please enter a depreciation rate (as a percentage): ");
      depreciationRate = keyboard.nextDouble();
      double aCarCost = aCar.getCostPrice();
      int aCarAge = aCar.ageOfCar();
      System.out.println("The current value of aCar is £" + df.format(aCar.currentValue(depreciationRate)));


   }//main
}//class
