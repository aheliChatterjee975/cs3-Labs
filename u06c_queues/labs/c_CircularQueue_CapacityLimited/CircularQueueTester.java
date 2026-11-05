import static java.lang.System.*;

public class CircularQueueTester
{
	public static void main(String args[]) {
		CircularQueue<String> queue = new CircularQueue<String>(5);
		out.println("Adding 'Red', 'Green', 'Blue', 'Purple', and 'Orange' to the queue.");
		queue.enqueue("Red");
		queue.enqueue("Green");
		queue.enqueue("Blue");
		queue.enqueue("Purple");
		queue.enqueue("Orange");
      // The following line SHOULD throw a FullQueueException if the queue is full as intended.
      // Comment it out once you've verified that it behaves as expected.
		queue.enqueue("Black");
		
		out.println("\n\nTesting the \"toString()\" method:");
		out.println(queue);
		
		out.println("\nTesting for a full queue");
		out.println(queue.isFull());
		
		out.println("\nTesting for an empty() queue");
		out.println(queue.isEmpty());
		
		out.println("\nPeek the front of the queue!");
		String str = queue.peek();
		out.println(str);
		
		out.println("\nremove the front of the queue!");
		out.println(queue.dequeue());
		
		out.println("\nremove the front of the queue!");
		out.println(queue.dequeue());
		
		out.println("\nAdding 'Yellow' to the queue.");
		queue.enqueue("Yellow");
		
		out.println("Adding 'Brown' to the queue.");
		queue.enqueue("Brown");
		
		out.println("\n\nTesting the \"toString()\" method:");
		out.println(queue);
		
		out.println("\nRemoving all items from the queue!");
		while (!queue.isEmpty())
			out.println(queue.dequeue());
		
		out.println("\nTesting for a full queue");
		out.println(queue.isFull());
		
		out.println("\nTesting for an empty() queue");
		out.println(queue.isEmpty());
		
		out.println("\nremove from an empty queue");
      // The following line SHOULD throw a NoSuchElementException if the queue is empty as intended.
      // Comment it out once you've verified that it behaves as expected.
		queue.dequeue();

		out.println("Adding 'Fuschia' to the queue.");      
      queue.enqueue("Fuschia");
      out.println(queue);
      out.println("Clearing the queue:");
      queue.clear();
      out.println(queue);
		out.println("Adding 'Fuschia' again to see if clear() reset all variables properly.");      
      queue.enqueue("Fuschia");
      out.println(queue);      
	}
}