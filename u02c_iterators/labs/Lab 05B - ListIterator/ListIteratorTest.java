//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class ListIteratorTest
{
   private ArrayList<String> list;

   public ListIteratorTest(String line) {
      list = new ArrayList<String>();
      list.addAll(Arrays.asList(line.split(" ")));
   }

   public void setTest(String line) {
      ListIterator<String> iter = list.listIterator();

      while(iter.hasNext()) {
         iter.next();
      }

      while(iter.hasPrevious()) {
         String item = iter.previous();

         if(item.equals(line)) {
            iter.set(line + "*");
         }
      }
   }

   public void replace(String toRemove, String replaceWith) {
      ListIterator<String> iter = list.listIterator();

      while(iter.hasNext()) {
         String item = iter.next();

         if(item.equals(toRemove)) {
            iter.set(replaceWith);
         }
      }
   }

   public String toString() {
      return list.toString();
   }
}

