import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;
import java.io.File;

public class Collisions
{
  public static void main ( String[] args )
  {
		try{
			Scanner file = new Scanner(new File("powersOfTwo.dat"));
         String lineOne = file.next();
			int runCount=Integer.parseInt(lineOne.substring(lineOne.indexOf('=')+1));

			HashTable table = new HashTable(runCount);
         
			for(int i=0; i<runCount; i++)
			{
				table.add(file.nextInt());
			}
			out.println(table);
		}
		catch(Exception e)
		{
			System.out.println("Houston, we have a problem!");
         System.out.println(e.getMessage());
		}
  }
}
