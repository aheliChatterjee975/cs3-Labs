// Copyright A+ Computer Science
// www.apluscompsci.com

//selection sort tester

import static java.lang.System.*;
import java.util.*;

public class SelectionSortTester
{
   public static void main( String args[] )
   {
      int[] array1 = {39,6,11,23,18,3,20,5,57,15}; //len=10
      out.println("array1 before selection sort");
      out.println(Arrays.toString(array1));
      SelectionSort.selectionSort(array1);
      out.println("\narray1 after selection sort");
      out.println(Arrays.toString(array1));
      out.println("\n");		
   	
      Integer[] array2 = {39,6,11,23,18,3,20,5,57,15};
      out.println("array2 before selection sort");
      out.println(Arrays.toString(array2));
      SelectionSort.selectionSort(array2);
      out.println("\narray2 after selection sort");
      out.println(Arrays.toString(array2));
      out.println("\n");
   	
      String[] array3 = {"art","zen","plus","Carl","Antler","question"};
      out.println("array3 before selection sort");
      out.println(Arrays.toString(array3));
      SelectionSort.selectionSort(array3);
      out.println("\narray3 after selection sort");
      out.println(Arrays.toString(array3));
      out.println("\n");	
      
      List<Integer> numberList = new ArrayList<>();		
      Collections.addAll(numberList, 2, 5, 8, 9, 1, 7, 4);
      out.println("numberList before selection sort");
      out.println(numberList);
      SelectionSort.selectionSort(numberList);
      out.println("\nnumberList after selection sort");
      out.println(numberList);
      out.println("\n");	
      
      List<String> nameList = new LinkedList<>();
      Collections.addAll(nameList, "b", "d", "Z", "7-Eleven", "ba", "bad");
      out.println("nameList before selection sort");
      out.println(nameList);
      SelectionSort.selectionSort(nameList);
      out.println("\nnameList after selection sort");
      out.println(nameList);
      out.println("\n");
   }
}
