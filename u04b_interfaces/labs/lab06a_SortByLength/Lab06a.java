//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class Lab06a
{
	public static void main(String args[]) throws IOException
	{
		ArrayList<Word> words = new ArrayList<Word>();

		Scanner file = new Scanner(new File("lab06a.dat"));

		while(file.hasNext())
		{
			words.add(new Word(file.next()));
		}

		Collections.sort(words);

		for(Word word : words)
		{
			out.print(word + " ");
		}
	}
}
