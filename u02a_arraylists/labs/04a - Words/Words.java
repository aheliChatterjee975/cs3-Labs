import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class Words
{
	private ArrayList<Word> words;

	public Words()
	{
		setWords("");
      out.print(words);
	}

	public Words(String wordList)
	{
      setWords(wordList);
      
	}

	public void setWords(String wordList)
	{
      words = new ArrayList<>();
      Scanner scan = new Scanner(wordList);
      while(scan.hasNext()) {
         String word = scan.next().replace(",", "");
         words.add(new Word(word));
     }
	}
	
	public int countWordsWithXChars(int size)
	{
		int count=0;
      for(Word w : words) {
         if(w.getLength() == size);
            count++;
      }
		return count;
	}
	
	public void removeWordsWithXChars(int size)
	{
      for(int i = words.size()-1; i>=0; i--) {
         if(words.get(i).getLength() == size) {
            words.remove(i);
         }
      }

	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;
      for(Word w : words) {
         if(w.getNumVowels() == numVowels) {
            count++;
         }
      }
		return count;
	}
	
	public String toString()
	{ 
      
	   return words.toString();
	}
}
