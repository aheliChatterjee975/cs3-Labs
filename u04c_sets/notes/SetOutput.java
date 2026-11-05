//© A+ Computer Science
// www.apluscompsci.com

//printing out a set with basic iterator loop

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import static java.lang.System.*;

public class SetOutput
{
   public static void main(String args[])
   {
      Set<Double> set = new TreeSet<Double>();
      set.add(2.5);
      set.add(5.8);
      set.add(7.3);
   
      //Using a For-Each Loop:
      for(double dec : set)
      {
         out.print(dec + " ");
      }
      out.println("\n");
   	
      //same as
      for(Double dec : set)
      {
         out.print(dec + " ");
      }	
      out.println("\n");
   
      //Using an Iterator:
      Iterator<Double> it = set.iterator();
      while(it.hasNext()){
         out.print(it.next() + " ");
      }
      out.println("\n");
      
      //Using the Collection forEach Method and a Lambda Expression:
      set.forEach( 
         num -> out.print(num + " ")
      );
      out.println("\n");
   
      //Using the Stream forEach method and a Lambda Expression:
      set.stream().forEach(
         num -> out.print(num + " ")
      );
      out.println("\n");
   
      //Using the Stream forEach method and a Lambda Expression:
      set.stream().forEachOrdered(
         num -> out.print(num + " ")
      );
   }
}