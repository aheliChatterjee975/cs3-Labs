import java.util.Stack;
import static java.lang.System.*;

public class Lab13b
{
    public static void main(String[] args)
    {
        SyntaxChecker test1 = new SyntaxChecker("(abc(*def)");
        out.println(test1 + " is " + (test1.checkExpression() ? "correct." : "incorrect."));

        SyntaxChecker test2 = new SyntaxChecker("[{}]");
        out.println(test2 + " is " + (test2.checkExpression() ? "correct." : "incorrect."));

        SyntaxChecker test3 = new SyntaxChecker("[");
        out.println(test3 + " is " + (test3.checkExpression() ? "correct." : "incorrect."));

        SyntaxChecker test4 = new SyntaxChecker("[{<()>}]");
        out.println(test4 + " is " + (test4.checkExpression() ? "correct." : "incorrect."));

        SyntaxChecker test5 = new SyntaxChecker("{<html[value=4]*(12)>{$x}}");
        out.println(test5 + " is " + (test5.checkExpression() ? "correct." : "incorrect."));

        SyntaxChecker test6 = new SyntaxChecker("[one]<two>{three}(four)");
        out.println(test6 + " is " + (test6.checkExpression() ? "correct." : "incorrect."));

        SyntaxChecker test7 = new SyntaxChecker("car(cdr(a)(b)))");
        out.println(test7 + " is " + (test7.checkExpression() ? "correct." : "incorrect."));

        SyntaxChecker test8 = new SyntaxChecker("car(cdr(a)(b))");
        out.println(test8 + " is " + (test8.checkExpression() ? "correct." : "incorrect."));
    }
}
