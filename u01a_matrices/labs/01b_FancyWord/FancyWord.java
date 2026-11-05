//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -


import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{
		mat = new char[0][0];
	}

	public FancyWord(String word)
	{
		// Create a square matrix
		mat = new char[word.length()][word.length()];

		// Fill every spot with spaces
		for(int r = 0; r < mat.length; r++)
		{
			for(int c = 0; c < mat[r].length; c++)
			{
				mat[r][c] = ' ';
			}
		}

		// Put the word on the first and last rows
		for(int c = 0; c < word.length(); c++)
		{
			mat[0][c] = word.charAt(c);
			mat[mat.length - 1][c] = word.charAt(c);
		}

		// Create the hourglass pattern
		for(int r = 1; r < mat.length - 1; r++)
		{
			mat[r][r] = word.charAt(r);

			mat[r][mat.length - 1 - r] =
				word.charAt(mat.length - 1 - r);
		}
	}

	public String toString()
	{
		String output = "";

		for(int r = 0; r < mat.length; r++)
		{
			for(int c = 0; c < mat[r].length; c++)
			{
				output += mat[r][c];
			}

			output += "\n";
		}

		return output;
	}
}


