import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab08e
{
    public static void main(String args[]) throws IOException
    {
        Scanner file = new Scanner(new File("lab08e.dat"));

        Acronyms test = new Acronyms();

        int num = file.nextInt();
        file.nextLine();

        for(int i = 0; i < num; i++)
        {
            test.putEntry(file.nextLine());
        }

        out.println("====    MAP CONTENTS    ====");
        out.println(test);

        out.println("====    READ LINES      ====");

        while(file.hasNextLine())
        {
            String line = file.nextLine();
            out.println(test.convert(line));
        }

        file.close();
    }
}

