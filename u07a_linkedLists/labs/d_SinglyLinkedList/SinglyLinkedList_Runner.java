import java.util.*;
import static java.lang.System.*;
import java.io.StringWriter;
import java.io.PrintWriter;

public class SinglyLinkedList_Runner
{
   public static void main ( String[] args )
   {
      test(new int[]{4,5,6,7,8,9,10,11,12,13}, 8, 14);
      pause();
      test(new int[]{24,75,86,37,82,94,111,82,43}, 37, 100);
      pause();
      test(new int[]{0,4,5,2,1,4,6}, 6, 7);
      pause();
      test(new int[0], 0, 0);
   }
   
   public static void test(int[] nums, int existingItem, int nonexistentItem) {
      SinglyLinkedList list = new SinglyLinkedList();
      SinglyLinkedList list2 = new SinglyLinkedList();
      SinglyLinkedList list3 = new SinglyLinkedList();
      for(int num : nums) {
         list.add(num);
         list2.add(num);
         list3.add(num);
      }
      if (list.isEmpty()) {
         out.println("Empty List!");
         return;
      }
   
      testAddMethods(list, list2, list3);
      testGetSizeAndContainsMethods("list", list, existingItem, nonexistentItem);
      testEqualsMethod(list, list2, list3);
      testSetAndRemoveMethods("list2", list2, existingItem, nonexistentItem);
      testClearAndNoSuchElementException("list3", list3);
      testUtilityMethods(list);
   }
   
   public static void testAddMethods(SinglyLinkedList list, SinglyLinkedList list2, SinglyLinkedList list3) {
      out.println("*************************************************");      
      out.println("*** Test add, addFirst, addLast, and toString ***");
      out.println("*************************************************");      
      list3.addFirst(20);
      list3.addLast(40);
      out.println("    LIST:: "+list.toString());
      out.println("   LIST2:: "+list2.toString());
      out.println("   LIST3:: "+list3.toString());
      out.println();
   }
      
   public static void testGetSizeAndContainsMethods(String listName, SinglyLinkedList list, int existingItem, int nonexistentItem) {
      out.println("***************************************************************");
      out.println("*** Test get, getFirst, getLast, size, contains, and equals ***");
      out.println("***************************************************************");
      out.println("\t" + listName + ".get(2) == " + list.get(2) + "\n");
      try {
         out.println(listName + ".get(100) should throw an IndexOutOfBoundsException.");
         out.println("\tlist.get(100) == " + list.get(100));         
      } catch(Exception e) {
         out.println("\tYour method threw:  " + getFullMessage(e));
      }  
      try {
         out.println(listName + ".get(-1) should throw an IndexOutOfBoundsException.");
         out.println("\tlist.get(-1) == " + list.get(-1));         
      
      } catch(Exception e) {
         out.println("\tYour method threw:  " + getFullMessage(e));
      } 
      out.println("Testing getFirst and getLast:");
      out.println("\t" + listName + ".getFirst() == " + list.getFirst());
      out.println("\t" + listName + ".getLast() == " + list.getLast());
      out.println();
      out.println("Test size and contains:");
      out.println("\t" + listName + ".size() == " + list.size());
      out.println("\t" + listName + ".contains("+existingItem+") == " + list.contains(existingItem));
      out.println("\t" + listName + ".contains("+nonexistentItem+") == " + list.contains(nonexistentItem) + "\n");
   }
      
   public static void testEqualsMethod(SinglyLinkedList list, SinglyLinkedList list2, SinglyLinkedList list3) {
      out.println("Comparing list to itself: ");
      out.println("\tlist.equals(list)? == "+list.equals(list));
      out.println("Comparing list to an identical list: ");
      out.println("\tlist.equals(list2)? == "+list.equals(list2));
      out.println("Comparing list to a list with different contents: ");
      out.println("\tlist.equals(list3)? == "+list.equals(list3));
      out.println();
   }
      
   public static void testSetAndRemoveMethods(String listName, SinglyLinkedList list, int existingItem, int nonexistentItem) {
      out.println("********************************************************************************");      
      out.println("*** Test set, remove(int), remove(obj), removeFirst, and removeLast on list ***");
      out.println("********************************************************************************");      
      out.println(listName + ":: "+list.toString() + "\n");
      out.println("set(2, 100) returned " + list.set(2, 100));
      out.println("\t" + listName + " after set(2, 100): "+list.toString() + "\n");
      try {
         out.println(listName + ".set(100, 2) should throw an IndexOutOfBoundsException.");
         out.println("\tlist.set(100, 2) == " + list.set(100, 2));         
      } catch(Exception e) {
         out.println("\tYour method threw:  " + getFullMessage(e));
      }  
      out.println("Testing remove(spot) on the first item:");
      out.println("\tremove(0) returned " + list.remove(0));
      out.println("\t" + listName + " after remove(0):   "+list.toString() + "\n");
      
      out.println("Testing remove(spot) on the last item:");
      out.println("\tremove( list.size()-1 ) returned " + list.remove(list.size()-1));
      out.println("\t" + listName + " after remove(list.size()-1):   "+list.toString() + "\n");
   
      out.println("Testing remove(spot) on a middle item:");
      out.println("\tremove(2) returned " + list.remove(2));
      out.println("\t" + listName + " after remove(2):   "+list.toString() + "\n");
   
      out.println("Testing remove(spot) on a invalid spot:");
      try {
         out.println("\t" + listName + ".remove(100) should throw an IndexOutOfBoundsException.");
         out.println("\tlist.remove(100) == " + list.remove(100));         
      } catch(Exception e) {
         out.println("\tYour method threw:  " + getFullMessage(e));
      }
      out.println("Testing remove(obj) on the first item:");
      Integer firstItem = (Integer)list.get(0);
      out.println("\tremove(Integer.valueOf("+firstItem+")) returned " + list.remove(Integer.valueOf(firstItem)));
      out.println("\t" + listName + " after remove(Integer.valueOf("+firstItem+")):   "+list.toString() + "\n");
   
      out.println("Testing remove(obj) on the last item:");
      Integer lastItem = (Integer)list.get(list.size()-1);
      out.println("\tremove(Integer.valueOf("+lastItem+")) returned " + list.remove(Integer.valueOf(lastItem)));
      out.println("\t" + listName + " after remove(Integer.valueOf("+lastItem+")):   "+list.toString() + "\n");
   
      out.println("Testing remove(obj) on an item that IS in the list:");
      out.println("\tremove(Integer.valueOf("+existingItem+")) returned " + list.remove(Integer.valueOf(existingItem)));
      out.println("\t" + listName + " after remove(Integer.valueOf("+existingItem+")):   "+list.toString() + "\n");
   
      out.println("Testing remove(obj) on an item that is NOT in the list:");
      out.println("\tremove(Integer.valueOf("+nonexistentItem+")) returned " + list.remove(Integer.valueOf(nonexistentItem)));
      out.println("\t" + listName + " after remove(Integer.valueOf("+nonexistentItem+")):   "+list.toString() + "\n");
   
      out.println("Testing removeFirst and removeLast:");
      out.println("\tremoveFirst() returned " + list.removeFirst());
      out.println("\t" + listName + " after removeFirst():   "+list.toString()); 
      out.println("\tremoveLast() returned " + list.removeLast());
      out.println("\t" + listName + " after removeLast():   "+list.toString()); 
      out.println();
      
      out.println("Testing all remove methods on a list with ONE element:");
      list.clear();
      list.add(50);
      out.println("\t" + listName + " after clear() and add(50): " + list);
      list.remove(0);
      out.println("\t" + listName + " after remove(0): " + list);
      list.add(50);
      out.println("\t" + listName + " after add(50): " + list);   
      list.remove(Integer.valueOf(50));
      out.println("\t" + listName + " after remove(Integer.valueOf(50)): " + list);
      list.add(50);
      out.println("\t" + listName + " after add(50): " + list);  
      list.removeFirst();
      out.println("\t" + listName + " after removeFirst(): " + list);
      list.add(50);
      out.println("\t" + listName + " after add(50): " + list);  
      list.removeLast();
      out.println("\t" + listName + " after removeLast(): " + list);
      list.add(50);
      out.println("\t" + listName + " after add(50): " + list);
      out.println();
   }

   public static void testClearAndNoSuchElementException(String listName, SinglyLinkedList list) {
      out.println("*****************************************************************************");
      out.println("*** Test clear and that NoSuchElementException are thrown when appropriate ***");
      out.println("*****************************************************************************");
      out.println(listName + ".clear()");
      list.clear();
      out.println("\t" + listName + " after clear() is called: " + list + "\n");
      try {
         out.println(listName + ".getFirst() should throw an NoSuchElementException.");
         out.println("\tlist.getFirst() == " + list.getFirst());         
      } catch(Exception e) {
         out.println("\tYour method threw:  " + getFullMessage(e));
      } 
      try {
         out.println(listName + ".getLast() should throw an NoSuchElementException.");
         out.println("\tlist.getLast() == " + list.getLast());         
      } catch(Exception e) {
         out.println("\tYour method threw:  " + getFullMessage(e));
      } 
      try {
         out.println(listName + ".removeFirst() should throw an NoSuchElementException.");
         out.println("\tlist.removeFirst() == " + list.removeFirst());         
      } catch(Exception e) {
         out.println("\tYour method threw:  " + getFullMessage(e));
      }  
      try {
         out.println(listName + ".removeLast() should throw an NoSuchElementException.");
         out.println("\tlist.removeLast() == " + list.removeLast());         
      } catch(Exception e) {
         out.println("\tYour method threw:  " + getFullMessage(e));
      } 
      out.println();
   }
      
   public static void testUtilityMethods(SinglyLinkedList list) {
      out.println("*********************************");
      out.println("*** Test List Utility methods ***");
      out.println("*********************************");
      out.println("\t     SUM:: "+ListUtilities.getSum(list));
      out.println("\t AVERAGE:: "+ListUtilities.getAverage(list));
      out.println("\tSMALLEST:: " + ListUtilities.getSmallest(list));
      out.println("\t LARGEST:: "+ListUtilities.getLargest(list));
      out.println();     
   }
   
   private static String getStackTrace(Exception e) {
      StringWriter sw = new StringWriter();
      PrintWriter pw = new PrintWriter(sw);
      e.printStackTrace(pw);
      String stackTrace = sw.toString(); // stack trace as a string
      return stackTrace;
   }
   
   private static String getFullMessage(Exception e) {
      String stackTrace = getStackTrace(e);
      int firstLineBreak = stackTrace.indexOf("\n");
      String message = stackTrace.substring(0, firstLineBreak);
      return message;
   }
   
   public static void pause(int delay) {
      try
      {
         Thread.currentThread();
         Thread.sleep(delay);
      }
      catch(InterruptedException e) { }
   }
    
   private static void pause() {
      System.out.print("\nPress ENTER to continue...");
      (new java.util.Scanner(System.in)).nextLine();
   }
}