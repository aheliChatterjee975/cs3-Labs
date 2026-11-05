import java.io.*;
import java.util.Scanner;

public class MaxHeapTester2
{
	private String[] words = { "apple", "pear", "grape", "strawberry", "banana", "orange", "lemon", "watermelon" };
	private MaxHeap<String> hp = new MaxHeap<String>();

	public static void main(String args[]) {
		MaxHeapTester2 tester = new MaxHeapTester2();
		tester.init();
		tester.output();		
	}

	private void init() {
		for (String s : words)
			hp.add(s);
	}

	private void output() {
		System.out.println("Heap Contents: " + hp.toString());

		System.out.println("\nRemoving " + hp.remove() + " from the heap!");
		System.out.println("Heap Contents: " + hp.toString());
		
		System.out.println("\nCalling the toArray() method: ");
		Object[] list = hp.toArray();
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
		System.out.println("\n\nRemoving all elements from the heap");
		while (!hp.isEmpty())
			System.out.println(hp.remove() + "  Heap Contents: " + hp.toString());
		System.out.println();
	}
}
