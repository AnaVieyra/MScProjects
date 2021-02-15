package PSD2Lab1;
import java.text.DecimalFormat;
import java.util.*;
/**
 * Created by anamv on 14/09/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Car {

   static DecimalFormat df = new DecimalFormat("0,000.00");
   static Calendar calendar = Calendar.getInstance();

   private int id;
   private int yearOfManufacture;
   private int topSpeed;
   private String make;
   private String ownerName;
   private String colour;
   private double costPrice;


   public Car() {
   }//Default constructor

   public Car(int pId, int pManufacture, int pSpeed, String pMake, String pOwner, String pColour, double pPrice){
      id = pId;
      yearOfManufacture = pManufacture;
      topSpeed = pSpeed;
      make = pMake;
      ownerName = pOwner;
      colour = pColour;
      costPrice = pPrice;
   }//Alternative Constructor 7p

   public Car(int pId, String pMake, String pOwner, String pColour) {
      id = pId;
      make = pMake;
      ownerName = pOwner;
      colour = pColour;
      yearOfManufacture = 0; //A possible suitable default value showing error?
      topSpeed = 0; //A possible suitable default value showing error?
      costPrice = 0; //A possible suitable default value showing error?
   }//Alternative constructor 4p

   public Car(int pId, String pOwner, int pSpeed) {
      id = pId;
      ownerName = pOwner;
      topSpeed = pSpeed;
      yearOfManufacture = 0; //A possible suitable default value showing error?
      make = "unknown";//A possible suitable default value showing error?
      colour = "unknown";//A possible suitable default value showing error?
      costPrice = 0; //A possible suitable default value showing error?
   }//Alternative Constructor 3p

   public void setId(int pId) {
      id = pId;
   }//setId

   public void setYearOfManufacture(int pManufacture) {
      yearOfManufacture = pManufacture;
   }//setYearOfManufacture

   public void setTopSpeed(int pSpeed) {
      topSpeed = pSpeed;
   }//setTopSpeed

   public void setMake(String pMake) {
      make = pMake;
   }//setMake

   public void setOwnerName(String pOwner){
      ownerName = pOwner;
   }//serOwnerName

   public void setColour(String pColour){
      colour = pColour;
   }//setColour

   public void setCostPrice(double pPrice){
      costPrice = pPrice;
   }//setCostPrice

   public int getId() {
      return id;
   }//getId

   public int getYearOfManufacture() {
      return yearOfManufacture;
   }//getYearOfManufacture

   public int getTopSpeed() {
      return topSpeed;
   }//getTopSpeed

   public String getMake() {
      return make;
   }//getHasACD

   public String getOwnerName(){
      return ownerName;
   }//getOwnerName

   public String getColour(){
      return colour;
   }//getColour

   public double getCostPrice(){
      return costPrice;
   }//getCostPrice

   // Method to print out all the details of a car
   public void printCarInfo() {
      System.out.println("CAR DETAILS");
      System.out.println("The ID of the car is " + id);
      System.out.println("The Year of Manufacture of the car is " + yearOfManufacture);
      System.out.println("The Top Speed of the car is " + topSpeed);
      System.out.println("The make of the car is " + make);
      System.out.println("The owner of the car is " + ownerName);
      System.out.println("The colour of the car is " + colour);
      System.out.println("The cost of the car is £" + df.format(costPrice));
      System.out.println("===========");
   }//printCarDetails

   //method to return age of car
   public int ageOfCar(){
      int answer;
      Calendar current = Calendar.getInstance();
      if (yearOfManufacture == 0)     {
         answer = -1;
      }//if
      else {
         answer = (current.get(Calendar.YEAR) - yearOfManufacture);
      }//else
      return answer;
   }//ageOfCar

   //method to return current value of car using depreciation
   public double currentValue(double pDepreciation){
      double value;
      if ((yearOfManufacture == 0) || (costPrice == 0)) {
         value = -1;
      }//if
      else {
         value = costPrice - (costPrice * (pDepreciation / 100) * ageOfCar());
      }//else
      return value;
   }//currentValue
}//class
