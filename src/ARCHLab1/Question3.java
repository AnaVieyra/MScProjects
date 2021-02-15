package ARCHLab1;
import java.util.Scanner;

/**
*Created by anamv on 18/01/2021
*COMMENTS ABOUT PROGRAM HERE*/
public class Question3 {
    static Scanner kb = new Scanner(System.in);
    public static void main (String [] args){
        int entry;
        String coin="";
        boolean isPound= false;

        System.out.println("Enter a coin value: ");
        entry = kb.nextInt();

        switch(entry){
            case 1:
                coin = "One Penny";
            case 2:
                coin = "Two Pence";
            case 5:
                coin = "Five Pence";
            case 10:
                coin = "Ten Pence";
            case 50:
                coin = "Fifty Pence";
            case 100:
                coin = "One Pound";
            case 200:
                coin = "Two Pounds";
                isPound = true;
        }//switch

        if (isPound == true){
            System.out.println("This is " + coin);
        }//if
        else{
            System.out.println("Invalid coin value: " + entry);
        }//else
    }//main
}//class
