//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab -

import static java.lang.System.*;

class SiteName implements Comparable<SiteName>
{
	private String site;

	public SiteName(String s)
	{
		site = s;
	}

	public int compareTo(SiteName other)
	{
		String category = site.substring(site.lastIndexOf("."));
		String otherCategory = other.site.substring(other.site.lastIndexOf("."));

		if(!category.equals(otherCategory))
		{
			return category.compareTo(otherCategory);
		}

		return site.compareTo(other.site);
	}

	public String toString()
	{
		return site;
	}
}
