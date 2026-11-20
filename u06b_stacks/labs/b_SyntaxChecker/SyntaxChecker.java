import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker
{
    private String exp;

    public SyntaxChecker()
    {
        exp = "";
    }

    public SyntaxChecker(String s)
    {
        setExpression(s);
    }

    public void setExpression(String s)
    {
        exp = s;
    }

    public boolean checkExpression()
    {
        Stack<Character> symbols = new Stack<Character>();

        for(int i = 0; i < exp.length(); i++)
        {
            char ch = exp.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{' || ch == '<')
            {
                symbols.push(ch);
            }

            else if(ch == ')' || ch == ']' || ch == '}' || ch == '>')
            {
                if(symbols.isEmpty())
                {
                    return false;
                }

                char open = symbols.pop();

                if((ch == ')' && open != '(') ||
                   (ch == ']' && open != '[') ||
                   (ch == '}' && open != '{') ||
                   (ch == '>' && open != '<'))
                {
                    return false;
                }
            }
        }

        return symbols.isEmpty();
    }

    public String toString()
    {
        return exp;
    }
}
