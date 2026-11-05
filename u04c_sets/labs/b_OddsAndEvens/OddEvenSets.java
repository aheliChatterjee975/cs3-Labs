import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenSets
{
    private Set<Integer> odds;
    private Set<Integer> evens;

    public OddEvenSets()
    {
        odds = new TreeSet<Integer>();
        evens = new TreeSet<Integer>();
    }

    public OddEvenSets(String line)
    {
        odds = new TreeSet<Integer>();
        evens = new TreeSet<Integer>();

        String[] nums = line.split(" ");

        for(String num : nums)
        {
            int value = Integer.parseInt(num);

            if(value % 2 == 0)
            {
                evens.add(value);
            }
            else
            {
                odds.add(value);
            }
        }
    }

    public String toString()
    {
        return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
    }
}

