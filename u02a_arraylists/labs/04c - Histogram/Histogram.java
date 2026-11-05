import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;
   private File n;
   private Scanner scan;
   
	public Histogram()
	{
	}

	public Histogram(char[] values, String fName)
	{
      letters = new ArrayList<Character>();
      for(char v : values)
      {
         letters.add(v);
      }
		out.println("search letters = "+letters);
      fileName = fName;
      int sizer = letters.size();
      count = new ArrayList<Integer>();
      for(int i = 0; i < letters.size(); i++)
      {
         count.add(0);
      }
	}

	public void loadAndAnalyzeFile() throws IOException
	{
      n = new File(fileName);
      scan = new Scanner(n);
      
      
      int most = 0;
      char a = letters.get(0);
      int cur = 0;
      String see = "";
      int current = 0;
      int L = 0;
      
      for(int k = 0; k < 3; k++)
      {
         scan = new Scanner(n);
         cur = 0;
         current = k;
      while(scan.hasNext())
      {
         
         
            see = scan.next();
            for(int i = 0; i < see.length(); i++)
            {
               char b = see.charAt(i);
               char c = letters.get(k);
               if(b == c)
               {
                  cur++;
               
               }
            
            }
            count.set(current, cur);
            
         }
     
      }
      out.println(count);

   }
	   
      

	public char mostFrequent()
	{
      
      int greatest = count.get(0);
      int ind = 0;
      for(int b : count)
      {
         if (b > greatest)
         {
            greatest = b;
            ind++;
         }
      
      }
      
      
      
		return letters.get(ind);
     
	}

	public char leastFrequent()
	{
      int least = count.get(0);
      int ind = 0;
      for(int a : count)
      {
         if(a < least)
         {
            least = a;
            ind++;
         
         }
      
      }
   
		return letters.get(ind);
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}

