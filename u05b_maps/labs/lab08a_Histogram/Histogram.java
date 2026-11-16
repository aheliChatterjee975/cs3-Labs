import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Histogram
{
    private Map<String,Integer> histogram;

    public Histogram()
    {
        histogram = new TreeMap<String,Integer>();
    }

    public Histogram(String sent)
    {
        histogram = new TreeMap<String,Integer>();
        setSentence(sent);
    }

    public void setSentence(String sent)
    {
        histogram.clear();

        Scanner chop = new Scanner(sent);

        while(chop.hasNext())
        {
            String key = chop.next();

            if(histogram.containsKey(key))
            {
                histogram.put(key, histogram.get(key) + 1);
            }
            else
            {
                histogram.put(key, 1);
            }
        }

        chop.close();
    }

    public void setSentence()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sent = keyboard.nextLine();
        setSentence(sent);
    }

    public String toString()
    {
        String output = "char    123456789012345\n";
        String allStars = "";

        for(String key : histogram.keySet())
        {
            allStars = "";

            for(int i = 0; i < histogram.get(key); i++)
            {
                allStars += "*";
            }

            output += key + "       " + allStars + "\n";
        }

        return output + "\n";
    }
}

