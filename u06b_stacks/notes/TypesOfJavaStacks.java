import static java.lang.System.*;
import java.util.*;

public class TypesOfJavaStacks
{
   public static void main( String args[] )
   {
      Stack<Integer> s1 = new Stack<Integer>();
      s1.push(88);
      s1.push(23);
      s1.push(11);
      out.println("Stack stack: " + s1);
      s1.pop();
      out.println("after calling pop():  " + s1 + "\n");
      
      LinkedList<Integer> s2 = new LinkedList<Integer>();
      s2.push(88);
      s2.push(23);
      s2.push(11);
      out.println("LinkedList stack: " +s2);
      s2.pop();
      out.println("after calling pop():  " + s2);
   }
}
