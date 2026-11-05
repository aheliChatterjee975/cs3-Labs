public class Stack<E> extends LinkedList<E> 
{
   //Instantiate like this:
   //
   // Stack stack = new Stack();
   //
   public Stack() {
   }
   
   public boolean empty() {
      return size() == 0;
   }

   public synchronized int search(Object o) {
      int i = lastIndexOf(o);
   
      if (i >= 0) {
         return size() - i;
      }
      return -1;
   }
}
