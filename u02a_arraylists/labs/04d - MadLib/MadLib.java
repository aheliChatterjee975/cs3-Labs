import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib 
{
	//add in three ArrayList instance variables
	//1 for nouns, 1 for adjectives, and 1 for verbs
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	private ArrayList<String> verbs;
	private String story;

	public MadLib()
	{
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		verbs = new ArrayList<String>();
		story = "";
	}

	public MadLib(String fileName)
	{
		// Initialize lists and pre-load word data files
		this();
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		// Load and parse the story file
		try {
			Scanner file = new Scanner(new File(fileName));
			while (file.hasNext()) {
				String word = file.next();
				
				// Replace symbols with random words or keep the original word
				if (word.equals("#")) {
					story += getRandomNoun() + " ";
				} else if (word.equals("@")) {
					story += getRandomVerb() + " ";
				} else if (word.equals("&")) {
					story += getRandomAdjective() + " ";
				} else {
					story += word + " ";
				}
			}
			file.close();
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public void loadNouns()
	{
		try {
			Scanner file = new Scanner(new File("nouns.dat"));
			while (file.hasNext()) {
				nouns.add(file.next());
			}
			file.close();
		}
		catch(Exception e)
		{
			out.println("Problem loading nouns.dat!");
		}
	}

	public void loadVerbs()
	{
		try {
			Scanner file = new Scanner(new File("verbs.dat"));
			while (file.hasNext()) {
				verbs.add(file.next());
			}
			file.close();
		}
		catch(Exception e)
		{
			out.println("Problem loading verbs.dat!");
		}
	}

	public void loadAdjectives()
	{
		try {
			Scanner file = new Scanner(new File("adjectives.dat"));
			while (file.hasNext()) {
				adjectives.add(file.next());
			}
			file.close();
		}
		catch(Exception e)
		{
			out.println("Problem loading adjectives.dat!");
		}
	}

	public String getRandomVerb()
	{
		if (verbs.isEmpty()) {
			return "";
		}
		int randIndex = (int)(Math.random() * verbs.size());
		return verbs.get(randIndex);
	}

	public String getRandomNoun()
	{
		if (nouns.isEmpty()) {
			return "";
		}
		int randIndex = (int)(Math.random() * nouns.size());
		return nouns.get(randIndex);
	}

	public String getRandomAdjective()
	{
		if (adjectives.isEmpty()) {
			return "";
		}
		int randIndex = (int)(Math.random() * adjectives.size());
		return adjectives.get(randIndex);
	}

	public String toString()
	{
		return story + "\n\n";
	}
}