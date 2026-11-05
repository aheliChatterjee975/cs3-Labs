import java.util.Scanner;
import java.io.File;
import static java.lang.System.*;

public class Lab01c
{
	public static void main(String[] args) throws Exception
	{
		Scanner file = new Scanner(new File("Lab01c.dat"));

		// Read the number of data sets
		int numSets = file.nextInt();

		// Process each data set
		for(int x = 0; x < numSets; x++)
		{
			// Read the size of the magic square
			int size = file.nextInt();

			// Create a MagicSquare object
			MagicSquare square = new MagicSquare(size);

			// Print it
			out.println(square);
		}

		file.close();
	}
}

