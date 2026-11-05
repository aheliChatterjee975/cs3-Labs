import static java.lang.System.*;
import java.util.*;

public class Bubbler
{
   private Bubbler() { }
   
   public static void bubbleSort1( int[] a ){
      int i, j, temp=0;
      for(i = 0; i < a.length; i++) {
         for(j = 1; j < (a.length - i); j++) {
            if(a[j-1] > a[j]) {
               temp = a[j-1];
               a[j-1]=a[j];
               a[j]=temp;
            }
         }
      }
   }
        
 //public static <T>                       void bubbleSort( T[] a )   <-- Doesn't allow compareTo call
 //public static                           void bubbleSort( Comparable[] a )  Same as
 //public static <T extends Comparable>    void bubbleSort( T[] a )           this one.
   public static <T extends Comparable<T>> void bubbleSort( T[] a ) // Best. Only allows classes such
   {                                                                // the String class which have a
      int i, j;                                                     // compareTo(String s) method as
      T temp;                                                       // opposed to compareTo(Object o).
      for(i = 0; i < a.length; i++) {
         for(j = 1; j < (a.length - i); j++) {
            if(a[j-1].compareTo(a[j]) > 0) {
               temp = a[j-1];
               a[j-1]=a[j];
               a[j]=temp;
            }
         }
      }
   }   
      
   
   // You can't have these two method signatures in the same class.
   // The compile will complain that they have the same type erasure.
   //    public static void bubbleSort( List<Integer> list ) {   }
   //    public static void bubbleSort( List<String> list ) {   } 
   //  
   // That's why we write our method header like this:
   public static <T extends Comparable<T>> void bubbleSort( List<T> list ) 
   {
      int i, j;
      T temp;
      for(i = 0; i < list.size(); i++) {
         for(j = 1; j < (list.size() - i); j++) {
            if(list.get(j-1).compareTo(list.get(j)) > 0) {
               temp = list.get(j-1);
               list.set(j-1, list.get(j));
               list.set(j, temp);
            }
         }
      }
   }   
   
   //Comparable<? super T> means that type ? passed to Comparable could be T or any supertype of T.
   public static <E extends Comparable<? super E>> void bubbleSort5(E[] ray) {
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

/* all concrete types of List<T> are,in fact, compiled to (the binary equivalent of)
 * List<Object> (for other types, the bound maybe something other than Object, 
 * but you get the point). Generic arity and type parameterinformation are lost in 
 * this process, which is why we call it type erasure.
 */