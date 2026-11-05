//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab -

import static java.lang.System.*;

class VowelWord implements Comparable<VowelWord>
{
	private String word;

	public VowelWord(String word)
	{
		this.word = word;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount = 0;

		for(int i = 0; i < word.length(); i++)
		{
			if(vowels.indexOf(word.charAt(i)) >= 0)
			{
				vowelCount++;
			}
		}

		return vowelCount;
	}

	public int compareTo(VowelWord other)
	{
		if(numVowels() != other.numVowels())
		{
			return numVowels() - other.numVowels();
		}

		return word.compareTo(other.word);
	}

	public String toString()
	{
		return word;
	}
}
