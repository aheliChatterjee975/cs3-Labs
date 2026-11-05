//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab -

import static java.lang.System.*;

public class Lab09b
{
	public static void main(String args[])
	{
		AtCounter counter;

		counter = new AtCounter();
		out.println("0 0 has " + counter.countAts(0,0) + " @s connected.");

		counter = new AtCounter();
		out.println("2 5 has " + counter.countAts(2,5) + " @s connected.");

		counter = new AtCounter();
		out.println("5 0 has " + counter.countAts(5,0) + " @s connected.");

		counter = new AtCounter();
		out.println("9 9 has " + counter.countAts(9,9) + " @s connected.");

		counter = new AtCounter();
		out.println("3 9 has " + counter.countAts(3,9) + " @s connected.");
	}
}


