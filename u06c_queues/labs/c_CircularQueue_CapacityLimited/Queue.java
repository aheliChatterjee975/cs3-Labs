import static java.lang.System.*;
import java.util.Arrays;
import java.util.NoSuchElementException;

interface Queue<T> {
   /** Get the front element of the queue without removing it. */
   public T peek() throws java.util.NoSuchElementException;
    	
   // We made our own type of exception to demonstrate how one would do so.
   // It would have been better to import Java's IllegalStateException class.
   // as we did with the NoSuchElementException.
   
   /** Adds the given element after the last element in the queue
    *  and updates the size of the queue. */
   public void enqueue(T item) throws FullQueueException;
   
   // We'll use Java's NoSuchElementException here. You can import that class
   // or just use its Fully Qualified Name, which includes the package.
   
   /** Removes the head of the queue and updates the size of the queue. */
   public T dequeue() throws java.util.NoSuchElementException;
   
   /** Returns the number of elements in the queue, not the capacity. **/
   public int size();
   
   /** Determines whether the queue is empty or not. */
   public boolean isEmpty();
   
   /** Determines whether the full is empty or not. */   
   public boolean isFull() ;

   /** After clear() is called, every spot in the array 
    *  should be null, and all other instance variables
    *  should have been set to starting conditions.
    */
   public void clear();

   /** Returns an array that constains the contents of
    *  this circular queue, with the head element at spot 0
    *  and the tail element at spot length - 1.
    *
    *  @return an array of Objects.
    */
   public Object[] toArray();

   /** Returns an array that constains the contents of
    *  this circular queue, with the head element at spot 0
    *  and the tail element at spot length - 1.
    *  The parameter won't be used in our implementation.
    *  It was to allow overloading of the toArray() name.
    *
    *  @return an array of type T.
    */
   public T[] toArray(T[] inArray);   
}