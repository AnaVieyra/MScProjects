package ARCHLab1;/**
*Created by anamv on 18/01/2021
*COMMENTS ABOUT PROGRAM HERE*/
public class Task4Arrays {
    public static void main (String [] args){
        char [] characters = new char [10];
        double [] numbers = {3.3,9.0,45.0,6.5,7.9};

        System.out.println("The original array: ");
        for(int i=0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }//for

        System.out.println("The original array, numbers x 2: ");
        for(int i=0; i<numbers.length;i++){
            numbers[i] = numbers[i] *2;
            System.out.println(numbers[i]);
        }//for

        System.out.println("The array with numbers x 2, reversed: ");
        for(int i=numbers.length-1; i>=0;i--){
            //numbers[i] = numbers[i] *2;
            System.out.println(numbers[i]);
        }//for
    }//main
}//class
