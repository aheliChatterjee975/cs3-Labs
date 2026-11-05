import java.util.HashSet;
import java.util.Set;

public class PermutationSet
{
    public static Set<String> permutations(String word)
    {
        Set<String> perms = new HashSet<String>();

        // Check for null
        if(word == null)
        {
            throw new NullPointerException("Word cannot be null.");
        }

        // Base case: empty string
        if(word.length() == 0)
        {
            perms.add("");
            return perms;
        }

        // Store the first character
        String init = word.substring(0, 1);

        // Store the rest of the string
        String rem = word.substring(1);

        // Recursively get permutations of the remainder
        Set<String> words = permutations(rem);

        // Loop through each permutation
        for(String current : words)
        {
            // Insert the first character at every possible spot
            for(int i = 0; i <= current.length(); i++)
            {
                String newWord = current.substring(0, i)
                               + init
                               + current.substring(i);

                perms.add(newWord);
            }
        }

        return perms;
    }
}

