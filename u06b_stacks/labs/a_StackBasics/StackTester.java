import java.util.Scanner;
import java.util.Stack;
import static java.lang.System.*;

public class StackTester
{
    private Stack<String> stack;

    public StackTester()
    {
        setStack("");
    }

    public StackTester(String line)
    {
        setStack(line);
    }

    public void setStack(String line)
    {
        stack = new Stack<String>();

        Scanner scan = new Scanner(line);

        while(scan.hasNext())
        {
            stack.push(scan.next());
        }
    }

    public void popEmAll()
    {
        out.println("popping all items from the stack");

        while(!stack.isEmpty())
        {
            out.print(stack.pop() + " ");
        }

        out.println();
    }

    public String toString()
    {
        return stack.toString();
    }
}
