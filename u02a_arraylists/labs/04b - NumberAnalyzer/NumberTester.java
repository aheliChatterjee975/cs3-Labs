//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class NumberTester
{
	public static void main(String[] args)
	{
		// Test constructor
		Number num1 = new Number(5);
		out.println("Number: " + num1);
		out.println("getNumber(): " + num1.getNumber());
		out.println("isOdd(): " + num1.isOdd());
		out.println("isPerfect(): " + num1.isPerfect());

		out.println();

		// Test another odd number
		Number num2 = new Number(12);
		out.println("Number: " + num2);
		out.println("getNumber(): " + num2.getNumber());
		out.println("isOdd(): " + num2.isOdd());
		out.println("isPerfect(): " + num2.isPerfect());

		out.println();

		// Test a perfect number
		Number num3 = new Number(6);
		out.println("Number: " + num3);
		out.println("getNumber(): " + num3.getNumber());
		out.println("isOdd(): " + num3.isOdd());
		out.println("isPerfect(): " + num3.isPerfect());

		out.println();

		// Test setNumber()
		Number num4 = new Number();
		num4.setNumber(28);
		out.println("Number after setNumber(): " + num4);
		out.println("getNumber(): " + num4.getNumber());
		out.println("isOdd(): " + num4.isOdd());
		out.println("isPerfect(): " + num4.isPerfect());
	}
}

