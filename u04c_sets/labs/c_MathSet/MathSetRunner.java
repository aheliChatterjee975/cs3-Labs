import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MathSetRunner
{
    public static void main(String args[]) throws IOException
    {
        MathSet test = new MathSet("1 2 3 4 5", "4 5 6 7 8");

        System.out.println(test);
        System.out.println("union - " + test.union());
        System.out.println("intersection - " + test.intersection());
        System.out.println("difference A-B - " + test.differenceAMinusB());
        System.out.println("difference B-A - " + test.differenceBMinusA());
        System.out.println("symmetric difference " + test.symmetricDifference());
        System.out.println();

        test = new MathSet(
            "10 11 12 13 14 15 16 17",
            "11 13 15 17 19 21 23"
        );

        System.out.println(test);
        System.out.println("union - " + test.union());
        System.out.println("intersection - " + test.intersection());
        System.out.println("difference A-B - " + test.differenceAMinusB());
        System.out.println("difference B-A - " + test.differenceBMinusA());
        System.out.println("symmetric difference " + test.symmetricDifference());
        System.out.println();

        test = new MathSet(
            "4 5 5 6 76 7 7 8 8 8 8 8",
            "23 3 4 3 5 3 53 5 46 46 4 6 5 3 4"
        );

        System.out.println(test);
        System.out.println("union - " + test.union());
        System.out.println("intersection - " + test.intersection());
        System.out.println("difference A-B - " + test.differenceAMinusB());
        System.out.println("difference B-A - " + test.differenceBMinusA());
        System.out.println("symmetric difference " + test.symmetricDifference());
    }
}



