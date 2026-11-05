//© A+ Computer Science  -  www.apluscompsci.com

import java.util.*;
import static java.lang.System.*;

public class SinglyLinkedList_Runner
{
   public static void main ( String[] args )
   {
      test(new int[]{4,5,6,7,8,9,10,11,12,13});
      test(new int[]{24,75,86,37,82,94,111,82,43});
      test(new int[]{0,4,5,2,1,4,6});
      test(new int[0]);
   }
   
   public static void test(int[] nums) {
      SinglyLinkedList list = new SinglyLinkedList();
      for(int num : nums) {
         list.add(num);
      }   
            SinglyLinkedList list2 = new SinglyLinkedList();
            for(int num : nums) {
               list2.add(num);
            } 
            SinglyLinkedList list3 = new SinglyLinkedList();
            for(int num : nums) {
            list3.add(num);
            } 
            list3.add(20);  
      if (list.isEmpty()) {
         out.println("Empty List!");
         return;
      }
      
      out.println("    LIST:: "+list.toString());
      out.println("   LIST2:: "+list2.toString());
      out.println("   LIST3:: "+list3.toString());
      out.println("list.equals(list)? == "+list.equals(list));
      out.println("list.equals(list2)? == "+list.equals(list2));
      out.println("list.equals(list3)? == "+list.equals(list3));
      out.println("list.get(2) == "+list.get(2));

      out.println("     SUM:: "+ListUtilities.getSum(list));
      out.println(" AVERAGE:: "+ListUtilities.getAvg(list));
      out.println("SMALLEST:: " + ListUtilities.getSmallest(list));
      out.println(" LARGEST:: "+ListUtilities.getLargest(list));
      out.println();      
   }
}
