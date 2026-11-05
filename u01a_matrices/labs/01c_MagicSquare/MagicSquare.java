//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class MagicSquare
{
	private int[][] mat;

	public MagicSquare()
	{
		mat = new int[0][0];
	}

	public MagicSquare(int size)
	{
		mat = new int[size][size];

		// Start with 1 in the middle of the top row
		int row = 0;
		int col = size / 2;

		for(int num = 1; num <= size * size; num++)
		{
			// Put the number in the current spot
			mat[row][col] = num;

			// Save the old position
			int oldRow = row;
			int oldCol = col;

			// Move up one row and right one column
			row--;
			col++;

			// Wrap row around if needed
			if(row < 0)
			{
				row = size - 1;
			}

			// Wrap column around if needed
			if(col >= size)
			{
				col = 0;
			}

			// If the new spot is already filled
			if(mat[row][col] != 0)
			{
				// Go back to the old row
				// and move down one row
				row = oldRow + 1;
				col = oldCol;

				// Make sure row stays in bounds
				if(row >= size)
				{
					row = 0;
				}
			}
		}
	}

	public String toString()
	{
		String output = "";

		for(int r = 0; r < mat.length; r++)
		{
			for(int c = 0; c < mat[r].length; c++)
			{
				output += mat[r][c] + "\t";
			}

			output += "\n";
		}

		return output;
	}
}

