package ARCHLab1;

/**
 * Created by anamv on 18/01/2021
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Question2
{
   public static void main(String[] args)
   {
         int p = 7, q = -4;
         int r = 3 * p + 4 * q;
         int s = 5 * p + 6 * r;
         int t;

         if (r > s){
            t = p + q + r;
         }//if
         else{
            t = p + q + s;
         }//else

         System.out.println("The value of p is: " + p);
         System.out.println("The value of q is: " + q);
         System.out.println("The value of r is: " + r);
         System.out.println("The value of s is: " + s);
         System.out.println("The value of t is: " + t);


      }//main
}//class
