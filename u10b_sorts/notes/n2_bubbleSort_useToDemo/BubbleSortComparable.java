import static java.lang.System.*;
import java.util.Arrays;

public class BubbleSortComparable
{
   public static <E extends Comparable<? super E>> void bubbleSort(E[] ray) {
      boolean changed = false;
      do {
         changed = false;
         for (int a = 0; a < ray.length - 1; a++) {
            if (ray[a].compareTo(ray[a + 1]) > 0) {
               E tmp = ray[a];
               ray[a] = ray[a + 1];
               ray[a + 1] = tmp;
               changed = true;
            }
            out.println(Arrays.toString(ray));
         }
         //out.println(Arrays.toString(ray));
         out.println();
      } while(changed);
   }
}

