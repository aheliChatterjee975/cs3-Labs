package queue;

public interface Queue<T>
{
	public void enqueue(T item);
	
	public T dequeue();
	
	public T peek();
	
	public boolean empty();
	
	public boolean full();
		
	public void clear();
	
	public Object[] toArray();
}
