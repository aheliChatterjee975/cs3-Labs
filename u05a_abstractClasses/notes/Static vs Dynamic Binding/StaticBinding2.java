//inheritance static example

import static java.lang.System.*;


public class StaticBinding2
{
	public static void write(Object obj)
	{
	    System.out.println("Object");
	}

	public static void write(String str)
	{
	   System.out.println("String");
	}
	
	public static void write(Integer x)
	{
	  System.out.println("Integer");
	}


  public static void main ( String[] args )
  {
   	Object x = new String("hi");
   	write(x);
   	x = 5;
   	write(x);
   	Integer y = 7;
   	write(y);
  }
}




















