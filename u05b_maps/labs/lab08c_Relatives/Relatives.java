import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;

public class Relatives
{
    private Map<String,Set<String>> map;

    public Relatives()
    {
        map = new TreeMap<String,Set<String>>();
    }

    public void setPersonRelative(String line)
    {
        String[] personRelative = line.split(" ");

        String person = personRelative[0];
        String relative = personRelative[1];

        if(!map.containsKey(person))
        {
            map.put(person, new TreeSet<String>());
        }

        map.get(person).add(relative);
    }

    public String getRelatives(String person)
    {
        if(map.containsKey(person))
        {
            return person + " is related to " + map.get(person);
        }

        return person + " has no relatives";
    }

    public boolean isRelated(String person, String relative)
    {
        if(map.containsKey(person))
        {
            return map.get(person).contains(relative);
        }

        return false;
    }

    public String toString()
    {
        String output = "";

        for(String person : map.keySet())
        {
            output += person + " is related to ";

            for(String relative : map.get(person))
            {
                output += relative + " ";
            }

            output = output.trim() + "\n";
        }

        return output;
    }
}
