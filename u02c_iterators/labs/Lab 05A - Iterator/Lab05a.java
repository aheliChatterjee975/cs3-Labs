import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class Lab05a
{
   public static void main(String[] args)
   {
      ArrayList<String> list = new ArrayList<String>();

      // Test populateListFromString
      IteratorTest.populateListFromString(list, "A B C D E");
      out.println("Original List: " + list);

      // Test addToListFromString
      IteratorTest.addToListFromString(list, "F G H");
      out.println("After Adding: " + list);

      // Test remove
      IteratorTest.remove(list, "C");
      out.println("After Removing C: " + list);

      // Test replace
      IteratorTest.replace(list, "F", "Z");
      out.println("After Replacing F with Z: " + list);
   }
}

