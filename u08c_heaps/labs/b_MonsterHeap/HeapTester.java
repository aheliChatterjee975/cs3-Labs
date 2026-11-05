import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class HeapTester
{
   public static void main ( String[] args )
   {
      Heap<String> test = new Heap<String>();     
      test.add("a");
      test.add("5");
      test.add("B");
      test.add("15");
      test.add("1A");
      test.add("a2");
      testIt(test);	

      Heap<Monster> test2 = new Heap<Monster>();     
      test2.add(new Monster(1,5));
      test2.add(new Monster(1,3));
      test2.add(new Monster(10,55));
      test2.add(new Monster(12,45));
      test2.add(new Monster(111,123));
      test2.add(new Monster(5,9));
      testIt(test2);
   }

   public static void testIt(Heap heap) {
      heap.print();
      System.out.println("The heap as an array: " + heap);
      System.out.println("peek ----> " + heap.peek());
      System.out.println("remove --> " + heap.remove());
      heap.print();
      System.out.println("The heap as an array: " + heap);
      System.out.println("peek ----> " + heap.peek());
      System.out.println("remove --> " + heap.remove());
      heap.print(); 
   }
}