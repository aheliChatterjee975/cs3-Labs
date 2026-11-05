import java.util.NoSuchElementException;
import java.util.ArrayList;

public class MaxHeap<T> extends ArrayList<T> 
{
	public MaxHeap() {}
	
	public MaxHeap(int initialCapacity) {
		super(initialCapacity);
	}
	
	public MaxHeap(MaxHeap<T> origHeap) {
		super(origHeap);
	}
	
	/**
	* Looks at the object at the top of this priority queue without removing it
	* from the queue.
	* @return the object at the top of this priority queue or null if this
	*         priority queue is empty.
	**/
	public T peek() {
		if (isEmpty())
			return null;
			
		return get(0);
	}
	
	/**
	* Removes the object at the top of this priority queue and returns that
	* object as the value of this function.
	* @return the object at the top of this priority queue.
	* @throws NoSuchElementException if this priority queue is empty.
	**/
	public T remove() {
		if (isEmpty())
			throw new NoSuchElementException();
		
		T temp = get(0);
		if (size() == 1)
			remove(0);
		else
		{
			set(0, remove(size() - 1));
			reheapDown();
		}
		return temp;
	}

	/**
	* Adds the specified element to this priority queue.
	* @param obj the element to be added to this priority queue.
	**/
	@Override
	public boolean add(T value) {
		super.add(value);
		reheapUp();
		return true;
	}

	private void reheapUp()
	{
		int bot = size() - 1;
	  
		int parent = (bot - 1) / 2;
		while( bot > 0 && ((Comparable) get(parent)).compareTo(get(bot)) < 0)
		{
			T temp = get(parent);
			set(parent, get(bot));
			set(bot, temp);
			bot = parent;
			parent = (bot - 1) / 2;
		}
	}

	private void reheapDown()
	{
		int root=0;
		boolean done = false;
		while(root < size() && !done)
		{
			int left = (root * 2) + 1;
			int right = (root * 2) + 2;
			int max;
			
			if (left < size())
			{
				if (right < size())
				{
					if (((Comparable) get(left)).compareTo(get(right)) > 0)
						max = left;
					else
						max = right;
				}
		   		else
		            max = left;
		    
		   
			    if (((Comparable) get(max)).compareTo(get(root)) > 0)
			    {
			    	T temp = get(max);
			    	set(max, get(root));
			    	set(root, temp);
			    	root = max;
			    }
				else
					done = true;
			}
			else
				done = true;
		}
	}
}


