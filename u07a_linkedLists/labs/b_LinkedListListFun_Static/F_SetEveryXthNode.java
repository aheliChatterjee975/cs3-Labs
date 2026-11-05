import java.util.*;
import static java.lang.System.*;

public class F_SetEveryXthNode
{
   public static void main ( String[] args )
   {    
      var z = new ListNode("go",
                   new ListNode("on",
                   new ListNode("at",
                   new ListNode("34",
                   new ListNode("2.1",
                   new ListNode("-a-2-1",
                   new ListNode("up",                  
                   new ListNode("over",null))))))));
                       
      out.print("                      Original list values:  "); 
      ListFun_Static.print(z);
      out.println();
      ListFun_Static.setEveryXthNode(z, 2, "one");     
      out.print("After calling setEveryXthNode(z, 2, \"one\"):  ");                            
      ListFun_Static.print(z);
      out.println();          
      ListFun_Static.setEveryXthNode(z, 1, 2.5);     
      out.print("  After calling setEveryXthNode(z, 1, 2.5):  ");                            
      ListFun_Static.print(z);
      out.println();  
   }
}
