//Copyright A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
import java.util.*;
import static java.lang.System.*;

public class LLFun_InstanceVar_Runner
{
	public static void main (String[] args)
	{
		LLFun_InstanceVar funHouse = new LLFun_InstanceVar(); 
		
		funHouse.add("go");
		funHouse.add("on");
		funHouse.add("at");
		funHouse.add("34");
		funHouse.add("2.1");
		funHouse.add("-a-2-1");
		funHouse.add("up");		       		
		funHouse.add("over");
			 								
		out.println("Lab15c Test Code\n\n");	
		
		out.print("                       Original list values:  " + funHouse + "\n");	
		
		out.println("                                              num nodes = " + funHouse.nodeCount());

		out.print("        List values after calling nodeCount:  " + funHouse + "\n");	

		funHouse.doubleFirst();		
		out.print("      List values after calling doubleFirst:  " + funHouse + "\n");							

		funHouse.doubleLast();		
		out.print("       List values after calling doubleLast:  " + funHouse + "\n");							

		funHouse.skipEveryOther();		
		out.print("   List values after calling skipEveryOther:  " + funHouse + "\n");							
		
		funHouse.removeXthNode(2);		
		out.print(" List values after calling removeXthNode(2):  " + funHouse + "\n");					
		
		
		funHouse.setXthNode(2, "one");		
		out.print("List values after calling setXthNode(2,one):  " + funHouse + "\n");										
	}
}
