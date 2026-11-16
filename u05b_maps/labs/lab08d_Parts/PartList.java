import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class PartList
{
	private TreeMap<Part, Integer> partsMap;
	
	public PartList()
	{
		partsMap = new TreeMap<Part, Integer>();
	}
	
	public PartList(String fileName)
	{
		this();
		try
		{
			Scanner file = new Scanner(new File(fileName));
			while (file.hasNextLine())
			{
				String line = file.nextLine().trim();
				if (!line.isEmpty()) 
				{
					Part p = new Part(line);
					if (partsMap.containsKey(p)) {
						partsMap.put(p, partsMap.get(p) + 1);
					} else {
						partsMap.put(p, 1);
					}
				}
			}
			file.close();
		}
		catch( IOException e ) 
		{
			out.println(e);
		}
		catch( RuntimeException e )
		{
			out.println(e);
		}
		catch( Exception e )
		{
			out.println(e);
		}
		finally
		{
			
		}
	}
	
	public String toString()
	{
		String output = "";
		for (Map.Entry<Part, Integer> entry : partsMap.entrySet())
		{
			output += entry.getKey() + " - " + entry.getValue() + "\n";
		}
		return output;
	}
}
