//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab -

import java.util.*;
import static java.lang.System.*;

public class GCF
{
	//instance variables, constructors, and other methods not shown 
	
	public static int gcf(int n1, int n2)
	{
		if(n2 == 0)
			return n1;
		else
			return gcf(n2, n1 % n2);
	}
}


