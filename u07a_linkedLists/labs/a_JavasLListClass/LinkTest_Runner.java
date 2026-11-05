//© A+ Computer Science  -  www.apluscompsci.com
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

import java.util.*;

public class LinkTest_Runner {
   public static void main ( String[] args ) throws IOException {
      LinkTest test = new LinkTest(new int[]{4,5,6,7,8,9,10,11,12,13});
      out.println(test);
   
      test = new LinkTest(new int[]{24,75,86,37,82,94,111,82,43});
      out.println(test);
   
      test = new LinkTest(new int[]{0,4,5,2,1,4,6});
      out.println(test);
      
      Scanner file = new Scanner(new File("numbers.dat"));
      int[] numbers = new int[1000];
      int count = 0;
      while (count < numbers.length && file.hasNextInt()) {
         numbers[count++] = file.nextInt();
      }
      //out.println(Arrays.toString(numbers));
      test = new LinkTest(numbers);
      out.println(test);
   }
}
