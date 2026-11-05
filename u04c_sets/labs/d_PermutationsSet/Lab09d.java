import static java.lang.System.*;
import java.util.Set;

public class Lab09d
{
    public static void main(String args[])
    {
        String s0 = "ABC";
        out.println("\nPermutations for " + s0 + " are: \n");
        out.println(displaySet(PermutationSet.permutations(s0)));

        String s1 = "abc";
        out.println("\nPermutations for " + s1 + " are: \n");
        out.println(displaySet(PermutationSet.permutations(s1)));

        String s2 = "boat";
        out.println("\nPermutations for " + s2 + " are: \n");
        out.println(displaySet(PermutationSet.permutations(s2)));

        String s3 = "frown";
        out.println("\nPermutations for " + s3 + " are: \n");
        out.println(displaySet(PermutationSet.permutations(s3)));

        out.println();
        out.println("Test null to make sure you're writing robust programs.");
        out.println("Your program should not crash!");

        try
        {
            out.println(displaySet(PermutationSet.permutations(null)));
        }
        catch(NullPointerException e)
        {
            out.println("Error: " + e.getMessage());
        }
    }

    public static String displaySet(Set<String> perms)
    {
        String output = "";
        int max = 63;
        int length = 0;

        for(String word : perms)
        {
            String piece = word + " ";

            if(length + piece.length() > max)
            {
                output += "\n";
                length = 0;
            }

            output += piece;
            length += piece.length();
        }

        return output;
    }
}

