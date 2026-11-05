//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;

	public AtCounter() {
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c)
	{
		// out of bounds
		if(r < 0 || r >= atMat.length || c < 0 || c >= atMat[0].length)
			return 0;

		// not an @
		if(atMat[r][c] != '@')
			return 0;

		// mark as visited
		atMat[r][c] = '-';

		// count this @ and recursively check all 4 directions
		return 1
			+ countAts(r - 1, c)
			+ countAts(r + 1, c)
			+ countAts(r, c - 1)
			+ countAts(r, c + 1);
	}
}
