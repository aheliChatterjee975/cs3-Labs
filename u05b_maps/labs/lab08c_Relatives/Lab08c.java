import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab08c
{
    public static void main(String args[]) throws IOException
    {
        Scanner file = new Scanner(new File("lab08c.dat"));

        Relatives test = new Relatives();

        int num = file.nextInt();
        file.nextLine();

        for(int i = 0; i < num; i++)
        {
            test.setPersonRelative(file.nextLine());
        }

        // Print all relatives
        out.println(test);

        // Print relatives of Dot
        out.println(test.getRelatives("Dot"));

        // Check direct relationships
        out.println("Is Dot directly related to Tom? " +
            (test.isRelated("Dot", "Tom") ? "Yes" : "No"));

        out.println("Is Dot directly related to Alice? " +
            (test.isRelated("Dot", "Alice") ? "Yes" : "No"));
    }
}
