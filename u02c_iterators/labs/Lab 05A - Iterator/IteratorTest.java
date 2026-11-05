import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import static java.lang.System.*;

class IteratorTest {

   public static void populateListFromString(ArrayList<String> list, 
                                             String strList) {
      list.clear();
      list.addAll(Arrays.asList(strList.split(" ")));
   }

   public static void addToListFromString(ArrayList<String> list, 
                                          String strList) {
      list.addAll(Arrays.asList(strList.split(" ")));
   }
   
   /*** REMOVE ***/
   public static void remove(ArrayList<String> list, String toRemove) {
      Iterator<String> iterator = list.iterator();

      while (iterator.hasNext()) {
         String item = iterator.next();

         if (item.equals(toRemove)) {
            iterator.remove();
         }
      }
   }

   /*** REPLACE ***/
   public static void replace(ArrayList<String> list, String toRemove, 
                              String replaceWith) {
      ListIterator<String> iterator = list.listIterator();

      while (iterator.hasNext()) {
         String item = iterator.next();

         if (item.equals(toRemove)) {
            iterator.set(replaceWith);
         }
      }
   } 
}
