/* Java implementation to convert infix expression to postfix*/
// Note that here we use Stack class for Stack operations 
import java.util.Stack; 

public class MathNotationsRunner {
  public static void main(String[] args)  { 
    System.out.printf("%22s <=> %s%n", "Infix", "Postfix"); 
    String exp = "2 - 5"; 
    System.out.printf("%22s <=> %s%n", exp, MathNotations.infixToPostfix(exp)); 
    exp = "(2 - 5)"; 
    System.out.printf("%22s <=> %s%n", exp, MathNotations.infixToPostfix(exp));  
    exp = "a+b*c^d"; 
    System.out.printf("%22s <=> %s%n", exp, MathNotations.infixToPostfix(exp)); 
    exp = "a^b*c+d"; 
    System.out.printf("%22s <=> %s%n", exp, MathNotations.infixToPostfix(exp)); 
    exp = "(a+b)^(8-c)"; 
    System.out.printf("%22s <=> %s%n", exp, MathNotations.infixToPostfix(exp)); 
    exp = "a+b*(c^d-e)^(f+g*h)-i"; 
    System.out.printf("%22s <=> %s%n", exp, MathNotations.infixToPostfix(exp)); 
  } 
} 