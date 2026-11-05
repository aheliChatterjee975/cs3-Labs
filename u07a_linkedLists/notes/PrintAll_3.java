//© A+ Computer Science
// www.apluscompsci.com

//printing a list example two

import static java.lang.System.*;

public class PrintAll_3
{
   public static void main( String args[] )
   {
      ListNode list = new ListNode("10",
         	          new ListNode("11",
         	          new ListNode("12",null)));
   	
      ListNode x = list;
      
      while(x!=null)
      {
         out.println(x.getValue());
         x=x.getNext();
      }
   	System.out.println();
      System.out.println("list: " + list.getValue());
      System.out.println("   x: " + x);		
   }
}