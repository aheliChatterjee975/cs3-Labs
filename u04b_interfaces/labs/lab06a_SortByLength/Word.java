//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word(String word)
	{
		this.word = word;
	}

	public int compareTo(Word other)
	{
		if(word.length() != other.word.length())
		{
			return word.length() - other.word.length();
		}
		
		return word.compareTo(other.word);
	}

	public String toString()
	{
		return word;
	}
}
