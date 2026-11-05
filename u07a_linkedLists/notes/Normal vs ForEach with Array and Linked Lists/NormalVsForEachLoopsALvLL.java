import java.util.*;
import static java.lang.System.*;

public class NormalVsForEachLoopsALvLL
{
   private static long elapsed = 0;
   public static double getElapsed() { 
      return elapsed/1000.0; }

   public static void main( String args[] )
   {
      int size=(int)(4E5);
      out.println(size);
      List<Integer> list = new ArrayList<Integer>();
         
      for(int i=0; i<size; i++)
         list.add( (int)(Math.random()*size) );
      long start = currentTimeMillis();
      for(int i= 0; i < list.size(); i++)
      {
         Integer num = list.get(i);
         out.print(num + " ");
      }
      elapsed = currentTimeMillis() - start;
      out.println("\nArrayList Normal loop: " + getElapsed());
      start = currentTimeMillis();
      for(Integer num : list)
      {
         out.print(num + " ");
      }
      elapsed = currentTimeMillis() - start;
      out.println("\nArrayList ForEach loop: " + getElapsed());      
   
      list = new LinkedList<Integer>();
         
      for(int i=0; i<size; i++)
         list.add( (int)(Math.random()*size) );
      start = currentTimeMillis();
      for(int i= 0; i < list.size(); i++)
      {
         Integer num = list.get(i);
         out.print(num + " ");
      }
      elapsed = currentTimeMillis() - start;
      out.println("\nLinkedList Normal loop: " + getElapsed());
      start = currentTimeMillis();
      for(Integer num : list)
      {
         out.print(num + " ");
      }
      elapsed = currentTimeMillis() - start;
      out.println("\nLinkedList ForEach loop: " + getElapsed()); 
   }
}