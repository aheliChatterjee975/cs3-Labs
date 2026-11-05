import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab09c
{
	public static void main( String args[] ) throws IOException
	{
      String values[] = {"A","E","I","O","U"};
      Grid test = new Grid(12, 12, values);
      out.println(test + "\n A count == " + test.findMax("A")
       + "\n E count == " + test.findMax("E")
       + "\n I count == " + test.findMax("I") + "\n");


     String values1[] = {"X", "Y", "2", "8", "7"};
     Grid test1 = new Grid(12, 12, values1);
     out.println(test1 + "\n X count == " + test1.findMax("X")
       + "\n 2 count == " + test1.findMax("2")
       + "\n Z count == " + test1.findMax("Z"));

	}
}


