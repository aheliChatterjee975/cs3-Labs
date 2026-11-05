import java.io.*;
import java.util.Scanner;

public class MaxHeapTester1
{
	int[] nums = { 5, 7, 3, 1, 9, 15, 89, 32, -4, 23, -8, 17 };
	MaxHeap<Integer> hp = new MaxHeap<Integer>();

	public static void main(String args[]) {
		MaxHeapTester1 tester = new MaxHeapTester1();
		tester.init();
		tester.output();
	}

	private void init() {
		for (int n : nums)
			hp.add(n);
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
