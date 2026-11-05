//ï¿½ A+ Computer Science
// www.apluscompsci.com

//selection sort example

import static java.lang.System.*;
import java.util.*;

public class SelectionSort
{
   public static void selectionSort(int[] ray)
   {
      int outerCount = 0, innerCount = 0;
      //this loop includes the first term, since your first step is to find the smallest term,
      //and it may or may not be in the first spot.   

      {
         ++outerCount;
         out.println("i = "+i+"\tray["+i+"] = "+ray[i]);
           
         //this loop finds the minimum of the unsorted part of the array
         int min = ???;

         {
            ++innerCount;



      	
      	//if the minimum isn't at the current spot it gets swapped to this spot.


         out.println("ray = "+Arrays.toString(ray)+"\n");
      }
      out.println("outerCount="+outerCount+" innerCount="+innerCount);
   }
   
   /** Rewrite for an array of objects. **/
   public static void selectionSort(Comparable[] ray)
   {

   }

   /** Rewrite for an list of objects. **/
   public static <T extends Comparable<T>> void selectionSort(List<T> list)
   {

   }
}
