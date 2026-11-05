//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*;

public class ForLoopExamples
{
	public static void main( String args[] )
	{

String name="Parastratiosphecomyia stratiosphecomyioides";
          int i = 0; 
         while (i < name.length( )) 
             {
                ++i;             
             }
System.out.println("There are "+ i + " characters.");



/*
	int m = 0;
    for (;;)
    {
        System.out.println(m);
        m++;
        if (m > 4)
        {
     	    break;
        }
    }
*/

/*
    for (int m = 0; m < 5; m++)
    {
        System.out.println(m);
    }
*/

/*
	double[] list = {1.2, 3.0, 0.8};
	int sum = 0;
	int i=0;
	for (i = 0; i < list.length; i++)
	{
		sum += list[i];
    	System.out.println (sum + " ");
	 }
	 System.out.println (i);
*/

/*
	int[] numbers = {1,2,3,4,5,6,7,8,9,10};
    for (int item : numbers)
    {
    	System.out.print(item-1 + " ");
	}
*/

/*
    int limit = 10;
    int sum = 0;
    int i = 1;
    for (; i <= limit;)
    {
      sum += i++;
      System.out.println(sum);
    }
*/

/*
    for (int  i = 4, j = 0; i >=0; i--, j++)
    {
      System.out.println(i + "  " + j);
    }
*/

/*
    // Fix the errors:
    int i = 4, j = 0;
    for ( ; i>=0 ; )
    {
      i--, j++;
      System.out.println(i + "  " + j);
    }
*/


     }
}

