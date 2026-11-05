//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class SpiralMatrix
{
	private int[][] mat;

	public SpiralMatrix()
	{
		mat = new int[1][1];
	}

	public SpiralMatrix(int size)
	{
		mat = new int[size][size];
	}
	
	public void setSize(int size)
	{
		mat = new int[size][size];
	}

	public void createSpiral()
	{
		int num = 1;
		int row = 0;
		int col = 0;
		int leftwall = 0;
		int rightwall = mat.length - 1;
		int top = 0;
		int bottom = mat.length - 1;

		for (int i = 0; i < mat.length * mat.length + mat.length; i++) 
		{
			if (row < bottom && col == leftwall) 
			{
				mat[row][col] = num;
				num += 1;
				row += 1;
			}
			else if (row == bottom && col < rightwall) 
			{
				mat[row][col] = num;
				num += 1;
				col += 1;
			}
			else if (col == rightwall && row > top) 
			{
				mat[row][col] = num;
				num += 1;
				row -= 1;
			}
			else if (row == top && col > leftwall + 1) 
			{
				mat[row][col] = num;
				num += 1;
				col -= 1;
			}
			else 
			{
				leftwall += 1;
				bottom -= 1;
				top += 1;
				rightwall -= 1;

				if (mat.length % 2 != 0) 
				{
					mat[mat.length / 2][mat.length / 2] = mat.length * mat.length;
				}
				else 
				{
					if (mat.length == 1) 
					{
						// Do nothing
					}
					else 
					{
						mat[mat.length / 2 - 1][mat.length / 2] = mat.length * mat.length;
					}
				}
			}
		}
	}

	public String toString()
	{
		String output = "";
		for (int r = 0; r < mat.length; r++)
		{
			for (int c = 0; c < mat[r].length; c++)
			{
				output += mat[r][c] + " ";
			}
			output += "\n";
		}    
		return output;
	}
}