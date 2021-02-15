package PSD2Lab2;

/**
 * Created by anamv on 21/09/2020
 * Program to define attributes of cardboard box
 */
public class CardboardBox
{
   //declare attributes
   private int width, height, depth;
   private String colour;
   private static int noOfBoxes = 0;


   public CardboardBox(){
      noOfBoxes = noOfBoxes + 1;
   }//default constructor

   public CardboardBox(int pWidth, int pHeight, int pDepth, String pColour){
      width = pWidth;
      height = pHeight;
      depth = pDepth;
      colour = pColour;
      noOfBoxes = noOfBoxes + 1;
   }//alternative constructor

   public CardboardBox(int pWidth, int pHeight, int pDepth){
      width = pWidth;
      height = pHeight;
      depth = pDepth;
      colour = "unknown";//initialized
      noOfBoxes = noOfBoxes + 1;
   }//alternative constructor

   public void setWidth(int pWidth){
      width = pWidth;
   }//setWidth

   public void setHeight(int pHeight){
      height = pHeight;
   }//setHeight

   public void setDepth(int pDepth){
      depth = pDepth;
   }//setDepth

   public void setColour(String pColour){
      colour = pColour;
   }//setColour

   public int getWidth(){
      return width;
   }//getWidth

   public int getHeight(){
      return height;
   }//getHeight

   public int getDepth(){
      return depth;
   }//getDepth

   public String getColour(){
      return colour;
   }//getColour

   public int calculateVolume(){
      return width * height * depth;
   }//calculateVolume

   public void showAllDetails(){
      System.out.println("The WIDTH of the cardboard box is " + width + " units");
      System.out.println("The HEIGHT of the cardboard box is " + height + " units");
      System.out.println("The DEPTH of the cardboard box is " + depth + " units");
      System.out.println("The COLOUR of the cardboard box is " + colour);
      System.out.print("The VOLUME of the cardboard box is ");
      System.out.println(calculateVolume() + " units");
   }//showAllDetails

   public void printTopArea(){
      int area = width * depth;
      System.out.println("The Top Area of this box is " + area + " units");
   }//printTopArea

   public void printFrontArea(){
      int area = width * height;
      System.out.println("The Front Area of this box is " + area + " units");
   }//printFrontArea

   public void printSideArea(){
      int area = height * depth;
      System.out.println("The Side Area of this box is " + area + " units");
   }//printSideArea

   public static int noOfBoxes(){
      return noOfBoxes;
   }//getNoOfBoxes

   public static int requiredBoxes(int pSugarVolume, int pBoxVolume){
      int requiredVolume = pSugarVolume;
      int availableVolume = pBoxVolume;
      if (requiredVolume % availableVolume > 0) {
         return (requiredVolume / availableVolume) + 1;
      }//if
      else {
         return requiredVolume / availableVolume;
      }//else
   }//requiredBoxes

}//class
