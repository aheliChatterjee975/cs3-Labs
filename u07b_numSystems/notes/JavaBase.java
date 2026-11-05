//© A+ Computer Science
// www.apluscompsci.com

//base conversion ebase10ample

import static java.lang.System.*;

public class JavaBase
{
	public static void main(String args[])
	{
      // byte  8 bits
      // short 16 bits
      // int   32 bits
      // long  64 bits

      byte b = 5; //<-- 5 is an int literal, which the compiler knows will fit.
      long x = 5_000_000_000L; //would not 
      int i = 0;
      //b = i;
   
		int base10 = Integer.parseInt("324", 6);
      //Which of these would not compile?
      //short base10 = Integer.parseInt("324", 6);
      //long base10 = Integer.parseInt("324", 6);
      //long base10 = Long.parseLong("5_000_000_000", 6);
      //long base10 = Long.parseLong("5_000_000_000L", 6);
      //long base10 = Long.parseLong("324L", 6);
		out.print("324 base6 == ");  // or "324_6"
		out.println(base10 + " base10");

		out.print(base10 + " base10 == ");
		out.println(Integer.toString(base10, 16)+" base16\n");

      double d = Double.parseDouble("5.7e2"); // Short for 5.7 x 10^2
      //Would either of these change what d stores?
      //d = 5.7e2;
      //d = 5.7e2f;  //The "f" just indicates it's a float literal.
      out.println("5.7e2 == " + d + "\n");
      
      //float f = 28.4;  //<--Nope!!!
      //float f = 28.4f; //<--This works!
      
      //Which of these would work?
      //float f = Double.parseFloat("28.4");
      float f = Float.parseFloat("28.4");
      //float f = Float.parseFloat("28.4f");
      out.println("f == " + f + "\n");
      
      out.println("Integer.toHexString(90).toUpperCase() == " + Integer.toHexString(90).toUpperCase());
      out.println("Integer.toOctalString(90) == " + Integer.toOctalString(90));
      out.println("Integer.toBinaryString(90) == " + Integer.toBinaryString(90));
      out.println("Integer.toString(90,2) == " + Integer.toString(90,2));
      out.println();
//      out.println("Integer.toBinaryString(-10) == " + Integer.toBinaryString(-10));
//      out.println("Integer.toString(-10,2) == " + Integer.toString(-10,2));
      out.println();
	}
}
