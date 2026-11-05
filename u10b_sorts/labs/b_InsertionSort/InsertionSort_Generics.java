import static java.lang.System.*;
import java.util.*;

public class InsertionSort_Generics
{
   public static <T extends Comparable<T>> void insertionSort(List<T> list)
   {
      for(int i=1; i< list.size(); ++i)
      {
         //out.println("i = "+i+"\tray["+i+"] = "+ray[i]);       
         T val = list.get(i);
         int j = i;
         while(j>0 && val.compareTo(list.get(j-1))<0)
         {         
            list.set(j, list.get(j-1));
            j--;
         }
         list.set(j, val);
           //out.println("ray = "+Arrays.toString(ray)+"\n");         
      }
   }   
}

