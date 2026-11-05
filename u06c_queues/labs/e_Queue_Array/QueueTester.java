import queue.Queue;
import queue.ArrayQueue;

public class QueueTester
{
	public static void main(String args[]) {
		Queue<String> queue = new Queue<String>(5);
		System.out.println("Adding 'Red', 'Green', 'Blue', 'Purple', and 'Orange' to the queue.");
		queue.enqueue("Red");
		queue.enqueue("Green");
		queue.enqueue("Blue");
		queue.enqueue("Purple");
		queue.enqueue("Orange");
		
		System.out.println("\n\nTesting the \"toString()\" method:");
		System.out.println(queue);
		
		System.out.println("\nTesting for a full queue");
		System.out.println(queue.full());
		
		System.out.println("\nTesting for an empty() queue");
		System.out.println(queue.empty());
		
		System.out.println("\nPeek the front of the queue!");
		String str = queue.peek();
		System.out.println(str);
		
		System.out.println("\nremove the front of the queue!");
		System.out.println(queue.dequeue());
		
		System.out.println("\nremove the front of the queue!");
		System.out.println(queue.dequeue());
		
		System.out.println("\nAdding 'Yellow' to the queue.");
		queue.enqueue("Yellow");
		
		System.out.println("Adding 'Brown' to the queue.");
		queue.enqueue("Brown");
		
		System.out.println("\n\nTesting the \"toString()\" method:");
		System.out.println(queue);
		
		System.out.println("\nRemoving all items from the queue!");
		while (!queue.empty())
			System.out.println(queue.dequeue());
		
		System.out.println("\nTesting for a full queue");
		System.out.println(queue.full());
		
		System.out.println("\nTesting for an empty() queue");
		System.out.println(queue.empty());
		
		System.out.println("\nremove from an empty queue");
		queue.dequeue();
	}
}
