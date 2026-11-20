import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab13c_Runner
{
   public static void main( String[] args )
   {
      out.println("Evaluating Postfix Expressions: " );
      
      String expression = "2 7 + 1 2 + +";
      out.println(expression + " == " + ExpressionSolver.solvePostfix(expression));	
      expression = "1 2 3 4 + + -";
      out.println(expression + " == " + ExpressionSolver.solvePostfix(expression));	
      expression = "9 3 * 8 / 4 +";
      out.println(expression + " == " + ExpressionSolver.solvePostfix(expression));	
      expression = "19 3 / 2 * 7 9 * + 43 -";
      out.println(expression + " == " + ExpressionSolver.solvePostfix(expression));	
      expression = "35 5 + 2 * 4 / 19 +";
      out.println(expression + " == " + ExpressionSolver.solvePostfix(expression));	
      expression = "2.3 49.2 + 0.27 * 9 2 / +";
      out.println(expression + " == " + ExpressionSolver.solvePostfix(expression));	
      expression = "2 3 2 ^ ^";
      out.println(expression + " == " + ExpressionSolver.solvePostfix(expression));
      out.println();
      out.println("Evaluating Prefix Expressions: " );
   
      expression = "+ + 2 7 + 1 2";
      out.println(expression + " == " + ExpressionSolver.solvePrefix(expression));
      expression = "- 1 + 2 + 3 4";
      out.println(expression + " == " + ExpressionSolver.solvePrefix(expression));
      expression = "+ / * 9 3 8 4";
      out.println(expression + " == " + ExpressionSolver.solvePrefix(expression));
      expression = "- + * / 19 3 2 * 7 9 43"; 
      out.println(expression + " == " + ExpressionSolver.solvePrefix(expression));
      expression = "+ / * + 35 5 2 4 19";
      out.println(expression + " == " + ExpressionSolver.solvePrefix(expression));
      expression = "+ * + 2.3 49.2 0.27 / 9 2";
      out.println(expression + " == " + ExpressionSolver.solvePrefix(expression));
      expression = "^ 2 ^ 3 2";
      out.println(expression + " == " + ExpressionSolver.solvePrefix(expression));
   }
}