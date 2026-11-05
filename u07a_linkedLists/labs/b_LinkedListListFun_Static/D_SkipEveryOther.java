import java.util.*;
import static java.lang.System.*;

public class D_SkipEveryOther
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
                  
      out.print("                                      Original list values:  "); 
      ListFun_Static.print(z);
      out.println();
      ListFun_Static.skipEveryOther(z);     
      out.print("       After calling skipEveryOther(z) with an even length:  ");                   
      ListFun_Static.print(z);
      out.println();
      out.print("           Removing the first element makes the length odd:  ");
      z = z.getNext();
      ListFun_Static.print(z);
      out.println();
      ListFun_Static.skipEveryOther(z);     
      out.print("        After calling skipEveryOther(z) with an odd length:  ");                   
      ListFun_Static.print(z);
   }
}
