import static java.lang.System.*;
import java.util.*;

public class BubblerTester
{
   public static void main( String args[] )
   {
		Integer[] array = {39,6,11,23,18,3,20,5,57,15};

		out.println("before bubble sort");
		out.println(Arrays.toString(array));

		Bubbler.bubbleSort(array);

		out.println("\n\nafter bubble sort");
		out.println(Arrays.toString(array));
      
      ArrayList<Mammal> myList = new ArrayList<>();
      myList.add(new Mammal(7.2, 9));
      myList.add(new Mammal(3.5, 10));
      Bubbler.bubbleSort(myList);
	}
}