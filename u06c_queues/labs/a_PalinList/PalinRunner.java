import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinRunner
{
   public static void main ( String[] args )
   {
      String expression = "a b b a";
      System.out.print("\"" + expression + "\"");
      if(PalinList.isPalin(expression))
         System.out.println(" is a palinlist.\n");   
      else
         System.out.println(" is not a palinlist.\n");       

      expression = "one two three two one";
      System.out.println("\"" + expression + "\" is " + (PalinList.isPalin(expression) ? "" : "not ") + "a palinlist.\n"); 

      expression = "one two three one";
      System.out.println("\"" + expression + "\" is " + (PalinList.isPalin(expression) ? "" : "not ") + "a palinlist.\n"); 
      
      expression = "1 2 3 4 5 one two three four five";
      System.out.println("\"" + expression + "\" is " + (PalinList.isPalin(expression) ? "" : "not ") + "a palinlist.\n"); 
      
      expression = "a b c d e f g x y z g f h";     
      System.out.println("\"" + expression + "\" is " + (PalinList.isPalin(expression) ? "" : "not ") + "a palinlist.\n"); 
      
      expression = "racecar is racecar";
      System.out.println("\"" + expression + "\" is " + (PalinList.isPalin(expression) ? "" : "not ") + "a palinlist.\n"); 
      
      expression = "1 2 3 a b c c b a 3 2 1";
      System.out.println("\"" + expression + "\" is " + (PalinList.isPalin(expression) ? "" : "not ") + "a palinlist.\n"); 
      
      expression = "chicken is a chicken";
      System.out.println("\"" + expression + "\" is " + (PalinList.isPalin(expression) ? "" : "not ") + "a palinlist.\n");     
   }
}