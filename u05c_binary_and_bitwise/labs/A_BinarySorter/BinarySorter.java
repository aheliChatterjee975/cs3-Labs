//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import static java.lang.System.*;

public class BinarySorter
{
   public static void main ( String[] args ) throws IOException
   {
   	// Make an ArrayList
      
      // Populate the list from the file.
      
      
      // Sort the list.
      
      out.printf("%-6s %-4s %-6s %s %n", "number", "base", "base10", "binary");
      for(Number n : numList)
      {
         String[] nStrRay = n.toString().split(" ");
         String number = nStrRay[0];
         int base = Integer.parseInt(nStrRay[1]);
         int base10 = Integer.parseInt(nStrRay[2]);
         String binary = nStrRay[3];
         out.printf("%-6s %-4d %-6d %s %n", number, base, base10, binary);
      }
   
   
   
   
   }
}
