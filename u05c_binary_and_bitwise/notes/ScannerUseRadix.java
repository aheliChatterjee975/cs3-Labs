import static java.lang.System.*;
import java.util.Scanner;

public class ScannerUseRadix
{
   public static void main(String args[])
   {
      printInRadix("101, 1001, 1010, 1011", 2);
      printInRadix("12, 23, 30, 75", 8);
      printInRadix("a, b, c, d, e, f, 10, 11, 12, 20, 30, 40", 16);
   }
   
   public static void printInRadix(String numbers, int radix) {
      Scanner numReader = new Scanner(numbers);
      numReader.useDelimiter(", ");
      numReader.useRadix(radix);               // Could've used hasNextInt(radix)
      while(numReader.hasNextInt()) {          // and nextInt(radix) instead of 
         out.print(numReader.nextInt() + " "); // setting the radix.
      } 
      out.println(); 
   }
}
