//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab04b
{
	public static void main( String args[] )
	{
		NumberAnalyzer test = new NumberAnalyzer("5 12 9 6 1 4 8 6");
		out.println(test);
		out.println("odd count = " + test.countOdds());
		out.println("even count = " + test.countEvens());
		out.println("perfect count = " + test.countPerfects() + "\n\n\n");


		// Add more test cases
		
		NumberAnalyzer test2 = new NumberAnalyzer("1 2 3 4 5 6");
		out.println(test2);
		out.println("odd count = " + test2.countOdds());
		out.println("even count = " + test2.countEvens());
		out.println("perfect count = " + test2.countPerfects() + "\n\n\n");


		NumberAnalyzer test3 = new NumberAnalyzer("6 28 496 8128");
		out.println(test3);
		out.println("odd count = " + test3.countOdds());
		out.println("even count = " + test3.countEvens());
		out.println("perfect count = " + test3.countPerfects() + "\n\n\n");


		NumberAnalyzer test4 = new NumberAnalyzer("10 15 20 25 30");
		out.println(test4);
		out.println("odd count = " + test4.countOdds());
		out.println("even count = " + test4.countEvens());
		out.println("perfect count = " + test4.countPerfects());
	}
}
