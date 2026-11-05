import static java.lang.System.*;

public class Word
{
	private String word;
   private static String vowels = "AEIOUaeiou";   //only one

	public Word()
	{

	}

	public Word(String wrd)
	{
      setWord(wrd);
	}

	public void setWord(String wrd)
	{
      word = wrd;
	}
	
	public int getNumVowels()
	{
		int count=0;
      for(int i = 0; i < word.length(); i++) {
         String w = word.substring(i, i+1);
         for(int k = 0; k < vowels.length(); k++) {
            String v = vowels.substring(k, k+1);
               if(w.equals(v)) {
                  count++;
               }
            }
            
         }
		return count;
	}
	
	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
	   return word;
	}
}
