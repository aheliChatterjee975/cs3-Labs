import static java.lang.System.*;
import java.util.*;

public class InsertionSortTester_Generics
{    
   public static void main( String args[] )
   {  
      int[] array1 = {39,6,11,23,18,3,20,5,57,15,4,54,4,32,66,7766,8,76,55,44,333344,443,677,88,8,7,90};
      int[] array2 = new int[array1.length];     
      int[] array3 = new int[array1.length];
      int[] array4 = new int[array1.length];
      System.arraycopy(array1, 0, array2, 0, array1.length);
      System.arraycopy(array1, 0, array3, 0, array1.length);
      System.arraycopy(array1, 0, array4, 0, array1.length);

      out.println();
      out.println("before insertion sort of array of primitives");
      out.println(Arrays.toString(array1));
      InsertionSort.insertionSort(array1);
      out.println("\nafter insertion sort of array of primitives");
      out.println(Arrays.toString(array1));     
      out.println();    

      Integer[] objRay = new Integer[array2.length];
      for (int i=0; i<array2.length; ++i) {
         objRay[i] = array2[i];
      }
      out.println();
      out.println("before insertion sort of array of Comparable objects");
      out.println(Arrays.toString(objRay));
      InsertionSort.insertionSort(objRay);
      out.println("\nafter insertion sort of array of Comparable objects");
      out.println(Arrays.toString(objRay));     
      out.println();  
      
      List<String> nameList = new LinkedList<>();
      Collections.addAll(nameList, "b", "d", "Z", "7-Eleven", "ba", "bad");
      out.println("nameList before selection sort");
      out.println(nameList);
      InsertionSort.insertionSort(nameList);
      out.println("\nnameList after selection sort");
      out.println(nameList);
      out.println("\n");
      	}
}
