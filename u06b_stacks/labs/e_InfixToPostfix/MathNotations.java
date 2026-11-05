import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.text.ParsePosition;
import java.text.NumberFormat;

public class MathNotations { 
  // Converts given infix expression to postfix expression.  
   public static String infixToPostfix(String exp) 
   { 
   
   }
    
  // A utility function to return precedence of a given operator 
  // Higher returned value means higher precedence 
   private static int precedence(String ch) { 
      switch (ch) { 
         case "+": 
         case "-": 
            return 1; 
       
         case "*": 
         case "/": 
            return 2; 
       
         case "^": 
            return 3; 
      } 
      return -1; 
   } 
  
  
   public static boolean isNumeric(String s) {
      ParsePosition pos = new ParsePosition(0);
      NumberFormat.getInstance().parse(s, pos);
      return s.length() == pos.getIndex();
   }

   public static boolean isNumeric2(String symbol) 
   {
      if (symbol == null) {
         return false;
      }
      try {
         Double.parseDouble(symbol);
         return true;
      }
      catch (NumberFormatException e) {
         return false;
      }
   }
 
   public static boolean isNumeric3(String symbol) 
   {
      try {
         Double.parseDouble(symbol);
         return true;
      }
      catch (NullPointerException | NumberFormatException e) {
         return false;
      }
   }
	
   public static boolean isNumeric4(String strNum) {
      // Checks if the provided string is numeric
      // by applying a regular expression to it.
      
      // [0-9] could be replaced with \\d
             
      String regex = "[-+]?[0-9]+(\\.[0-9]+)?";   //Only accepts 2.5
      //String regex = "[-+]?[0-9]+[\\.]?[0-9]*";   //Only accepts 2.5 and 2.
      //String regex = "[-+]?[0-9]*[\\.]?[0-9]+";   //Only accepts 2.5 and .5 
      //String regex = "[-+]?[0-9]*[\\.]?[0-9]*";   //This version isn't good b.c. it accepts 2.5 , 2. , .5, or just .
      //String regex = "[-+]?([0-9]+[\\.]?[0-9]*)|([0-9]*[\\.]?[0-9]+)";  //This accepts 2.5 , 2. , or .5
      //String regex = "[-+]?([0-9]+(\\.[0-9]*)?|\\.[0-9]+)";  //This accepts 2.5 , 2. , or .5
      return Pattern.matches(regex, strNum);
   }

}