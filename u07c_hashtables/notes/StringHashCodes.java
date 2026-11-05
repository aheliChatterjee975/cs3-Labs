//hashcode example

import static java.lang.System.*;

public class StringHashCodes
{
   public static void main ( String[] args )
   {
      String s1 = "A";		
      out.println(s1.hashCode()); 
   
      String s2 = "a";		
      out.println(s2.hashCode()); 
   
      String s3 = "act";		
      out.println(s3.hashCode()); 
   
   
      String[] words = {"Computer", "Science", "computer", "science", "BFND", "bfnd", "Cy-Fair", "Bobcats", "at", "art", "an", "in", "am"};
   
      System.out.printf("%9s %12s %5s %2s %n", "word", "hashcode", "h%19", "(h & 0x7fffffff) % 19");      
      //s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
      for(String word : words)
      {
         int h = word.hashCode();
         //System.out.println(word + h + "\t" + h%19 + "\t" + (h & 0x7fffffff) % 19);     //0x7fffffff == Integer.MaxValue == 2147483647 
         System.out.printf("%9s %12d %5d %2d %n", word, h, h%19, (h & 0x7fffffff) % 19);      
      
      }  	
         
   }
}
