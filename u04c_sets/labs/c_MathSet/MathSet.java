import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import static java.lang.System.*;

public class MathSet
{
    private Set<Integer> one;
    private Set<Integer> two;

    public MathSet()
    {
        one = new TreeSet<Integer>();
        two = new TreeSet<Integer>();
    }

    public MathSet(String o, String t)
    {
        one = new TreeSet<Integer>();
        two = new TreeSet<Integer>();

        String[] numsOne = o.split(" ");
        String[] numsTwo = t.split(" ");

        for(String num : numsOne)
        {
            one.add(Integer.parseInt(num));
        }

        for(String num : numsTwo)
        {
            two.add(Integer.parseInt(num));
        }
    }

    public Set<Integer> union()
    {
        Set<Integer> result = new TreeSet<Integer>(one);
        result.addAll(two);

        return result;
    }

    public Set<Integer> intersection()
    {
        Set<Integer> result = new TreeSet<Integer>(one);
        result.retainAll(two);

        return result;
    }

    public Set<Integer> differenceAMinusB()
    {
        Set<Integer> result = new TreeSet<Integer>(one);
        result.removeAll(two);

        return result;
    }

    public Set<Integer> differenceBMinusA()
    {
        Set<Integer> result = new TreeSet<Integer>(two);
        result.removeAll(one);

        return result;
    }

    public Set<Integer> symmetricDifference()
    {
        Set<Integer> result = union();
        Set<Integer> common = intersection();

        result.removeAll(common);

        return result;
    }

    public String toString()
    {
        return "Set one " + one + "\n" +
               "Set two " + two + "\n";
    }
}
