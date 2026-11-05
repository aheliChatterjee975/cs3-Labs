import java.util.*;
import static java.lang.System.*;

public class LLFun_Static_Runner
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
                  
      out.println("Lab15b Test Code\n\n");   
      
      out.print("                  Original list values:  "); 
      ListFun_Static.print(z);
      out.println();
      
      out.printf("%50s = %d%n","num nodes", ListFun_Static.nodeCount(z));

      out.print("            After calling nodeCount(z):  "); 
      ListFun_Static.print(z);
      out.println();    

      ListFun_Static.doubleFirst(z);     
      out.print("          After calling doubleFirst(z):  ");                   
      ListFun_Static.print(z);
      out.println(); 

      ListFun_Static.doubleLast(z);      
      out.print("           After calling doubleLast(z):  ");                   
      ListFun_Static.print(z);
      out.println();          

      ListFun_Static.skipEveryOther(z);     
      out.print("       After calling skipEveryOther(z):  ");                   
      ListFun_Static.print(z);
      out.println();       
      
      ListFun_Static.removeEveryXthNode(z,2);     
      out.print(" After calling removeEveryXthNode(z,2):  ");             
      ListFun_Static.print(z);
      out.println();       
      
      ListFun_Static.setEveryXthNode(z,2,"one");     
      out.print("After calling setEveryXthNode(z,2,one):  ");                            
      ListFun_Static.print(z);
      out.println();          
   }
}
