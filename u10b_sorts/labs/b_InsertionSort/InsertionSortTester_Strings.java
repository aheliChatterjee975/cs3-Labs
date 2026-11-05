//insertion sort tester

import static java.lang.System.*;
import java.util.Arrays;

public class InsertionSortTester_Strings
{
   public static void main( String args[] )
   {  
      String[] array = {"fried green tomatoes", "cobbler", "crisp", "fried chicken", "crisp", 
                        "pecan pie", "divinity", "buttermilk biscuits", "skillet cornbread"};
   
      out.println();
      out.println("before insertion sort by swapping of the insertion term all the way down to its intended position");
      for(int i=0; i<array.length; i++)
         out.printf("%-21s", array[i]);
      out.println();
      for(int i=0; i<array.length; i++)
         out.printf("%-21d", array[i].hashCode());
      InsertionSort.insertionSort(array);
      out.println("\n\nafter insertion sort by swapping of the insertion term all the way down to its intended position");
      for(int i=0; i<array.length; i++)
         out.printf("%-21s",array[i]);
      out.println();         
      for(int i=0; i<array.length; i++)
         out.printf("%-21d", array[i].hashCode());
      out.println("\n");  
      out.println("Based on this, does it appear Insertion Sort is a stable sort?");  
   }
}
