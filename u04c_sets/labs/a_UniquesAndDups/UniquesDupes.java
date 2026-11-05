
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import static java.lang.System.*;

public class UniquesDupes
{
    public static Set<String> getUniques(String input)
    {
        Set<String> uniques = new TreeSet<String>();

        String[] words = input.split(" ");
        uniques.addAll(Arrays.asList(words));

        return uniques;
    }

    public static Set<String> getDupes(String input)
    {
        Set<String> dupes = new TreeSet<String>();
        List<String> list = new ArrayList<String>(
            Arrays.asList(input.split(" "))
        );

        for(String word : list)
        {
            if(list.indexOf(word) != list.lastIndexOf(word))
            {
                dupes.add(word);
            }
        }

        return dupes;
    }
}


