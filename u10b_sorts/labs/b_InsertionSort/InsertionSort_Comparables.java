import static java.lang.System.*;
import java.util.*;

public class InsertionSort_Comparables
{
   // Linear search to find insertion point, and shift to place element.
   // Both a are simultaenously. O(n) comparisons and moves
   public static void insertionSort( Comparable[] ray)
   {
      for(int i=1; i< ray.length; ++i)
      {
         //out.println("i = "+i+"\tray["+i+"] = "+ray[i]);       
         Comparable val = ray[i];
         int j=i;
         while(j>0 && val.compareTo(ray[j-1])<0)
         {         
            ray[j]=ray[j-1];
            j--;
         }
         ray[j]=val;
           //out.println("ray = "+Arrays.toString(ray)+"\n");         
      }
   }	
      
   // Uses BinarySearch to find insertion point, then shifts to insert
   // O(log n) comparisons and O(n) shifts makes it more efficient
   public static void insertionSort2( Comparable[] ray)
   {
   	  //This loop starts by adding the second entry to the sorted part of the array
   	  //Then it Inserts it in the appropriate spot in the array by finding that
   	  //spot using binary search, storing entry that is to be inserted in a temporary
   	  //variable, then shifting every entry to the right that needs to be moved, 
   	  //and then inserting the value by copying it from the temporary variable into 
   	  //its proper location.
      for (int i=1; i< ray.length; ++i){
      	 //this is the binary search
         int bot=0, top=i-1;
            //out.println("i = "+i+"\tray["+i+"] = "+ray[i]);
            //out.println("before while loop, bottom = "+bot+"\ttop = "+top);       
         while (bot<=top){
            int mid=(bot+top)/2;
            if (ray[mid].compareTo(ray[i])<0)
               bot=mid+1;
            else top=mid-1;
         }
           //out.println("after while loop, bottom = "+bot+"\ttop = "+top);
         
         //store the value temporarily
         Comparable temp = ray[i];
         //shift values over
         for (int j=i; j>bot; --j)
            ray[j]=ray[j-1];
         //ArrayCopy is actually faster:
         //System.arraycopy(ray,bot,ray,bot+1,i-bot);
         
         //insert the value
         ray[bot]=temp;
            //out.println("ray = "+Arrays.toString(ray)+"\n");
      }
   }

  // Uses BinarySearch to find insertion point, then shifts to insert
   // O(log n) comparisons and O(n) shifts makes it more efficient
   public static void insertionSort3( Comparable[] ray)
   {
   	  //This loop starts by adding the second entry to the sorted part of the array
   	  //Then it Inserts it in the appropriate spot in the array by finding that
   	  //spot using binary search, storing entry that is to be inserted in a temporary
   	  //variable, then shifting every entry to the right that needs to be moved, 
   	  //and then inserting the value by copying it from the temporary variable into 
   	  //its proper location.
      for (int i=1; i< ray.length; ++i){
      	 //this is the binary search
         int bot=0, top=i-1;
            //out.println("i = "+i+"\tray["+i+"] = "+ray[i]);
            //out.println("before while loop, bottom = "+bot+"\ttop = "+top);       
         while (bot<=top){
            int mid=(bot+top)/2;
            if (ray[mid].compareTo(ray[i])<0)
               bot=mid+1;
            else top=mid-1;
         }
           //out.println("after while loop, bottom = "+bot+"\ttop = "+top);
         
         //store the value temporarily
         Comparable temp = ray[i];
         //shift values over
         //ArrayCopy is actually faster:
         System.arraycopy(ray,bot,ray,bot+1,i-bot);
         
         //insert the value
         ray[bot]=temp;
            //out.println("ray = "+Arrays.toString(ray)+"\n");
      }
   }

}

