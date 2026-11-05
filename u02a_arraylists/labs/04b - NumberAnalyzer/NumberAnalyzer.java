//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	public NumberAnalyzer()
	{
	}

	public NumberAnalyzer(String numbers)
	{
      setList(numbers);
	}
	
	public void setList(String numbers)
	{
	   list = new ArrayList<>();
      Scanner scan = new Scanner(numbers);
      while(scan.hasNextInt()) {
         int num = scan.nextInt();
         list.add(new Number(num));
      }
	}

	public int countOdds()
	{
      int oddCount=0;
      for(int i = 0; i < list.size(); i++) {
         if(list.get(i).isOdd()) {
            oddCount++;
         }
      }
      return oddCount;
	}

	public int countEvens()
	{
      int evenCount=0;
      for(int i = 0; i < list.size(); i++) {
         if(list.get(i).isOdd()==false) {
            evenCount++;
         }
      }
      return evenCount;
	}

	public int countPerfects()
	{
		int perfectCount=0;
      for(int i = 0; i < list.size(); i++) {
         if(list.get(i).isPerfect()) {
            perfectCount++;
         }
      }
      return perfectCount;
	}
	
	public String toString( )
	{
		return list.toString();
	}
}
