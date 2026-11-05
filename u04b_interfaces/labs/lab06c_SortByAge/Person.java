//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab -

import static java.lang.System.*;

public class Person implements Comparable<Person>
{
  private int myYear;
  private int myMonth;
  private int myDay;
  private String myName;

  public Person(int y, int m, int d, String n)
  {
    myYear = y;
    myMonth = m;
    myDay = d;
    myName = n;
  }

  public int compareTo(Person other)
  {
    if(myYear != other.myYear)
    {
      return other.myYear - myYear;
    }

    if(myMonth != other.myMonth)
    {
      return other.myMonth - myMonth;
    }

    if(myDay != other.myDay)
    {
      return other.myDay - myDay;
    }

    return myName.compareTo(other.myName);
  }
  
  public String toString()
  {
   return myName + " DOB: " + myYear + "-" +String.format("%02d", myMonth)+ "-" +String.format("%02d", myDay);
  }
}
