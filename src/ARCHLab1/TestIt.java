package ARCHLab1;

/**
 * Created by anamv on 18/01/2021
 * COMMENTS ABOUT PROGRAM HERE
 */
public class TestIt
{
   public static void main(String[] args)
   {
      int a = -4;
      int b, c;
      b = 3*a-5;
      c = 4*b-7;
      // if a is less than 0 then it is made positive
      if (a<0){
         a = -a;
         System.out.println("The value of a = "+a);
         System.out.println("The value of b before if = " + b);
         System.out.println("The value of c before if = " + c);
      }//if
      // test Compound if-else construct
      if (b>0) {
         b = -b + c*2;
         c = c +1;
      }//if
      else {
         b = b + c*1;
         c = c -1;
      }//else
      System.out.println("The value of b after if = " + b);
      System.out.println("The value of c after if = " + c);
   }//main
}//class
