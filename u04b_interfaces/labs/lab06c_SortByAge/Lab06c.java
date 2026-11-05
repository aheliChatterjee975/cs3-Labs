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

public class Lab06c
{
  public static void main(String[] args) throws IOException
  {
    ArrayList<Person> people = new ArrayList<Person>();

    Scanner file = new Scanner(new File("lab06c.dat"));

    int numPeople = file.nextInt();
    file.nextLine();

    for(int i = 0; i < numPeople; i++)
    {
      int year = file.nextInt();
      int month = file.nextInt();
      int day = file.nextInt();
      String name = file.next();

      people.add(new Person(year, month, day, name));
    }

    Collections.sort(people);

    for(Person person : people)
    {
      out.println(person);
    }
  }
}


