import java.util.*;
import static java.lang.System.*;

public class C_DoubleLast
{
   public static void main ( String[] args )
   {
      ListNode z = new ListNode("go",
                   new ListNode("on",
                   new ListNode("at",
                   new ListNode("34",
                   new ListNode("2.1",
                   new ListNode("-a-2-1",
                   new ListNode("up",                  
                   new ListNode("over",null))))))));
                  
      out.print("                  Original list values:  "); 
      ListFun_Static.print(z);
      out.println();
      
      ListFun_Static.doubleLast(z);      
      out.print("           After calling doubleLast(z):  ");                   
      ListFun_Static.print(z);
      out.println();          
   }
}
