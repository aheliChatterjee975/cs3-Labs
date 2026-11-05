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

public class Lab06d
{
	public static void main(String[] args) throws IOException
	{
		ArrayList<SiteName> sites = new ArrayList<SiteName>();

		Scanner file = new Scanner(new File("lab06d.dat"));

		int numSites = file.nextInt();

		for(int i = 0; i < numSites; i++)
		{
			sites.add(new SiteName(file.next()));
		}

		Collections.sort(sites);

		for(SiteName site : sites)
		{
			out.println(site + " ");
		}
	}
}


