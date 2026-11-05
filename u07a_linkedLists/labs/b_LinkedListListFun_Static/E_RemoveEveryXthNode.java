import java.util.*;
import static java.lang.System.*;

public class E_RemoveEveryXthNode
{
   public static void main ( String[] args )
   {
      //ListNode z = null;
      
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
      ListFun_Static.removeEveryXthNode(z,3);     
      out.print(" After calling removeEveryXthNode(z,3):  ");             
      ListFun_Static.print(z);
      out.println();       
      ListFun_Static.removeEveryXthNode(z,2);     
      out.print(" After calling removeEveryXthNode(z,2):  ");             
      ListFun_Static.print(z);
      out.println(); 
   }
}
