import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;


class ExpressionSolver {
private ArrayList<String> expression;
private String exp;
private int ans;


   public ExpressionSolver(String s) {
       setExpression(s);
   }


   public void setExpression(String s) {
       expression = new ArrayList<>();
       exp = s;
       for(int i = 0; i < exp.length(); i++) {
           String character = exp.substring(i, i+1);
           if(!character.equals(" ")) {
             expression.add(character);
           }
       }
   }


   public void solveExpression() {
       ans = 0;
       while(expression.indexOf("*") != -1 || expression.indexOf("/") != -1) {
           for(int i = 0; i < expression.size(); i++) {
               String op = expression.get(i);
               if(op.equals("*") || op.equals("/")) {
                   int left = parseInt(expression.get(i-1));
                   int right = parseInt(expression.get(i+1));
                   if(op.equals("*")) {
                       ans = left * right;
                   } else {
                       ans = left / right;
                   }
                   expression.remove(i-1);
                   expression.remove(i-1);
                   expression.set(i-1, Integer.toString(ans));
               }
           }
       }
      
       while(expression.indexOf("+") != -1 || expression.indexOf("-") != -1) {
           for(int i = 0; i < expression.size(); i++) {
               String op = expression.get(i);
               if(op.equals("+") || op.equals("-")) {
                   int left = parseInt(expression.get(i-1));
                   int right = parseInt(expression.get(i+1));
                   if(op.equals("+")) {
                       ans = left + right;
                   } else {
                       ans = left - right;
                   }
                   expression.remove(i-1);
                   expression.remove(i-1);
                   expression.set(i-1, Integer.toString(ans));               
              }
           }
       }
   }


   public String toString() {
       return exp + " = " + ans;
   }
}


