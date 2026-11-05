//insertion sort tester

import static java.lang.System.*;
import java.util.Arrays;

public class InsertionSortTester_Monsters
{
   public static void main( String args[] )
   {  
      Monster[] array = new Monster[5];
      array[0] = new Monster("Bob");
      array[1] = new Monster("Al");
      array[2] = new Monster("Chad");
      array[3] = new Monster("Zed");
      array[4] = new Monster("Bob");
   
      out.println();
      out.println("before insertion sort by swapping of the insertion term all the way down to its intended position");
      for(int i=0; i<array.length; i++)
         out.printf("%-11s",array[i]);
      out.println();
      for(int i=0; i<array.length; i++)
         out.print(array[i].hashCode()+" ");
      InsertionSort.insertionSort(array);
      out.println("\n\nafter insertion sort by swapping of the insertion term all the way down to its intended position");
      for(int i=0; i<array.length; i++)
         out.printf("%-11s",array[i]);
      out.println();         
      for(int i=0; i<array.length; i++)
         out.print(array[i].hashCode()+" ");
      out.println();  
      out.println("Based on this, does it appear Insertion Sort is a stable sort?");  
   }
}
