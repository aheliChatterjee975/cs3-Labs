import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class SpanishToEnglish
{
    private Map<String,String> pairs;

    public SpanishToEnglish()
    {
        pairs = new TreeMap<String,String>();
    }

    public void putEntry(String entry)
    {
        String[] list = entry.split(" ");

        pairs.put(list[0], list[1]);
    }

    public String translate(String sent)
    {
        Scanner chop = new Scanner(sent);
        String output = "";

        while(chop.hasNext())
        {
            String word = chop.next();

            if(pairs.containsKey(word))
            {
                output += pairs.get(word) + " ";
            }
            else
            {
                output += word + " ";
            }
        }

        return output.trim();
    }

    public String toString()
    {
        return pairs.toString().replaceAll("\\,","\n");
    }
}


