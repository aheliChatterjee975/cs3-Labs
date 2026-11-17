import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class Acronyms
{
    private Map<String,String> acronymTable;

    public Acronyms()
    {
        acronymTable = new TreeMap<String,String>();
    }

    public void putEntry(String entry)
    {
        Scanner chop = new Scanner(entry);

        String acronym = chop.next();
        chop.next(); // skips the dash

        String phrase = "";

        while(chop.hasNext())
        {
            phrase += chop.next() + " ";
        }

        acronymTable.put(acronym, phrase.trim());
    }

    public String convert(String sent)
    {
        Scanner chop = new Scanner(sent);
        String output = "";

        while(chop.hasNext())
        {
            String word = chop.next();

            if(acronymTable.containsKey(word))
            {
                output += acronymTable.get(word);
            }
            else
            {
                output += word;
            }

            output += " ";
        }

        return output.trim();
    }

    public String toString()
    {
        return acronymTable.toString();
    }
}
