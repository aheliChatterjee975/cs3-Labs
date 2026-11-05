
import java.util.Scanner;

public class Lab04e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an expression (e.g. 5+3*2): ");
        String input = scanner.nextLine();
        
        ExpressionSolver solver = new ExpressionSolver(input);
        solver.solveExpression();
        
        System.out.println(solver.toString());
        
        scanner.close();
    }
}