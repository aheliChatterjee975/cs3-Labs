//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class SinglyLinkedList
{
   private ListNode front;
   private ListNode back;
   private int size;

	public SinglyLinkedList()	{
		front = null;
		back = null;
	}

   //MODIFIER METHODS - methods that can change the list
	public void add(Comparable insertItem) {

	}

	public void addFirst( Comparable insertItem)	{

	}

	public void addLast(Comparable insertItem ) {

	}

   // Should throw an IndexOutOfBoundsException with a message that  
   // shows the offending index as well as the size of the list.
	public Comparable remove(int index) {
      // if (???)
      //    throw new ???


		return null;
	}

	public boolean remove(Comparable o) {


		return false;
	}

   // Should throw a NoSuchElementException is the list doesn't exist.
	public Comparable removeFirst( ) {
      Comparable temp = front.getValue();

		return temp;
	}

   // Should throw a NoSuchElementException is the list doesn't exist.
	public Comparable removeLast( ) {

		return null;
	}

   // Should throw an IndexOutOfBoundsException with a message that  
   // shows the offending index as well as the size of the list.
	public Comparable set(int index, Comparable element)
	{

		return null;
	}

	public void clear() {

	}


   //ACCESSOR METHODS - methods that do not change the list
   public boolean isEmpty() {
      return front==null;
   }

	public boolean equals(Object someList) {

		return false;
	}

	public boolean contains(Comparable searchValue) {

		return false;
	}

   // Should throw an IndexOutOfBoundsException with a message that  
   // shows the offending index as well as the size of the list.
  	public Comparable get(int index) {

		return null;
	}

   // Should throw a NoSuchElementException is the list doesn't exist.
	public Comparable getFirst() {

		return null;
	}

   // Should throw a NoSuchElementException is the list doesn't exist.
	public Comparable getLast() {

		return null;
	}

	public int size() {
		return 0;
	}

	public String toString() {
		String output = "";

		return output;
	}
}
