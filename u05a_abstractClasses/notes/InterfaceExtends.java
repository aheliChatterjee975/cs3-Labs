//© A+ Computer Science  -  www.apluscompsci.com

//abstract example one

import static java.lang.System.*;
import java.util.Scanner;

interface A
{
	void fun();
}

interface B
{
	void notFun();
}

interface C
{
	void weird();
}

interface D extends A,B,C
{
	
}

class W implements D
{
   // which methods must the W class implement?
   public void fun() { out.println("fun");  }
   public void notFun() { out.println("notFun");  }   
   public void weird() { out.println("weird");  }   
}

public class InterfaceExtends
{
  public static void main ( String[] args )
  {
  }
}