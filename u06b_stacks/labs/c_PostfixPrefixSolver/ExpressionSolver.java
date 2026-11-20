import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;


public class ExpressionSolver
{


  private static double calc(double one, double two, String op) {
     switch (op) {
        case "+":
           return one + two;
        case "-":
           return one - two;
        case "*":
           return one * two;
        case "/":
           return one / two;
         case "^":
           return Math.pow(one, two);
        default:
           throw new UnsupportedOperationException("Unsupported operator: " + op);
     }
  }


  public static double solvePostfix(String expression) {
     Stack<Double> stack = new Stack<>();
     Scanner scan = new Scanner(expression);


     while (scan.hasNext()) {
        String token = scan.next();


        if (isNumber(token)) {
           stack.push(Double.parseDouble(token));
        } else {
           double two = stack.pop();
           double one = stack.pop();
           stack.push(calc(one, two, token));
        }
     }
     scan.close();
     return stack.pop();
  }
        
  public static double solvePrefix(String expression) {
     Stack<Double> stack = new Stack<>();
     String[] tokens = expression.trim().split("\\s+");


     for (int i = tokens.length - 1; i >= 0; i--) {
        String token = tokens[i];


        if (isNumber(token)) {
           stack.push(Double.parseDouble(token));
        } else {
           double one = stack.pop();
           double two = stack.pop();
           stack.push(calc(one, two, token));
        }
     }
     return stack.pop();
  }  
 
  public static boolean isNumber(String symbol) {
     try {
        Double.parseDouble(symbol);
        return true;
     }
     catch (NullPointerException | NumberFormatException e) {
        return false;
     }
  }
}
