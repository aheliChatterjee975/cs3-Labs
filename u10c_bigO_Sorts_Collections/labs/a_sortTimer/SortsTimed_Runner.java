//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class SortsTimed_Runner
{
	private Comparable[] list;
	private SortsTimed sortTester;
	private int size = 10_000;

	public SortsTimed_Runner()
	{
		sortTester = new SortsTimed();
	}

	// Use PrintWriter to write 10,000 random digits to the data file.
	// Be sure to CLOSE your Scanner!
	public void writeRandomDigitsToFile(String fileName) throws IOException {

	}

	// Use PrintWriter to write 10,000 random #s to the data file.
	// Be sure to CLOSE your Scanner!
	public void writeRandomFile(String fileName) throws IOException {

	}

	// Use PrintWriter to write the numbers 0 to 9,999 to the data file.
	// Be sure to CLOSE your Scanner!
	public void writeRandomDigitsFile(String fileName) throws IOException {

	}

	// Use PrintWriter to write the numbers 9,999 down to 0 to the data file.
	// Be sure to CLOSE your Scanner!
	public void writeRevOrderFile(String fileName) throws IOException {

	}

	// Load the numbers from the given file into array list.
	// Be sure to CLOSE your Scanner!
	public void loadFromFile(String fileName) throws IOException {

	}


	public void testSearches(String fileName) throws IOException
	{
		out.println("Testing Searches: \n");
		loadFromFile(fileName);
		sortTester.linearSearch(list, 75000);
		out.println("Seconds taken to find 75,000 using Linear Search: "+sortTester.getElapsed());

		loadFromFile(fileName);
		sortTester.quickSort(list);
		out.println("Seconds taken to sort list using quick sort: "+sortTester.getElapsed());
		sortTester.binarySearch(list, 75000);
		out.println("Seconds taken to find 75,000 using Binary Search: "+sortTester.getElapsed() + "\n");
	}

	public void testSorts(String fileName) throws IOException
	{
		out.printf("%11s%11s%11s%11s%11s%11s\n","Merge","Quick","Insertion1","Insertion2","Selection","Bubble");

		loadFromFile(fileName);
		sortTester.mergeSort(list);
		out.printf("%11s",sortTester.getElapsed());

		// Test other sorts:
	}


	public static void main( String args[] ) throws IOException
	{
		SortsTimed_Runner prog = new SortsTimed_Runner();
		prog.writeRandomDigitsToFile("randomDigits.dat");
		prog.writeRandomFile("randomNumbers.dat");
		prog.writeInOrderFile("inOrder.dat");
		prog.writeRevOrderFile("reverseOrder.dat");

		prog.testSearches("randomNumbers.dat");

		out.println("Sorting " + prog.size + " random digits:");
		prog.testSorts("randomDigits.dat");

		out.println("Sorting " + prog.size + " random numbers:");
		prog.testSorts("randomNumbers.dat");

		out.println("Sorting " + prog.size + " numbers already in order:");
		prog.testSorts("inOrder.dat");

		out.println("Sorting " + prog.size + " numbers in reverse order:");
		prog.testSorts("reverseOrder.dat");
	}
}