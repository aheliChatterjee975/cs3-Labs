import java.util.ArrayList;
import static java.lang.System.*;

public class Heap<T extends Comparable<T>>
{
	private ArrayList<T> list;

	public Heap()
	{

	}

	public void add(T value)
	{


	}

   public void swapUp(int bot)
   {


	}

	public T remove( )
	{


	}

	public void swapDown(int top)
	{
		
  	}
	
	private void swap(int start, int finish)
	{
		
	}
	
	public T peek()
	{

	}
	
	public boolean isEmpty()
	{

	}

	public void print()
	{
		out.println("\nPRINTING THE HEAP!\n");
      int x=0;
		for(int i=1; i<list.size();i*=2)
		{
			for(int s=1;s<list.size()-i;s++)
			{
		      out.print(" ");
			}
		   for(int j=0;j<=i-1&&x<list.size(); j++)
		   {
		   	out.print(list.get(x++)+"  ");
		   }
		   out.println();
		   if(x==list.size()-1)
		   {
		   	out.print(list.get(x++)+"  ");
		   }
		}
		out.println();
	}

	public String toString()
	{
		return list.toString();
	}
}