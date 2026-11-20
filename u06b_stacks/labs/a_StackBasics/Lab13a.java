//© A+ Computer Science
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab13a
{
    public static void main(String[] args)
    {
        StackTester test1 = new StackTester("a b c d e f g h i");
        out.println(test1);
        test1.popEmAll();

        StackTester test2 = new StackTester("1 2 3 4 5 6 7 8 9 10");
        out.println(test2);
        test2.popEmAll();

        StackTester test3 = new StackTester("# $ % ^ * ( ) ) _");
        out.println(test3);
        test3.popEmAll();
    }
}


